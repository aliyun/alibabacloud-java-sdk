// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeUserCertificateExpireCountResponseBody extends TeaModel {
    /**
     * <p>The number of domain names whose SSL certificates are about to expires within 30 days.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ExpireWithin30DaysCount")
    public Integer expireWithin30DaysCount;

    /**
     * <p>The number of domain names whose SSL certificates have already expired.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("ExpiredCount")
    public Integer expiredCount;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F5E8DF64-7175-4186-9B06-F002C0BBD0C5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUserCertificateExpireCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserCertificateExpireCountResponseBody self = new DescribeUserCertificateExpireCountResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeUserCertificateExpireCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
