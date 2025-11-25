// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingRiskDomainAndIpCountResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>EE258AC0-6EDD-5929-AB47-165E9B54****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("RiskDomainCount")
    public Long riskDomainCount;

    /**
     * <strong>example:</strong>
     * <p>47</p>
     */
    @NameInMap("RiskIpCount")
    public Long riskIpCount;

    /**
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeOutgoingRiskDomainAndIpCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutgoingRiskDomainAndIpCountResponseBody self = new DescribeOutgoingRiskDomainAndIpCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOutgoingRiskDomainAndIpCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOutgoingRiskDomainAndIpCountResponseBody setRiskDomainCount(Long riskDomainCount) {
        this.riskDomainCount = riskDomainCount;
        return this;
    }
    public Long getRiskDomainCount() {
        return this.riskDomainCount;
    }

    public DescribeOutgoingRiskDomainAndIpCountResponseBody setRiskIpCount(Long riskIpCount) {
        this.riskIpCount = riskIpCount;
        return this;
    }
    public Long getRiskIpCount() {
        return this.riskIpCount;
    }

    public DescribeOutgoingRiskDomainAndIpCountResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
