// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class DescribeQuotaResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("quota")
    public Quota quota;

    @NameInMap("requestId")
    public String requestId;

    public static DescribeQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeQuotaResponseBody self = new DescribeQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeQuotaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeQuotaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeQuotaResponseBody setQuota(Quota quota) {
        this.quota = quota;
        return this;
    }
    public Quota getQuota() {
        return this.quota;
    }

    public DescribeQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
