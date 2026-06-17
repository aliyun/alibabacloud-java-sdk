// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingRiskDomainAndIpCountResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EE258AC0-6EDD-5929-AB47-165E9B54****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of risk domain names.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("RiskDomainCount")
    public Long riskDomainCount;

    /**
     * <p>The number of risk IP addresses.</p>
     * 
     * <strong>example:</strong>
     * <p>47</p>
     */
    @NameInMap("RiskIpCount")
    public Long riskIpCount;

    /**
     * <p>The total number of entries.</p>
     * 
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
