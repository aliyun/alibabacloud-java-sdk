// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.metastore20241012.models;

import com.aliyun.tea.*;

public class Policy extends TeaModel {
    @NameInMap("AllowExceptions")
    public java.util.List<PolicyItem> allowExceptions;

    @NameInMap("Conditions")
    public java.util.List<PolicyItemCondition> conditions;

    @NameInMap("DenyExceptions")
    public java.util.List<PolicyItem> denyExceptions;

    @NameInMap("DenyPolicyItems")
    public java.util.List<PolicyItem> denyPolicyItems;

    @NameInMap("Description")
    public String description;

    @NameInMap("Id")
    public String id;

    @NameInMap("IsAuditEnabled")
    public Boolean isAuditEnabled;

    @NameInMap("IsDenyAllElse")
    public Boolean isDenyAllElse;

    @NameInMap("IsEnabled")
    public Boolean isEnabled;

    @NameInMap("Name")
    public String name;

    @NameInMap("Options")
    public java.util.Map<String, String> options;

    @NameInMap("PolicyItems")
    public java.util.List<PolicyItem> policyItems;

    @NameInMap("PolicyLabels")
    public java.util.List<String> policyLabels;

    @NameInMap("PolicyPriority")
    public Integer policyPriority;

    @NameInMap("PolicyType")
    public Integer policyType;

    @NameInMap("ResourceSignature")
    public String resourceSignature;

    @NameInMap("Resources")
    public PolicyResources resources;

    @NameInMap("Service")
    public String service;

    @NameInMap("ValiditySchedules")
    public java.util.List<PolicyValiditySchedules> validitySchedules;

    @NameInMap("Version")
    public Long version;

    public static Policy build(java.util.Map<String, ?> map) throws Exception {
        Policy self = new Policy();
        return TeaModel.build(map, self);
    }

    public Policy setAllowExceptions(java.util.List<PolicyItem> allowExceptions) {
        this.allowExceptions = allowExceptions;
        return this;
    }
    public java.util.List<PolicyItem> getAllowExceptions() {
        return this.allowExceptions;
    }

