// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeTransactionFor2CBrowserRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AlipayAuthCode")
    public String alipayAuthCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Bizid")
    public String bizid;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Hash")
    public String hash;

    public static DescribeTransactionFor2CBrowserRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransactionFor2CBrowserRequest self = new DescribeTransactionFor2CBrowserRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTransactionFor2CBrowserRequest setAlipayAuthCode(String alipayAuthCode) {
        this.alipayAuthCode = alipayAuthCode;
        return this;
    }
    public String getAlipayAuthCode() {
        return this.alipayAuthCode;
    }

    public DescribeTransactionFor2CBrowserRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public DescribeTransactionFor2CBrowserRequest setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

}
