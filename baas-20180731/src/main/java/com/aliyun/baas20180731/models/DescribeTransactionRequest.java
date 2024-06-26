// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeTransactionRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    @NameInMap("Hash")
    public String hash;

    public static DescribeTransactionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransactionRequest self = new DescribeTransactionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTransactionRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public DescribeTransactionRequest setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

}
