// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class RemoveKnowledgeUploadUserResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public RemoveKnowledgeUploadUserResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveKnowledgeUploadUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveKnowledgeUploadUserResponseBody self = new RemoveKnowledgeUploadUserResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveKnowledgeUploadUserResponseBody setData(RemoveKnowledgeUploadUserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RemoveKnowledgeUploadUserResponseBodyData getData() {
        return this.data;
    }

    public RemoveKnowledgeUploadUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RemoveKnowledgeUploadUserResponseBodyData extends TeaModel {
        /**
         * <p>The location of the knowledge base file.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucketName/path/to/file.pdf</p>
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
         * <p>The number of users that were successfully deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Removed")
        public Integer removed;

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static RemoveKnowledgeUploadUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RemoveKnowledgeUploadUserResponseBodyData self = new RemoveKnowledgeUploadUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RemoveKnowledgeUploadUserResponseBodyData setFileLocation(String fileLocation) {
            this.fileLocation = fileLocation;
            return this;
        }
        public String getFileLocation() {
            return this.fileLocation;
        }

        public RemoveKnowledgeUploadUserResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RemoveKnowledgeUploadUserResponseBodyData setRemoved(Integer removed) {
            this.removed = removed;
            return this;
        }
        public Integer getRemoved() {
            return this.removed;
        }

        public RemoveKnowledgeUploadUserResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
