// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteZnodeResponseBody extends TeaModel {
    @NameInMap("Data")
    public DeleteZnodeResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("HttpCode")
    public String httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Data")
        public String data;

        @NameInMap("Dir")
        public Boolean dir;

        @NameInMap("Name")
        public String name;

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
