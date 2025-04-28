// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListRowPermissionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("PageResult")
    public ListRowPermissionResponseBodyPageResult pageResult;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListRowPermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRowPermissionResponseBody self = new ListRowPermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRowPermissionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRowPermissionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListRowPermissionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRowPermissionResponseBody setPageResult(ListRowPermissionResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListRowPermissionResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListRowPermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRowPermissionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListRowPermissionResponseBodyPageResultDataMappingColumns extends TeaModel {
        @NameInMap("ColumnDesc")
        public String columnDesc;

        /**
         * <strong>example:</strong>
         * <p>business_id</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("ColumnType")
        public String columnType;

        public static ListRowPermissionResponseBodyPageResultDataMappingColumns build(java.util.Map<String, ?> map) throws Exception {
            ListRowPermissionResponseBodyPageResultDataMappingColumns self = new ListRowPermissionResponseBodyPageResultDataMappingColumns();
            return TeaModel.build(map, self);
        }

        public ListRowPermissionResponseBodyPageResultDataMappingColumns setColumnDesc(String columnDesc) {
            this.columnDesc = columnDesc;
            return this;
        }
        public String getColumnDesc() {
            return this.columnDesc;
        }

        public ListRowPermissionResponseBodyPageResultDataMappingColumns setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ListRowPermissionResponseBodyPageResultDataMappingColumns setColumnType(String columnType) {
            this.columnType = columnType;
            return this;
        }
        public String getColumnType() {
            return this.columnType;
        }

    }

    public static class ListRowPermissionResponseBodyPageResultDataRulesExpressions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>business_id</p>
         */
        @NameInMap("MappingColumnName")
        public String mappingColumnName;

        /**
         * <strong>example:</strong>
         * <p>30008888</p>
         */
        @NameInMap("Operator")
        public String operator;

        @NameInMap("SubConditions")
        public java.util.List<?> subConditions;

        /**
         * <strong>example:</strong>
         * <p>EXPRESSION</p>
         */
        @NameInMap("Type")
        public String type;

        @NameInMap("Values")
        public java.util.List<String> values;

        public static ListRowPermissionResponseBodyPageResultDataRulesExpressions build(java.util.Map<String, ?> map) throws Exception {
            ListRowPermissionResponseBodyPageResultDataRulesExpressions self = new ListRowPermissionResponseBodyPageResultDataRulesExpressions();
            return TeaModel.build(map, self);
        }

        public ListRowPermissionResponseBodyPageResultDataRulesExpressions setMappingColumnName(String mappingColumnName) {
            this.mappingColumnName = mappingColumnName;
            return this;
        }
        public String getMappingColumnName() {
            return this.mappingColumnName;
        }

        public ListRowPermissionResponseBodyPageResultDataRulesExpressions setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListRowPermissionResponseBodyPageResultDataRulesExpressions setSubConditions(java.util.List<?> subConditions) {
            this.subConditions = subConditions;
            return this;
        }
        public java.util.List<?> getSubConditions() {
            return this.subConditions;
        }

        public ListRowPermissionResponseBodyPageResultDataRulesExpressions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListRowPermissionResponseBodyPageResultDataRulesExpressions setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class ListRowPermissionResponseBodyPageResultDataRulesUserMappingListAccounts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>30008888</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        public static ListRowPermissionResponseBodyPageResultDataRulesUserMappingListAccounts build(java.util.Map<String, ?> map) throws Exception {
            ListRowPermissionResponseBodyPageResultDataRulesUserMappingListAccounts self = new ListRowPermissionResponseBodyPageResultDataRulesUserMappingListAccounts();
            return TeaModel.build(map, self);
        }

        public ListRowPermissionResponseBodyPageResultDataRulesUserMappingListAccounts setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

    public static class ListRowPermissionResponseBodyPageResultDataRulesUserMappingList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>PERSONAL</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("Accounts")
        public java.util.List<ListRowPermissionResponseBodyPageResultDataRulesUserMappingListAccounts> accounts;

        public static ListRowPermissionResponseBodyPageResultDataRulesUserMappingList build(java.util.Map<String, ?> map) throws Exception {
            ListRowPermissionResponseBodyPageResultDataRulesUserMappingList self = new ListRowPermissionResponseBodyPageResultDataRulesUserMappingList();
            return TeaModel.build(map, self);
        }

        public ListRowPermissionResponseBodyPageResultDataRulesUserMappingList setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public ListRowPermissionResponseBodyPageResultDataRulesUserMappingList setAccounts(java.util.List<ListRowPermissionResponseBodyPageResultDataRulesUserMappingListAccounts> accounts) {
            this.accounts = accounts;
            return this;
        }
        public java.util.List<ListRowPermissionResponseBodyPageResultDataRulesUserMappingListAccounts> getAccounts() {
            return this.accounts;
        }

    }

    public static class ListRowPermissionResponseBodyPageResultDataRules extends TeaModel {
        @NameInMap("Expressions")
        public java.util.List<ListRowPermissionResponseBodyPageResultDataRulesExpressions> expressions;

        @NameInMap("IsDelete")
        public Boolean isDelete;

        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <strong>example:</strong>
         * <p>SELECT_COLUMN</p>
         */
        @NameInMap("ScopeType")
        public String scopeType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        @NameInMap("UserMappingList")
        public java.util.List<ListRowPermissionResponseBodyPageResultDataRulesUserMappingList> userMappingList;

        public static ListRowPermissionResponseBodyPageResultDataRules build(java.util.Map<String, ?> map) throws Exception {
            ListRowPermissionResponseBodyPageResultDataRules self = new ListRowPermissionResponseBodyPageResultDataRules();
            return TeaModel.build(map, self);
        }

        public ListRowPermissionResponseBodyPageResultDataRules setExpressions(java.util.List<ListRowPermissionResponseBodyPageResultDataRulesExpressions> expressions) {
            this.expressions = expressions;
            return this;
        }
        public java.util.List<ListRowPermissionResponseBodyPageResultDataRulesExpressions> getExpressions() {
            return this.expressions;
        }

        public ListRowPermissionResponseBodyPageResultDataRules setIsDelete(Boolean isDelete) {
            this.isDelete = isDelete;
            return this;
        }
        public Boolean getIsDelete() {
            return this.isDelete;
        }

        public ListRowPermissionResponseBodyPageResultDataRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListRowPermissionResponseBodyPageResultDataRules setScopeType(String scopeType) {
            this.scopeType = scopeType;
            return this;
        }
        public String getScopeType() {
            return this.scopeType;
        }

        public ListRowPermissionResponseBodyPageResultDataRules setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListRowPermissionResponseBodyPageResultDataRules setUserMappingList(java.util.List<ListRowPermissionResponseBodyPageResultDataRulesUserMappingList> userMappingList) {
            this.userMappingList = userMappingList;
            return this;
        }
        public java.util.List<ListRowPermissionResponseBodyPageResultDataRulesUserMappingList> getUserMappingList() {
            return this.userMappingList;
        }

    }

    public static class ListRowPermissionResponseBodyPageResultDataTables extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>business_id</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <strong>example:</strong>
         * <p>business_id</p>
         */
        @NameInMap("MappingColumnName")
        public String mappingColumnName;

        /**
         * <strong>example:</strong>
         * <p>odps.300199897.project_name.table_name</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        public static ListRowPermissionResponseBodyPageResultDataTables build(java.util.Map<String, ?> map) throws Exception {
            ListRowPermissionResponseBodyPageResultDataTables self = new ListRowPermissionResponseBodyPageResultDataTables();
            return TeaModel.build(map, self);
        }

        public ListRowPermissionResponseBodyPageResultDataTables setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ListRowPermissionResponseBodyPageResultDataTables setMappingColumnName(String mappingColumnName) {
            this.mappingColumnName = mappingColumnName;
            return this;
        }
        public String getMappingColumnName() {
            return this.mappingColumnName;
        }

        public ListRowPermissionResponseBodyPageResultDataTables setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

    public static class ListRowPermissionResponseBodyPageResultData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>30008888</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>2023-08-23T08:01:44Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2025-02-12T02:16:45Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("MappingColumns")
        public java.util.List<ListRowPermissionResponseBodyPageResultDataMappingColumns> mappingColumns;

        /**
         * <strong>example:</strong>
         * <p>30008888</p>
         */
        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("RowPermissionDesc")
        public String rowPermissionDesc;

        /**
         * <strong>example:</strong>
         * <p>30008888</p>
         */
        @NameInMap("RowPermissionId")
        public Long rowPermissionId;

        @NameInMap("RowPermissionName")
        public String rowPermissionName;

        @NameInMap("Rules")
        public java.util.List<ListRowPermissionResponseBodyPageResultDataRules> rules;

        @NameInMap("Tables")
        public java.util.List<ListRowPermissionResponseBodyPageResultDataTables> tables;

        /**
         * <strong>example:</strong>
         * <p>30000001</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        public static ListRowPermissionResponseBodyPageResultData build(java.util.Map<String, ?> map) throws Exception {
            ListRowPermissionResponseBodyPageResultData self = new ListRowPermissionResponseBodyPageResultData();
            return TeaModel.build(map, self);
        }

        public ListRowPermissionResponseBodyPageResultData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListRowPermissionResponseBodyPageResultData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListRowPermissionResponseBodyPageResultData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListRowPermissionResponseBodyPageResultData setMappingColumns(java.util.List<ListRowPermissionResponseBodyPageResultDataMappingColumns> mappingColumns) {
            this.mappingColumns = mappingColumns;
            return this;
        }
        public java.util.List<ListRowPermissionResponseBodyPageResultDataMappingColumns> getMappingColumns() {
            return this.mappingColumns;
        }

        public ListRowPermissionResponseBodyPageResultData setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListRowPermissionResponseBodyPageResultData setRowPermissionDesc(String rowPermissionDesc) {
            this.rowPermissionDesc = rowPermissionDesc;
            return this;
        }
        public String getRowPermissionDesc() {
            return this.rowPermissionDesc;
        }

        public ListRowPermissionResponseBodyPageResultData setRowPermissionId(Long rowPermissionId) {
            this.rowPermissionId = rowPermissionId;
            return this;
        }
        public Long getRowPermissionId() {
            return this.rowPermissionId;
        }

        public ListRowPermissionResponseBodyPageResultData setRowPermissionName(String rowPermissionName) {
            this.rowPermissionName = rowPermissionName;
            return this;
        }
        public String getRowPermissionName() {
            return this.rowPermissionName;
        }

        public ListRowPermissionResponseBodyPageResultData setRules(java.util.List<ListRowPermissionResponseBodyPageResultDataRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<ListRowPermissionResponseBodyPageResultDataRules> getRules() {
            return this.rules;
        }

        public ListRowPermissionResponseBodyPageResultData setTables(java.util.List<ListRowPermissionResponseBodyPageResultDataTables> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<ListRowPermissionResponseBodyPageResultDataTables> getTables() {
            return this.tables;
        }

        public ListRowPermissionResponseBodyPageResultData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

    public static class ListRowPermissionResponseBodyPageResult extends TeaModel {
        @NameInMap("Data")
        public java.util.List<ListRowPermissionResponseBodyPageResultData> data;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListRowPermissionResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListRowPermissionResponseBodyPageResult self = new ListRowPermissionResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListRowPermissionResponseBodyPageResult setData(java.util.List<ListRowPermissionResponseBodyPageResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListRowPermissionResponseBodyPageResultData> getData() {
            return this.data;
        }

        public ListRowPermissionResponseBodyPageResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
