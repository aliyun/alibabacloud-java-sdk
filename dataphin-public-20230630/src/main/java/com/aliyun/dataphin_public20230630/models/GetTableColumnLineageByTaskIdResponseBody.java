// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetTableColumnLineageByTaskIdResponseBody extends TeaModel {
    /**
     * <p>The error code. A value of OK indicates that the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The query result.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetTableColumnLineageByTaskIdResponseBodyData> data;

    /**
     * <p>The HTTP status code returned by the backend.</p>
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
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetTableColumnLineageByTaskIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTableColumnLineageByTaskIdResponseBody self = new GetTableColumnLineageByTaskIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTableColumnLineageByTaskIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTableColumnLineageByTaskIdResponseBody setData(java.util.List<GetTableColumnLineageByTaskIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetTableColumnLineageByTaskIdResponseBodyData> getData() {
        return this.data;
    }

    public GetTableColumnLineageByTaskIdResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTableColumnLineageByTaskIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTableColumnLineageByTaskIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTableColumnLineageByTaskIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTableColumnLineageByTaskIdResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the business unit to which the input table belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("InputBizUnitId")
        public Long inputBizUnitId;

        /**
         * <p>The GUID of the input field.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.123.test_project.input_table.id</p>
         */
        @NameInMap("InputColumnId")
        public String inputColumnId;

        /**
         * <p>The name of the input field.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("InputColumnName")
        public String inputColumnName;

        /**
         * <p>The ID of the data source to which the input table belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("InputDataSourceId")
        public Long inputDataSourceId;

        /**
         * <p>The storage format of the input table.</p>
         * 
         * <strong>example:</strong>
         * <p>MAX_COMPUTE</p>
         */
        @NameInMap("InputDataSourceType")
        public String inputDataSourceType;

        /**
         * <p>The type of the input data source.</p>
         * 
         * <strong>example:</strong>
         * <p>MAX_COMPUTE</p>
         */
        @NameInMap("InputDbType")
        public String inputDbType;

        /**
         * <p>The environment of the input table. Valid values: DEV and PROD.</p>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("InputEnv")
        public String inputEnv;

        /**
         * <p>The ID of the project to which the input table belongs.</p>
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
         * <p>The GUID of the input table. Each asset has a unique GUID in one of the following formats:</p>
         * <ul>
         * <li>Logical table: dp_table.[Tenant ID].[Business unit name].[Table name]</li>
         * <li>Physical table of a compute source: [Engine type].[Tenant ID].[Project name].[Table name]</li>
         * <li>Data source table: dp_ds_table.[Tenant ID].[Data source ID].[Schema name].[Table name]</li>
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
         * <p>The type of the input table. Valid values:</p>
         * <ul>
         * <li>PHYSICAL_TABLE: physical table (compute source)</li>
         * <li>DIM_LOGIC_TABLE: logical dimension table</li>
         * <li>FACT_LOGIC_TABLE: logical fact table</li>
         * <li>SUM_LOGIC_TABLE: logical aggregate table</li>
         * <li>REAL_TIME_LOGIC_TABLE: real-time metadata table</li>
         * <li>REAL_TIME_MIRROR_TABLE: real-time mirror table</li>
         * <li>PHYSICAL_VIEW: physical view</li>
         * <li>LOGICAL_VIEW: logical view</li>
         * <li>DATA_SOURCE_PHYSICAL_TABLE: data source table</li>
         * <li>DATA_SOURCE_VIEW: data source view</li>
         * <li>DATA_SOURCE_MATERIALIZED_VIEW: data source materialized view</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PHYSICAL_TABLE</p>
         */
        @NameInMap("InputTableType")
        public String inputTableType;

        /**
         * <p>The ID of the business unit to which the output table belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("OutputBizUnitId")
        public Long outputBizUnitId;

        /**
         * <p>The GUID of the output field.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.123.test_project.input_table.id</p>
         */
        @NameInMap("OutputColumnId")
        public String outputColumnId;

        /**
         * <p>The name of the output field.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("OutputColumnName")
        public String outputColumnName;

        /**
         * <p>The ID of the data source to which the output table belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("OutputDataSourceId")
        public Long outputDataSourceId;

        /**
         * <p>The storage format of the output table.</p>
         * 
         * <strong>example:</strong>
         * <p>MAX_COMPUTE</p>
         */
        @NameInMap("OutputDataSourceType")
        public String outputDataSourceType;

        /**
         * <p>The type of the output data source.</p>
         * 
         * <strong>example:</strong>
         * <p>MAX_COMPUTE</p>
         */
        @NameInMap("OutputDbType")
        public String outputDbType;

        /**
         * <p>The environment of the output table. Valid values: DEV and PROD.</p>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("OutputEnv")
        public String outputEnv;

        /**
         * <p>The ID of the project to which the output table belongs.</p>
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
         * <p>The environment of the task (node) associated with the lineage. Valid values: DEV and PROD.</p>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("TaskEnv")
        public String taskEnv;

        /**
         * <p>The ID of the task (node) associated with the lineage.</p>
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

        public static GetTableColumnLineageByTaskIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTableColumnLineageByTaskIdResponseBodyData self = new GetTableColumnLineageByTaskIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTableColumnLineageByTaskIdResponseBodyData setInputBizUnitId(Long inputBizUnitId) {
            this.inputBizUnitId = inputBizUnitId;
            return this;
        }
        public Long getInputBizUnitId() {
            return this.inputBizUnitId;
        }

        public GetTableColumnLineageByTaskIdResponseBodyData setInputColumnId(String inputColumnId) {
            this.inputColumnId = inputColumnId;
            return this;
        }
        public String getInputColumnId() {
            return this.inputColumnId;
        }

        public GetTableColumnLineageByTaskIdResponseBodyData setInputColumnName(String inputColumnName) {
            this.inputColumnName = inputColumnName;
            return this;
        }
        public String getInputColumnName() {
            return this.inputColumnName;
        }

        public GetTableColumnLineageByTaskIdResponseBodyData setInputDataSourceId(Long inputDataSourceId) {
            this.inputDataSourceId = inputDataSourceId;
            return this;
        }
        public Long getInputDataSourceId() {
            return this.inputDataSourceId;
        }

        public GetTableColumnLineageByTaskIdResponseBodyData setInputDataSourceType(String inputDataSourceType) {
            this.inputDataSourceType = inputDataSourceType;
            return this;
        }
        public String getInputDataSourceType() {
            return this.inputDataSourceType;
        }

        public GetTableColumnLineageByTaskIdResponseBodyData setInputDbType(String inputDbType) {
            this.inputDbType = inputDbType;
            return this;
        }
        public String getInputDbType() {
            return this.inputDbType;
        }

        public GetTableColumnLineageByTaskIdResponseBodyData setInputEnv(String inputEnv) {
            this.inputEnv = inputEnv;
            return this;
        }
        public String getInputEnv() {
            return this.inputEnv;
        }

        public GetTableColumnLineageByTaskIdResponseBodyData setInputProjectId(Long inputProjectId) {
            this.inputProjectId = inputProjectId;
            return this;
        }
        public Long getInputProjectId() {
            return this.inputProjectId;
        }

        public GetTableColumnLineageByTaskIdResponseBodyData setInputTableDeleted(Boolean inputTableDeleted) {
            this.inputTableDeleted = inputTableDeleted;
            return this;
        }
        public Boolean getInputTableDeleted() {
            return this.inputTableDeleted;
        }

        public GetTableColumnLineageByTaskIdResponseBodyData setInputTableId(String inputTableId) {
            this.inputTableId = inputTableId;
            return this;
        }
        public String getInputTableId() {
            return this.inputTableId;
        }

        public GetTableColumnLineageByTaskIdResponseBodyData setInputTableName(String inputTableName) {
            this.inputTableName = inputTableName;
            return this;
        }
        public String getInputTableName() {
            return this.inputTableName;
        }

        public GetTableColumnLineageByTaskIdResponseBodyData setInputTableType(String inputTableType) {
            this.inputTableType = inputTableType;
            return this;
        }
        public String getInputTableType() {
            return this.inputTableType;
        }

        public GetTableColumnLineageByTaskIdResponseBodyData setOutputBizUnitId(Long outputBizUnitId) {
            this.outputBizUnitId = outputBizUnitId;
            return this;
        }
        public Long getOutputBizUnitId() {
            return this.outputBizUnitId;
        }

        public GetTableColumnLineageByTaskIdResponseBodyData setOutputColumnId(String outputColumnId) {
            this.outputColumnId = outputColumnId;
            return this;
        }
        public String getOutputColumnId() {
            return this.outputColumnId;
        }

        public GetTableColumnLineageByTaskIdResponseBodyData setOutputColumnName(String outputColumnName) {
            this.outputColumnName = outputColumnName;
            return this;
        }
        public String getOutputColumnName() {
            return this.outputColumnName;
        }

        public GetTableColumnLineageByTaskIdResponseBodyData setOutputDataSourceId(Long outputDataSourceId) {
            this.outputDataSourceId = outputDataSourceId;
            return this;
        }
        public Long getOutputDataSourceId() {
            return this.outputDataSourceId;
        }

        public GetTableColumnLineageByTaskIdResponseBodyData setOutputDataSourceType(String outputDataSourceType) {
            this.outputDataSourceType = outputDataSourceType;
            return this;
        }
        public String getOutputDataSourceType() {
            return this.outputDataSourceType;
        }

        public GetTableColumnLineageByTaskIdResponseBodyData setOutputDbType(String outputDbType) {
            this.outputDbType = outputDbType;
            return this;
        }
        public String getOutputDbType() {
            return this.outputDbType;
        }

        public GetTableColumnLineageByTaskIdResponseBodyData setOutputEnv(String outputEnv) {
            this.outputEnv = outputEnv;
            return this;
        }
        public String getOutputEnv() {
            return this.outputEnv;
        }

        public GetTableColumnLineageByTaskIdResponseBodyData setOutputProjectId(Long outputProjectId) {
            this.outputProjectId = outputProjectId;
            return this;
        }
        public Long getOutputProjectId() {
            return this.outputProjectId;
        }

        public GetTableColumnLineageByTaskIdResponseBodyData setOutputTableDeleted(Boolean outputTableDeleted) {
            this.outputTableDeleted = outputTableDeleted;
            return this;
        }
        public Boolean getOutputTableDeleted() {
            return this.outputTableDeleted;
        }

        public GetTableColumnLineageByTaskIdResponseBodyData setOutputTableId(String outputTableId) {
            this.outputTableId = outputTableId;
            return this;
        }
        public String getOutputTableId() {
            return this.outputTableId;
        }

        public GetTableColumnLineageByTaskIdResponseBodyData setOutputTableName(String outputTableName) {
            this.outputTableName = outputTableName;
            return this;
        }
        public String getOutputTableName() {
            return this.outputTableName;
        }

        public GetTableColumnLineageByTaskIdResponseBodyData setOutputTableType(String outputTableType) {
            this.outputTableType = outputTableType;
            return this;
        }
        public String getOutputTableType() {
            return this.outputTableType;
        }

        public GetTableColumnLineageByTaskIdResponseBodyData setTaskEnv(String taskEnv) {
            this.taskEnv = taskEnv;
            return this;
        }
        public String getTaskEnv() {
            return this.taskEnv;
        }

        public GetTableColumnLineageByTaskIdResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetTableColumnLineageByTaskIdResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

}
