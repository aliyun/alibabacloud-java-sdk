// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingStatisticResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IgnoreAssetCount")
    public Integer ignoreAssetCount;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("IgnoreDomainCount")
    public Integer ignoreDomainCount;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IgnoreDstIPCount")
    public Integer ignoreDstIPCount;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PrivateRiskAssetCount")
    public Long privateRiskAssetCount;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PrivateTotalAssetCount")
    public Long privateTotalAssetCount;

    /**
     * <strong>example:</strong>
     * <p>E2BD70F4-48BF-5EFD-B103-F0763E27*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RiskAssetCount")
    public Integer riskAssetCount;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RiskDomainCount")
    public Integer riskDomainCount;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RiskDstIPCount")
    public Integer riskDstIPCount;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SubscribeAssetCount")
    public Integer subscribeAssetCount;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("SubscribeDomainCount")
    public Integer subscribeDomainCount;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("SubscribeDstIPCount")
    public Integer subscribeDstIPCount;

    /**
     * <strong>example:</strong>
     * <p>13</p>
     */
    @NameInMap("TotalAssetCount")
    public Integer totalAssetCount;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalDomainCount")
    public Integer totalDomainCount;

    /**
     * <strong>example:</strong>
     * <p>107</p>
     */
    @NameInMap("TotalDstIPCount")
    public Integer totalDstIPCount;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalProtocolCount")
    public Integer totalProtocolCount;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("UncoveredAclDomain")
    public Integer uncoveredAclDomain;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("UncoveredAclDstIP")
    public Integer uncoveredAclDstIP;

    /**
     * <strong>example:</strong>
     * <p>20.13</p>
     */
    @NameInMap("UnknownProtocolRadio")
    public String unknownProtocolRadio;

    public static DescribeOutgoingStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutgoingStatisticResponseBody self = new DescribeOutgoingStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOutgoingStatisticResponseBody setIgnoreAssetCount(Integer ignoreAssetCount) {
        this.ignoreAssetCount = ignoreAssetCount;
        return this;
    }
    public Integer getIgnoreAssetCount() {
        return this.ignoreAssetCount;
    }

    public DescribeOutgoingStatisticResponseBody setIgnoreDomainCount(Integer ignoreDomainCount) {
        this.ignoreDomainCount = ignoreDomainCount;
        return this;
    }
    public Integer getIgnoreDomainCount() {
        return this.ignoreDomainCount;
    }

    public DescribeOutgoingStatisticResponseBody setIgnoreDstIPCount(Integer ignoreDstIPCount) {
        this.ignoreDstIPCount = ignoreDstIPCount;
        return this;
    }
    public Integer getIgnoreDstIPCount() {
        return this.ignoreDstIPCount;
    }

    public DescribeOutgoingStatisticResponseBody setPrivateRiskAssetCount(Long privateRiskAssetCount) {
        this.privateRiskAssetCount = privateRiskAssetCount;
        return this;
    }
    public Long getPrivateRiskAssetCount() {
        return this.privateRiskAssetCount;
    }

    public DescribeOutgoingStatisticResponseBody setPrivateTotalAssetCount(Long privateTotalAssetCount) {
        this.privateTotalAssetCount = privateTotalAssetCount;
        return this;
    }
    public Long getPrivateTotalAssetCount() {
        return this.privateTotalAssetCount;
    }

    public DescribeOutgoingStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOutgoingStatisticResponseBody setRiskAssetCount(Integer riskAssetCount) {
        this.riskAssetCount = riskAssetCount;
        return this;
    }
    public Integer getRiskAssetCount() {
        return this.riskAssetCount;
    }

    public DescribeOutgoingStatisticResponseBody setRiskDomainCount(Integer riskDomainCount) {
        this.riskDomainCount = riskDomainCount;
        return this;
    }
    public Integer getRiskDomainCount() {
        return this.riskDomainCount;
    }

    public DescribeOutgoingStatisticResponseBody setRiskDstIPCount(Integer riskDstIPCount) {
        this.riskDstIPCount = riskDstIPCount;
        return this;
    }
    public Integer getRiskDstIPCount() {
        return this.riskDstIPCount;
    }

    public DescribeOutgoingStatisticResponseBody setSubscribeAssetCount(Integer subscribeAssetCount) {
        this.subscribeAssetCount = subscribeAssetCount;
        return this;
    }
    public Integer getSubscribeAssetCount() {
        return this.subscribeAssetCount;
    }

    public DescribeOutgoingStatisticResponseBody setSubscribeDomainCount(Integer subscribeDomainCount) {
        this.subscribeDomainCount = subscribeDomainCount;
        return this;
    }
    public Integer getSubscribeDomainCount() {
        return this.subscribeDomainCount;
    }

    public DescribeOutgoingStatisticResponseBody setSubscribeDstIPCount(Integer subscribeDstIPCount) {
        this.subscribeDstIPCount = subscribeDstIPCount;
        return this;
    }
    public Integer getSubscribeDstIPCount() {
        return this.subscribeDstIPCount;
    }

    public DescribeOutgoingStatisticResponseBody setTotalAssetCount(Integer totalAssetCount) {
        this.totalAssetCount = totalAssetCount;
        return this;
    }
    public Integer getTotalAssetCount() {
        return this.totalAssetCount;
    }

    public DescribeOutgoingStatisticResponseBody setTotalDomainCount(Integer totalDomainCount) {
        this.totalDomainCount = totalDomainCount;
        return this;
    }
    public Integer getTotalDomainCount() {
        return this.totalDomainCount;
    }

    public DescribeOutgoingStatisticResponseBody setTotalDstIPCount(Integer totalDstIPCount) {
        this.totalDstIPCount = totalDstIPCount;
        return this;
    }
    public Integer getTotalDstIPCount() {
        return this.totalDstIPCount;
    }

    public DescribeOutgoingStatisticResponseBody setTotalProtocolCount(Integer totalProtocolCount) {
        this.totalProtocolCount = totalProtocolCount;
        return this;
    }
    public Integer getTotalProtocolCount() {
        return this.totalProtocolCount;
    }

    public DescribeOutgoingStatisticResponseBody setUncoveredAclDomain(Integer uncoveredAclDomain) {
        this.uncoveredAclDomain = uncoveredAclDomain;
        return this;
    }
    public Integer getUncoveredAclDomain() {
        return this.uncoveredAclDomain;
    }

    public DescribeOutgoingStatisticResponseBody setUncoveredAclDstIP(Integer uncoveredAclDstIP) {
        this.uncoveredAclDstIP = uncoveredAclDstIP;
        return this;
    }
    public Integer getUncoveredAclDstIP() {
        return this.uncoveredAclDstIP;
    }

    public DescribeOutgoingStatisticResponseBody setUnknownProtocolRadio(String unknownProtocolRadio) {
        this.unknownProtocolRadio = unknownProtocolRadio;
        return this;
    }
    public String getUnknownProtocolRadio() {
        return this.unknownProtocolRadio;
    }

}
