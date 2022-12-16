// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteZnodeResponseBody extends TeaModel {
    // The details of the data.
    @NameInMap("Data")
    public DeleteZnodeResponseBodyData data;

    // The error code returned if the request fails.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The HTTP status code returned.
    @NameInMap("HttpCode")
    public String httpCode;

    // The message returned.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request is successful. Valid values:
    // - `true`: The request is successful. 
    // - `false`: The request fails.
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
        // The data of the node.
        @NameInMap("Data")
        public String data;

        // Indicates whether the node directory information is returned. Valid values:
        // - `true`: The information is returned. 
        // - `false`: The information fails to be returned.
        @NameInMap("Dir")
        public Boolean dir;

        // The name of the node.
        @NameInMap("Name")
        public String name;

        // The path of the node.
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
