// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeAutoRepairPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>r-xxx</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("resource_ids")
    public java.util.List<String> resourceIds;

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

    @NameInMap("rules")
    public java.util.List<DescribeAutoRepairPolicyResponseBodyRules> rules;

    public static DescribeAutoRepairPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoRepairPolicyResponseBody self = new DescribeAutoRepairPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAutoRepairPolicyResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeAutoRepairPolicyResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeAutoRepairPolicyResponseBody setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public DescribeAutoRepairPolicyResponseBody setResourceSubType(String resourceSubType) {
        this.resourceSubType = resourceSubType;
        return this;
    }
    public String getResourceSubType() {
        return this.resourceSubType;
    }

    public DescribeAutoRepairPolicyResponseBody setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeAutoRepairPolicyResponseBody setRules(java.util.List<DescribeAutoRepairPolicyResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<DescribeAutoRepairPolicyResponseBodyRules> getRules() {
        return this.rules;
    }

    public static class DescribeAutoRepairPolicyResponseBodyRulesIncidentsConditions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
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

        public static DescribeAutoRepairPolicyResponseBodyRulesIncidentsConditions build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoRepairPolicyResponseBodyRulesIncidentsConditions self = new DescribeAutoRepairPolicyResponseBodyRulesIncidentsConditions();
            return TeaModel.build(map, self);
        }

        public DescribeAutoRepairPolicyResponseBodyRulesIncidentsConditions setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeAutoRepairPolicyResponseBodyRulesIncidentsConditions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAutoRepairPolicyResponseBodyRulesIncidentsConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeAutoRepairPolicyResponseBodyRulesIncidentsEvents extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("reason")
        public String reason;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("type")
        public String type;

        public static DescribeAutoRepairPolicyResponseBodyRulesIncidentsEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoRepairPolicyResponseBodyRulesIncidentsEvents self = new DescribeAutoRepairPolicyResponseBodyRulesIncidentsEvents();
            return TeaModel.build(map, self);
        }

        public DescribeAutoRepairPolicyResponseBodyRulesIncidentsEvents setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeAutoRepairPolicyResponseBodyRulesIncidentsEvents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeAutoRepairPolicyResponseBodyRulesIncidents extends TeaModel {
        @NameInMap("conditions")
        public java.util.List<DescribeAutoRepairPolicyResponseBodyRulesIncidentsConditions> conditions;

        @NameInMap("events")
        public java.util.List<DescribeAutoRepairPolicyResponseBodyRulesIncidentsEvents> events;

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

        public static DescribeAutoRepairPolicyResponseBodyRulesIncidents build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoRepairPolicyResponseBodyRulesIncidents self = new DescribeAutoRepairPolicyResponseBodyRulesIncidents();
            return TeaModel.build(map, self);
        }

        public DescribeAutoRepairPolicyResponseBodyRulesIncidents setConditions(java.util.List<DescribeAutoRepairPolicyResponseBodyRulesIncidentsConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<DescribeAutoRepairPolicyResponseBodyRulesIncidentsConditions> getConditions() {
            return this.conditions;
        }

        public DescribeAutoRepairPolicyResponseBodyRulesIncidents setEvents(java.util.List<DescribeAutoRepairPolicyResponseBodyRulesIncidentsEvents> events) {
            this.events = events;
            return this;
        }
        public java.util.List<DescribeAutoRepairPolicyResponseBodyRulesIncidentsEvents> getEvents() {
            return this.events;
        }

        public DescribeAutoRepairPolicyResponseBodyRulesIncidents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAutoRepairPolicyResponseBodyRulesIncidents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeAutoRepairPolicyResponseBodyRulesRepairProcedureInterventionApprovedLabel extends TeaModel {
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

        public static DescribeAutoRepairPolicyResponseBodyRulesRepairProcedureInterventionApprovedLabel build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoRepairPolicyResponseBodyRulesRepairProcedureInterventionApprovedLabel self = new DescribeAutoRepairPolicyResponseBodyRulesRepairProcedureInterventionApprovedLabel();
            return TeaModel.build(map, self);
        }

        public DescribeAutoRepairPolicyResponseBodyRulesRepairProcedureInterventionApprovedLabel setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAutoRepairPolicyResponseBodyRulesRepairProcedureInterventionApprovedLabel setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeAutoRepairPolicyResponseBodyRulesRepairProcedureInterventionInquiringLabel extends TeaModel {
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

        public static DescribeAutoRepairPolicyResponseBodyRulesRepairProcedureInterventionInquiringLabel build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoRepairPolicyResponseBodyRulesRepairProcedureInterventionInquiringLabel self = new DescribeAutoRepairPolicyResponseBodyRulesRepairProcedureInterventionInquiringLabel();
            return TeaModel.build(map, self);
        }

        public DescribeAutoRepairPolicyResponseBodyRulesRepairProcedureInterventionInquiringLabel setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAutoRepairPolicyResponseBodyRulesRepairProcedureInterventionInquiringLabel setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeAutoRepairPolicyResponseBodyRulesRepairProcedureIntervention extends TeaModel {
        @NameInMap("approved_label")
        public DescribeAutoRepairPolicyResponseBodyRulesRepairProcedureInterventionApprovedLabel approvedLabel;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public String enable;

        @NameInMap("inquiring_label")
        public DescribeAutoRepairPolicyResponseBodyRulesRepairProcedureInterventionInquiringLabel inquiringLabel;

        /**
         * <strong>example:</strong>
         * <p>label</p>
         */
        @NameInMap("type")
        public String type;

        public static DescribeAutoRepairPolicyResponseBodyRulesRepairProcedureIntervention build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoRepairPolicyResponseBodyRulesRepairProcedureIntervention self = new DescribeAutoRepairPolicyResponseBodyRulesRepairProcedureIntervention();
            return TeaModel.build(map, self);
        }

        public DescribeAutoRepairPolicyResponseBodyRulesRepairProcedureIntervention setApprovedLabel(DescribeAutoRepairPolicyResponseBodyRulesRepairProcedureInterventionApprovedLabel approvedLabel) {
            this.approvedLabel = approvedLabel;
            return this;
        }
        public DescribeAutoRepairPolicyResponseBodyRulesRepairProcedureInterventionApprovedLabel getApprovedLabel() {
            return this.approvedLabel;
        }

        public DescribeAutoRepairPolicyResponseBodyRulesRepairProcedureIntervention setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public DescribeAutoRepairPolicyResponseBodyRulesRepairProcedureIntervention setInquiringLabel(DescribeAutoRepairPolicyResponseBodyRulesRepairProcedureInterventionInquiringLabel inquiringLabel) {
            this.inquiringLabel = inquiringLabel;
            return this;
        }
        public DescribeAutoRepairPolicyResponseBodyRulesRepairProcedureInterventionInquiringLabel getInquiringLabel() {
            return this.inquiringLabel;
        }

        public DescribeAutoRepairPolicyResponseBodyRulesRepairProcedureIntervention setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeAutoRepairPolicyResponseBodyRulesRepairProcedure extends TeaModel {
        @NameInMap("config")
        public java.util.Map<String, ?> config;

        @NameInMap("intervention")
        public DescribeAutoRepairPolicyResponseBodyRulesRepairProcedureIntervention intervention;

        /**
         * <strong>example:</strong>
         * <p>QuarantineGPU</p>
         */
        @NameInMap("name")
        public String name;

        public static DescribeAutoRepairPolicyResponseBodyRulesRepairProcedure build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoRepairPolicyResponseBodyRulesRepairProcedure self = new DescribeAutoRepairPolicyResponseBodyRulesRepairProcedure();
            return TeaModel.build(map, self);
        }

        public DescribeAutoRepairPolicyResponseBodyRulesRepairProcedure setConfig(java.util.Map<String, ?> config) {
            this.config = config;
            return this;
        }
        public java.util.Map<String, ?> getConfig() {
            return this.config;
        }

        public DescribeAutoRepairPolicyResponseBodyRulesRepairProcedure setIntervention(DescribeAutoRepairPolicyResponseBodyRulesRepairProcedureIntervention intervention) {
            this.intervention = intervention;
            return this;
        }
        public DescribeAutoRepairPolicyResponseBodyRulesRepairProcedureIntervention getIntervention() {
            return this.intervention;
        }

        public DescribeAutoRepairPolicyResponseBodyRulesRepairProcedure setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeAutoRepairPolicyResponseBodyRules extends TeaModel {
        @NameInMap("incidents")
        public java.util.List<DescribeAutoRepairPolicyResponseBodyRulesIncidents> incidents;

        @NameInMap("repair_procedure")
        public java.util.List<DescribeAutoRepairPolicyResponseBodyRulesRepairProcedure> repairProcedure;

        public static DescribeAutoRepairPolicyResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoRepairPolicyResponseBodyRules self = new DescribeAutoRepairPolicyResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribeAutoRepairPolicyResponseBodyRules setIncidents(java.util.List<DescribeAutoRepairPolicyResponseBodyRulesIncidents> incidents) {
            this.incidents = incidents;
            return this;
        }
        public java.util.List<DescribeAutoRepairPolicyResponseBodyRulesIncidents> getIncidents() {
            return this.incidents;
        }

        public DescribeAutoRepairPolicyResponseBodyRules setRepairProcedure(java.util.List<DescribeAutoRepairPolicyResponseBodyRulesRepairProcedure> repairProcedure) {
            this.repairProcedure = repairProcedure;
            return this;
        }
        public java.util.List<DescribeAutoRepairPolicyResponseBodyRulesRepairProcedure> getRepairProcedure() {
            return this.repairProcedure;
        }

    }

}
