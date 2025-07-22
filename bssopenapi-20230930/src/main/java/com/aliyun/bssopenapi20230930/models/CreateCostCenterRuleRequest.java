// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CreateCostCenterRuleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>485938</p>
     */
    @NameInMap("CostCenterId")
    public Long costCenterId;

    @NameInMap("FilterExpression")
    public CreateCostCenterRuleRequestFilterExpression filterExpression;

    /**
     * <strong>example:</strong>
     * <p>2084210001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    public static CreateCostCenterRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCostCenterRuleRequest self = new CreateCostCenterRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateCostCenterRuleRequest setCostCenterId(Long costCenterId) {
        this.costCenterId = costCenterId;
        return this;
    }
    public Long getCostCenterId() {
        return this.costCenterId;
    }

    public CreateCostCenterRuleRequest setFilterExpression(CreateCostCenterRuleRequestFilterExpression filterExpression) {
        this.filterExpression = filterExpression;
        return this;
    }
    public CreateCostCenterRuleRequestFilterExpression getFilterExpression() {
        return this.filterExpression;
    }

    public CreateCostCenterRuleRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public static class CreateCostCenterRuleRequestFilterExpressionFilterValues extends TeaModel {
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

        public static CreateCostCenterRuleRequestFilterExpressionFilterValues build(java.util.Map<String, ?> map) throws Exception {
            CreateCostCenterRuleRequestFilterExpressionFilterValues self = new CreateCostCenterRuleRequestFilterExpressionFilterValues();
            return TeaModel.build(map, self);
        }

        public CreateCostCenterRuleRequestFilterExpressionFilterValues setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateCostCenterRuleRequestFilterExpressionFilterValues setCodeName(String codeName) {
            this.codeName = codeName;
            return this;
        }
        public String getCodeName() {
            return this.codeName;
        }

        public CreateCostCenterRuleRequestFilterExpressionFilterValues setSelectType(String selectType) {
            this.selectType = selectType;
            return this;
        }
        public String getSelectType() {
            return this.selectType;
        }

        public CreateCostCenterRuleRequestFilterExpressionFilterValues setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class CreateCostCenterRuleRequestFilterExpression extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>NARY</p>
         */
        @NameInMap("ExpressionType")
        public String expressionType;

        @NameInMap("FilterValues")
        public CreateCostCenterRuleRequestFilterExpressionFilterValues filterValues;

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

        public static CreateCostCenterRuleRequestFilterExpression build(java.util.Map<String, ?> map) throws Exception {
            CreateCostCenterRuleRequestFilterExpression self = new CreateCostCenterRuleRequestFilterExpression();
            return TeaModel.build(map, self);
        }

        public CreateCostCenterRuleRequestFilterExpression setExpressionType(String expressionType) {
            this.expressionType = expressionType;
            return this;
        }
        public String getExpressionType() {
            return this.expressionType;
        }

        public CreateCostCenterRuleRequestFilterExpression setFilterValues(CreateCostCenterRuleRequestFilterExpressionFilterValues filterValues) {
            this.filterValues = filterValues;
            return this;
        }
        public CreateCostCenterRuleRequestFilterExpressionFilterValues getFilterValues() {
            return this.filterValues;
        }

        public CreateCostCenterRuleRequestFilterExpression setOperand(Object operand) {
            this.operand = operand;
            return this;
        }
        public Object getOperand() {
            return this.operand;
        }

        public CreateCostCenterRuleRequestFilterExpression setOperands(java.util.List<?> operands) {
            this.operands = operands;
            return this;
        }
        public java.util.List<?> getOperands() {
            return this.operands;
        }

        public CreateCostCenterRuleRequestFilterExpression setOperatorType(String operatorType) {
            this.operatorType = operatorType;
            return this;
        }
        public String getOperatorType() {
            return this.operatorType;
        }

    }

}
