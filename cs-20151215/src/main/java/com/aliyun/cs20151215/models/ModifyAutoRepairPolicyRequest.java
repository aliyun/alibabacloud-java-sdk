// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyAutoRepairPolicyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("rules")
    public java.util.List<ModifyAutoRepairPolicyRequestRules> rules;

    public static ModifyAutoRepairPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoRepairPolicyRequest self = new ModifyAutoRepairPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAutoRepairPolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyAutoRepairPolicyRequest setRules(java.util.List<ModifyAutoRepairPolicyRequestRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<ModifyAutoRepairPolicyRequestRules> getRules() {
        return this.rules;
    }

    public static class ModifyAutoRepairPolicyRequestRulesIncidentsConditions extends TeaModel {
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

        public static ModifyAutoRepairPolicyRequestRulesIncidentsConditions build(java.util.Map<String, ?> map) throws Exception {
            ModifyAutoRepairPolicyRequestRulesIncidentsConditions self = new ModifyAutoRepairPolicyRequestRulesIncidentsConditions();
            return TeaModel.build(map, self);
        }

        public ModifyAutoRepairPolicyRequestRulesIncidentsConditions setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ModifyAutoRepairPolicyRequestRulesIncidentsConditions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ModifyAutoRepairPolicyRequestRulesIncidentsConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ModifyAutoRepairPolicyRequestRulesIncidentsEvents extends TeaModel {
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

        public static ModifyAutoRepairPolicyRequestRulesIncidentsEvents build(java.util.Map<String, ?> map) throws Exception {
            ModifyAutoRepairPolicyRequestRulesIncidentsEvents self = new ModifyAutoRepairPolicyRequestRulesIncidentsEvents();
            return TeaModel.build(map, self);
        }

        public ModifyAutoRepairPolicyRequestRulesIncidentsEvents setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ModifyAutoRepairPolicyRequestRulesIncidentsEvents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ModifyAutoRepairPolicyRequestRulesIncidents extends TeaModel {
        @NameInMap("conditions")
        public java.util.List<ModifyAutoRepairPolicyRequestRulesIncidentsConditions> conditions;

        @NameInMap("events")
        public java.util.List<ModifyAutoRepairPolicyRequestRulesIncidentsEvents> events;

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

        public static ModifyAutoRepairPolicyRequestRulesIncidents build(java.util.Map<String, ?> map) throws Exception {
            ModifyAutoRepairPolicyRequestRulesIncidents self = new ModifyAutoRepairPolicyRequestRulesIncidents();
            return TeaModel.build(map, self);
        }

        public ModifyAutoRepairPolicyRequestRulesIncidents setConditions(java.util.List<ModifyAutoRepairPolicyRequestRulesIncidentsConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<ModifyAutoRepairPolicyRequestRulesIncidentsConditions> getConditions() {
            return this.conditions;
        }

        public ModifyAutoRepairPolicyRequestRulesIncidents setEvents(java.util.List<ModifyAutoRepairPolicyRequestRulesIncidentsEvents> events) {
            this.events = events;
            return this;
        }
        public java.util.List<ModifyAutoRepairPolicyRequestRulesIncidentsEvents> getEvents() {
            return this.events;
        }

        public ModifyAutoRepairPolicyRequestRulesIncidents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyAutoRepairPolicyRequestRulesIncidents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ModifyAutoRepairPolicyRequestRulesRepairProcedureInterventionApprovedLabel extends TeaModel {
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

        public static ModifyAutoRepairPolicyRequestRulesRepairProcedureInterventionApprovedLabel build(java.util.Map<String, ?> map) throws Exception {
            ModifyAutoRepairPolicyRequestRulesRepairProcedureInterventionApprovedLabel self = new ModifyAutoRepairPolicyRequestRulesRepairProcedureInterventionApprovedLabel();
            return TeaModel.build(map, self);
        }

        public ModifyAutoRepairPolicyRequestRulesRepairProcedureInterventionApprovedLabel setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ModifyAutoRepairPolicyRequestRulesRepairProcedureInterventionApprovedLabel setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ModifyAutoRepairPolicyRequestRulesRepairProcedureInterventionInquiringLabel extends TeaModel {
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

        public static ModifyAutoRepairPolicyRequestRulesRepairProcedureInterventionInquiringLabel build(java.util.Map<String, ?> map) throws Exception {
            ModifyAutoRepairPolicyRequestRulesRepairProcedureInterventionInquiringLabel self = new ModifyAutoRepairPolicyRequestRulesRepairProcedureInterventionInquiringLabel();
            return TeaModel.build(map, self);
        }

        public ModifyAutoRepairPolicyRequestRulesRepairProcedureInterventionInquiringLabel setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ModifyAutoRepairPolicyRequestRulesRepairProcedureInterventionInquiringLabel setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ModifyAutoRepairPolicyRequestRulesRepairProcedureIntervention extends TeaModel {
        @NameInMap("approved_label")
        public ModifyAutoRepairPolicyRequestRulesRepairProcedureInterventionApprovedLabel approvedLabel;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("inquiring_label")
        public ModifyAutoRepairPolicyRequestRulesRepairProcedureInterventionInquiringLabel inquiringLabel;

        /**
         * <strong>example:</strong>
         * <p>label</p>
         */
        @NameInMap("type")
        public String type;

        public static ModifyAutoRepairPolicyRequestRulesRepairProcedureIntervention build(java.util.Map<String, ?> map) throws Exception {
            ModifyAutoRepairPolicyRequestRulesRepairProcedureIntervention self = new ModifyAutoRepairPolicyRequestRulesRepairProcedureIntervention();
            return TeaModel.build(map, self);
        }

        public ModifyAutoRepairPolicyRequestRulesRepairProcedureIntervention setApprovedLabel(ModifyAutoRepairPolicyRequestRulesRepairProcedureInterventionApprovedLabel approvedLabel) {
            this.approvedLabel = approvedLabel;
            return this;
        }
        public ModifyAutoRepairPolicyRequestRulesRepairProcedureInterventionApprovedLabel getApprovedLabel() {
            return this.approvedLabel;
        }

        public ModifyAutoRepairPolicyRequestRulesRepairProcedureIntervention setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ModifyAutoRepairPolicyRequestRulesRepairProcedureIntervention setInquiringLabel(ModifyAutoRepairPolicyRequestRulesRepairProcedureInterventionInquiringLabel inquiringLabel) {
            this.inquiringLabel = inquiringLabel;
            return this;
        }
        public ModifyAutoRepairPolicyRequestRulesRepairProcedureInterventionInquiringLabel getInquiringLabel() {
            return this.inquiringLabel;
        }

        public ModifyAutoRepairPolicyRequestRulesRepairProcedureIntervention setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ModifyAutoRepairPolicyRequestRulesRepairProcedure extends TeaModel {
        @NameInMap("config")
        public java.util.Map<String, ?> config;

        @NameInMap("intervention")
        public ModifyAutoRepairPolicyRequestRulesRepairProcedureIntervention intervention;

        /**
         * <strong>example:</strong>
         * <p>QuarantineGPU</p>
         */
        @NameInMap("name")
        public String name;

        public static ModifyAutoRepairPolicyRequestRulesRepairProcedure build(java.util.Map<String, ?> map) throws Exception {
            ModifyAutoRepairPolicyRequestRulesRepairProcedure self = new ModifyAutoRepairPolicyRequestRulesRepairProcedure();
            return TeaModel.build(map, self);
        }

        public ModifyAutoRepairPolicyRequestRulesRepairProcedure setConfig(java.util.Map<String, ?> config) {
            this.config = config;
            return this;
        }
        public java.util.Map<String, ?> getConfig() {
            return this.config;
        }

        public ModifyAutoRepairPolicyRequestRulesRepairProcedure setIntervention(ModifyAutoRepairPolicyRequestRulesRepairProcedureIntervention intervention) {
            this.intervention = intervention;
            return this;
        }
        public ModifyAutoRepairPolicyRequestRulesRepairProcedureIntervention getIntervention() {
            return this.intervention;
        }

        public ModifyAutoRepairPolicyRequestRulesRepairProcedure setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ModifyAutoRepairPolicyRequestRules extends TeaModel {
        @NameInMap("incidents")
        public java.util.List<ModifyAutoRepairPolicyRequestRulesIncidents> incidents;

        @NameInMap("repair_procedure")
        public java.util.List<ModifyAutoRepairPolicyRequestRulesRepairProcedure> repairProcedure;

        public static ModifyAutoRepairPolicyRequestRules build(java.util.Map<String, ?> map) throws Exception {
            ModifyAutoRepairPolicyRequestRules self = new ModifyAutoRepairPolicyRequestRules();
            return TeaModel.build(map, self);
        }

        public ModifyAutoRepairPolicyRequestRules setIncidents(java.util.List<ModifyAutoRepairPolicyRequestRulesIncidents> incidents) {
            this.incidents = incidents;
            return this;
        }
        public java.util.List<ModifyAutoRepairPolicyRequestRulesIncidents> getIncidents() {
            return this.incidents;
        }

        public ModifyAutoRepairPolicyRequestRules setRepairProcedure(java.util.List<ModifyAutoRepairPolicyRequestRulesRepairProcedure> repairProcedure) {
            this.repairProcedure = repairProcedure;
            return this;
        }
        public java.util.List<ModifyAutoRepairPolicyRequestRulesRepairProcedure> getRepairProcedure() {
            return this.repairProcedure;
        }

    }

}
