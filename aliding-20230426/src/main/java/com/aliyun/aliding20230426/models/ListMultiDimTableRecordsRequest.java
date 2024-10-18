// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListMultiDimTableRecordsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>101114</p>
     */
    @NameInMap("BaseId")
    public String baseId;

    @NameInMap("Filter")
    public ListMultiDimTableRecordsRequestFilter filter;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAUUg5QSTWwHyeElt8z5z4Qo=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("SheetIdOrName")
    public String sheetIdOrName;

    @NameInMap("TenantContext")
    public ListMultiDimTableRecordsRequestTenantContext tenantContext;

    public static ListMultiDimTableRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMultiDimTableRecordsRequest self = new ListMultiDimTableRecordsRequest();
        return TeaModel.build(map, self);
    }

    public ListMultiDimTableRecordsRequest setBaseId(String baseId) {
        this.baseId = baseId;
        return this;
    }
    public String getBaseId() {
        return this.baseId;
    }

    public ListMultiDimTableRecordsRequest setFilter(ListMultiDimTableRecordsRequestFilter filter) {
        this.filter = filter;
        return this;
    }
    public ListMultiDimTableRecordsRequestFilter getFilter() {
        return this.filter;
    }

    public ListMultiDimTableRecordsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMultiDimTableRecordsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMultiDimTableRecordsRequest setSheetIdOrName(String sheetIdOrName) {
        this.sheetIdOrName = sheetIdOrName;
        return this;
    }
    public String getSheetIdOrName() {
        return this.sheetIdOrName;
    }

    public ListMultiDimTableRecordsRequest setTenantContext(ListMultiDimTableRecordsRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public ListMultiDimTableRecordsRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class ListMultiDimTableRecordsRequestFilterConditions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Sandbox</p>
         */
        @NameInMap("Field")
        public String field;

        /**
         * <strong>example:</strong>
         * <p>equal</p>
         */
        @NameInMap("Operator")
        public String operator;

        @NameInMap("Value")
        public java.util.List<?> value;

        public static ListMultiDimTableRecordsRequestFilterConditions build(java.util.Map<String, ?> map) throws Exception {
            ListMultiDimTableRecordsRequestFilterConditions self = new ListMultiDimTableRecordsRequestFilterConditions();
            return TeaModel.build(map, self);
        }

        public ListMultiDimTableRecordsRequestFilterConditions setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public ListMultiDimTableRecordsRequestFilterConditions setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListMultiDimTableRecordsRequestFilterConditions setValue(java.util.List<?> value) {
            this.value = value;
            return this;
        }
        public java.util.List<?> getValue() {
            return this.value;
        }

    }

    public static class ListMultiDimTableRecordsRequestFilter extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>and</p>
         */
        @NameInMap("Combination")
        public String combination;

        @NameInMap("Conditions")
        public java.util.List<ListMultiDimTableRecordsRequestFilterConditions> conditions;

        public static ListMultiDimTableRecordsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListMultiDimTableRecordsRequestFilter self = new ListMultiDimTableRecordsRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListMultiDimTableRecordsRequestFilter setCombination(String combination) {
            this.combination = combination;
            return this;
        }
        public String getCombination() {
            return this.combination;
        }

        public ListMultiDimTableRecordsRequestFilter setConditions(java.util.List<ListMultiDimTableRecordsRequestFilterConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<ListMultiDimTableRecordsRequestFilterConditions> getConditions() {
            return this.conditions;
        }

    }

    public static class ListMultiDimTableRecordsRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static ListMultiDimTableRecordsRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            ListMultiDimTableRecordsRequestTenantContext self = new ListMultiDimTableRecordsRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public ListMultiDimTableRecordsRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
