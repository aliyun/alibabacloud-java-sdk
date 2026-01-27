// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListAutoRepairPoliciesResponseBody extends TeaModel {
    @NameInMap("items")
    public java.util.List<ListAutoRepairPoliciesResponseBodyItems> items;

    public static ListAutoRepairPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAutoRepairPoliciesResponseBody self = new ListAutoRepairPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAutoRepairPoliciesResponseBody setItems(java.util.List<ListAutoRepairPoliciesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListAutoRepairPoliciesResponseBodyItems> getItems() {
        return this.items;
    }

    public static class ListAutoRepairPoliciesResponseBodyItemsRulesIncidentsConditions extends TeaModel {
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

        public static ListAutoRepairPoliciesResponseBodyItemsRulesIncidentsConditions build(java.util.Map<String, ?> map) throws Exception {
            ListAutoRepairPoliciesResponseBodyItemsRulesIncidentsConditions self = new ListAutoRepairPoliciesResponseBodyItemsRulesIncidentsConditions();
            return TeaModel.build(map, self);
        }

        public ListAutoRepairPoliciesResponseBodyItemsRulesIncidentsConditions setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListAutoRepairPoliciesResponseBodyItemsRulesIncidentsConditions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAutoRepairPoliciesResponseBodyItemsRulesIncidentsConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAutoRepairPoliciesResponseBodyItemsRulesIncidentsEvents extends TeaModel {
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

        public static ListAutoRepairPoliciesResponseBodyItemsRulesIncidentsEvents build(java.util.Map<String, ?> map) throws Exception {
            ListAutoRepairPoliciesResponseBodyItemsRulesIncidentsEvents self = new ListAutoRepairPoliciesResponseBodyItemsRulesIncidentsEvents();
            return TeaModel.build(map, self);
        }

        public ListAutoRepairPoliciesResponseBodyItemsRulesIncidentsEvents setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListAutoRepairPoliciesResponseBodyItemsRulesIncidentsEvents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAutoRepairPoliciesResponseBodyItemsRulesIncidents extends TeaModel {
        @NameInMap("conditions")
        public java.util.List<ListAutoRepairPoliciesResponseBodyItemsRulesIncidentsConditions> conditions;

        @NameInMap("events")
        public java.util.List<ListAutoRepairPoliciesResponseBodyItemsRulesIncidentsEvents> events;

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

        public static ListAutoRepairPoliciesResponseBodyItemsRulesIncidents build(java.util.Map<String, ?> map) throws Exception {
            ListAutoRepairPoliciesResponseBodyItemsRulesIncidents self = new ListAutoRepairPoliciesResponseBodyItemsRulesIncidents();
            return TeaModel.build(map, self);
        }

        public ListAutoRepairPoliciesResponseBodyItemsRulesIncidents setConditions(java.util.List<ListAutoRepairPoliciesResponseBodyItemsRulesIncidentsConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<ListAutoRepairPoliciesResponseBodyItemsRulesIncidentsConditions> getConditions() {
            return this.conditions;
        }

        public ListAutoRepairPoliciesResponseBodyItemsRulesIncidents setEvents(java.util.List<ListAutoRepairPoliciesResponseBodyItemsRulesIncidentsEvents> events) {
            this.events = events;
            return this;
        }
        public java.util.List<ListAutoRepairPoliciesResponseBodyItemsRulesIncidentsEvents> getEvents() {
            return this.events;
        }

        public ListAutoRepairPoliciesResponseBodyItemsRulesIncidents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAutoRepairPoliciesResponseBodyItemsRulesIncidents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAutoRepairPoliciesResponseBodyItemsRulesRepairProcedureInterventionApprovedLabel extends TeaModel {
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

        public static ListAutoRepairPoliciesResponseBodyItemsRulesRepairProcedureInterventionApprovedLabel build(java.util.Map<String, ?> map) throws Exception {
            ListAutoRepairPoliciesResponseBodyItemsRulesRepairProcedureInterventionApprovedLabel self = new ListAutoRepairPoliciesResponseBodyItemsRulesRepairProcedureInterventionApprovedLabel();
            return TeaModel.build(map, self);
        }

        public ListAutoRepairPoliciesResponseBodyItemsRulesRepairProcedureInterventionApprovedLabel setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAutoRepairPoliciesResponseBodyItemsRulesRepairProcedureInterventionApprovedLabel setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListAutoRepairPoliciesResponseBodyItemsRulesRepairProcedureInterventionInquiringLabel extends TeaModel {
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

        public static ListAutoRepairPoliciesResponseBodyItemsRulesRepairProcedureInterventionInquiringLabel build(java.util.Map<String, ?> map) throws Exception {
            ListAutoRepairPoliciesResponseBodyItemsRulesRepairProcedureInterventionInquiringLabel self = new ListAutoRepairPoliciesResponseBodyItemsRulesRepairProcedureInterventionInquiringLabel();
            return TeaModel.build(map, self);
        }

        public ListAutoRepairPoliciesResponseBodyItemsRulesRepairProcedureInterventionInquiringLabel setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAutoRepairPoliciesResponseBodyItemsRulesRepairProcedureInterventionInquiringLabel setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListAutoRepairPoliciesResponseBodyItemsRulesRepairProcedureIntervention extends TeaModel {
        @NameInMap("approved_label")
        public ListAutoRepairPoliciesResponseBodyItemsRulesRepairProcedureInterventionApprovedLabel approvedLabel;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public String enable;

        @NameInMap("inquiring_label")
        public ListAutoRepairPoliciesResponseBodyItemsRulesRepairProcedureInterventionInquiringLabel inquiringLabel;

        /**
         * <strong>example:</strong>
         * <p>label</p>
         */
        @NameInMap("type")
        public String type;

        public static ListAutoRepairPoliciesResponseBodyItemsRulesRepairProcedureIntervention build(java.util.Map<String, ?> map) throws Exception {
            ListAutoRepairPoliciesResponseBodyItemsRulesRepairProcedureIntervention self = new ListAutoRepairPoliciesResponseBodyItemsRulesRepairProcedureIntervention();
            return TeaModel.build(map, self);
        }

        public ListAutoRepairPoliciesResponseBodyItemsRulesRepairProcedureIntervention setApprovedLabel(ListAutoRepairPoliciesResponseBodyItemsRulesRepairProcedureInterventionApprovedLabel approvedLabel) {
            this.approvedLabel = approvedLabel;
            return this;
        }
        public ListAutoRepairPoliciesResponseBodyItemsRulesRepairProcedureInterventionApprovedLabel getApprovedLabel() {
            return this.approvedLabel;
        }

        public ListAutoRepairPoliciesResponseBodyItemsRulesRepairProcedureIntervention setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public ListAutoRepairPoliciesResponseBodyItemsRulesRepairProcedureIntervention setInquiringLabel(ListAutoRepairPoliciesResponseBodyItemsRulesRepairProcedureInterventionInquiringLabel inquiringLabel) {
            this.inquiringLabel = inquiringLabel;
            return this;
        }
        public ListAutoRepairPoliciesResponseBodyItemsRulesRepairProcedureInterventionInquiringLabel getInquiringLabel() {
            return this.inquiringLabel;
        }

        public ListAutoRepairPoliciesResponseBodyItemsRulesRepairProcedureIntervention setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAutoRepairPoliciesResponseBodyItemsRulesRepairProcedure extends TeaModel {
        @NameInMap("config")
        public java.util.Map<String, ?> config;

        @NameInMap("intervention")
        public ListAutoRepairPoliciesResponseBodyItemsRulesRepairProcedureIntervention intervention;

        /**
         * <strong>example:</strong>
         * <p>QuarantineGPU</p>
         */
        @NameInMap("name")
        public String name;

        public static ListAutoRepairPoliciesResponseBodyItemsRulesRepairProcedure build(java.util.Map<String, ?> map) throws Exception {
            ListAutoRepairPoliciesResponseBodyItemsRulesRepairProcedure self = new ListAutoRepairPoliciesResponseBodyItemsRulesRepairProcedure();
            return TeaModel.build(map, self);
        }

        public ListAutoRepairPoliciesResponseBodyItemsRulesRepairProcedure setConfig(java.util.Map<String, ?> config) {
            this.config = config;
            return this;
        }
        public java.util.Map<String, ?> getConfig() {
            return this.config;
        }

        public ListAutoRepairPoliciesResponseBodyItemsRulesRepairProcedure setIntervention(ListAutoRepairPoliciesResponseBodyItemsRulesRepairProcedureIntervention intervention) {
            this.intervention = intervention;
            return this;
        }
        public ListAutoRepairPoliciesResponseBodyItemsRulesRepairProcedureIntervention getIntervention() {
            return this.intervention;
        }

        public ListAutoRepairPoliciesResponseBodyItemsRulesRepairProcedure setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListAutoRepairPoliciesResponseBodyItemsRules extends TeaModel {
        @NameInMap("incidents")
        public java.util.List<ListAutoRepairPoliciesResponseBodyItemsRulesIncidents> incidents;

        @NameInMap("repair_procedure")
        public java.util.List<ListAutoRepairPoliciesResponseBodyItemsRulesRepairProcedure> repairProcedure;

        public static ListAutoRepairPoliciesResponseBodyItemsRules build(java.util.Map<String, ?> map) throws Exception {
            ListAutoRepairPoliciesResponseBodyItemsRules self = new ListAutoRepairPoliciesResponseBodyItemsRules();
            return TeaModel.build(map, self);
        }

        public ListAutoRepairPoliciesResponseBodyItemsRules setIncidents(java.util.List<ListAutoRepairPoliciesResponseBodyItemsRulesIncidents> incidents) {
            this.incidents = incidents;
            return this;
        }
        public java.util.List<ListAutoRepairPoliciesResponseBodyItemsRulesIncidents> getIncidents() {
            return this.incidents;
        }

        public ListAutoRepairPoliciesResponseBodyItemsRules setRepairProcedure(java.util.List<ListAutoRepairPoliciesResponseBodyItemsRulesRepairProcedure> repairProcedure) {
            this.repairProcedure = repairProcedure;
            return this;
        }
        public java.util.List<ListAutoRepairPoliciesResponseBodyItemsRulesRepairProcedure> getRepairProcedure() {
            return this.repairProcedure;
        }

    }

    public static class ListAutoRepairPoliciesResponseBodyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>r-xxxxx</p>
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
        public java.util.List<ListAutoRepairPoliciesResponseBodyItemsRules> rules;

        public static ListAutoRepairPoliciesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListAutoRepairPoliciesResponseBodyItems self = new ListAutoRepairPoliciesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListAutoRepairPoliciesResponseBodyItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAutoRepairPoliciesResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAutoRepairPoliciesResponseBodyItems setResourceIds(java.util.List<String> resourceIds) {
            this.resourceIds = resourceIds;
            return this;
        }
        public java.util.List<String> getResourceIds() {
            return this.resourceIds;
        }

        public ListAutoRepairPoliciesResponseBodyItems setResourceSubType(String resourceSubType) {
            this.resourceSubType = resourceSubType;
            return this;
        }
        public String getResourceSubType() {
            return this.resourceSubType;
        }

        public ListAutoRepairPoliciesResponseBodyItems setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListAutoRepairPoliciesResponseBodyItems setRules(java.util.List<ListAutoRepairPoliciesResponseBodyItemsRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<ListAutoRepairPoliciesResponseBodyItemsRules> getRules() {
            return this.rules;
        }

    }

}
