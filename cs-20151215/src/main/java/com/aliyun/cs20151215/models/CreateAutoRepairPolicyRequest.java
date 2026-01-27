// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateAutoRepairPolicyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>ess</p>
     */
    @NameInMap("resource_sub_type")
    public String resourceSubType;

    /**
     * <strong>example:</strong>
     * <p>nodepool</p>
     */
    @NameInMap("resource_type")
    public String resourceType;

    /**
     * <strong>example:</strong>
     * <p>[&quot;np-xxx&quot;]</p>
     */
    @NameInMap("rules")
    public java.util.List<CreateAutoRepairPolicyRequestRules> rules;

    public static CreateAutoRepairPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoRepairPolicyRequest self = new CreateAutoRepairPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateAutoRepairPolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAutoRepairPolicyRequest setResourceSubType(String resourceSubType) {
        this.resourceSubType = resourceSubType;
        return this;
    }
    public String getResourceSubType() {
        return this.resourceSubType;
    }

    public CreateAutoRepairPolicyRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public CreateAutoRepairPolicyRequest setRules(java.util.List<CreateAutoRepairPolicyRequestRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<CreateAutoRepairPolicyRequestRules> getRules() {
        return this.rules;
    }

    public static class CreateAutoRepairPolicyRequestRulesIncidentsConditions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("reason")
        public String reason;

        /**
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>KubeletReady</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateAutoRepairPolicyRequestRulesIncidentsConditions build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoRepairPolicyRequestRulesIncidentsConditions self = new CreateAutoRepairPolicyRequestRulesIncidentsConditions();
            return TeaModel.build(map, self);
        }

        public CreateAutoRepairPolicyRequestRulesIncidentsConditions setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public CreateAutoRepairPolicyRequestRulesIncidentsConditions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateAutoRepairPolicyRequestRulesIncidentsConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateAutoRepairPolicyRequestRulesIncidentsEvents extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("reason")
        public String reason;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateAutoRepairPolicyRequestRulesIncidentsEvents build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoRepairPolicyRequestRulesIncidentsEvents self = new CreateAutoRepairPolicyRequestRulesIncidentsEvents();
            return TeaModel.build(map, self);
        }

        public CreateAutoRepairPolicyRequestRulesIncidentsEvents setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public CreateAutoRepairPolicyRequestRulesIncidentsEvents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateAutoRepairPolicyRequestRulesIncidents extends TeaModel {
        @NameInMap("conditions")
        public java.util.List<CreateAutoRepairPolicyRequestRulesIncidentsConditions> conditions;

        @NameInMap("events")
        public java.util.List<CreateAutoRepairPolicyRequestRulesIncidentsEvents> events;

        /**
         * <strong>example:</strong>
         * <p>Node.FaultNeedReboot.HOST</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateAutoRepairPolicyRequestRulesIncidents build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoRepairPolicyRequestRulesIncidents self = new CreateAutoRepairPolicyRequestRulesIncidents();
            return TeaModel.build(map, self);
        }

        public CreateAutoRepairPolicyRequestRulesIncidents setConditions(java.util.List<CreateAutoRepairPolicyRequestRulesIncidentsConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<CreateAutoRepairPolicyRequestRulesIncidentsConditions> getConditions() {
            return this.conditions;
        }

        public CreateAutoRepairPolicyRequestRulesIncidents setEvents(java.util.List<CreateAutoRepairPolicyRequestRulesIncidentsEvents> events) {
            this.events = events;
            return this;
        }
        public java.util.List<CreateAutoRepairPolicyRequestRulesIncidentsEvents> getEvents() {
            return this.events;
        }

        public CreateAutoRepairPolicyRequestRulesIncidents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateAutoRepairPolicyRequestRulesIncidents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateAutoRepairPolicyRequestRulesRepairProcedureInterventionApprovedLabel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>k8s.aliyun.com/incident</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>approved</p>
         */
        @NameInMap("value")
        public String value;

        public static CreateAutoRepairPolicyRequestRulesRepairProcedureInterventionApprovedLabel build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoRepairPolicyRequestRulesRepairProcedureInterventionApprovedLabel self = new CreateAutoRepairPolicyRequestRulesRepairProcedureInterventionApprovedLabel();
            return TeaModel.build(map, self);
        }

        public CreateAutoRepairPolicyRequestRulesRepairProcedureInterventionApprovedLabel setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAutoRepairPolicyRequestRulesRepairProcedureInterventionApprovedLabel setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateAutoRepairPolicyRequestRulesRepairProcedureInterventionInquiringLabel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>k8s.aliyun.com/incident</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>inquiring</p>
         */
        @NameInMap("value")
        public String value;

        public static CreateAutoRepairPolicyRequestRulesRepairProcedureInterventionInquiringLabel build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoRepairPolicyRequestRulesRepairProcedureInterventionInquiringLabel self = new CreateAutoRepairPolicyRequestRulesRepairProcedureInterventionInquiringLabel();
            return TeaModel.build(map, self);
        }

        public CreateAutoRepairPolicyRequestRulesRepairProcedureInterventionInquiringLabel setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAutoRepairPolicyRequestRulesRepairProcedureInterventionInquiringLabel setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateAutoRepairPolicyRequestRulesRepairProcedureIntervention extends TeaModel {
        @NameInMap("approved_label")
        public CreateAutoRepairPolicyRequestRulesRepairProcedureInterventionApprovedLabel approvedLabel;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("inquiring_label")
        public CreateAutoRepairPolicyRequestRulesRepairProcedureInterventionInquiringLabel inquiringLabel;

        /**
         * <strong>example:</strong>
         * <p>label</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateAutoRepairPolicyRequestRulesRepairProcedureIntervention build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoRepairPolicyRequestRulesRepairProcedureIntervention self = new CreateAutoRepairPolicyRequestRulesRepairProcedureIntervention();
            return TeaModel.build(map, self);
        }

        public CreateAutoRepairPolicyRequestRulesRepairProcedureIntervention setApprovedLabel(CreateAutoRepairPolicyRequestRulesRepairProcedureInterventionApprovedLabel approvedLabel) {
            this.approvedLabel = approvedLabel;
            return this;
        }
        public CreateAutoRepairPolicyRequestRulesRepairProcedureInterventionApprovedLabel getApprovedLabel() {
            return this.approvedLabel;
        }

        public CreateAutoRepairPolicyRequestRulesRepairProcedureIntervention setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public CreateAutoRepairPolicyRequestRulesRepairProcedureIntervention setInquiringLabel(CreateAutoRepairPolicyRequestRulesRepairProcedureInterventionInquiringLabel inquiringLabel) {
            this.inquiringLabel = inquiringLabel;
            return this;
        }
        public CreateAutoRepairPolicyRequestRulesRepairProcedureInterventionInquiringLabel getInquiringLabel() {
            return this.inquiringLabel;
        }

        public CreateAutoRepairPolicyRequestRulesRepairProcedureIntervention setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateAutoRepairPolicyRequestRulesRepairProcedure extends TeaModel {
        @NameInMap("config")
        public java.util.Map<String, ?> config;

        @NameInMap("intervention")
        public CreateAutoRepairPolicyRequestRulesRepairProcedureIntervention intervention;

        /**
         * <strong>example:</strong>
         * <p>Drain</p>
         */
        @NameInMap("name")
        public String name;

        public static CreateAutoRepairPolicyRequestRulesRepairProcedure build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoRepairPolicyRequestRulesRepairProcedure self = new CreateAutoRepairPolicyRequestRulesRepairProcedure();
            return TeaModel.build(map, self);
        }

        public CreateAutoRepairPolicyRequestRulesRepairProcedure setConfig(java.util.Map<String, ?> config) {
            this.config = config;
            return this;
        }
        public java.util.Map<String, ?> getConfig() {
            return this.config;
        }

        public CreateAutoRepairPolicyRequestRulesRepairProcedure setIntervention(CreateAutoRepairPolicyRequestRulesRepairProcedureIntervention intervention) {
            this.intervention = intervention;
            return this;
        }
        public CreateAutoRepairPolicyRequestRulesRepairProcedureIntervention getIntervention() {
            return this.intervention;
        }

        public CreateAutoRepairPolicyRequestRulesRepairProcedure setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateAutoRepairPolicyRequestRules extends TeaModel {
        @NameInMap("incidents")
        public java.util.List<CreateAutoRepairPolicyRequestRulesIncidents> incidents;

        @NameInMap("repair_procedure")
        public java.util.List<CreateAutoRepairPolicyRequestRulesRepairProcedure> repairProcedure;

        public static CreateAutoRepairPolicyRequestRules build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoRepairPolicyRequestRules self = new CreateAutoRepairPolicyRequestRules();
            return TeaModel.build(map, self);
        }

        public CreateAutoRepairPolicyRequestRules setIncidents(java.util.List<CreateAutoRepairPolicyRequestRulesIncidents> incidents) {
            this.incidents = incidents;
            return this;
        }
        public java.util.List<CreateAutoRepairPolicyRequestRulesIncidents> getIncidents() {
            return this.incidents;
        }

        public CreateAutoRepairPolicyRequestRules setRepairProcedure(java.util.List<CreateAutoRepairPolicyRequestRulesRepairProcedure> repairProcedure) {
            this.repairProcedure = repairProcedure;
            return this;
        }
        public java.util.List<CreateAutoRepairPolicyRequestRulesRepairProcedure> getRepairProcedure() {
            return this.repairProcedure;
        }

    }

}
