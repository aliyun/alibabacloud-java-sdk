// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ResetHotlineNumberRequest extends TeaModel {
    /**
     * <p>Number description.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>热线号码</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Indicates whether the number is used for inbound calls.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableInbound")
    public Boolean enableInbound;

    /**
     * <p>Whether inbound call satisfaction evaluation is enabled.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableInboundEvaluation")
    public Boolean enableInboundEvaluation;

    /**
     * <p>Whether used for outbound calls.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableOutbound")
    public Boolean enableOutbound;

    /**
     * <p>Indicates whether outbound satisfaction evaluation is enabled.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableOutboundEvaluation")
    public Boolean enableOutboundEvaluation;

    /**
     * <p>Satisfaction level. Valid values:</p>
     * <ul>
     * <li><strong>2</strong>: Two-level (Satisfied, Not Satisfied)</li>
     * <li><strong>3</strong>: Three-level (Satisfied, Neutral, Not Satisfied)</li>
     * <li><strong>4</strong>: Four-level (Very Satisfied, Satisfied, Neutral, Not Satisfied)</li>
     * <li><strong>5</strong>: Five-level (Very Satisfied, Satisfied, Neutral, Not Satisfied, Very Poor)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("EvaluationLevel")
    public Integer evaluationLevel;

    /**
     * <p>Hotline number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0571********</p>
     */
    @NameInMap("HotlineNumber")
    public String hotlineNumber;

    /**
     * <p>The IVR flow ID for inbound calls.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("InboundFlowId")
    public Long inboundFlowId;

    /**
     * <p>The Artificial Intelligence Cloud Call Service (AICCS) instance ID. You can obtain it from the console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre-cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Indicates whether outbound calls apply to all departments.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OutboundAllDepart")
    public Boolean outboundAllDepart;

    /**
     * <p>Outbound call effective scope.</p>
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
         * <p>Effective department ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("DepartmentId")
        public Long departmentId;

        /**
         * <p>List of effective skill groups.</p>
         * <blockquote>
         * <p>If the skill group list is empty, the setting applies to the entire department. Otherwise, it applies only to the specified skill groups under the department.</p>
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
