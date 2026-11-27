// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class AddHotlineNumberRequest extends TeaModel {
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
     * <p>The satisfaction level. Valid values:</p>
     * <ul>
     * <li><strong>2</strong>: Level 2 (Satisfied, Dissatisfied).</li>
     * <li><strong>3</strong>: Level 3 (Satisfied, Neutral, Dissatisfied).</li>
     * <li><strong>4</strong>: Level 4 (Very satisfied, Satisfied, Neutral, Dissatisfied).</li>
     * <li><strong>5</strong>: Level 5 (Very satisfied, Satisfied, Neutral, Dissatisfied, Very dissatisfied).</li>
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
     * <p>05710000****</p>
     */
    @NameInMap("HotlineNumber")
    public String hotlineNumber;

    /**
     * <p>The ID of the inbound IVR flow. You can obtain the ID from the Hotline &gt; Channel Access &gt; IVR Flow Management page in the SaaS workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("InboundFlowId")
    public Long inboundFlowId;

    /**
     * <p>The Artificial Intelligence Cloud Call Service instance ID. You can obtain the ID from the Artificial Intelligence Cloud Call Service console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre-cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether outbound calls apply to all departments under the instance.</p>
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
