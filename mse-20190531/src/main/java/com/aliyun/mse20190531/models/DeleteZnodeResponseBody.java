// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteZnodeResponseBody extends TeaModel {
    /**
     * <p>The data overview.</p>
     */
    @NameInMap("Data")
    public DeleteZnodeResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-100-000</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpCode")
    public String httpCode;

    /**
     * <p>The message.</p>
     * 
     * <strong>example:</strong>
     * <p>The request is processed successfully.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DC34E4A3-5F1C-4E40-86EA-02EDF967****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The request result. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request succeeded.</li>
     * <li><code>false</code>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteZnodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteZnodeResponseBody self = new DeleteZnodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteZnodeResponseBody setData(DeleteZnodeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteZnodeResponseBodyData getData() {
        return this.data;
    }

    public DeleteZnodeResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteZnodeResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public DeleteZnodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteZnodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteZnodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteZnodeResponseBodyData extends TeaModel {
        /**
         * <p>The list of node data.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster</p>
         */
        @NameInMap("Data")
        public String data;

        /**
         * <p>The node list information. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The information is returned successfully.</li>
         * <li><code>false</code>: The information fails to be returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Dir")
        public Boolean dir;

        /**
         * <p>The node name.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-bc1a29b0-160230875****-reg-center-0-1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The node path.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("Path")
        public String path;

        public static DeleteZnodeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteZnodeResponseBodyData self = new DeleteZnodeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteZnodeResponseBodyData setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public DeleteZnodeResponseBodyData setDir(Boolean dir) {
            this.dir = dir;
            return this;
        }
        public Boolean getDir() {
            return this.dir;
        }

        public DeleteZnodeResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeleteZnodeResponseBodyData setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

}
