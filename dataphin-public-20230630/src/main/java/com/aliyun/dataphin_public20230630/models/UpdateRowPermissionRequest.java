// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateRowPermissionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpdateRowPermissionCommand")
    public UpdateRowPermissionRequestUpdateRowPermissionCommand updateRowPermissionCommand;

    public static UpdateRowPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRowPermissionRequest self = new UpdateRowPermissionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRowPermissionRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateRowPermissionRequest setUpdateRowPermissionCommand(UpdateRowPermissionRequestUpdateRowPermissionCommand updateRowPermissionCommand) {
        this.updateRowPermissionCommand = updateRowPermissionCommand;
        return this;
    }
    public UpdateRowPermissionRequestUpdateRowPermissionCommand getUpdateRowPermissionCommand() {
        return this.updateRowPermissionCommand;
    }

    public static class UpdateRowPermissionRequestUpdateRowPermissionCommandMappingColumns extends TeaModel {
        @NameInMap("ColumnDesc")
        public String columnDesc;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>business_id</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("ColumnType")
        public String columnType;

        public static UpdateRowPermissionRequestUpdateRowPermissionCommandMappingColumns build(java.util.Map<String, ?> map) throws Exception {
            UpdateRowPermissionRequestUpdateRowPermissionCommandMappingColumns self = new UpdateRowPermissionRequestUpdateRowPermissionCommandMappingColumns();
            return TeaModel.build(map, self);
        }

        public UpdateRowPermissionRequestUpdateRowPermissionCommandMappingColumns setColumnDesc(String columnDesc) {
            this.columnDesc = columnDesc;
            return this;
        }
        public String getColumnDesc() {
            return this.columnDesc;
        }

        public UpdateRowPermissionRequestUpdateRowPermissionCommandMappingColumns setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public UpdateRowPermissionRequestUpdateRowPermissionCommandMappingColumns setColumnType(String columnType) {
            this.columnType = columnType;
            return this;
        }
        public String getColumnType() {
            return this.columnType;
        }

    }

    public static class UpdateRowPermissionRequestUpdateRowPermissionCommandRulesExpressions extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>business_id</p>
         */
        @NameInMap("MappingColumnName")
        public String mappingColumnName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OR</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("SubConditions")
        public java.util.List<?> subConditions;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>EXPRESSION</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static UpdateRowPermissionRequestUpdateRowPermissionCommandRulesExpressions build(java.util.Map<String, ?> map) throws Exception {
            UpdateRowPermissionRequestUpdateRowPermissionCommandRulesExpressions self = new UpdateRowPermissionRequestUpdateRowPermissionCommandRulesExpressions();
            return TeaModel.build(map, self);
        }

        public UpdateRowPermissionRequestUpdateRowPermissionCommandRulesExpressions setMappingColumnName(String mappingColumnName) {
            this.mappingColumnName = mappingColumnName;
            return this;
        }
        public String getMappingColumnName() {
            return this.mappingColumnName;
        }

        public UpdateRowPermissionRequestUpdateRowPermissionCommandRulesExpressions setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public UpdateRowPermissionRequestUpdateRowPermissionCommandRulesExpressions setSubConditions(java.util.List<?> subConditions) {
            this.subConditions = subConditions;
            return this;
        }
        public java.util.List<?> getSubConditions() {
            return this.subConditions;
        }

        public UpdateRowPermissionRequestUpdateRowPermissionCommandRulesExpressions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateRowPermissionRequestUpdateRowPermissionCommandRulesExpressions setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateRowPermissionRequestUpdateRowPermissionCommandRulesUserMappingListAccounts extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        public static UpdateRowPermissionRequestUpdateRowPermissionCommandRulesUserMappingListAccounts build(java.util.Map<String, ?> map) throws Exception {
            UpdateRowPermissionRequestUpdateRowPermissionCommandRulesUserMappingListAccounts self = new UpdateRowPermissionRequestUpdateRowPermissionCommandRulesUserMappingListAccounts();
            return TeaModel.build(map, self);
        }

        public UpdateRowPermissionRequestUpdateRowPermissionCommandRulesUserMappingListAccounts setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

    public static class UpdateRowPermissionRequestUpdateRowPermissionCommandRulesUserMappingList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PERSONAL</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Accounts")
        public java.util.List<UpdateRowPermissionRequestUpdateRowPermissionCommandRulesUserMappingListAccounts> accounts;

        public static UpdateRowPermissionRequestUpdateRowPermissionCommandRulesUserMappingList build(java.util.Map<String, ?> map) throws Exception {
            UpdateRowPermissionRequestUpdateRowPermissionCommandRulesUserMappingList self = new UpdateRowPermissionRequestUpdateRowPermissionCommandRulesUserMappingList();
            return TeaModel.build(map, self);
        }

        public UpdateRowPermissionRequestUpdateRowPermissionCommandRulesUserMappingList setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public UpdateRowPermissionRequestUpdateRowPermissionCommandRulesUserMappingList setAccounts(java.util.List<UpdateRowPermissionRequestUpdateRowPermissionCommandRulesUserMappingListAccounts> accounts) {
            this.accounts = accounts;
            return this;
        }
        public java.util.List<UpdateRowPermissionRequestUpdateRowPermissionCommandRulesUserMappingListAccounts> getAccounts() {
            return this.accounts;
        }

    }

    public static class UpdateRowPermissionRequestUpdateRowPermissionCommandRules extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Expressions")
        public java.util.List<UpdateRowPermissionRequestUpdateRowPermissionCommandRulesExpressions> expressions;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IsDelete")
        public Boolean isDelete;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT_COLUMN</p>
         */
        @NameInMap("ScopeType")
        public String scopeType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        @NameInMap("UserMappingList")
        public java.util.List<UpdateRowPermissionRequestUpdateRowPermissionCommandRulesUserMappingList> userMappingList;

        public static UpdateRowPermissionRequestUpdateRowPermissionCommandRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateRowPermissionRequestUpdateRowPermissionCommandRules self = new UpdateRowPermissionRequestUpdateRowPermissionCommandRules();
            return TeaModel.build(map, self);
        }

        public UpdateRowPermissionRequestUpdateRowPermissionCommandRules setExpressions(java.util.List<UpdateRowPermissionRequestUpdateRowPermissionCommandRulesExpressions> expressions) {
            this.expressions = expressions;
            return this;
        }
        public java.util.List<UpdateRowPermissionRequestUpdateRowPermissionCommandRulesExpressions> getExpressions() {
            return this.expressions;
        }

        public UpdateRowPermissionRequestUpdateRowPermissionCommandRules setIsDelete(Boolean isDelete) {
            this.isDelete = isDelete;
            return this;
        }
        public Boolean getIsDelete() {
            return this.isDelete;
        }

        public UpdateRowPermissionRequestUpdateRowPermissionCommandRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public UpdateRowPermissionRequestUpdateRowPermissionCommandRules setScopeType(String scopeType) {
            this.scopeType = scopeType;
            return this;
        }
        public String getScopeType() {
            return this.scopeType;
        }

        public UpdateRowPermissionRequestUpdateRowPermissionCommandRules setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public UpdateRowPermissionRequestUpdateRowPermissionCommandRules setUserMappingList(java.util.List<UpdateRowPermissionRequestUpdateRowPermissionCommandRulesUserMappingList> userMappingList) {
            this.userMappingList = userMappingList;
            return this;
        }
        public java.util.List<UpdateRowPermissionRequestUpdateRowPermissionCommandRulesUserMappingList> getUserMappingList() {
            return this.userMappingList;
        }

    }

    public static class UpdateRowPermissionRequestUpdateRowPermissionCommandTables extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>business_id</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>business_id</p>
         */
        @NameInMap("MappingColumnName")
        public String mappingColumnName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.300199897.project_name.table_name</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        public static UpdateRowPermissionRequestUpdateRowPermissionCommandTables build(java.util.Map<String, ?> map) throws Exception {
            UpdateRowPermissionRequestUpdateRowPermissionCommandTables self = new UpdateRowPermissionRequestUpdateRowPermissionCommandTables();
            return TeaModel.build(map, self);
        }

        public UpdateRowPermissionRequestUpdateRowPermissionCommandTables setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public UpdateRowPermissionRequestUpdateRowPermissionCommandTables setMappingColumnName(String mappingColumnName) {
            this.mappingColumnName = mappingColumnName;
            return this;
        }
        public String getMappingColumnName() {
            return this.mappingColumnName;
        }

        public UpdateRowPermissionRequestUpdateRowPermissionCommandTables setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

    public static class UpdateRowPermissionRequestUpdateRowPermissionCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("MappingColumns")
        public java.util.List<UpdateRowPermissionRequestUpdateRowPermissionCommandMappingColumns> mappingColumns;

        @NameInMap("RowPermissionDesc")
        public String rowPermissionDesc;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30009999</p>
         */
        @NameInMap("RowPermissionId")
        public Long rowPermissionId;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("RowPermissionName")
        public String rowPermissionName;

        @NameInMap("Rules")
        public java.util.List<UpdateRowPermissionRequestUpdateRowPermissionCommandRules> rules;

        @NameInMap("Tables")
        public java.util.List<UpdateRowPermissionRequestUpdateRowPermissionCommandTables> tables;

        public static UpdateRowPermissionRequestUpdateRowPermissionCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateRowPermissionRequestUpdateRowPermissionCommand self = new UpdateRowPermissionRequestUpdateRowPermissionCommand();
            return TeaModel.build(map, self);
        }

        public UpdateRowPermissionRequestUpdateRowPermissionCommand setMappingColumns(java.util.List<UpdateRowPermissionRequestUpdateRowPermissionCommandMappingColumns> mappingColumns) {
            this.mappingColumns = mappingColumns;
            return this;
        }
        public java.util.List<UpdateRowPermissionRequestUpdateRowPermissionCommandMappingColumns> getMappingColumns() {
            return this.mappingColumns;
        }

        public UpdateRowPermissionRequestUpdateRowPermissionCommand setRowPermissionDesc(String rowPermissionDesc) {
            this.rowPermissionDesc = rowPermissionDesc;
            return this;
        }
        public String getRowPermissionDesc() {
            return this.rowPermissionDesc;
        }

        public UpdateRowPermissionRequestUpdateRowPermissionCommand setRowPermissionId(Long rowPermissionId) {
            this.rowPermissionId = rowPermissionId;
            return this;
        }
        public Long getRowPermissionId() {
            return this.rowPermissionId;
        }

        public UpdateRowPermissionRequestUpdateRowPermissionCommand setRowPermissionName(String rowPermissionName) {
            this.rowPermissionName = rowPermissionName;
            return this;
        }
        public String getRowPermissionName() {
            return this.rowPermissionName;
        }

        public UpdateRowPermissionRequestUpdateRowPermissionCommand setRules(java.util.List<UpdateRowPermissionRequestUpdateRowPermissionCommandRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<UpdateRowPermissionRequestUpdateRowPermissionCommandRules> getRules() {
            return this.rules;
        }

        public UpdateRowPermissionRequestUpdateRowPermissionCommand setTables(java.util.List<UpdateRowPermissionRequestUpdateRowPermissionCommandTables> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<UpdateRowPermissionRequestUpdateRowPermissionCommandTables> getTables() {
            return this.tables;
        }

    }

}
