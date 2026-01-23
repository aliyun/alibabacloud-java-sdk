// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetTableLineagesResponseBody extends TeaModel {
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

    @NameInMap("TableLineageList")
    public java.util.List<GetTableLineagesResponseBodyTableLineageList> tableLineageList;

    public static GetTableLineagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTableLineagesResponseBody self = new GetTableLineagesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTableLineagesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTableLineagesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTableLineagesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTableLineagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTableLineagesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetTableLineagesResponseBody setTableLineageList(java.util.List<GetTableLineagesResponseBodyTableLineageList> tableLineageList) {
        this.tableLineageList = tableLineageList;
        return this;
    }
    public java.util.List<GetTableLineagesResponseBodyTableLineageList> getTableLineageList() {
        return this.tableLineageList;
    }

    public static class GetTableLineagesResponseBodyTableLineageList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InputBizUnitId")
        public Long inputBizUnitId;

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

        public static GetTableLineagesResponseBodyTableLineageList build(java.util.Map<String, ?> map) throws Exception {
            GetTableLineagesResponseBodyTableLineageList self = new GetTableLineagesResponseBodyTableLineageList();
            return TeaModel.build(map, self);
        }

        public GetTableLineagesResponseBodyTableLineageList setInputBizUnitId(Long inputBizUnitId) {
            this.inputBizUnitId = inputBizUnitId;
            return this;
        }
        public Long getInputBizUnitId() {
            return this.inputBizUnitId;
        }

        public GetTableLineagesResponseBodyTableLineageList setInputDataSourceId(Long inputDataSourceId) {
            this.inputDataSourceId = inputDataSourceId;
            return this;
        }
        public Long getInputDataSourceId() {
            return this.inputDataSourceId;
        }

        public GetTableLineagesResponseBodyTableLineageList setInputDataSourceType(String inputDataSourceType) {
            this.inputDataSourceType = inputDataSourceType;
            return this;
        }
        public String getInputDataSourceType() {
            return this.inputDataSourceType;
        }

        public GetTableLineagesResponseBodyTableLineageList setInputProjectId(Long inputProjectId) {
            this.inputProjectId = inputProjectId;
            return this;
        }
        public Long getInputProjectId() {
            return this.inputProjectId;
        }

        public GetTableLineagesResponseBodyTableLineageList setInputTableDeleted(Boolean inputTableDeleted) {
            this.inputTableDeleted = inputTableDeleted;
            return this;
        }
        public Boolean getInputTableDeleted() {
            return this.inputTableDeleted;
        }

        public GetTableLineagesResponseBodyTableLineageList setInputTableEnv(String inputTableEnv) {
            this.inputTableEnv = inputTableEnv;
            return this;
        }
        public String getInputTableEnv() {
            return this.inputTableEnv;
        }

        public GetTableLineagesResponseBodyTableLineageList setInputTableGuid(String inputTableGuid) {
            this.inputTableGuid = inputTableGuid;
            return this;
        }
        public String getInputTableGuid() {
            return this.inputTableGuid;
        }

        public GetTableLineagesResponseBodyTableLineageList setInputTableName(String inputTableName) {
            this.inputTableName = inputTableName;
            return this;
        }
        public String getInputTableName() {
            return this.inputTableName;
        }

        public GetTableLineagesResponseBodyTableLineageList setNodeEnv(String nodeEnv) {
            this.nodeEnv = nodeEnv;
            return this;
        }
        public String getNodeEnv() {
            return this.nodeEnv;
        }

        public GetTableLineagesResponseBodyTableLineageList setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetTableLineagesResponseBodyTableLineageList setOutputBizUnitId(Long outputBizUnitId) {
            this.outputBizUnitId = outputBizUnitId;
            return this;
        }
        public Long getOutputBizUnitId() {
            return this.outputBizUnitId;
        }

        public GetTableLineagesResponseBodyTableLineageList setOutputDataSourceId(Long outputDataSourceId) {
            this.outputDataSourceId = outputDataSourceId;
            return this;
        }
        public Long getOutputDataSourceId() {
            return this.outputDataSourceId;
        }

        public GetTableLineagesResponseBodyTableLineageList setOutputDataSourceType(String outputDataSourceType) {
            this.outputDataSourceType = outputDataSourceType;
            return this;
        }
        public String getOutputDataSourceType() {
            return this.outputDataSourceType;
        }

        public GetTableLineagesResponseBodyTableLineageList setOutputProjectId(Long outputProjectId) {
            this.outputProjectId = outputProjectId;
            return this;
        }
        public Long getOutputProjectId() {
            return this.outputProjectId;
        }

        public GetTableLineagesResponseBodyTableLineageList setOutputTableDeleted(Boolean outputTableDeleted) {
            this.outputTableDeleted = outputTableDeleted;
            return this;
        }
        public Boolean getOutputTableDeleted() {
            return this.outputTableDeleted;
        }

        public GetTableLineagesResponseBodyTableLineageList setOutputTableEnv(String outputTableEnv) {
            this.outputTableEnv = outputTableEnv;
            return this;
        }
        public String getOutputTableEnv() {
            return this.outputTableEnv;
        }

        public GetTableLineagesResponseBodyTableLineageList setOutputTableGuid(String outputTableGuid) {
            this.outputTableGuid = outputTableGuid;
            return this;
        }
        public String getOutputTableGuid() {
            return this.outputTableGuid;
        }

        public GetTableLineagesResponseBodyTableLineageList setOutputTableName(String outputTableName) {
            this.outputTableName = outputTableName;
            return this;
        }
        public String getOutputTableName() {
            return this.outputTableName;
        }

    }

}
