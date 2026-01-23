// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetTableColumnLineagesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TableColumnLineageList")
    public java.util.List<GetTableColumnLineagesResponseBodyTableColumnLineageList> tableColumnLineageList;

    public static GetTableColumnLineagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTableColumnLineagesResponseBody self = new GetTableColumnLineagesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTableColumnLineagesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTableColumnLineagesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTableColumnLineagesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTableColumnLineagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTableColumnLineagesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetTableColumnLineagesResponseBody setTableColumnLineageList(java.util.List<GetTableColumnLineagesResponseBodyTableColumnLineageList> tableColumnLineageList) {
        this.tableColumnLineageList = tableColumnLineageList;
        return this;
    }
    public java.util.List<GetTableColumnLineagesResponseBodyTableColumnLineageList> getTableColumnLineageList() {
        return this.tableColumnLineageList;
    }

    public static class GetTableColumnLineagesResponseBodyTableColumnLineageList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InputBizUnitId")
        public Long inputBizUnitId;

        /**
         * <strong>example:</strong>
         * <p>1121.col1</p>
         */
        @NameInMap("InputColumnGuid")
        public String inputColumnGuid;

        /**
         * <strong>example:</strong>
         * <p>col1</p>
         */
        @NameInMap("InputColumnName")
        public String inputColumnName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>1233</p>
         */
        @NameInMap("InputProjectId")
        public Long inputProjectId;

        @NameInMap("InputTableDeleted")
        public Boolean inputTableDeleted;

        /**
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("InputTableEnv")
        public String inputTableEnv;

        /**
         * <strong>example:</strong>
         * <p>123211</p>
         */
        @NameInMap("InputTableGuid")
        public String inputTableGuid;

        /**
         * <strong>example:</strong>
         * <p>t_input</p>
         */
        @NameInMap("InputTableName")
        public String inputTableName;

        /**
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("NodeEnv")
        public String nodeEnv;

        /**
         * <strong>example:</strong>
         * <p>110021</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OutputBizUnitId")
        public Long outputBizUnitId;

        /**
         * <strong>example:</strong>
         * <p>2231.col2</p>
         */
        @NameInMap("OutputColumnGuid")
        public String outputColumnGuid;

        /**
         * <strong>example:</strong>
         * <p>col2</p>
         */
        @NameInMap("OutputColumnName")
        public String outputColumnName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>1233</p>
         */
        @NameInMap("OutputProjectId")
        public Long outputProjectId;

        @NameInMap("OutputTableDeleted")
        public Boolean outputTableDeleted;

        /**
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("OutputTableEnv")
        public String outputTableEnv;

        /**
         * <strong>example:</strong>
         * <p>2231</p>
         */
        @NameInMap("OutputTableGuid")
        public String outputTableGuid;

        /**
         * <strong>example:</strong>
         * <p>t_output</p>
         */
        @NameInMap("OutputTableName")
        public String outputTableName;

        public static GetTableColumnLineagesResponseBodyTableColumnLineageList build(java.util.Map<String, ?> map) throws Exception {
            GetTableColumnLineagesResponseBodyTableColumnLineageList self = new GetTableColumnLineagesResponseBodyTableColumnLineageList();
            return TeaModel.build(map, self);
        }

        public GetTableColumnLineagesResponseBodyTableColumnLineageList setInputBizUnitId(Long inputBizUnitId) {
            this.inputBizUnitId = inputBizUnitId;
            return this;
        }
        public Long getInputBizUnitId() {
            return this.inputBizUnitId;
        }

        public GetTableColumnLineagesResponseBodyTableColumnLineageList setInputColumnGuid(String inputColumnGuid) {
            this.inputColumnGuid = inputColumnGuid;
            return this;
        }
        public String getInputColumnGuid() {
            return this.inputColumnGuid;
        }

        public GetTableColumnLineagesResponseBodyTableColumnLineageList setInputColumnName(String inputColumnName) {
            this.inputColumnName = inputColumnName;
            return this;
        }
        public String getInputColumnName() {
            return this.inputColumnName;
        }

        public GetTableColumnLineagesResponseBodyTableColumnLineageList setInputDataSourceId(Long inputDataSourceId) {
            this.inputDataSourceId = inputDataSourceId;
            return this;
        }
        public Long getInputDataSourceId() {
            return this.inputDataSourceId;
        }

        public GetTableColumnLineagesResponseBodyTableColumnLineageList setInputDataSourceType(String inputDataSourceType) {
            this.inputDataSourceType = inputDataSourceType;
            return this;
        }
        public String getInputDataSourceType() {
            return this.inputDataSourceType;
        }

        public GetTableColumnLineagesResponseBodyTableColumnLineageList setInputProjectId(Long inputProjectId) {
            this.inputProjectId = inputProjectId;
            return this;
        }
        public Long getInputProjectId() {
            return this.inputProjectId;
        }

        public GetTableColumnLineagesResponseBodyTableColumnLineageList setInputTableDeleted(Boolean inputTableDeleted) {
            this.inputTableDeleted = inputTableDeleted;
            return this;
        }
        public Boolean getInputTableDeleted() {
            return this.inputTableDeleted;
        }

        public GetTableColumnLineagesResponseBodyTableColumnLineageList setInputTableEnv(String inputTableEnv) {
            this.inputTableEnv = inputTableEnv;
            return this;
        }
        public String getInputTableEnv() {
            return this.inputTableEnv;
        }

        public GetTableColumnLineagesResponseBodyTableColumnLineageList setInputTableGuid(String inputTableGuid) {
            this.inputTableGuid = inputTableGuid;
            return this;
        }
        public String getInputTableGuid() {
            return this.inputTableGuid;
        }

        public GetTableColumnLineagesResponseBodyTableColumnLineageList setInputTableName(String inputTableName) {
            this.inputTableName = inputTableName;
            return this;
        }
        public String getInputTableName() {
            return this.inputTableName;
        }

        public GetTableColumnLineagesResponseBodyTableColumnLineageList setNodeEnv(String nodeEnv) {
            this.nodeEnv = nodeEnv;
            return this;
        }
        public String getNodeEnv() {
            return this.nodeEnv;
        }

        public GetTableColumnLineagesResponseBodyTableColumnLineageList setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetTableColumnLineagesResponseBodyTableColumnLineageList setOutputBizUnitId(Long outputBizUnitId) {
            this.outputBizUnitId = outputBizUnitId;
            return this;
        }
        public Long getOutputBizUnitId() {
            return this.outputBizUnitId;
        }

        public GetTableColumnLineagesResponseBodyTableColumnLineageList setOutputColumnGuid(String outputColumnGuid) {
            this.outputColumnGuid = outputColumnGuid;
            return this;
        }
        public String getOutputColumnGuid() {
            return this.outputColumnGuid;
        }

        public GetTableColumnLineagesResponseBodyTableColumnLineageList setOutputColumnName(String outputColumnName) {
            this.outputColumnName = outputColumnName;
            return this;
        }
        public String getOutputColumnName() {
            return this.outputColumnName;
        }

        public GetTableColumnLineagesResponseBodyTableColumnLineageList setOutputDataSourceId(Long outputDataSourceId) {
            this.outputDataSourceId = outputDataSourceId;
            return this;
        }
        public Long getOutputDataSourceId() {
            return this.outputDataSourceId;
        }

        public GetTableColumnLineagesResponseBodyTableColumnLineageList setOutputDataSourceType(String outputDataSourceType) {
            this.outputDataSourceType = outputDataSourceType;
            return this;
        }
        public String getOutputDataSourceType() {
            return this.outputDataSourceType;
        }

        public GetTableColumnLineagesResponseBodyTableColumnLineageList setOutputProjectId(Long outputProjectId) {
            this.outputProjectId = outputProjectId;
            return this;
        }
        public Long getOutputProjectId() {
            return this.outputProjectId;
        }

        public GetTableColumnLineagesResponseBodyTableColumnLineageList setOutputTableDeleted(Boolean outputTableDeleted) {
            this.outputTableDeleted = outputTableDeleted;
            return this;
        }
        public Boolean getOutputTableDeleted() {
            return this.outputTableDeleted;
        }

        public GetTableColumnLineagesResponseBodyTableColumnLineageList setOutputTableEnv(String outputTableEnv) {
            this.outputTableEnv = outputTableEnv;
            return this;
        }
        public String getOutputTableEnv() {
            return this.outputTableEnv;
        }

        public GetTableColumnLineagesResponseBodyTableColumnLineageList setOutputTableGuid(String outputTableGuid) {
            this.outputTableGuid = outputTableGuid;
            return this;
        }
        public String getOutputTableGuid() {
            return this.outputTableGuid;
        }

        public GetTableColumnLineagesResponseBodyTableColumnLineageList setOutputTableName(String outputTableName) {
            this.outputTableName = outputTableName;
            return this;
        }
        public String getOutputTableName() {
            return this.outputTableName;
        }

    }

}
