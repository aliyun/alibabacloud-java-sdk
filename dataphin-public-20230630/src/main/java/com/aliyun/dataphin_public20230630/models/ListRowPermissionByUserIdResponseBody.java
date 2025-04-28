// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListRowPermissionByUserIdResponseBody extends TeaModel {
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
    public ListRowPermissionByUserIdResponseBodyPageResult pageResult;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListRowPermissionByUserIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRowPermissionByUserIdResponseBody self = new ListRowPermissionByUserIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRowPermissionByUserIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRowPermissionByUserIdResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListRowPermissionByUserIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRowPermissionByUserIdResponseBody setPageResult(ListRowPermissionByUserIdResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListRowPermissionByUserIdResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListRowPermissionByUserIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRowPermissionByUserIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListRowPermissionByUserIdResponseBodyPageResultDataRulesExpressions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>business_id</p>
         */
        @NameInMap("MappingColumnName")
        public String mappingColumnName;

        /**
         * <strong>example:</strong>
         * <p>EQUAL</p>
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

        public static ListRowPermissionByUserIdResponseBodyPageResultDataRulesExpressions build(java.util.Map<String, ?> map) throws Exception {
            ListRowPermissionByUserIdResponseBodyPageResultDataRulesExpressions self = new ListRowPermissionByUserIdResponseBodyPageResultDataRulesExpressions();
            return TeaModel.build(map, self);
        }

        public ListRowPermissionByUserIdResponseBodyPageResultDataRulesExpressions setMappingColumnName(String mappingColumnName) {
            this.mappingColumnName = mappingColumnName;
            return this;
        }
        public String getMappingColumnName() {
            return this.mappingColumnName;
        }

        public ListRowPermissionByUserIdResponseBodyPageResultDataRulesExpressions setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListRowPermissionByUserIdResponseBodyPageResultDataRulesExpressions setSubConditions(java.util.List<?> subConditions) {
            this.subConditions = subConditions;
            return this;
        }
        public java.util.List<?> getSubConditions() {
            return this.subConditions;
        }

        public ListRowPermissionByUserIdResponseBodyPageResultDataRulesExpressions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListRowPermissionByUserIdResponseBodyPageResultDataRulesExpressions setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class ListRowPermissionByUserIdResponseBodyPageResultDataRulesUserMappingListAccounts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>30008888</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        public static ListRowPermissionByUserIdResponseBodyPageResultDataRulesUserMappingListAccounts build(java.util.Map<String, ?> map) throws Exception {
            ListRowPermissionByUserIdResponseBodyPageResultDataRulesUserMappingListAccounts self = new ListRowPermissionByUserIdResponseBodyPageResultDataRulesUserMappingListAccounts();
            return TeaModel.build(map, self);
        }

        public ListRowPermissionByUserIdResponseBodyPageResultDataRulesUserMappingListAccounts setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

    public static class ListRowPermissionByUserIdResponseBodyPageResultDataRulesUserMappingList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>PERSONAL</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("Accounts")
        public java.util.List<ListRowPermissionByUserIdResponseBodyPageResultDataRulesUserMappingListAccounts> accounts;

        public static ListRowPermissionByUserIdResponseBodyPageResultDataRulesUserMappingList build(java.util.Map<String, ?> map) throws Exception {
            ListRowPermissionByUserIdResponseBodyPageResultDataRulesUserMappingList self = new ListRowPermissionByUserIdResponseBodyPageResultDataRulesUserMappingList();
            return TeaModel.build(map, self);
        }

        public ListRowPermissionByUserIdResponseBodyPageResultDataRulesUserMappingList setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public ListRowPermissionByUserIdResponseBodyPageResultDataRulesUserMappingList setAccounts(java.util.List<ListRowPermissionByUserIdResponseBodyPageResultDataRulesUserMappingListAccounts> accounts) {
            this.accounts = accounts;
            return this;
        }
        public java.util.List<ListRowPermissionByUserIdResponseBodyPageResultDataRulesUserMappingListAccounts> getAccounts() {
            return this.accounts;
        }

    }

    public static class ListRowPermissionByUserIdResponseBodyPageResultDataRules extends TeaModel {
        @NameInMap("Expressions")
        public java.util.List<ListRowPermissionByUserIdResponseBodyPageResultDataRulesExpressions> expressions;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
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
        public java.util.List<ListRowPermissionByUserIdResponseBodyPageResultDataRulesUserMappingList> userMappingList;

        public static ListRowPermissionByUserIdResponseBodyPageResultDataRules build(java.util.Map<String, ?> map) throws Exception {
            ListRowPermissionByUserIdResponseBodyPageResultDataRules self = new ListRowPermissionByUserIdResponseBodyPageResultDataRules();
            return TeaModel.build(map, self);
        }

        public ListRowPermissionByUserIdResponseBodyPageResultDataRules setExpressions(java.util.List<ListRowPermissionByUserIdResponseBodyPageResultDataRulesExpressions> expressions) {
            this.expressions = expressions;
            return this;
        }
        public java.util.List<ListRowPermissionByUserIdResponseBodyPageResultDataRulesExpressions> getExpressions() {
            return this.expressions;
        }

        public ListRowPermissionByUserIdResponseBodyPageResultDataRules setIsDelete(Boolean isDelete) {
            this.isDelete = isDelete;
            return this;
        }
        public Boolean getIsDelete() {
            return this.isDelete;
        }

        public ListRowPermissionByUserIdResponseBodyPageResultDataRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListRowPermissionByUserIdResponseBodyPageResultDataRules setScopeType(String scopeType) {
            this.scopeType = scopeType;
            return this;
        }
        public String getScopeType() {
            return this.scopeType;
        }

        public ListRowPermissionByUserIdResponseBodyPageResultDataRules setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListRowPermissionByUserIdResponseBodyPageResultDataRules setUserMappingList(java.util.List<ListRowPermissionByUserIdResponseBodyPageResultDataRulesUserMappingList> userMappingList) {
            this.userMappingList = userMappingList;
            return this;
        }
        public java.util.List<ListRowPermissionByUserIdResponseBodyPageResultDataRulesUserMappingList> getUserMappingList() {
            return this.userMappingList;
        }

    }

    public static class ListRowPermissionByUserIdResponseBodyPageResultDataTables extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>business_id</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("MappingColumnName")
        public String mappingColumnName;

        /**
         * <strong>example:</strong>
         * <p>odps.300199897.project_name.table_name</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        public static ListRowPermissionByUserIdResponseBodyPageResultDataTables build(java.util.Map<String, ?> map) throws Exception {
            ListRowPermissionByUserIdResponseBodyPageResultDataTables self = new ListRowPermissionByUserIdResponseBodyPageResultDataTables();
            return TeaModel.build(map, self);
        }

        public ListRowPermissionByUserIdResponseBodyPageResultDataTables setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ListRowPermissionByUserIdResponseBodyPageResultDataTables setMappingColumnName(String mappingColumnName) {
            this.mappingColumnName = mappingColumnName;
            return this;
        }
        public String getMappingColumnName() {
            return this.mappingColumnName;
        }

        public ListRowPermissionByUserIdResponseBodyPageResultDataTables setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

    public static class ListRowPermissionByUserIdResponseBodyPageResultData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>30008888</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>2023-03-30T21:37:23Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2025-03-03T10:14Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>30008888</p>
         */
        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("Rules")
        public java.util.List<ListRowPermissionByUserIdResponseBodyPageResultDataRules> rules;

        @NameInMap("Tables")
        public java.util.List<ListRowPermissionByUserIdResponseBodyPageResultDataTables> tables;

        /**
         * <strong>example:</strong>
         * <p>30000001</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        public static ListRowPermissionByUserIdResponseBodyPageResultData build(java.util.Map<String, ?> map) throws Exception {
            ListRowPermissionByUserIdResponseBodyPageResultData self = new ListRowPermissionByUserIdResponseBodyPageResultData();
            return TeaModel.build(map, self);
        }

        public ListRowPermissionByUserIdResponseBodyPageResultData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListRowPermissionByUserIdResponseBodyPageResultData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListRowPermissionByUserIdResponseBodyPageResultData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListRowPermissionByUserIdResponseBodyPageResultData setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListRowPermissionByUserIdResponseBodyPageResultData setRules(java.util.List<ListRowPermissionByUserIdResponseBodyPageResultDataRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<ListRowPermissionByUserIdResponseBodyPageResultDataRules> getRules() {
            return this.rules;
        }

        public ListRowPermissionByUserIdResponseBodyPageResultData setTables(java.util.List<ListRowPermissionByUserIdResponseBodyPageResultDataTables> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<ListRowPermissionByUserIdResponseBodyPageResultDataTables> getTables() {
            return this.tables;
        }

        public ListRowPermissionByUserIdResponseBodyPageResultData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

    public static class ListRowPermissionByUserIdResponseBodyPageResult extends TeaModel {
        @NameInMap("Data")
        public java.util.List<ListRowPermissionByUserIdResponseBodyPageResultData> data;

        /**
         * <strong>example:</strong>
         * <p>121</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListRowPermissionByUserIdResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListRowPermissionByUserIdResponseBodyPageResult self = new ListRowPermissionByUserIdResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListRowPermissionByUserIdResponseBodyPageResult setData(java.util.List<ListRowPermissionByUserIdResponseBodyPageResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListRowPermissionByUserIdResponseBodyPageResultData> getData() {
            return this.data;
        }

        public ListRowPermissionByUserIdResponseBodyPageResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
