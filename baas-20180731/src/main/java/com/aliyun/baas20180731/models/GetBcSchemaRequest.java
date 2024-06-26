// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class GetBcSchemaRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    public static GetBcSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBcSchemaRequest self = new GetBcSchemaRequest();
        return TeaModel.build(map, self);
    }

    public GetBcSchemaRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

}
