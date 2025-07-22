// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class QueryCostCenterRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>597745</p>
     */
    @NameInMap("CostCenterId")
    public Long costCenterId;

    @NameInMap("FilterExpression")
    public QueryCostCenterRuleResponseBodyFilterExpression filterExpression;

    /**
     * <strong>example:</strong>
     * <p>Tue Nov 12 14:49:43 CST 2024</p>
     */
    @NameInMap("GmtCreate")
    public String gmtCreate;

    /**
     * <strong>example:</strong>
     * <p>Wed Oct 16 10:15:37 CST 2024</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <strong>example:</strong>
     * <p>32048</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsDeleted")
    public Integer isDeleted;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <strong>example:</strong>
     * <p>1977800748053695</p>
     */
    @NameInMap("OwnerAccountId")
    public Long ownerAccountId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>UUID</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RootCostCenterId")
    public Long rootCostCenterId;

    /**
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Status")
    public String status;

    public static QueryCostCenterRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCostCenterRuleResponseBody self = new QueryCostCenterRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCostCenterRuleResponseBody setCostCenterId(Long costCenterId) {
        this.costCenterId = costCenterId;
        return this;
    }
    public Long getCostCenterId() {
        return this.costCenterId;
    }

    public QueryCostCenterRuleResponseBody setFilterExpression(QueryCostCenterRuleResponseBodyFilterExpression filterExpression) {
        this.filterExpression = filterExpression;
        return this;
    }
    public QueryCostCenterRuleResponseBodyFilterExpression getFilterExpression() {
        return this.filterExpression;
    }

    public QueryCostCenterRuleResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public QueryCostCenterRuleResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public QueryCostCenterRuleResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryCostCenterRuleResponseBody setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }
    public Integer getIsDeleted() {
        return this.isDeleted;
    }

    public QueryCostCenterRuleResponseBody setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }
    public Object getMetadata() {
        return this.metadata;
    }

    public QueryCostCenterRuleResponseBody setOwnerAccountId(Long ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
        return this;
    }
    public Long getOwnerAccountId() {
        return this.ownerAccountId;
    }

    public QueryCostCenterRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCostCenterRuleResponseBody setRootCostCenterId(Long rootCostCenterId) {
        this.rootCostCenterId = rootCostCenterId;
        return this;
    }
    public Long getRootCostCenterId() {
        return this.rootCostCenterId;
    }

    public QueryCostCenterRuleResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class QueryCostCenterRuleResponseBodyFilterExpressionFilterValues extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>TAG-test-xxx-key</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("CodeName")
        public String codeName;

        /**
         * <strong>example:</strong>
         * <p>IN</p>
         */
        @NameInMap("SelectType")
        public String selectType;

        @NameInMap("Values")
        public java.util.List<String> values;

        public static QueryCostCenterRuleResponseBodyFilterExpressionFilterValues build(java.util.Map<String, ?> map) throws Exception {
            QueryCostCenterRuleResponseBodyFilterExpressionFilterValues self = new QueryCostCenterRuleResponseBodyFilterExpressionFilterValues();
            return TeaModel.build(map, self);
        }

        public QueryCostCenterRuleResponseBodyFilterExpressionFilterValues setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryCostCenterRuleResponseBodyFilterExpressionFilterValues setCodeName(String codeName) {
            this.codeName = codeName;
            return this;
        }
        public String getCodeName() {
            return this.codeName;
        }

        public QueryCostCenterRuleResponseBodyFilterExpressionFilterValues setSelectType(String selectType) {
            this.selectType = selectType;
            return this;
        }
        public String getSelectType() {
            return this.selectType;
        }

        public QueryCostCenterRuleResponseBodyFilterExpressionFilterValues setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class QueryCostCenterRuleResponseBodyFilterExpression extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>NARY</p>
         */
        @NameInMap("ExpressionType")
        public String expressionType;

        @NameInMap("FilterValues")
        public QueryCostCenterRuleResponseBodyFilterExpressionFilterValues filterValues;

        @NameInMap("Operand")
        public Object operand;

        @NameInMap("Operands")
        public java.util.List<?> operands;

        /**
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("OperatorType")
        public String operatorType;

        public static QueryCostCenterRuleResponseBodyFilterExpression build(java.util.Map<String, ?> map) throws Exception {
            QueryCostCenterRuleResponseBodyFilterExpression self = new QueryCostCenterRuleResponseBodyFilterExpression();
            return TeaModel.build(map, self);
        }

        public QueryCostCenterRuleResponseBodyFilterExpression setExpressionType(String expressionType) {
            this.expressionType = expressionType;
            return this;
        }
        public String getExpressionType() {
            return this.expressionType;
        }

        public QueryCostCenterRuleResponseBodyFilterExpression setFilterValues(QueryCostCenterRuleResponseBodyFilterExpressionFilterValues filterValues) {
            this.filterValues = filterValues;
            return this;
        }
        public QueryCostCenterRuleResponseBodyFilterExpressionFilterValues getFilterValues() {
            return this.filterValues;
        }

        public QueryCostCenterRuleResponseBodyFilterExpression setOperand(Object operand) {
            this.operand = operand;
            return this;
        }
        public Object getOperand() {
            return this.operand;
        }

        public QueryCostCenterRuleResponseBodyFilterExpression setOperands(java.util.List<?> operands) {
            this.operands = operands;
            return this;
        }
        public java.util.List<?> getOperands() {
            return this.operands;
        }

        public QueryCostCenterRuleResponseBodyFilterExpression setOperatorType(String operatorType) {
            this.operatorType = operatorType;
            return this;
        }
        public String getOperatorType() {
            return this.operatorType;
        }

    }

}
