// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeAuditCallbackResponseBody extends TeaModel {
    @NameInMap("Callback")
    public String callback;

    @NameInMap("CryptType")
    public Integer cryptType;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Seed")
    public String seed;

    public static DescribeAuditCallbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditCallbackResponseBody self = new DescribeAuditCallbackResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAuditCallbackResponseBody setCallback(String callback) {
        this.callback = callback;
        return this;
    }
    public String getCallback() {
        return this.callback;
    }

    public DescribeAuditCallbackResponseBody setCryptType(Integer cryptType) {
        this.cryptType = cryptType;
        return this;
    }
    public Integer getCryptType() {
        return this.cryptType;
    }

    public DescribeAuditCallbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAuditCallbackResponseBody setSeed(String seed) {
        this.seed = seed;
        return this;
    }
    public String getSeed() {
        return this.seed;
    }

}
