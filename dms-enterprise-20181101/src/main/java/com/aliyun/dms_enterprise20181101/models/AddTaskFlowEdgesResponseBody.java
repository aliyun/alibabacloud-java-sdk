// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class AddTaskFlowEdgesResponseBody extends TeaModel {
    /**
     * <p>The list of task flow edge IDs.</p>
     */
    @NameInMap("EdgeIds")
    public AddTaskFlowEdgesResponseBodyEdgeIds edgeIds;

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
     * <p>The ID of the request. You can use the ID to query logs and troubleshoot issues.</p>
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

    public static AddTaskFlowEdgesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddTaskFlowEdgesResponseBody self = new AddTaskFlowEdgesResponseBody();
        return TeaModel.build(map, self);
    }

    public AddTaskFlowEdgesResponseBody setEdgeIds(AddTaskFlowEdgesResponseBodyEdgeIds edgeIds) {
        this.edgeIds = edgeIds;
        return this;
    }
    public AddTaskFlowEdgesResponseBodyEdgeIds getEdgeIds() {
        return this.edgeIds;
    }

    public AddTaskFlowEdgesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AddTaskFlowEdgesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddTaskFlowEdgesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddTaskFlowEdgesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddTaskFlowEdgesResponseBodyEdgeIds extends TeaModel {
        @NameInMap("EdgeId")
        public java.util.List<Long> edgeId;

        public static AddTaskFlowEdgesResponseBodyEdgeIds build(java.util.Map<String, ?> map) throws Exception {
            AddTaskFlowEdgesResponseBodyEdgeIds self = new AddTaskFlowEdgesResponseBodyEdgeIds();
            return TeaModel.build(map, self);
        }

        public AddTaskFlowEdgesResponseBodyEdgeIds setEdgeId(java.util.List<Long> edgeId) {
            this.edgeId = edgeId;
            return this;
        }
        public java.util.List<Long> getEdgeId() {
            return this.edgeId;
        }

    }

}
