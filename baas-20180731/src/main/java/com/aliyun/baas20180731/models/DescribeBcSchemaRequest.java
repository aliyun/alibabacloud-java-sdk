// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeBcSchemaRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    public static DescribeBcSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBcSchemaRequest self = new DescribeBcSchemaRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBcSchemaRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

}
