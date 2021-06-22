// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class AddHotlineNumberShrinkRequest extends TeaModel {
    // 实例id
    @NameInMap("InstanceId")
    public String instanceId;

    // 号码
    @NameInMap("HotlineNumber")
    public String hotlineNumber;

    // 号码描述
    @NameInMap("Description")
    public String description;

    // 是否用于入呼
    @NameInMap("EnableInbound")
    public Boolean enableInbound;

    // 入呼ivr流程id
    @NameInMap("InboundFlowId")
    public Long inboundFlowId;

    // 是否用于外呼
    @NameInMap("EnableOutbound")
    public Boolean enableOutbound;

    // 外呼是否对所有部门生效
    @NameInMap("OutboundAllDepart")
    public Boolean outboundAllDepart;

    // 是否开启入呼满意度
    @NameInMap("EnableInboundEvaluation")
    public Boolean enableInboundEvaluation;

    // 是否开启外呼满意度
    @NameInMap("EnableOutboundEvaluation")
    public Boolean enableOutboundEvaluation;

    // 满意度等级
    @NameInMap("EvaluationLevel")
    public Integer evaluationLevel;

    // 外呼生效范围
    @NameInMap("OutboundRangeList")
    public String outboundRangeListShrink;

    public static AddHotlineNumberShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddHotlineNumberShrinkRequest self = new AddHotlineNumberShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddHotlineNumberShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddHotlineNumberShrinkRequest setHotlineNumber(String hotlineNumber) {
        this.hotlineNumber = hotlineNumber;
        return this;
    }
    public String getHotlineNumber() {
        return this.hotlineNumber;
    }

    public AddHotlineNumberShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddHotlineNumberShrinkRequest setEnableInbound(Boolean enableInbound) {
        this.enableInbound = enableInbound;
        return this;
    }
    public Boolean getEnableInbound() {
        return this.enableInbound;
    }

    public AddHotlineNumberShrinkRequest setInboundFlowId(Long inboundFlowId) {
        this.inboundFlowId = inboundFlowId;
        return this;
    }
    public Long getInboundFlowId() {
        return this.inboundFlowId;
    }

    public AddHotlineNumberShrinkRequest setEnableOutbound(Boolean enableOutbound) {
        this.enableOutbound = enableOutbound;
        return this;
    }
    public Boolean getEnableOutbound() {
        return this.enableOutbound;
    }

    public AddHotlineNumberShrinkRequest setOutboundAllDepart(Boolean outboundAllDepart) {
        this.outboundAllDepart = outboundAllDepart;
        return this;
    }
    public Boolean getOutboundAllDepart() {
        return this.outboundAllDepart;
    }

    public AddHotlineNumberShrinkRequest setEnableInboundEvaluation(Boolean enableInboundEvaluation) {
        this.enableInboundEvaluation = enableInboundEvaluation;
        return this;
    }
    public Boolean getEnableInboundEvaluation() {
        return this.enableInboundEvaluation;
    }

    public AddHotlineNumberShrinkRequest setEnableOutboundEvaluation(Boolean enableOutboundEvaluation) {
        this.enableOutboundEvaluation = enableOutboundEvaluation;
        return this;
    }
    public Boolean getEnableOutboundEvaluation() {
        return this.enableOutboundEvaluation;
    }

    public AddHotlineNumberShrinkRequest setEvaluationLevel(Integer evaluationLevel) {
        this.evaluationLevel = evaluationLevel;
        return this;
    }
    public Integer getEvaluationLevel() {
        return this.evaluationLevel;
    }

    public AddHotlineNumberShrinkRequest setOutboundRangeListShrink(String outboundRangeListShrink) {
        this.outboundRangeListShrink = outboundRangeListShrink;
        return this;
    }
    public String getOutboundRangeListShrink() {
        return this.outboundRangeListShrink;
    }

}
