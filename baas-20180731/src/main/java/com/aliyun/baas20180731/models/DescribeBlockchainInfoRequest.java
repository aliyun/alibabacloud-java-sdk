// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeBlockchainInfoRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    public static DescribeBlockchainInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlockchainInfoRequest self = new DescribeBlockchainInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBlockchainInfoRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

}
