// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ResetHotlineNumberShrinkRequest extends TeaModel {
    // 号码描述
    @NameInMap("Description")
    public String description;

    // 是否用于入呼
    @NameInMap("EnableInbound")
    public Boolean enableInbound;

    // 是否开启入呼满意度
    @NameInMap("EnableInboundEvaluation")
    public Boolean enableInboundEvaluation;

    // 是否用于外呼
    @NameInMap("EnableOutbound")
    public Boolean enableOutbound;

    // 是否开启外呼满意度
    @NameInMap("EnableOutboundEvaluation")
    public Boolean enableOutboundEvaluation;

    // 满意度等级
    @NameInMap("EvaluationLevel")
    public Integer evaluationLevel;

    // 号码
    @NameInMap("HotlineNumber")
    public String hotlineNumber;

    // 入呼ivr流程id
    @NameInMap("InboundFlowId")
    public Long inboundFlowId;

    // 实例id
    @NameInMap("InstanceId")
    public String instanceId;

    // 外呼是否对所有部门生效
    @NameInMap("OutboundAllDepart")
    public Boolean outboundAllDepart;

    // 外呼生效范围
    @NameInMap("OutboundRangeList")
    public String outboundRangeListShrink;

    public static ResetHotlineNumberShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetHotlineNumberShrinkRequest self = new ResetHotlineNumberShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ResetHotlineNumberShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ResetHotlineNumberShrinkRequest setEnableInbound(Boolean enableInbound) {
        this.enableInbound = enableInbound;
        return this;
    }
    public Boolean getEnableInbound() {
        return this.enableInbound;
    }

    public ResetHotlineNumberShrinkRequest setEnableInboundEvaluation(Boolean enableInboundEvaluation) {
        this.enableInboundEvaluation = enableInboundEvaluation;
        return this;
    }
    public Boolean getEnableInboundEvaluation() {
        return this.enableInboundEvaluation;
    }

    public ResetHotlineNumberShrinkRequest setEnableOutbound(Boolean enableOutbound) {
        this.enableOutbound = enableOutbound;
        return this;
    }
    public Boolean getEnableOutbound() {
        return this.enableOutbound;
    }

    public ResetHotlineNumberShrinkRequest setEnableOutboundEvaluation(Boolean enableOutboundEvaluation) {
        this.enableOutboundEvaluation = enableOutboundEvaluation;
        return this;
    }
    public Boolean getEnableOutboundEvaluation() {
        return this.enableOutboundEvaluation;
    }

    public ResetHotlineNumberShrinkRequest setEvaluationLevel(Integer evaluationLevel) {
        this.evaluationLevel = evaluationLevel;
        return this;
    }
    public Integer getEvaluationLevel() {
        return this.evaluationLevel;
    }

    public ResetHotlineNumberShrinkRequest setHotlineNumber(String hotlineNumber) {
        this.hotlineNumber = hotlineNumber;
        return this;
    }
    public String getHotlineNumber() {
        return this.hotlineNumber;
    }

    public ResetHotlineNumberShrinkRequest setInboundFlowId(Long inboundFlowId) {
        this.inboundFlowId = inboundFlowId;
        return this;
    }
    public Long getInboundFlowId() {
        return this.inboundFlowId;
    }

    public ResetHotlineNumberShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ResetHotlineNumberShrinkRequest setOutboundAllDepart(Boolean outboundAllDepart) {
        this.outboundAllDepart = outboundAllDepart;
        return this;
    }
    public Boolean getOutboundAllDepart() {
        return this.outboundAllDepart;
    }

    public ResetHotlineNumberShrinkRequest setOutboundRangeListShrink(String outboundRangeListShrink) {
        this.outboundRangeListShrink = outboundRangeListShrink;
        return this;
    }
    public String getOutboundRangeListShrink() {
        return this.outboundRangeListShrink;
    }

}
