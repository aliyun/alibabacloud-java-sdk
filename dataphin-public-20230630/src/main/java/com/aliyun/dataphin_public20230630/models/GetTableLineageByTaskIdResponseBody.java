// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetTableLineageByTaskIdResponseBody extends TeaModel {
    /**
     * <p>The error code. OK indicates a successful request.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The query results.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetTableLineageByTaskIdResponseBodyData> data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetTableLineageByTaskIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTableLineageByTaskIdResponseBody self = new GetTableLineageByTaskIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTableLineageByTaskIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTableLineageByTaskIdResponseBody setData(java.util.List<GetTableLineageByTaskIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetTableLineageByTaskIdResponseBodyData> getData() {
        return this.data;
    }

    public GetTableLineageByTaskIdResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTableLineageByTaskIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTableLineageByTaskIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTableLineageByTaskIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTableLineageByTaskIdResponseBodyData extends TeaModel {
        /**
         * <p>The business unit ID of the input table.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("InputBizUnitId")
        public Long inputBizUnitId;

        /**
         * <p>The data source ID of the input table.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("InputDataSourceId")
        public Long inputDataSourceId;

        /**
         * <p>The storage type of the input table.</p>
         * 
         * <strong>example:</strong>
         * <p>MAX_COMPUTE</p>
         */
        @NameInMap("InputDataSourceType")
        public String inputDataSourceType;

        /**
         * <p>The data source type of the input table.</p>
         * 
         * <strong>example:</strong>
         * <p>MAX_COMPUTE</p>
         */
        @NameInMap("InputDbType")
        public String inputDbType;

        /**
         * <p>The environment of the input table: DEV or PROD.</p>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("InputEnv")
        public String inputEnv;

        /**
         * <p>The project ID of the input table.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("InputProjectId")
        public Long inputProjectId;

        /**
         * <p>Indicates whether the input table is deleted.</p>
         */
        @NameInMap("InputTableDeleted")
        public Boolean inputTableDeleted;

        /**
         * <p>The GUID of the input table. Each asset has a unique GUID in the following format:</p>
         * <ul>
         * <li>Logical table: dp_table.[TenantId].[BusinessUnitName].[TableName]</li>
         * <li>Compute source physical table: [EngineType].[TenantId].[ProjectName].[TableName]</li>
         * <li>Data source table: dp_ds_table.[TenantId].[DataSourceId].[SchemaName].[TableName]</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>odps.123.test_project.order</p>
         */
        @NameInMap("InputTableId")
        public String inputTableId;

        /**
         * <p>The name of the input table.</p>
         * 
         * <strong>example:</strong>
         * <p>order</p>
         */
        @NameInMap("InputTableName")
        public String inputTableName;

        /**
         * <p>The type of the input table. </p>
         * <ul>
         * <li>PHYSICAL_TABLE Physical table (compute source)</li>
         * <li>DIM_LOGIC_TABLE Dimension logical table</li>
         * <li>FACT_LOGIC_TABLE Fact logical table</li>
         * <li>SUM_LOGIC_TABLE Aggregate logical table</li>
         * <li>REAL_TIME_LOGIC_TABLE Real-time meta table</li>
         * <li>REAL_TIME_MIRROR_TABLE Real-time mirror table</li>
         * <li>PHYSICAL_VIEW Physical view</li>
         * <li>LOGICAL_VIEW Logical view</li>
         * <li>DATA_SOURCE_PHYSICAL_TABLE Data source table</li>
         * <li>DATA_SOURCE_VIEW Data source view</li>
         * <li>DATA_SOURCE_MATERIALIZED_VIEW Data source materialized view</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PHYSICAL_TABLE</p>
         */
        @NameInMap("InputTableType")
        public String inputTableType;

        /**
         * <p>The business unit ID of the output table.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("OutputBizUnitId")
        public Long outputBizUnitId;

        /**
         * <p>The data source ID of the output table.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("OutputDataSourceId")
        public Long outputDataSourceId;

        /**
         * <p>The storage type of the output table.</p>
         * 
         * <strong>example:</strong>
         * <p>MAX_COMPUTE</p>
         */
        @NameInMap("OutputDataSourceType")
        public String outputDataSourceType;

        /**
         * <p>The data source type of the output table.</p>
         * 
         * <strong>example:</strong>
         * <p>MAX_COMPUTE</p>
         */
        @NameInMap("OutputDbType")
        public String outputDbType;

        /**
         * <p>The environment of the output table: DEV or PROD.</p>
         * 
         * <strong>example:</strong>
         * <p>DEV/PROD</p>
         */
        @NameInMap("OutputEnv")
        public String outputEnv;

        /**
         * <p>The project ID of the output table.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("OutputProjectId")
        public Long outputProjectId;

        /**
         * <p>Indicates whether the output table is deleted.</p>
         */
        @NameInMap("OutputTableDeleted")
        public Boolean outputTableDeleted;

        /**
         * <p>The GUID of the output table. Each asset has a unique GUID. For the format, see InputTableId.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.123.test_project.order</p>
         */
        @NameInMap("OutputTableId")
        public String outputTableId;

        /**
         * <p>The name of the output table.</p>
         * 
         * <strong>example:</strong>
         * <p>order</p>
         */
        @NameInMap("OutputTableName")
        public String outputTableName;

        /**
         * <p>The type of the output table. For valid values, see InputTableType.</p>
         * 
         * <strong>example:</strong>
         * <p>PHYSICAL_TABLE</p>
         */
        @NameInMap("OutputTableType")
        public String outputTableType;

        /**
         * <p>The environment of the task (node) associated with the lineage: DEV or PROD.</p>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("TaskEnv")
        public String taskEnv;

        /**
         * <p>The task (node) ID associated with the lineage.</p>
         * 
         * <strong>example:</strong>
         * <p>n_123</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        public static GetTableLineageByTaskIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTableLineageByTaskIdResponseBodyData self = new GetTableLineageByTaskIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTableLineageByTaskIdResponseBodyData setInputBizUnitId(Long inputBizUnitId) {
            this.inputBizUnitId = inputBizUnitId;
            return this;
        }
        public Long getInputBizUnitId() {
            return this.inputBizUnitId;
        }

        public GetTableLineageByTaskIdResponseBodyData setInputDataSourceId(Long inputDataSourceId) {
            this.inputDataSourceId = inputDataSourceId;
            return this;
        }
        public Long getInputDataSourceId() {
            return this.inputDataSourceId;
        }

        public GetTableLineageByTaskIdResponseBodyData setInputDataSourceType(String inputDataSourceType) {
            this.inputDataSourceType = inputDataSourceType;
            return this;
        }
        public String getInputDataSourceType() {
            return this.inputDataSourceType;
        }

        public GetTableLineageByTaskIdResponseBodyData setInputDbType(String inputDbType) {
            this.inputDbType = inputDbType;
            return this;
        }
        public String getInputDbType() {
            return this.inputDbType;
        }

        public GetTableLineageByTaskIdResponseBodyData setInputEnv(String inputEnv) {
            this.inputEnv = inputEnv;
            return this;
        }
        public String getInputEnv() {
            return this.inputEnv;
        }

        public GetTableLineageByTaskIdResponseBodyData setInputProjectId(Long inputProjectId) {
            this.inputProjectId = inputProjectId;
            return this;
        }
        public Long getInputProjectId() {
            return this.inputProjectId;
        }

        public GetTableLineageByTaskIdResponseBodyData setInputTableDeleted(Boolean inputTableDeleted) {
            this.inputTableDeleted = inputTableDeleted;
            return this;
        }
        public Boolean getInputTableDeleted() {
            return this.inputTableDeleted;
        }

        public GetTableLineageByTaskIdResponseBodyData setInputTableId(String inputTableId) {
            this.inputTableId = inputTableId;
            return this;
        }
        public String getInputTableId() {
            return this.inputTableId;
        }

        public GetTableLineageByTaskIdResponseBodyData setInputTableName(String inputTableName) {
            this.inputTableName = inputTableName;
            return this;
        }
        public String getInputTableName() {
            return this.inputTableName;
        }

        public GetTableLineageByTaskIdResponseBodyData setInputTableType(String inputTableType) {
            this.inputTableType = inputTableType;
            return this;
        }
        public String getInputTableType() {
            return this.inputTableType;
        }

        public GetTableLineageByTaskIdResponseBodyData setOutputBizUnitId(Long outputBizUnitId) {
            this.outputBizUnitId = outputBizUnitId;
            return this;
        }
        public Long getOutputBizUnitId() {
            return this.outputBizUnitId;
        }

        public GetTableLineageByTaskIdResponseBodyData setOutputDataSourceId(Long outputDataSourceId) {
            this.outputDataSourceId = outputDataSourceId;
            return this;
        }
        public Long getOutputDataSourceId() {
            return this.outputDataSourceId;
        }

        public GetTableLineageByTaskIdResponseBodyData setOutputDataSourceType(String outputDataSourceType) {
            this.outputDataSourceType = outputDataSourceType;
            return this;
        }
        public String getOutputDataSourceType() {
            return this.outputDataSourceType;
        }

        public GetTableLineageByTaskIdResponseBodyData setOutputDbType(String outputDbType) {
            this.outputDbType = outputDbType;
            return this;
        }
        public String getOutputDbType() {
            return this.outputDbType;
        }

        public GetTableLineageByTaskIdResponseBodyData setOutputEnv(String outputEnv) {
            this.outputEnv = outputEnv;
            return this;
        }
        public String getOutputEnv() {
            return this.outputEnv;
        }

        public GetTableLineageByTaskIdResponseBodyData setOutputProjectId(Long outputProjectId) {
            this.outputProjectId = outputProjectId;
            return this;
        }
        public Long getOutputProjectId() {
            return this.outputProjectId;
        }

        public GetTableLineageByTaskIdResponseBodyData setOutputTableDeleted(Boolean outputTableDeleted) {
            this.outputTableDeleted = outputTableDeleted;
            return this;
        }
        public Boolean getOutputTableDeleted() {
            return this.outputTableDeleted;
        }

        public GetTableLineageByTaskIdResponseBodyData setOutputTableId(String outputTableId) {
            this.outputTableId = outputTableId;
            return this;
        }
        public String getOutputTableId() {
            return this.outputTableId;
        }

        public GetTableLineageByTaskIdResponseBodyData setOutputTableName(String outputTableName) {
            this.outputTableName = outputTableName;
            return this;
        }
        public String getOutputTableName() {
            return this.outputTableName;
        }

        public GetTableLineageByTaskIdResponseBodyData setOutputTableType(String outputTableType) {
            this.outputTableType = outputTableType;
            return this;
        }
        public String getOutputTableType() {
            return this.outputTableType;
        }

        public GetTableLineageByTaskIdResponseBodyData setTaskEnv(String taskEnv) {
            this.taskEnv = taskEnv;
            return this;
        }
        public String getTaskEnv() {
            return this.taskEnv;
        }

        public GetTableLineageByTaskIdResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetTableLineageByTaskIdResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

}
