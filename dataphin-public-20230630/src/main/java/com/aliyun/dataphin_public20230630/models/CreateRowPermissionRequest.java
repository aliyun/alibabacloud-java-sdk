// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateRowPermissionRequest extends TeaModel {
    /**
     * <p>Request command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateRowPermissionCommand")
    public CreateRowPermissionRequestCreateRowPermissionCommand createRowPermissionCommand;

    /**
     * <p>Tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static CreateRowPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRowPermissionRequest self = new CreateRowPermissionRequest();
        return TeaModel.build(map, self);
    }

    public CreateRowPermissionRequest setCreateRowPermissionCommand(CreateRowPermissionRequestCreateRowPermissionCommand createRowPermissionCommand) {
        this.createRowPermissionCommand = createRowPermissionCommand;
        return this;
    }
    public CreateRowPermissionRequestCreateRowPermissionCommand getCreateRowPermissionCommand() {
        return this.createRowPermissionCommand;
    }

    public CreateRowPermissionRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class CreateRowPermissionRequestCreateRowPermissionCommandMappingColumns extends TeaModel {
        /**
         * <p>The description of the mapping column.</p>
         * 
         * <strong>example:</strong>
         * <p>控制业务ID字段</p>
         */
        @NameInMap("ColumnDesc")
        public String columnDesc;

        /**
         * <p>The name of the mapping column.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>business_id</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>The type of the mapping column.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("ColumnType")
        public String columnType;

        public static CreateRowPermissionRequestCreateRowPermissionCommandMappingColumns build(java.util.Map<String, ?> map) throws Exception {
            CreateRowPermissionRequestCreateRowPermissionCommandMappingColumns self = new CreateRowPermissionRequestCreateRowPermissionCommandMappingColumns();
            return TeaModel.build(map, self);
        }

        public CreateRowPermissionRequestCreateRowPermissionCommandMappingColumns setColumnDesc(String columnDesc) {
            this.columnDesc = columnDesc;
            return this;
        }
        public String getColumnDesc() {
            return this.columnDesc;
        }

        public CreateRowPermissionRequestCreateRowPermissionCommandMappingColumns setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public CreateRowPermissionRequestCreateRowPermissionCommandMappingColumns setColumnType(String columnType) {
            this.columnType = columnType;
            return this;
        }
        public String getColumnType() {
            return this.columnType;
        }

    }

    public static class CreateRowPermissionRequestCreateRowPermissionCommandRulesExpressions extends TeaModel {
        /**
         * <p>The name of the mapping column.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("MappingColumnName")
        public String mappingColumnName;

        /**
         * <p>The operator of the expression.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>EQUAL</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The sub-expressions.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("SubConditions")
        public java.util.List<?> subConditions;

        /**
         * <p>The type of the expression.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RELATION</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The expression operation values.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static CreateRowPermissionRequestCreateRowPermissionCommandRulesExpressions build(java.util.Map<String, ?> map) throws Exception {
            CreateRowPermissionRequestCreateRowPermissionCommandRulesExpressions self = new CreateRowPermissionRequestCreateRowPermissionCommandRulesExpressions();
            return TeaModel.build(map, self);
        }

        public CreateRowPermissionRequestCreateRowPermissionCommandRulesExpressions setMappingColumnName(String mappingColumnName) {
            this.mappingColumnName = mappingColumnName;
            return this;
        }
        public String getMappingColumnName() {
            return this.mappingColumnName;
        }

        public CreateRowPermissionRequestCreateRowPermissionCommandRulesExpressions setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public CreateRowPermissionRequestCreateRowPermissionCommandRulesExpressions setSubConditions(java.util.List<?> subConditions) {
            this.subConditions = subConditions;
            return this;
        }
        public java.util.List<?> getSubConditions() {
            return this.subConditions;
        }

        public CreateRowPermissionRequestCreateRowPermissionCommandRulesExpressions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateRowPermissionRequestCreateRowPermissionCommandRulesExpressions setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class CreateRowPermissionRequestCreateRowPermissionCommandRulesUserMappingListAccounts extends TeaModel {
        /**
         * <p>The ID of the account bound to the rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>300001111</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        public static CreateRowPermissionRequestCreateRowPermissionCommandRulesUserMappingListAccounts build(java.util.Map<String, ?> map) throws Exception {
            CreateRowPermissionRequestCreateRowPermissionCommandRulesUserMappingListAccounts self = new CreateRowPermissionRequestCreateRowPermissionCommandRulesUserMappingListAccounts();
            return TeaModel.build(map, self);
        }

        public CreateRowPermissionRequestCreateRowPermissionCommandRulesUserMappingListAccounts setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

    public static class CreateRowPermissionRequestCreateRowPermissionCommandRulesUserMappingList extends TeaModel {
        /**
         * <p>The type of the account bound to the rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PERSONAL</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <p>The accounts bound to the rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PERSONAL</p>
         */
        @NameInMap("Accounts")
        public java.util.List<CreateRowPermissionRequestCreateRowPermissionCommandRulesUserMappingListAccounts> accounts;

        public static CreateRowPermissionRequestCreateRowPermissionCommandRulesUserMappingList build(java.util.Map<String, ?> map) throws Exception {
            CreateRowPermissionRequestCreateRowPermissionCommandRulesUserMappingList self = new CreateRowPermissionRequestCreateRowPermissionCommandRulesUserMappingList();
            return TeaModel.build(map, self);
        }

        public CreateRowPermissionRequestCreateRowPermissionCommandRulesUserMappingList setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public CreateRowPermissionRequestCreateRowPermissionCommandRulesUserMappingList setAccounts(java.util.List<CreateRowPermissionRequestCreateRowPermissionCommandRulesUserMappingListAccounts> accounts) {
            this.accounts = accounts;
            return this;
        }
        public java.util.List<CreateRowPermissionRequestCreateRowPermissionCommandRulesUserMappingListAccounts> getAccounts() {
            return this.accounts;
        }

    }

    public static class CreateRowPermissionRequestCreateRowPermissionCommandRules extends TeaModel {
        /**
         * <p>The rule expressions.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Expressions")
        public java.util.List<CreateRowPermissionRequestCreateRowPermissionCommandRulesExpressions> expressions;

        /**
         * <p>Specifies whether to delete the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsDelete")
        public Boolean isDelete;

        /**
         * <p>The name of the rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>中台</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The scope type of the rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT_COLUMN</p>
         */
        @NameInMap("ScopeType")
        public String scopeType;

        /**
         * <p>The status of the rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The accounts bound to the rule.</p>
         */
        @NameInMap("UserMappingList")
        public java.util.List<CreateRowPermissionRequestCreateRowPermissionCommandRulesUserMappingList> userMappingList;

        public static CreateRowPermissionRequestCreateRowPermissionCommandRules build(java.util.Map<String, ?> map) throws Exception {
            CreateRowPermissionRequestCreateRowPermissionCommandRules self = new CreateRowPermissionRequestCreateRowPermissionCommandRules();
            return TeaModel.build(map, self);
        }

        public CreateRowPermissionRequestCreateRowPermissionCommandRules setExpressions(java.util.List<CreateRowPermissionRequestCreateRowPermissionCommandRulesExpressions> expressions) {
            this.expressions = expressions;
            return this;
        }
        public java.util.List<CreateRowPermissionRequestCreateRowPermissionCommandRulesExpressions> getExpressions() {
            return this.expressions;
        }

        public CreateRowPermissionRequestCreateRowPermissionCommandRules setIsDelete(Boolean isDelete) {
            this.isDelete = isDelete;
            return this;
        }
        public Boolean getIsDelete() {
            return this.isDelete;
        }

        public CreateRowPermissionRequestCreateRowPermissionCommandRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateRowPermissionRequestCreateRowPermissionCommandRules setScopeType(String scopeType) {
            this.scopeType = scopeType;
            return this;
        }
        public String getScopeType() {
            return this.scopeType;
        }

        public CreateRowPermissionRequestCreateRowPermissionCommandRules setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public CreateRowPermissionRequestCreateRowPermissionCommandRules setUserMappingList(java.util.List<CreateRowPermissionRequestCreateRowPermissionCommandRulesUserMappingList> userMappingList) {
            this.userMappingList = userMappingList;
            return this;
        }
        public java.util.List<CreateRowPermissionRequestCreateRowPermissionCommandRulesUserMappingList> getUserMappingList() {
            return this.userMappingList;
        }

    }

    public static class CreateRowPermissionRequestCreateRowPermissionCommandTables extends TeaModel {
        /**
         * <p>The column of the table.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>business_id</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>The name of the mapping column.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>business_id</p>
         */
        @NameInMap("MappingColumnName")
        public String mappingColumnName;

        /**
         * <p>The GUID of the table.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.300199897.project_name.table_name</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        public static CreateRowPermissionRequestCreateRowPermissionCommandTables build(java.util.Map<String, ?> map) throws Exception {
            CreateRowPermissionRequestCreateRowPermissionCommandTables self = new CreateRowPermissionRequestCreateRowPermissionCommandTables();
            return TeaModel.build(map, self);
        }

        public CreateRowPermissionRequestCreateRowPermissionCommandTables setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public CreateRowPermissionRequestCreateRowPermissionCommandTables setMappingColumnName(String mappingColumnName) {
            this.mappingColumnName = mappingColumnName;
            return this;
        }
        public String getMappingColumnName() {
            return this.mappingColumnName;
        }

        public CreateRowPermissionRequestCreateRowPermissionCommandTables setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

    public static class CreateRowPermissionRequestCreateRowPermissionCommand extends TeaModel {
        /**
         * <p>The mapping columns.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("MappingColumns")
        public java.util.List<CreateRowPermissionRequestCreateRowPermissionCommandMappingColumns> mappingColumns;

        /**
         * <p>The description of the row-level permission.</p>
         * 
         * <strong>example:</strong>
         * <p>管控业务数据</p>
         */
        @NameInMap("RowPermissionDesc")
        public String rowPermissionDesc;

        /**
         * <p>The name of the row-level permission.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>业务管控</p>
         */
        @NameInMap("RowPermissionName")
        public String rowPermissionName;

        /**
         * <p>The rules.</p>
         */
        @NameInMap("Rules")
        public java.util.List<CreateRowPermissionRequestCreateRowPermissionCommandRules> rules;

        /**
         * <p>The related tables.</p>
         */
        @NameInMap("Tables")
        public java.util.List<CreateRowPermissionRequestCreateRowPermissionCommandTables> tables;

        public static CreateRowPermissionRequestCreateRowPermissionCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateRowPermissionRequestCreateRowPermissionCommand self = new CreateRowPermissionRequestCreateRowPermissionCommand();
            return TeaModel.build(map, self);
        }

        public CreateRowPermissionRequestCreateRowPermissionCommand setMappingColumns(java.util.List<CreateRowPermissionRequestCreateRowPermissionCommandMappingColumns> mappingColumns) {
            this.mappingColumns = mappingColumns;
            return this;
        }
        public java.util.List<CreateRowPermissionRequestCreateRowPermissionCommandMappingColumns> getMappingColumns() {
            return this.mappingColumns;
        }

        public CreateRowPermissionRequestCreateRowPermissionCommand setRowPermissionDesc(String rowPermissionDesc) {
            this.rowPermissionDesc = rowPermissionDesc;
            return this;
        }
        public String getRowPermissionDesc() {
            return this.rowPermissionDesc;
        }

        public CreateRowPermissionRequestCreateRowPermissionCommand setRowPermissionName(String rowPermissionName) {
            this.rowPermissionName = rowPermissionName;
            return this;
        }
        public String getRowPermissionName() {
            return this.rowPermissionName;
        }

        public CreateRowPermissionRequestCreateRowPermissionCommand setRules(java.util.List<CreateRowPermissionRequestCreateRowPermissionCommandRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<CreateRowPermissionRequestCreateRowPermissionCommandRules> getRules() {
            return this.rules;
        }

        public CreateRowPermissionRequestCreateRowPermissionCommand setTables(java.util.List<CreateRowPermissionRequestCreateRowPermissionCommandTables> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<CreateRowPermissionRequestCreateRowPermissionCommandTables> getTables() {
            return this.tables;
        }

    }

}
