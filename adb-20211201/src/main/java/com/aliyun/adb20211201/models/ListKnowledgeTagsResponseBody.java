// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListKnowledgeTagsResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListKnowledgeTagsResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListKnowledgeTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgeTagsResponseBody self = new ListKnowledgeTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListKnowledgeTagsResponseBody setData(ListKnowledgeTagsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListKnowledgeTagsResponseBodyData getData() {
        return this.data;
    }

    public ListKnowledgeTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListKnowledgeTagsResponseBodyDataTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key_name</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>test_value</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static ListKnowledgeTagsResponseBodyDataTags build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeTagsResponseBodyDataTags self = new ListKnowledgeTagsResponseBodyDataTags();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeTagsResponseBodyDataTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListKnowledgeTagsResponseBodyDataTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListKnowledgeTagsResponseBodyData extends TeaModel {
        /**
         * <p>The location of the knowledge base file.</p>
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
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        /**
         * <p>The list details.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListKnowledgeTagsResponseBodyDataTags> tags;

        public static ListKnowledgeTagsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeTagsResponseBodyData self = new ListKnowledgeTagsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeTagsResponseBodyData setFileLocation(String fileLocation) {
            this.fileLocation = fileLocation;
            return this;
        }
        public String getFileLocation() {
            return this.fileLocation;
        }

        public ListKnowledgeTagsResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListKnowledgeTagsResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ListKnowledgeTagsResponseBodyData setTags(java.util.List<ListKnowledgeTagsResponseBodyDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListKnowledgeTagsResponseBodyDataTags> getTags() {
            return this.tags;
        }

    }

}
