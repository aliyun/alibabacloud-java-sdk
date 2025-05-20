// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeQueryExplainResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>List<ExplainedSqlDO></p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeQueryExplainResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeQueryExplainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeQueryExplainResponseBody self = new DescribeQueryExplainResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeQueryExplainResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeQueryExplainResponseBody setData(java.util.List<DescribeQueryExplainResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeQueryExplainResponseBodyData> getData() {
        return this.data;
    }

    public DescribeQueryExplainResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeQueryExplainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeQueryExplainResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeQueryExplainResponseBodyData extends TeaModel {
        @NameInMap("Argument")
        public String argument;

        @NameInMap("AvgRowSize")
        public String avgRowSize;

        @NameInMap("DefinedValues")
        public String definedValues;

        @NameInMap("EstimateCPU")
        public String estimateCPU;

        @NameInMap("EstimateExecutions")
        public String estimateExecutions;

        @NameInMap("EstimateIO")
        public String estimateIO;

        @NameInMap("EstimateRows")
        public String estimateRows;

        @NameInMap("Extra")
        public String extra;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("IndexList")
        public java.util.List<String> indexList;

        /**
         * <strong>example:</strong>
         * <p>PRIMARY</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("KeyLen")
        public String keyLen;

        @NameInMap("LogicalOp")
        public String logicalOp;

        @NameInMap("LogicalPlanList")
        public java.util.List<String> logicalPlanList;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("OutputList")
        public String outputList;

        @NameInMap("Parallel")
        public String parallel;

        @NameInMap("Parent")
        public String parent;

        @NameInMap("PhysicalOp")
        public String physicalOp;

        /**
         * <strong>example:</strong>
         * <p>test_idx</p>
         */
        @NameInMap("PossibleKeys")
        public String possibleKeys;

        @NameInMap("QueryPlan")
        public String queryPlan;

        /**
         * <strong>example:</strong>
         * <p>test_column</p>
         */
        @NameInMap("Ref")
        public String ref;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Rows")
        public String rows;

        /**
         * <strong>example:</strong>
         * <p>SIMPLE</p>
         */
        @NameInMap("SelectType")
        public String selectType;

        @NameInMap("StmtId")
        public String stmtId;

        @NameInMap("StmtText")
        public String stmtText;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Table")
        public String table;

        @NameInMap("TableList")
        public java.util.List<String> tableList;

        @NameInMap("TotalSubtreeCost")
        public String totalSubtreeCost;

        /**
         * <strong>example:</strong>
         * <p>eq_ref</p>
         */
        @NameInMap("Type")
        public String type;

        @NameInMap("Warnings")
        public String warnings;

        public static DescribeQueryExplainResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeQueryExplainResponseBodyData self = new DescribeQueryExplainResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeQueryExplainResponseBodyData setArgument(String argument) {
            this.argument = argument;
            return this;
        }
        public String getArgument() {
            return this.argument;
        }

        public DescribeQueryExplainResponseBodyData setAvgRowSize(String avgRowSize) {
            this.avgRowSize = avgRowSize;
            return this;
        }
        public String getAvgRowSize() {
            return this.avgRowSize;
        }

        public DescribeQueryExplainResponseBodyData setDefinedValues(String definedValues) {
            this.definedValues = definedValues;
            return this;
        }
        public String getDefinedValues() {
            return this.definedValues;
        }

        public DescribeQueryExplainResponseBodyData setEstimateCPU(String estimateCPU) {
            this.estimateCPU = estimateCPU;
            return this;
        }
        public String getEstimateCPU() {
            return this.estimateCPU;
        }

        public DescribeQueryExplainResponseBodyData setEstimateExecutions(String estimateExecutions) {
            this.estimateExecutions = estimateExecutions;
            return this;
        }
        public String getEstimateExecutions() {
            return this.estimateExecutions;
        }

        public DescribeQueryExplainResponseBodyData setEstimateIO(String estimateIO) {
            this.estimateIO = estimateIO;
            return this;
        }
        public String getEstimateIO() {
            return this.estimateIO;
        }

        public DescribeQueryExplainResponseBodyData setEstimateRows(String estimateRows) {
            this.estimateRows = estimateRows;
            return this;
        }
        public String getEstimateRows() {
            return this.estimateRows;
        }

        public DescribeQueryExplainResponseBodyData setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public DescribeQueryExplainResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeQueryExplainResponseBodyData setIndexList(java.util.List<String> indexList) {
            this.indexList = indexList;
            return this;
        }
        public java.util.List<String> getIndexList() {
            return this.indexList;
        }

        public DescribeQueryExplainResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeQueryExplainResponseBodyData setKeyLen(String keyLen) {
            this.keyLen = keyLen;
            return this;
        }
        public String getKeyLen() {
            return this.keyLen;
        }

        public DescribeQueryExplainResponseBodyData setLogicalOp(String logicalOp) {
            this.logicalOp = logicalOp;
            return this;
        }
        public String getLogicalOp() {
            return this.logicalOp;
        }

        public DescribeQueryExplainResponseBodyData setLogicalPlanList(java.util.List<String> logicalPlanList) {
            this.logicalPlanList = logicalPlanList;
            return this;
        }
        public java.util.List<String> getLogicalPlanList() {
            return this.logicalPlanList;
        }

        public DescribeQueryExplainResponseBodyData setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeQueryExplainResponseBodyData setOutputList(String outputList) {
            this.outputList = outputList;
            return this;
        }
        public String getOutputList() {
            return this.outputList;
        }

        public DescribeQueryExplainResponseBodyData setParallel(String parallel) {
            this.parallel = parallel;
            return this;
        }
        public String getParallel() {
            return this.parallel;
        }

        public DescribeQueryExplainResponseBodyData setParent(String parent) {
            this.parent = parent;
            return this;
        }
        public String getParent() {
            return this.parent;
        }

        public DescribeQueryExplainResponseBodyData setPhysicalOp(String physicalOp) {
            this.physicalOp = physicalOp;
            return this;
        }
        public String getPhysicalOp() {
            return this.physicalOp;
        }

        public DescribeQueryExplainResponseBodyData setPossibleKeys(String possibleKeys) {
            this.possibleKeys = possibleKeys;
            return this;
        }
        public String getPossibleKeys() {
            return this.possibleKeys;
        }

        public DescribeQueryExplainResponseBodyData setQueryPlan(String queryPlan) {
            this.queryPlan = queryPlan;
            return this;
        }
        public String getQueryPlan() {
            return this.queryPlan;
        }

        public DescribeQueryExplainResponseBodyData setRef(String ref) {
            this.ref = ref;
            return this;
        }
        public String getRef() {
            return this.ref;
        }

        public DescribeQueryExplainResponseBodyData setRows(String rows) {
            this.rows = rows;
            return this;
        }
        public String getRows() {
            return this.rows;
        }

        public DescribeQueryExplainResponseBodyData setSelectType(String selectType) {
            this.selectType = selectType;
            return this;
        }
        public String getSelectType() {
            return this.selectType;
        }

        public DescribeQueryExplainResponseBodyData setStmtId(String stmtId) {
            this.stmtId = stmtId;
            return this;
        }
        public String getStmtId() {
            return this.stmtId;
        }

        public DescribeQueryExplainResponseBodyData setStmtText(String stmtText) {
            this.stmtText = stmtText;
            return this;
        }
        public String getStmtText() {
            return this.stmtText;
        }

        public DescribeQueryExplainResponseBodyData setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

        public DescribeQueryExplainResponseBodyData setTableList(java.util.List<String> tableList) {
            this.tableList = tableList;
            return this;
        }
        public java.util.List<String> getTableList() {
            return this.tableList;
        }

        public DescribeQueryExplainResponseBodyData setTotalSubtreeCost(String totalSubtreeCost) {
            this.totalSubtreeCost = totalSubtreeCost;
            return this;
        }
        public String getTotalSubtreeCost() {
            return this.totalSubtreeCost;
        }

        public DescribeQueryExplainResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeQueryExplainResponseBodyData setWarnings(String warnings) {
            this.warnings = warnings;
            return this;
        }
        public String getWarnings() {
            return this.warnings;
        }

    }

}
