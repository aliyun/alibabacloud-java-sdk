// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class PausePhysicalNodeResponseBody extends TeaModel {
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
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("NodeOperateResultList")
    public java.util.List<PausePhysicalNodeResponseBodyNodeOperateResultList> nodeOperateResultList;

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

    public static PausePhysicalNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PausePhysicalNodeResponseBody self = new PausePhysicalNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public PausePhysicalNodeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PausePhysicalNodeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public PausePhysicalNodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PausePhysicalNodeResponseBody setNodeOperateResultList(java.util.List<PausePhysicalNodeResponseBodyNodeOperateResultList> nodeOperateResultList) {
        this.nodeOperateResultList = nodeOperateResultList;
        return this;
    }
    public java.util.List<PausePhysicalNodeResponseBodyNodeOperateResultList> getNodeOperateResultList() {
        return this.nodeOperateResultList;
    }

    public PausePhysicalNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PausePhysicalNodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PausePhysicalNodeResponseBodyNodeOperateResultList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>n_123456</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        public static PausePhysicalNodeResponseBodyNodeOperateResultList build(java.util.Map<String, ?> map) throws Exception {
            PausePhysicalNodeResponseBodyNodeOperateResultList self = new PausePhysicalNodeResponseBodyNodeOperateResultList();
            return TeaModel.build(map, self);
        }

        public PausePhysicalNodeResponseBodyNodeOperateResultList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public PausePhysicalNodeResponseBodyNodeOperateResultList setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public PausePhysicalNodeResponseBodyNodeOperateResultList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
