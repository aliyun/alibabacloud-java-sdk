// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSensitiveColumnInfoResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SensitiveColumnList")
    public ListSensitiveColumnInfoResponseBodySensitiveColumnList sensitiveColumnList;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListSensitiveColumnInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSensitiveColumnInfoResponseBody self = new ListSensitiveColumnInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSensitiveColumnInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListSensitiveColumnInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListSensitiveColumnInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSensitiveColumnInfoResponseBody setSensitiveColumnList(ListSensitiveColumnInfoResponseBodySensitiveColumnList sensitiveColumnList) {
        this.sensitiveColumnList = sensitiveColumnList;
        return this;
    }
    public ListSensitiveColumnInfoResponseBodySensitiveColumnList getSensitiveColumnList() {
        return this.sensitiveColumnList;
    }

    public ListSensitiveColumnInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListSensitiveColumnInfoResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumnDefaultDesensitizationRule extends TeaModel {
        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        public static ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumnDefaultDesensitizationRule build(java.util.Map<String, ?> map) throws Exception {
            ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumnDefaultDesensitizationRule self = new ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumnDefaultDesensitizationRule();
            return TeaModel.build(map, self);
        }

        public ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumnDefaultDesensitizationRule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumnDefaultDesensitizationRule setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

    public static class ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumnSemiDesensitizationRuleListSemiDesensitizationRule extends TeaModel {
        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        public static ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumnSemiDesensitizationRuleListSemiDesensitizationRule build(java.util.Map<String, ?> map) throws Exception {
            ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumnSemiDesensitizationRuleListSemiDesensitizationRule self = new ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumnSemiDesensitizationRuleListSemiDesensitizationRule();
            return TeaModel.build(map, self);
        }

        public ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumnSemiDesensitizationRuleListSemiDesensitizationRule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumnSemiDesensitizationRuleListSemiDesensitizationRule setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

    public static class ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumnSemiDesensitizationRuleList extends TeaModel {
        @NameInMap("SemiDesensitizationRule")
        public java.util.List<ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumnSemiDesensitizationRuleListSemiDesensitizationRule> semiDesensitizationRule;

        public static ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumnSemiDesensitizationRuleList build(java.util.Map<String, ?> map) throws Exception {
            ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumnSemiDesensitizationRuleList self = new ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumnSemiDesensitizationRuleList();
            return TeaModel.build(map, self);
        }

        public ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumnSemiDesensitizationRuleList setSemiDesensitizationRule(java.util.List<ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumnSemiDesensitizationRuleListSemiDesensitizationRule> semiDesensitizationRule) {
            this.semiDesensitizationRule = semiDesensitizationRule;
            return this;
        }
        public java.util.List<ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumnSemiDesensitizationRuleListSemiDesensitizationRule> getSemiDesensitizationRule() {
            return this.semiDesensitizationRule;
        }

    }

    public static class ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumn extends TeaModel {
        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("DefaultDesensitizationRule")
        public ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumnDefaultDesensitizationRule defaultDesensitizationRule;

        @NameInMap("InstanceId")
        public Integer instanceId;

        @NameInMap("IsPlain")
        public Boolean isPlain;

        @NameInMap("SampleData")
        public String sampleData;

        @NameInMap("SchemaName")
        public String schemaName;

        @NameInMap("SecurityLevel")
        public String securityLevel;

        @NameInMap("SemiDesensitizationRuleList")
        public ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumnSemiDesensitizationRuleList semiDesensitizationRuleList;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("UserSensitivityLevel")
        public String userSensitivityLevel;

        public static ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumn build(java.util.Map<String, ?> map) throws Exception {
            ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumn self = new ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumn();
            return TeaModel.build(map, self);
        }

        public ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumn setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumn setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumn setDefaultDesensitizationRule(ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumnDefaultDesensitizationRule defaultDesensitizationRule) {
            this.defaultDesensitizationRule = defaultDesensitizationRule;
            return this;
        }
        public ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumnDefaultDesensitizationRule getDefaultDesensitizationRule() {
            return this.defaultDesensitizationRule;
        }

        public ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumn setInstanceId(Integer instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Integer getInstanceId() {
            return this.instanceId;
        }

        public ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumn setIsPlain(Boolean isPlain) {
            this.isPlain = isPlain;
            return this;
        }
        public Boolean getIsPlain() {
            return this.isPlain;
        }

        public ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumn setSampleData(String sampleData) {
            this.sampleData = sampleData;
            return this;
        }
        public String getSampleData() {
            return this.sampleData;
        }

        public ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumn setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumn setSecurityLevel(String securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public String getSecurityLevel() {
            return this.securityLevel;
        }

        public ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumn setSemiDesensitizationRuleList(ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumnSemiDesensitizationRuleList semiDesensitizationRuleList) {
            this.semiDesensitizationRuleList = semiDesensitizationRuleList;
            return this;
        }
        public ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumnSemiDesensitizationRuleList getSemiDesensitizationRuleList() {
            return this.semiDesensitizationRuleList;
        }

        public ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumn setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumn setUserSensitivityLevel(String userSensitivityLevel) {
            this.userSensitivityLevel = userSensitivityLevel;
            return this;
        }
        public String getUserSensitivityLevel() {
            return this.userSensitivityLevel;
        }

    }

    public static class ListSensitiveColumnInfoResponseBodySensitiveColumnList extends TeaModel {
        @NameInMap("SensitiveColumn")
        public java.util.List<ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumn> sensitiveColumn;

        public static ListSensitiveColumnInfoResponseBodySensitiveColumnList build(java.util.Map<String, ?> map) throws Exception {
            ListSensitiveColumnInfoResponseBodySensitiveColumnList self = new ListSensitiveColumnInfoResponseBodySensitiveColumnList();
            return TeaModel.build(map, self);
        }

        public ListSensitiveColumnInfoResponseBodySensitiveColumnList setSensitiveColumn(java.util.List<ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumn> sensitiveColumn) {
            this.sensitiveColumn = sensitiveColumn;
            return this;
        }
        public java.util.List<ListSensitiveColumnInfoResponseBodySensitiveColumnListSensitiveColumn> getSensitiveColumn() {
            return this.sensitiveColumn;
        }

    }

}
