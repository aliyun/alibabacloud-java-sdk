// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.buss20220822.models;

import com.aliyun.tea.*;

public class RiskEventSyncRequest extends TeaModel {
    @NameInMap("Deleted")
    public Boolean deleted;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DiscoveryTime")
    public Long discoveryTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EventName")
    public String eventName;

    @NameInMap("EventNumber")
    public String eventNumber;

    @NameInMap("RelevanceBu")
    public String relevanceBu;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RiskDetail")
    public String riskDetail;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RiskEffectType")
    public String riskEffectType;

    @NameInMap("RiskLevel")
    public String riskLevel;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RiskType")
    public String riskType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Submitter")
    public String submitter;

    public static RiskEventSyncRequest build(java.util.Map<String, ?> map) throws Exception {
        RiskEventSyncRequest self = new RiskEventSyncRequest();
        return TeaModel.build(map, self);
    }

    public RiskEventSyncRequest setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    public Boolean getDeleted() {
        return this.deleted;
    }

    public RiskEventSyncRequest setDiscoveryTime(Long discoveryTime) {
        this.discoveryTime = discoveryTime;
        return this;
    }
    public Long getDiscoveryTime() {
        return this.discoveryTime;
    }

    public RiskEventSyncRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public RiskEventSyncRequest setEventNumber(String eventNumber) {
        this.eventNumber = eventNumber;
        return this;
    }
    public String getEventNumber() {
        return this.eventNumber;
    }

    public RiskEventSyncRequest setRelevanceBu(String relevanceBu) {
        this.relevanceBu = relevanceBu;
        return this;
    }
    public String getRelevanceBu() {
        return this.relevanceBu;
    }

    public RiskEventSyncRequest setRiskDetail(String riskDetail) {
        this.riskDetail = riskDetail;
        return this;
    }
    public String getRiskDetail() {
        return this.riskDetail;
    }

    public RiskEventSyncRequest setRiskEffectType(String riskEffectType) {
        this.riskEffectType = riskEffectType;
        return this;
    }
    public String getRiskEffectType() {
        return this.riskEffectType;
    }

    public RiskEventSyncRequest setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public RiskEventSyncRequest setRiskType(String riskType) {
        this.riskType = riskType;
        return this;
    }
    public String getRiskType() {
        return this.riskType;
    }

    public RiskEventSyncRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public RiskEventSyncRequest setSubmitter(String submitter) {
        this.submitter = submitter;
        return this;
    }
    public String getSubmitter() {
        return this.submitter;
    }

}
