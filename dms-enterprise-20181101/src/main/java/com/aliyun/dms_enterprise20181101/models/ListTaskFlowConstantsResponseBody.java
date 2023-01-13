// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTaskFlowConstantsResponseBody extends TeaModel {
    /**
     * <p>A list of constant key-value pairs for the task flow.</p>
     */
    @NameInMap("DagConstants")
    public ListTaskFlowConstantsResponseBodyDagConstants dagConstants;

    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request. You can use the ID to locate logs and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListTaskFlowConstantsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTaskFlowConstantsResponseBody self = new ListTaskFlowConstantsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTaskFlowConstantsResponseBody setDagConstants(ListTaskFlowConstantsResponseBodyDagConstants dagConstants) {
        this.dagConstants = dagConstants;
        return this;
    }
    public ListTaskFlowConstantsResponseBodyDagConstants getDagConstants() {
        return this.dagConstants;
    }

    public ListTaskFlowConstantsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListTaskFlowConstantsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListTaskFlowConstantsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTaskFlowConstantsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTaskFlowConstantsResponseBodyDagConstantsDagConstant extends TeaModel {
        /**
         * <p>The constant key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The constant value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListTaskFlowConstantsResponseBodyDagConstantsDagConstant build(java.util.Map<String, ?> map) throws Exception {
            ListTaskFlowConstantsResponseBodyDagConstantsDagConstant self = new ListTaskFlowConstantsResponseBodyDagConstantsDagConstant();
            return TeaModel.build(map, self);
        }

        public ListTaskFlowConstantsResponseBodyDagConstantsDagConstant setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTaskFlowConstantsResponseBodyDagConstantsDagConstant setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListTaskFlowConstantsResponseBodyDagConstants extends TeaModel {
        @NameInMap("DagConstant")
        public java.util.List<ListTaskFlowConstantsResponseBodyDagConstantsDagConstant> dagConstant;

        public static ListTaskFlowConstantsResponseBodyDagConstants build(java.util.Map<String, ?> map) throws Exception {
            ListTaskFlowConstantsResponseBodyDagConstants self = new ListTaskFlowConstantsResponseBodyDagConstants();
            return TeaModel.build(map, self);
        }

        public ListTaskFlowConstantsResponseBodyDagConstants setDagConstant(java.util.List<ListTaskFlowConstantsResponseBodyDagConstantsDagConstant> dagConstant) {
            this.dagConstant = dagConstant;
            return this;
        }
        public java.util.List<ListTaskFlowConstantsResponseBodyDagConstantsDagConstant> getDagConstant() {
            return this.dagConstant;
        }

    }

}
