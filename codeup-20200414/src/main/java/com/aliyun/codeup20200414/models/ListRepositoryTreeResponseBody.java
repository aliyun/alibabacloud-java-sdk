// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListRepositoryTreeResponseBody extends TeaModel {
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<ListRepositoryTreeResponseBodyResult> result;

    public static ListRepositoryTreeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryTreeResponseBody self = new ListRepositoryTreeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRepositoryTreeResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListRepositoryTreeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRepositoryTreeResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListRepositoryTreeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListRepositoryTreeResponseBody setResult(java.util.List<ListRepositoryTreeResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListRepositoryTreeResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListRepositoryTreeResponseBodyResult extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Path")
        public String path;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static ListRepositoryTreeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryTreeResponseBodyResult self = new ListRepositoryTreeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListRepositoryTreeResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListRepositoryTreeResponseBodyResult setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListRepositoryTreeResponseBodyResult setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListRepositoryTreeResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRepositoryTreeResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
