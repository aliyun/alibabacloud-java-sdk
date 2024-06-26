// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeBlockchainSchemaRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    public static DescribeBlockchainSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlockchainSchemaRequest self = new DescribeBlockchainSchemaRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBlockchainSchemaRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

}
