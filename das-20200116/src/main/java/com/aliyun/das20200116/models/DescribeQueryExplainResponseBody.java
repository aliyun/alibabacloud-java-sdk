// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeQueryExplainResponseBody extends TeaModel {
    /**
     * <p>The status code returned. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>List of execution plans.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeQueryExplainResponseBodyData> data;

    /**
     * <p>The response message.</p>
     * <blockquote>
     * <p>If the request succeeds, this parameter returns Successful. If the request fails, this parameter returns error details such as an error code.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request succeeded.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
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
        /**
         * <p>A reserved field for the SQL Server engine.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("Argument")
        public String argument;

        /**
         * <p>A reserved field for the SQL Server engine.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("AvgRowSize")
        public String avgRowSize;

        /**
         * <p>A reserved field for the SQL Server engine.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("DefinedValues")
        public String definedValues;

        /**
         * <p>A reserved field for the SQL Server engine.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("EstimateCPU")
        public String estimateCPU;

        /**
         * <p>A reserved field for the SQL Server engine.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("EstimateExecutions")
        public String estimateExecutions;

        /**
         * <p>A reserved field for the SQL Server engine.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("EstimateIO")
        public String estimateIO;

        /**
         * <p>A reserved field for the SQL Server engine.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("EstimateRows")
        public String estimateRows;

        /**
         * <p>Additional information.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("Extra")
        public String extra;

        /**
         * <p>The ID of the query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>A reserved field for the PostgreSQL engine.</p>
         */
        @NameInMap("IndexList")
        public java.util.List<String> indexList;

        /**
         * <p>The index actually used in the execution plan.</p>
         * 
         * <strong>example:</strong>
         * <p>PRIMARY</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The length of the index actually used.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("KeyLen")
        public String keyLen;

        /**
         * <p>A reserved field for the SQL Server engine.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("LogicalOp")
        public String logicalOp;

        /**
         * <p>A reserved field for the PolarDB X engine.</p>
         */
        @NameInMap("LogicalPlanList")
        public java.util.List<String> logicalPlanList;

        /**
         * <p>A reserved field for the SQL Server engine.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>A reserved field for the SQL Server engine.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("OutputList")
        public String outputList;

        /**
         * <p>A reserved field for the SQL Server engine.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("Parallel")
        public String parallel;

        /**
         * <p>A reserved field for the SQL Server engine.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("Parent")
        public String parent;

        /**
         * <p>A reserved field for the SQL Server engine.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("PhysicalOp")
        public String physicalOp;

        /**
         * <p>The indexes that might be used.</p>
         * 
         * <strong>example:</strong>
         * <p>test_idx</p>
         */
        @NameInMap("PossibleKeys")
        public String possibleKeys;

        /**
         * <p>A reserved field for the PostgreSQL engine.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("QueryPlan")
        public String queryPlan;

        /**
         * <p>The column used by the index.</p>
         * 
         * <strong>example:</strong>
         * <p>test_column</p>
         */
        @NameInMap("Ref")
        public String ref;

        /**
         * <p>The number of rows to scan.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Rows")
        public String rows;

        /**
         * <p>The type of the query.</p>
         * 
         * <strong>example:</strong>
         * <p>SIMPLE</p>
         */
        @NameInMap("SelectType")
        public String selectType;

        /**
         * <p>A reserved field for the SQL Server engine.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("StmtId")
        public String stmtId;

        /**
         * <p>A reserved field for the SQL Server engine.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("StmtText")
        public String stmtText;

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Table")
        public String table;

        /**
         * <p>A reserved field for the PostgreSQL engine.</p>
         */
        @NameInMap("TableList")
        public java.util.List<String> tableList;

        /**
         * <p>A reserved field for the SQL Server engine.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("TotalSubtreeCost")
        public String totalSubtreeCost;

        /**
         * <p>The join type.</p>
         * 
         * <strong>example:</strong>
         * <p>eq_ref</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>A reserved field for the SQL Server engine.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
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
