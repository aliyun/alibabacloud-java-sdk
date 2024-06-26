// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeSchemaDetailRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    @NameInMap("SchemaId")
    public Long schemaId;

    public static DescribeSchemaDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSchemaDetailRequest self = new DescribeSchemaDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSchemaDetailRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public DescribeSchemaDetailRequest setSchemaId(Long schemaId) {
        this.schemaId = schemaId;
        return this;
    }
    public Long getSchemaId() {
        return this.schemaId;
    }

}
