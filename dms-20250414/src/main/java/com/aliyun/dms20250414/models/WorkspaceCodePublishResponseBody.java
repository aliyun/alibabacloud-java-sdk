// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class WorkspaceCodePublishResponseBody extends TeaModel {
    /**
     * <p>job</p>
     */
    @NameInMap("Data")
    public WorkspaceCodePublishResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Failed to deploy，repo branch empty</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static WorkspaceCodePublishResponseBody build(java.util.Map<String, ?> map) throws Exception {
        WorkspaceCodePublishResponseBody self = new WorkspaceCodePublishResponseBody();
        return TeaModel.build(map, self);
    }

    public WorkspaceCodePublishResponseBody setData(WorkspaceCodePublishResponseBodyData data) {
        this.data = data;
        return this;
    }
    public WorkspaceCodePublishResponseBodyData getData() {
        return this.data;
    }

    public WorkspaceCodePublishResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public WorkspaceCodePublishResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public WorkspaceCodePublishResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public WorkspaceCodePublishResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public WorkspaceCodePublishResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class WorkspaceCodePublishResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ws-xxxx-xxxxxx</p>
         */
        @NameInMap("Key")
        public String key;

        public static WorkspaceCodePublishResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            WorkspaceCodePublishResponseBodyData self = new WorkspaceCodePublishResponseBodyData();
            return TeaModel.build(map, self);
        }

        public WorkspaceCodePublishResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

}
