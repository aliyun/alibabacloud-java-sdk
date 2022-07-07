// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class AddStoryFilesResponseBody extends TeaModel {
    @NameInMap("Files")
    public java.util.List<AddStoryFilesResponseBodyFiles> files;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static AddStoryFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddStoryFilesResponseBody self = new AddStoryFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public AddStoryFilesResponseBody setFiles(java.util.List<AddStoryFilesResponseBodyFiles> files) {
        this.files = files;
        return this;
    }
    public java.util.List<AddStoryFilesResponseBodyFiles> getFiles() {
        return this.files;
    }

    public AddStoryFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddStoryFilesResponseBodyFiles extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("URI")
        public String URI;

        public static AddStoryFilesResponseBodyFiles build(java.util.Map<String, ?> map) throws Exception {
            AddStoryFilesResponseBodyFiles self = new AddStoryFilesResponseBodyFiles();
            return TeaModel.build(map, self);
        }

        public AddStoryFilesResponseBodyFiles setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public AddStoryFilesResponseBodyFiles setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public AddStoryFilesResponseBodyFiles setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

}
