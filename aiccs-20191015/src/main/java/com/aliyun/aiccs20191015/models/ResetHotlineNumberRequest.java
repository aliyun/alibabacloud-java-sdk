// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ResetHotlineNumberRequest extends TeaModel {
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
    public java.util.List<ResetHotlineNumberRequestOutboundRangeList> outboundRangeList;

    public static ResetHotlineNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetHotlineNumberRequest self = new ResetHotlineNumberRequest();
        return TeaModel.build(map, self);
    }

    public ResetHotlineNumberRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ResetHotlineNumberRequest setEnableInbound(Boolean enableInbound) {
        this.enableInbound = enableInbound;
        return this;
    }
    public Boolean getEnableInbound() {
        return this.enableInbound;
    }

    public ResetHotlineNumberRequest setEnableInboundEvaluation(Boolean enableInboundEvaluation) {
        this.enableInboundEvaluation = enableInboundEvaluation;
        return this;
    }
    public Boolean getEnableInboundEvaluation() {
        return this.enableInboundEvaluation;
    }

    public ResetHotlineNumberRequest setEnableOutbound(Boolean enableOutbound) {
        this.enableOutbound = enableOutbound;
        return this;
    }
    public Boolean getEnableOutbound() {
        return this.enableOutbound;
    }

    public ResetHotlineNumberRequest setEnableOutboundEvaluation(Boolean enableOutboundEvaluation) {
        this.enableOutboundEvaluation = enableOutboundEvaluation;
        return this;
    }
    public Boolean getEnableOutboundEvaluation() {
        return this.enableOutboundEvaluation;
    }

    public ResetHotlineNumberRequest setEvaluationLevel(Integer evaluationLevel) {
        this.evaluationLevel = evaluationLevel;
        return this;
    }
    public Integer getEvaluationLevel() {
        return this.evaluationLevel;
    }

    public ResetHotlineNumberRequest setHotlineNumber(String hotlineNumber) {
        this.hotlineNumber = hotlineNumber;
        return this;
    }
    public String getHotlineNumber() {
        return this.hotlineNumber;
    }

    public ResetHotlineNumberRequest setInboundFlowId(Long inboundFlowId) {
        this.inboundFlowId = inboundFlowId;
        return this;
    }
    public Long getInboundFlowId() {
        return this.inboundFlowId;
    }

    public ResetHotlineNumberRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ResetHotlineNumberRequest setOutboundAllDepart(Boolean outboundAllDepart) {
        this.outboundAllDepart = outboundAllDepart;
        return this;
    }
    public Boolean getOutboundAllDepart() {
        return this.outboundAllDepart;
    }

    public ResetHotlineNumberRequest setOutboundRangeList(java.util.List<ResetHotlineNumberRequestOutboundRangeList> outboundRangeList) {
        this.outboundRangeList = outboundRangeList;
        return this;
    }
    public java.util.List<ResetHotlineNumberRequestOutboundRangeList> getOutboundRangeList() {
        return this.outboundRangeList;
    }

    public static class ResetHotlineNumberRequestOutboundRangeList extends TeaModel {
        // 生效部门id
        @NameInMap("DepartmentId")
        public Long departmentId;

        // 生效技能组列表（部门123下）
        @NameInMap("GroupIdList")
        public java.util.List<Long> groupIdList;

        public static ResetHotlineNumberRequestOutboundRangeList build(java.util.Map<String, ?> map) throws Exception {
            ResetHotlineNumberRequestOutboundRangeList self = new ResetHotlineNumberRequestOutboundRangeList();
            return TeaModel.build(map, self);
        }

        public ResetHotlineNumberRequestOutboundRangeList setDepartmentId(Long departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public Long getDepartmentId() {
            return this.departmentId;
        }

        public ResetHotlineNumberRequestOutboundRangeList setGroupIdList(java.util.List<Long> groupIdList) {
            this.groupIdList = groupIdList;
            return this;
        }
        public java.util.List<Long> getGroupIdList() {
            return this.groupIdList;
        }

    }

}
