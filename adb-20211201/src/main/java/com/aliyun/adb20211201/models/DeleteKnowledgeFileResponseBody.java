// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteKnowledgeFileResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DeleteKnowledgeFileResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteKnowledgeFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteKnowledgeFileResponseBody self = new DeleteKnowledgeFileResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteKnowledgeFileResponseBody setData(DeleteKnowledgeFileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteKnowledgeFileResponseBodyData getData() {
        return this.data;
    }

    public DeleteKnowledgeFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteKnowledgeFileResponseBodyData extends TeaModel {
        /**
         * <p>The file location. Currently, only OSS paths are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/doc.pdf</p>
         */
        @NameInMap("FileLocation")
        public String fileLocation;

        /**
         * <p>The prompt message.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Successful.</li>
         * <li><strong>false</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static DeleteKnowledgeFileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteKnowledgeFileResponseBodyData self = new DeleteKnowledgeFileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteKnowledgeFileResponseBodyData setFileLocation(String fileLocation) {
            this.fileLocation = fileLocation;
            return this;
        }
        public String getFileLocation() {
            return this.fileLocation;
        }

        public DeleteKnowledgeFileResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeleteKnowledgeFileResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
