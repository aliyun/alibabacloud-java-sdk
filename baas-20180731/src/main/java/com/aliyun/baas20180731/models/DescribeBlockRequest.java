// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeBlockRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    @NameInMap("Height")
    public Long height;

    public static DescribeBlockRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlockRequest self = new DescribeBlockRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBlockRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public DescribeBlockRequest setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

}
