// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetTableColumnLineageByTaskIdResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetTableColumnLineageByTaskIdResponseBodyData> data;

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

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("InputBizUnitId")
        public Long inputBizUnitId;

        /**
         * <strong>example:</strong>
         * <p>odps.123.test_project.input_table.id</p>
         */
        @NameInMap("InputColumnId")
        public String inputColumnId;

        /**
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("InputColumnName")
        public String inputColumnName;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("InputDataSourceId")
        public Long inputDataSourceId;

        /**
         * <strong>example:</strong>
         * <p>MAX_COMPUTE</p>
         */
        @NameInMap("InputDataSourceType")
        public String inputDataSourceType;

        /**
         * <strong>example:</strong>
         * <p>MAX_COMPUTE</p>
         */
        @NameInMap("InputDbType")
        public String inputDbType;

        /**
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("InputEnv")
        public String inputEnv;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("InputProjectId")
        public Long inputProjectId;

        @NameInMap("InputTableDeleted")
        public Boolean inputTableDeleted;

        /**
         * <strong>example:</strong>
         * <p>odps.123.test_project.order</p>
         */
        @NameInMap("InputTableId")
        public String inputTableId;

        /**
         * <strong>example:</strong>
         * <p>order</p>
         */
        @NameInMap("InputTableName")
        public String inputTableName;

        /**
         * <strong>example:</strong>
         * <p>PHYSICAL_TABLE</p>
         */
        @NameInMap("InputTableType")
        public String inputTableType;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("OutputBizUnitId")
        public Long outputBizUnitId;

        /**
         * <strong>example:</strong>
         * <p>odps.123.test_project.input_table.id</p>
         */
        @NameInMap("OutputColumnId")
        public String outputColumnId;

        /**
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("OutputColumnName")
        public String outputColumnName;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("OutputDataSourceId")
        public Long outputDataSourceId;

        /**
         * <strong>example:</strong>
         * <p>MAX_COMPUTE</p>
         */
        @NameInMap("OutputDataSourceType")
        public String outputDataSourceType;

        /**
         * <strong>example:</strong>
         * <p>MAX_COMPUTE</p>
         */
        @NameInMap("OutputDbType")
        public String outputDbType;

        /**
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("OutputEnv")
        public String outputEnv;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("OutputProjectId")
        public Long outputProjectId;

        @NameInMap("OutputTableDeleted")
        public Boolean outputTableDeleted;

        /**
         * <strong>example:</strong>
         * <p>odps.123.test_project.order</p>
         */
        @NameInMap("OutputTableId")
        public String outputTableId;

        /**
         * <strong>example:</strong>
         * <p>order</p>
         */
        @NameInMap("OutputTableName")
        public String outputTableName;

        /**
         * <strong>example:</strong>
         * <p>PHYSICAL_TABLE</p>
         */
        @NameInMap("OutputTableType")
        public String outputTableType;

        /**
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("TaskEnv")
        public String taskEnv;

        /**
         * <strong>example:</strong>
         * <p>n_123</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
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
