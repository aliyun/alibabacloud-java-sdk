// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNatFirewallQuotaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ExceptionCount")
    public Long exceptionCount;

    /**
     * <strong>example:</strong>
     * <p>F98BAA59-5863-5B61-8FD4-C5E96813****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("UnprotectedCount")
    public Long unprotectedCount;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("UsedCount")
    public Long usedCount;

    public static DescribeNatFirewallQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatFirewallQuotaResponseBody self = new DescribeNatFirewallQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNatFirewallQuotaResponseBody setExceptionCount(Long exceptionCount) {
        this.exceptionCount = exceptionCount;
        return this;
    }
    public Long getExceptionCount() {
        return this.exceptionCount;
    }

    public DescribeNatFirewallQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNatFirewallQuotaResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeNatFirewallQuotaResponseBody setUnprotectedCount(Long unprotectedCount) {
        this.unprotectedCount = unprotectedCount;
        return this;
    }
    public Long getUnprotectedCount() {
        return this.unprotectedCount;
    }

    public DescribeNatFirewallQuotaResponseBody setUsedCount(Long usedCount) {
        this.usedCount = usedCount;
        return this;
    }
    public Long getUsedCount() {
        return this.usedCount;
    }

}
