// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeBlockchainSchemaDetailRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    @NameInMap("SchemaId")
    public Long schemaId;

    public static DescribeBlockchainSchemaDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlockchainSchemaDetailRequest self = new DescribeBlockchainSchemaDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBlockchainSchemaDetailRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public DescribeBlockchainSchemaDetailRequest setSchemaId(Long schemaId) {
        this.schemaId = schemaId;
        return this;
    }
    public Long getSchemaId() {
        return this.schemaId;
    }

}
