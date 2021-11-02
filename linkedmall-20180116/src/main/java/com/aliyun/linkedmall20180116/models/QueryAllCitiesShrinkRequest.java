// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryAllCitiesShrinkRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("ExtJson")
    public String extJsonShrink;

    public static QueryAllCitiesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAllCitiesShrinkRequest self = new QueryAllCitiesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryAllCitiesShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryAllCitiesShrinkRequest setExtJsonShrink(String extJsonShrink) {
        this.extJsonShrink = extJsonShrink;
        return this;
    }
    public String getExtJsonShrink() {
        return this.extJsonShrink;
    }

}
