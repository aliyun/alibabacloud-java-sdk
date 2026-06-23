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
     * <p>The list of self-healing sub-rules.</p>
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
         * <p>The fault name.</p>
         * 
         * <strong>example:</strong>
         * <p>Node.FaultNeedReboot.HOST</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The type of manual approval.</p>
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
         * <p>The label key value.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s.aliyun.com/incident</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The label value.</p>
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
         * <p>The label key value.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s.aliyun.com/incident</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The label value.</p>
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
         * <p>The label configuration for authorization confirmation. When you add the following labels to the node, you authorize ACK to perform the operations in this phase. After completing the phase operations, ACK automatically removes the authorization inquiry and authorization confirmation labels for this phase. If you do not promptly add the following labels for authorization, ACK does not perform the actions in this phase or subsequent phases, and the node may remain in a damaged state.</p>
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
         * <p>The label configuration for authorization inquiry. When this phase is reached, ACK adds the following labels to your node and waits for you to authorize the execution of the phase action.</p>
         */
        @NameInMap("inquiring_label")
        public ModifyAutoRepairPolicyRequestRulesRepairProcedureInterventionInquiringLabel inquiringLabel;

        /**
         * <p>The type of approval.</p>
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
         * <p>The parameter settings of the flow.</p>
         */
        @NameInMap("config")
        public java.util.Map<String, ?> config;

        /**
         * <p>The configuration for manual intervention in the procedure.</p>
         */
        @NameInMap("intervention")
        public ModifyAutoRepairPolicyRequestRulesRepairProcedureIntervention intervention;

        /**
         * <p>The name of the procedure.</p>
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
         * <p>The list of identified faults.</p>
         */
        @NameInMap("incidents")
        public java.util.List<ModifyAutoRepairPolicyRequestRulesIncidents> incidents;

        /**
         * <p>The repair procedure.</p>
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
