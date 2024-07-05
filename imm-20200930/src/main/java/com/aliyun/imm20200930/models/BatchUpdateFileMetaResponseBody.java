// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class BatchUpdateFileMetaResponseBody extends TeaModel {
    @NameInMap("Files")
    public java.util.List<BatchUpdateFileMetaResponseBodyFiles> files;

    /**
     * <strong>example:</strong>
     * <p>F5BF215E-3237-0852-B9C6-F233D44A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchUpdateFileMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateFileMetaResponseBody self = new BatchUpdateFileMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchUpdateFileMetaResponseBody setFiles(java.util.List<BatchUpdateFileMetaResponseBodyFiles> files) {
        this.files = files;
        return this;
    }
    public java.util.List<BatchUpdateFileMetaResponseBodyFiles> getFiles() {
        return this.files;
    }

    public BatchUpdateFileMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BatchUpdateFileMetaResponseBodyFiles extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>*error.OpError : InvalidArgument | Index KV count exceeded, should be no more than 100.</p>
         */
        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("URI")
        public String URI;

        public static BatchUpdateFileMetaResponseBodyFiles build(java.util.Map<String, ?> map) throws Exception {
            BatchUpdateFileMetaResponseBodyFiles self = new BatchUpdateFileMetaResponseBodyFiles();
            return TeaModel.build(map, self);
        }

        public BatchUpdateFileMetaResponseBodyFiles setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public BatchUpdateFileMetaResponseBodyFiles setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public BatchUpdateFileMetaResponseBodyFiles setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

}
