// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class QueryBlockRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    @NameInMap("Height")
    public Long height;

    public static QueryBlockRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockRequest self = new QueryBlockRequest();
        return TeaModel.build(map, self);
    }

    public QueryBlockRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public QueryBlockRequest setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

}
