// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class WorkspaceCodePublishResponseBody extends TeaModel {
    /**
     * <p>An object that contains the key for the asynchronous code deployment.</p>
     */
    @NameInMap("Data")
    public WorkspaceCodePublishResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message returned if the request fails. This parameter is empty on success.</p>
     * 
     * <strong>example:</strong>
     * <p>Failed to deploy，repo branch empty</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates if the request succeeded.</p>
     * 
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
         * <p>The key for the asynchronous code deployment. Use this key to query its status.</p>
         * 
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
