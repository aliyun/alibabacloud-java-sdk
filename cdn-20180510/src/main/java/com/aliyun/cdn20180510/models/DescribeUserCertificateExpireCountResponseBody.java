// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeUserCertificateExpireCountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ExpireWithin30DaysCount")
    public Integer expireWithin30DaysCount;

    @NameInMap("ExpiredCount")
    public Integer expiredCount;

    public static DescribeUserCertificateExpireCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserCertificateExpireCountResponseBody self = new DescribeUserCertificateExpireCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserCertificateExpireCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserCertificateExpireCountResponseBody setExpireWithin30DaysCount(Integer expireWithin30DaysCount) {
        this.expireWithin30DaysCount = expireWithin30DaysCount;
        return this;
    }
    public Integer getExpireWithin30DaysCount() {
        return this.expireWithin30DaysCount;
    }

    public DescribeUserCertificateExpireCountResponseBody setExpiredCount(Integer expiredCount) {
        this.expiredCount = expiredCount;
        return this;
    }
    public Integer getExpiredCount() {
        return this.expiredCount;
    }

}
