// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class AddStoryFilesResponseBody extends TeaModel {
    /**
     * <p>The objects that were added.</p>
     */
    @NameInMap("Files")
    public java.util.List<AddStoryFilesResponseBodyFiles> files;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6E93D6C9-5AC0-49F9-914D-E02678D3****</p>
     */
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
        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>ResourceNotFound</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified resource %s is not found.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The URI of the object.</p>
         * <p>The OSS URI follows the <code>oss://{bucketname}/{objectname}</code> format, where <code>bucketname</code> is the name of the bucket in the same region as the current project and <code>objectname</code> is the path of the object with the extension included.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/test-object</p>
         */
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
