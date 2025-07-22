// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class ModifyCostCenterRuleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>485938</p>
     */
    @NameInMap("CostCenterId")
    public Long costCenterId;

    @NameInMap("FilterExpression")
    public ModifyCostCenterRuleRequestFilterExpression filterExpression;

    /**
     * <strong>example:</strong>
     * <p>2684201000001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    /**
     * <strong>example:</strong>
     * <p>1234567812345678</p>
     */
    @NameInMap("OwnerAccountId")
    public Long ownerAccountId;

    public static ModifyCostCenterRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCostCenterRuleRequest self = new ModifyCostCenterRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCostCenterRuleRequest setCostCenterId(Long costCenterId) {
        this.costCenterId = costCenterId;
        return this;
    }
    public Long getCostCenterId() {
        return this.costCenterId;
    }

    public ModifyCostCenterRuleRequest setFilterExpression(ModifyCostCenterRuleRequestFilterExpression filterExpression) {
        this.filterExpression = filterExpression;
        return this;
    }
    public ModifyCostCenterRuleRequestFilterExpression getFilterExpression() {
        return this.filterExpression;
    }

    public ModifyCostCenterRuleRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public ModifyCostCenterRuleRequest setOwnerAccountId(Long ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
        return this;
    }
    public Long getOwnerAccountId() {
        return this.ownerAccountId;
    }

    public static class ModifyCostCenterRuleRequestFilterExpressionFilterValues extends TeaModel {
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

        public static ModifyCostCenterRuleRequestFilterExpressionFilterValues build(java.util.Map<String, ?> map) throws Exception {
            ModifyCostCenterRuleRequestFilterExpressionFilterValues self = new ModifyCostCenterRuleRequestFilterExpressionFilterValues();
            return TeaModel.build(map, self);
        }

        public ModifyCostCenterRuleRequestFilterExpressionFilterValues setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ModifyCostCenterRuleRequestFilterExpressionFilterValues setCodeName(String codeName) {
            this.codeName = codeName;
            return this;
        }
        public String getCodeName() {
            return this.codeName;
        }

        public ModifyCostCenterRuleRequestFilterExpressionFilterValues setSelectType(String selectType) {
            this.selectType = selectType;
            return this;
        }
        public String getSelectType() {
            return this.selectType;
        }

        public ModifyCostCenterRuleRequestFilterExpressionFilterValues setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class ModifyCostCenterRuleRequestFilterExpression extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>NARY</p>
         */
        @NameInMap("ExpressionType")
        public String expressionType;

        @NameInMap("FilterValues")
        public ModifyCostCenterRuleRequestFilterExpressionFilterValues filterValues;

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

        public static ModifyCostCenterRuleRequestFilterExpression build(java.util.Map<String, ?> map) throws Exception {
            ModifyCostCenterRuleRequestFilterExpression self = new ModifyCostCenterRuleRequestFilterExpression();
            return TeaModel.build(map, self);
        }

        public ModifyCostCenterRuleRequestFilterExpression setExpressionType(String expressionType) {
            this.expressionType = expressionType;
            return this;
        }
        public String getExpressionType() {
            return this.expressionType;
        }

        public ModifyCostCenterRuleRequestFilterExpression setFilterValues(ModifyCostCenterRuleRequestFilterExpressionFilterValues filterValues) {
            this.filterValues = filterValues;
            return this;
        }
        public ModifyCostCenterRuleRequestFilterExpressionFilterValues getFilterValues() {
            return this.filterValues;
        }

        public ModifyCostCenterRuleRequestFilterExpression setOperand(Object operand) {
            this.operand = operand;
            return this;
        }
        public Object getOperand() {
            return this.operand;
        }

        public ModifyCostCenterRuleRequestFilterExpression setOperands(java.util.List<?> operands) {
            this.operands = operands;
            return this;
        }
        public java.util.List<?> getOperands() {
            return this.operands;
        }

        public ModifyCostCenterRuleRequestFilterExpression setOperatorType(String operatorType) {
            this.operatorType = operatorType;
            return this;
        }
        public String getOperatorType() {
            return this.operatorType;
        }

    }

}