    public Policy setConditions(java.util.List<PolicyItemCondition> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<PolicyItemCondition> getConditions() {
        return this.conditions;
    }

    public Policy setDenyExceptions(java.util.List<PolicyItem> denyExceptions) {
        this.denyExceptions = denyExceptions;
        return this;
    }
    public java.util.List<PolicyItem> getDenyExceptions() {
        return this.denyExceptions;
    }

    public Policy setDenyPolicyItems(java.util.List<PolicyItem> denyPolicyItems) {
        this.denyPolicyItems = denyPolicyItems;
        return this;
    }
    public java.util.List<PolicyItem> getDenyPolicyItems() {
        return this.denyPolicyItems;
    }

    public Policy setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Policy setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Policy setIsAuditEnabled(Boolean isAuditEnabled) {
        this.isAuditEnabled = isAuditEnabled;
        return this;
    }
    public Boolean getIsAuditEnabled() {
        return this.isAuditEnabled;
    }

    public Policy setIsDenyAllElse(Boolean isDenyAllElse) {
        this.isDenyAllElse = isDenyAllElse;
        return this;
    }
    public Boolean getIsDenyAllElse() {
        return this.isDenyAllElse;
    }

    public Policy setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    public Policy setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Policy setOptions(java.util.Map<String, String> options) {
        this.options = options;
        return this;
    }
    public java.util.Map<String, String> getOptions() {
        return this.options;
    }

    public Policy setPolicyItems(java.util.List<PolicyItem> policyItems) {
        this.policyItems = policyItems;
        return this;
    }
    public java.util.List<PolicyItem> getPolicyItems() {
        return this.policyItems;
    }

    public Policy setPolicyLabels(java.util.List<String> policyLabels) {
        this.policyLabels = policyLabels;
        return this;
    }
    public java.util.List<String> getPolicyLabels() {
        return this.policyLabels;
    }

    public Policy setPolicyPriority(Integer policyPriority) {
        this.policyPriority = policyPriority;
        return this;
    }
    public Integer getPolicyPriority() {
        return this.policyPriority;
    }

    public Policy setPolicyType(Integer policyType) {
        this.policyType = policyType;
        return this;
    }
    public Integer getPolicyType() {
        return this.policyType;
    }

    public Policy setResourceSignature(String resourceSignature) {
        this.resourceSignature = resourceSignature;
        return this;
    }
    public String getResourceSignature() {
        return this.resourceSignature;
    }

    public Policy setResources(PolicyResources resources) {
        this.resources = resources;
        return this;
    }
    public PolicyResources getResources() {
        return this.resources;
    }

    public Policy setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public Policy setValiditySchedules(java.util.List<PolicyValiditySchedules> validitySchedules) {
        this.validitySchedules = validitySchedules;
        return this;
    }
    public java.util.List<PolicyValiditySchedules> getValiditySchedules() {
        return this.validitySchedules;
    }

    public Policy setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

    public static class PolicyResourcesColumn extends TeaModel {
        @NameInMap("IsExcludes")
        public Boolean isExcludes;

        @NameInMap("IsRecursive")
        public Boolean isRecursive;

        @NameInMap("Values")
        public java.util.List<String> values;

        public static PolicyResourcesColumn build(java.util.Map<String, ?> map) throws Exception {
            PolicyResourcesColumn self = new PolicyResourcesColumn();
            return TeaModel.build(map, self);
        }

        public PolicyResourcesColumn setIsExcludes(Boolean isExcludes) {
            this.isExcludes = isExcludes;
            return this;
        }
        public Boolean getIsExcludes() {
            return this.isExcludes;
        }

        public PolicyResourcesColumn setIsRecursive(Boolean isRecursive) {
            this.isRecursive = isRecursive;
            return this;
        }
        public Boolean getIsRecursive() {
            return this.isRecursive;
        }

        public PolicyResourcesColumn setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class PolicyResourcesDatabase extends TeaModel {
        @NameInMap("IsExcludes")
        public Boolean isExcludes;

        @NameInMap("IsRecursive")
        public Boolean isRecursive;

        @NameInMap("Values")
        public java.util.List<String> values;

        public static PolicyResourcesDatabase build(java.util.Map<String, ?> map) throws Exception {
            PolicyResourcesDatabase self = new PolicyResourcesDatabase();
            return TeaModel.build(map, self);
        }

        public PolicyResourcesDatabase setIsExcludes(Boolean isExcludes) {
            this.isExcludes = isExcludes;
            return this;
        }
        public Boolean getIsExcludes() {
            return this.isExcludes;
        }

        public PolicyResourcesDatabase setIsRecursive(Boolean isRecursive) {
            this.isRecursive = isRecursive;
            return this;
        }
        public Boolean getIsRecursive() {
            return this.isRecursive;
        }

        public PolicyResourcesDatabase setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class PolicyResourcesPath extends TeaModel {
        @NameInMap("IsExcludes")
        public Boolean isExcludes;

        @NameInMap("IsRecursive")
        public Boolean isRecursive;

        @NameInMap("Values")
        public java.util.List<String> values;

        public static PolicyResourcesPath build(java.util.Map<String, ?> map) throws Exception {
            PolicyResourcesPath self = new PolicyResourcesPath();
            return TeaModel.build(map, self);
        }

        public PolicyResourcesPath setIsExcludes(Boolean isExcludes) {
            this.isExcludes = isExcludes;
            return this;
        }
        public Boolean getIsExcludes() {
            return this.isExcludes;
        }

        public PolicyResourcesPath setIsRecursive(Boolean isRecursive) {
            this.isRecursive = isRecursive;
            return this;
        }
        public Boolean getIsRecursive() {
            return this.isRecursive;
        }

        public PolicyResourcesPath setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class PolicyResourcesTable extends TeaModel {
        @NameInMap("IsExcludes")
        public Boolean isExcludes;

        @NameInMap("IsRecursive")
        public Boolean isRecursive;

        @NameInMap("Values")
        public java.util.List<String> values;

        public static PolicyResourcesTable build(java.util.Map<String, ?> map) throws Exception {
            PolicyResourcesTable self = new PolicyResourcesTable();
            return TeaModel.build(map, self);
        }

        public PolicyResourcesTable setIsExcludes(Boolean isExcludes) {
            this.isExcludes = isExcludes;
            return this;
        }
        public Boolean getIsExcludes() {
            return this.isExcludes;
        }

        public PolicyResourcesTable setIsRecursive(Boolean isRecursive) {
            this.isRecursive = isRecursive;
            return this;
        }
        public Boolean getIsRecursive() {
            return this.isRecursive;
        }

        public PolicyResourcesTable setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class PolicyResourcesUdf extends TeaModel {
        @NameInMap("IsExcludes")
        public Boolean isExcludes;

        @NameInMap("IsRecursive")
        public Boolean isRecursive;

        @NameInMap("Values")
        public java.util.List<String> values;

        public static PolicyResourcesUdf build(java.util.Map<String, ?> map) throws Exception {
            PolicyResourcesUdf self = new PolicyResourcesUdf();
            return TeaModel.build(map, self);
        }

        public PolicyResourcesUdf setIsExcludes(Boolean isExcludes) {
            this.isExcludes = isExcludes;
            return this;
        }
        public Boolean getIsExcludes() {
            return this.isExcludes;
        }

        public PolicyResourcesUdf setIsRecursive(Boolean isRecursive) {
            this.isRecursive = isRecursive;
            return this;
        }
        public Boolean getIsRecursive() {
            return this.isRecursive;
        }

        public PolicyResourcesUdf setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class PolicyResources extends TeaModel {
        @NameInMap("Column")
        public PolicyResourcesColumn column;

        @NameInMap("Database")
        public PolicyResourcesDatabase database;

        @NameInMap("Path")
        public PolicyResourcesPath path;

        @NameInMap("Table")
        public PolicyResourcesTable table;

        @NameInMap("Udf")
        public PolicyResourcesUdf udf;

        public static PolicyResources build(java.util.Map<String, ?> map) throws Exception {
            PolicyResources self = new PolicyResources();
            return TeaModel.build(map, self);
        }

        public PolicyResources setColumn(PolicyResourcesColumn column) {
            this.column = column;
            return this;
        }
        public PolicyResourcesColumn getColumn() {
            return this.column;
        }

        public PolicyResources setDatabase(PolicyResourcesDatabase database) {
            this.database = database;
            return this;
        }
        public PolicyResourcesDatabase getDatabase() {
            return this.database;
        }

        public PolicyResources setPath(PolicyResourcesPath path) {
            this.path = path;
            return this;
        }
        public PolicyResourcesPath getPath() {
            return this.path;
        }

        public PolicyResources setTable(PolicyResourcesTable table) {
            this.table = table;
            return this;
        }
        public PolicyResourcesTable getTable() {
            return this.table;
        }

        public PolicyResources setUdf(PolicyResourcesUdf udf) {
            this.udf = udf;
            return this;
        }
        public PolicyResourcesUdf getUdf() {
            return this.udf;
        }

    }

    public static class PolicyValiditySchedules extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("TimeZone")
        public String timeZone;

        public static PolicyValiditySchedules build(java.util.Map<String, ?> map) throws Exception {
            PolicyValiditySchedules self = new PolicyValiditySchedules();
            return TeaModel.build(map, self);
        }

        public PolicyValiditySchedules setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public PolicyValiditySchedules setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public PolicyValiditySchedules setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

}
