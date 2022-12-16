// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateZnodeResponseBody extends TeaModel {
    // The details of the data.
    @NameInMap("Data")
    public CreateZnodeResponseBodyData data;

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

    public static CreateZnodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateZnodeResponseBody self = new CreateZnodeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateZnodeResponseBody setData(CreateZnodeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateZnodeResponseBodyData getData() {
        return this.data;
    }

    public CreateZnodeResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateZnodeResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public CreateZnodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateZnodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateZnodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateZnodeResponseBodyData extends TeaModel {
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

        public static CreateZnodeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateZnodeResponseBodyData self = new CreateZnodeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateZnodeResponseBodyData setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public CreateZnodeResponseBodyData setDir(Boolean dir) {
            this.dir = dir;
            return this;
        }
        public Boolean getDir() {
            return this.dir;
        }

        public CreateZnodeResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateZnodeResponseBodyData setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

}
