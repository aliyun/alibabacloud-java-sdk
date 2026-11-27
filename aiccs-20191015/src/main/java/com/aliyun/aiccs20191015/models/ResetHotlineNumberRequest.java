// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ResetHotlineNumberRequest extends TeaModel {
    /**
     * <p>The description of the hotline number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Hotline number</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether the hotline number is used for inbound calls.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableInbound")
    public Boolean enableInbound;

    /**
     * <p>Specifies whether to enable the satisfaction survey for inbound calls.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableInboundEvaluation")
    public Boolean enableInboundEvaluation;

    /**
     * <p>Specifies whether the hotline number is used for outbound calls.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableOutbound")
    public Boolean enableOutbound;

    /**
     * <p>Specifies whether to enable the satisfaction survey for outbound calls.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableOutboundEvaluation")
    public Boolean enableOutboundEvaluation;

    /**
     * <p>The satisfaction survey level. Valid values:</p>
     * <ul>
     * <li><strong>2</strong>: level 2 (satisfied, dissatisfied)</li>
     * <li><strong>3</strong>: level 3 (satisfied, neutral, dissatisfied)</li>
     * <li><strong>4</strong>: level 4 (very satisfied, satisfied, neutral, dissatisfied)</li>
     * <li><strong>5</strong>: level 5 (very satisfied, satisfied, neutral, dissatisfied, very poor)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("EvaluationLevel")
    public Integer evaluationLevel;

    /**
     * <p>The hotline number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0571********</p>
     */
    @NameInMap("HotlineNumber")
    public String hotlineNumber;

    /**
     * <p>The ID of the inbound Interactive Voice Response (IVR) flow.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("InboundFlowId")
    public Long inboundFlowId;

    /**
     * <p>Instance ID of the Artificial Intelligence Cloud Call Service (AICCS) instance. You can obtain instance ID from the AICCS console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre-cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether outbound calls apply to all departments.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OutboundAllDepart")
    public Boolean outboundAllDepart;

    /**
     * <p>The effective scope of outbound calls.</p>
     */
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
        /**
         * <p>The ID of the effective department.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("DepartmentId")
        public Long departmentId;

        /**
         * <p>The list of effective skill groups.</p>
         * <blockquote>
         * <p>If the skill group list is empty, the configuration applies to the entire department. Otherwise, it applies only to the specified skill groups under the department.</p>
         * </blockquote>
         */
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
