// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DeleteCostCenterRuleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>637127</p>
     */
    @NameInMap("CostCenterId")
    public Long costCenterId;

    @NameInMap("FilterExpression")
    public DeleteCostCenterRuleRequestFilterExpression filterExpression;

    /**
     * <strong>example:</strong>
     * <p>2684201000001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    public static DeleteCostCenterRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCostCenterRuleRequest self = new DeleteCostCenterRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCostCenterRuleRequest setCostCenterId(Long costCenterId) {
        this.costCenterId = costCenterId;
        return this;
    }
    public Long getCostCenterId() {
        return this.costCenterId;
    }

    public DeleteCostCenterRuleRequest setFilterExpression(DeleteCostCenterRuleRequestFilterExpression filterExpression) {
        this.filterExpression = filterExpression;
        return this;
    }
    public DeleteCostCenterRuleRequestFilterExpression getFilterExpression() {
        return this.filterExpression;
    }

    public DeleteCostCenterRuleRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public static class DeleteCostCenterRuleRequestFilterExpressionFilterValues extends TeaModel {
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

        public static DeleteCostCenterRuleRequestFilterExpressionFilterValues build(java.util.Map<String, ?> map) throws Exception {
            DeleteCostCenterRuleRequestFilterExpressionFilterValues self = new DeleteCostCenterRuleRequestFilterExpressionFilterValues();
            return TeaModel.build(map, self);
        }

        public DeleteCostCenterRuleRequestFilterExpressionFilterValues setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DeleteCostCenterRuleRequestFilterExpressionFilterValues setCodeName(String codeName) {
            this.codeName = codeName;
            return this;
        }
        public String getCodeName() {
            return this.codeName;
        }

        public DeleteCostCenterRuleRequestFilterExpressionFilterValues setSelectType(String selectType) {
            this.selectType = selectType;
            return this;
        }
        public String getSelectType() {
            return this.selectType;
        }

        public DeleteCostCenterRuleRequestFilterExpressionFilterValues setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class DeleteCostCenterRuleRequestFilterExpression extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>NARY</p>
         */
        @NameInMap("ExpressionType")
        public String expressionType;

        @NameInMap("FilterValues")
        public DeleteCostCenterRuleRequestFilterExpressionFilterValues filterValues;

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

        public static DeleteCostCenterRuleRequestFilterExpression build(java.util.Map<String, ?> map) throws Exception {
            DeleteCostCenterRuleRequestFilterExpression self = new DeleteCostCenterRuleRequestFilterExpression();
            return TeaModel.build(map, self);
        }

        public DeleteCostCenterRuleRequestFilterExpression setExpressionType(String expressionType) {
            this.expressionType = expressionType;
            return this;
        }
        public String getExpressionType() {
            return this.expressionType;
        }

        public DeleteCostCenterRuleRequestFilterExpression setFilterValues(DeleteCostCenterRuleRequestFilterExpressionFilterValues filterValues) {
            this.filterValues = filterValues;
            return this;
        }
        public DeleteCostCenterRuleRequestFilterExpressionFilterValues getFilterValues() {
            return this.filterValues;
        }

        public DeleteCostCenterRuleRequestFilterExpression setOperand(Object operand) {
            this.operand = operand;
            return this;
        }
        public Object getOperand() {
            return this.operand;
        }

        public DeleteCostCenterRuleRequestFilterExpression setOperands(java.util.List<?> operands) {
            this.operands = operands;
            return this;
        }
        public java.util.List<?> getOperands() {
            return this.operands;
        }

        public DeleteCostCenterRuleRequestFilterExpression setOperatorType(String operatorType) {
            this.operatorType = operatorType;
            return this;
        }
        public String getOperatorType() {
            return this.operatorType;
        }

    }

}
