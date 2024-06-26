// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeTransactionReceiptFor2CBrowserRequest extends TeaModel {
    @NameInMap("AlipayAuthCode")
    public String alipayAuthCode;

    @NameInMap("Bizid")
    public String bizid;

    @NameInMap("Hash")
    public String hash;

    public static DescribeTransactionReceiptFor2CBrowserRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransactionReceiptFor2CBrowserRequest self = new DescribeTransactionReceiptFor2CBrowserRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTransactionReceiptFor2CBrowserRequest setAlipayAuthCode(String alipayAuthCode) {
        this.alipayAuthCode = alipayAuthCode;
        return this;
    }
    public String getAlipayAuthCode() {
        return this.alipayAuthCode;
    }

    public DescribeTransactionReceiptFor2CBrowserRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public DescribeTransactionReceiptFor2CBrowserRequest setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

}
