// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyAutoRepairPolicyRequest extends TeaModel {
    /**
     * <p>The name of the self-healing rule.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>A list of self-healing sub-rules.</p>
     */
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

    public static class ModifyAutoRepairPolicyRequestRulesIncidents extends TeaModel {
        /**
         * <p>The incident name.</p>
         * 
         * <strong>example:</strong>
         * <p>Node.FaultNeedReboot.HOST</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The incident type.</p>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("type")
        public String type;

        public static ModifyAutoRepairPolicyRequestRulesIncidents build(java.util.Map<String, ?> map) throws Exception {
            ModifyAutoRepairPolicyRequestRulesIncidents self = new ModifyAutoRepairPolicyRequestRulesIncidents();
            return TeaModel.build(map, self);
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
         * <p>The label <code>key</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s.aliyun.com/incident</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The label <code>value</code>.</p>
         * 
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
         * <p>The label <code>key</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s.aliyun.com/incident</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The label <code>value</code>.</p>
         * 
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
        /**
         * <p>The label configuration for authorization confirmation. Add this label to the node to authorize ACK to proceed with this stage. After the stage completes, ACK automatically removes the inquiry and confirmation labels. If you do not add this label in time, ACK will not proceed with this or subsequent stages, leaving the node in an unhealthy state.</p>
         */
        @NameInMap("approved_label")
        public ModifyAutoRepairPolicyRequestRulesRepairProcedureInterventionApprovedLabel approvedLabel;

        /**
         * <p>Specifies whether to enable manual approval.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The label configuration for the authorization inquiry. At this stage, ACK adds this label to the node and waits for your authorization before proceeding.</p>
         */
        @NameInMap("inquiring_label")
        public ModifyAutoRepairPolicyRequestRulesRepairProcedureInterventionInquiringLabel inquiringLabel;

        /**
         * <p>The approval type.</p>
         * 
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
        /**
         * <p>Configuration parameters for the procedure.</p>
         */
        @NameInMap("config")
        public java.util.Map<String, ?> config;

        /**
         * <p>The configuration for the manual intervention procedure.</p>
         */
        @NameInMap("intervention")
        public ModifyAutoRepairPolicyRequestRulesRepairProcedureIntervention intervention;

        /**
         * <p>The procedure name.</p>
         * 
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
        /**
         * <p>A list of identified incidents.</p>
         */
        @NameInMap("incidents")
        public java.util.List<ModifyAutoRepairPolicyRequestRulesIncidents> incidents;

        /**
         * <p>A list of repair procedures.</p>
         */
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
