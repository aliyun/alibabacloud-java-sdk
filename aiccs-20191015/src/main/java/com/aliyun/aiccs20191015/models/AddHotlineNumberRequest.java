// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class AddHotlineNumberRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("EnableInbound")
    public Boolean enableInbound;

    @NameInMap("EnableInboundEvaluation")
    public Boolean enableInboundEvaluation;

    @NameInMap("EnableOutbound")
    public Boolean enableOutbound;

    @NameInMap("EnableOutboundEvaluation")
    public Boolean enableOutboundEvaluation;

    @NameInMap("EvaluationLevel")
    public Integer evaluationLevel;

    @NameInMap("HotlineNumber")
    public String hotlineNumber;

    @NameInMap("InboundFlowId")
    public Long inboundFlowId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OutboundAllDepart")
    public Boolean outboundAllDepart;

    @NameInMap("OutboundRangeList")
    public java.util.List<AddHotlineNumberRequestOutboundRangeList> outboundRangeList;

    public static AddHotlineNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        AddHotlineNumberRequest self = new AddHotlineNumberRequest();
        return TeaModel.build(map, self);
    }

    public AddHotlineNumberRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddHotlineNumberRequest setEnableInbound(Boolean enableInbound) {
        this.enableInbound = enableInbound;
        return this;
    }
    public Boolean getEnableInbound() {
        return this.enableInbound;
    }

    public AddHotlineNumberRequest setEnableInboundEvaluation(Boolean enableInboundEvaluation) {
        this.enableInboundEvaluation = enableInboundEvaluation;
        return this;
    }
    public Boolean getEnableInboundEvaluation() {
        return this.enableInboundEvaluation;
    }

    public AddHotlineNumberRequest setEnableOutbound(Boolean enableOutbound) {
        this.enableOutbound = enableOutbound;
        return this;
    }
    public Boolean getEnableOutbound() {
        return this.enableOutbound;
    }

    public AddHotlineNumberRequest setEnableOutboundEvaluation(Boolean enableOutboundEvaluation) {
        this.enableOutboundEvaluation = enableOutboundEvaluation;
        return this;
    }
    public Boolean getEnableOutboundEvaluation() {
        return this.enableOutboundEvaluation;
    }

    public AddHotlineNumberRequest setEvaluationLevel(Integer evaluationLevel) {
        this.evaluationLevel = evaluationLevel;
        return this;
    }
    public Integer getEvaluationLevel() {
        return this.evaluationLevel;
    }

    public AddHotlineNumberRequest setHotlineNumber(String hotlineNumber) {
        this.hotlineNumber = hotlineNumber;
        return this;
    }
    public String getHotlineNumber() {
        return this.hotlineNumber;
    }

    public AddHotlineNumberRequest setInboundFlowId(Long inboundFlowId) {
        this.inboundFlowId = inboundFlowId;
        return this;
    }
    public Long getInboundFlowId() {
        return this.inboundFlowId;
    }

    public AddHotlineNumberRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddHotlineNumberRequest setOutboundAllDepart(Boolean outboundAllDepart) {
        this.outboundAllDepart = outboundAllDepart;
        return this;
    }
    public Boolean getOutboundAllDepart() {
        return this.outboundAllDepart;
    }

    public AddHotlineNumberRequest setOutboundRangeList(java.util.List<AddHotlineNumberRequestOutboundRangeList> outboundRangeList) {
        this.outboundRangeList = outboundRangeList;
        return this;
    }
    public java.util.List<AddHotlineNumberRequestOutboundRangeList> getOutboundRangeList() {
        return this.outboundRangeList;
    }

    public static class AddHotlineNumberRequestOutboundRangeList extends TeaModel {
        @NameInMap("DepartmentId")
        public Long departmentId;

        @NameInMap("GroupIdList")
        public java.util.List<Long> groupIdList;

        public static AddHotlineNumberRequestOutboundRangeList build(java.util.Map<String, ?> map) throws Exception {
            AddHotlineNumberRequestOutboundRangeList self = new AddHotlineNumberRequestOutboundRangeList();
            return TeaModel.build(map, self);
        }

        public AddHotlineNumberRequestOutboundRangeList setDepartmentId(Long departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public Long getDepartmentId() {
            return this.departmentId;
        }

        public AddHotlineNumberRequestOutboundRangeList setGroupIdList(java.util.List<Long> groupIdList) {
            this.groupIdList = groupIdList;
            return this;
        }
        public java.util.List<Long> getGroupIdList() {
            return this.groupIdList;
        }

    }

}
