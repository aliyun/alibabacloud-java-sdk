// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class RemoveKnowledgeTagsResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public RemoveKnowledgeTagsResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveKnowledgeTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveKnowledgeTagsResponseBody self = new RemoveKnowledgeTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveKnowledgeTagsResponseBody setData(RemoveKnowledgeTagsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RemoveKnowledgeTagsResponseBodyData getData() {
        return this.data;
    }

    public RemoveKnowledgeTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RemoveKnowledgeTagsResponseBodyData extends TeaModel {
        /**
         * <p>The location of the knowledge base file.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/doc.pdf</p>
         */
        @NameInMap("FileLocation")
        public String fileLocation;

        /**
         * <p>The message returned by the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The number of tags that were successfully deleted.</p>
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

        public static RemoveKnowledgeTagsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RemoveKnowledgeTagsResponseBodyData self = new RemoveKnowledgeTagsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RemoveKnowledgeTagsResponseBodyData setFileLocation(String fileLocation) {
            this.fileLocation = fileLocation;
            return this;
        }
        public String getFileLocation() {
            return this.fileLocation;
        }

        public RemoveKnowledgeTagsResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RemoveKnowledgeTagsResponseBodyData setRemoved(Integer removed) {
            this.removed = removed;
            return this;
        }
        public Integer getRemoved() {
            return this.removed;
        }

        public RemoveKnowledgeTagsResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
