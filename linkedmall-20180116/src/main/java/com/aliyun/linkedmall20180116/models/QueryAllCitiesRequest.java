// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryAllCitiesRequest extends TeaModel {
    @NameInMap("BizId")
    @Validation(required = true)
    public String bizId;

    @NameInMap("ExtJson")
    public java.util.Map<String, ?> extJson;

    public static QueryAllCitiesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAllCitiesRequest self = new QueryAllCitiesRequest();
        return TeaModel.build(map, self);
    }

    public QueryAllCitiesRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryAllCitiesRequest setExtJson(java.util.Map<String, ?> extJson) {
        this.extJson = extJson;
        return this;
    }
    public java.util.Map<String, ?> getExtJson() {
        return this.extJson;
    }

}
