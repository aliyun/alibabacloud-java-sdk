// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeBlockchainSchemaFileOSSPropertiesRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    public static DescribeBlockchainSchemaFileOSSPropertiesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlockchainSchemaFileOSSPropertiesRequest self = new DescribeBlockchainSchemaFileOSSPropertiesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBlockchainSchemaFileOSSPropertiesRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

}
