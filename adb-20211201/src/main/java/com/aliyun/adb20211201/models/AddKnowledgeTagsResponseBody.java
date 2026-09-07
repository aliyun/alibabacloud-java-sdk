// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class AddKnowledgeTagsResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public AddKnowledgeTagsResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddKnowledgeTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddKnowledgeTagsResponseBody self = new AddKnowledgeTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddKnowledgeTagsResponseBody setData(AddKnowledgeTagsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddKnowledgeTagsResponseBodyData getData() {
        return this.data;
    }

    public AddKnowledgeTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddKnowledgeTagsResponseBodyDataSkipped extends TeaModel {
        /**
         * <p>The reason why the tag was skipped.</p>
         * 
         * <strong>example:</strong>
         * <p>conflict</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>skipKey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>skipValue</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static AddKnowledgeTagsResponseBodyDataSkipped build(java.util.Map<String, ?> map) throws Exception {
            AddKnowledgeTagsResponseBodyDataSkipped self = new AddKnowledgeTagsResponseBodyDataSkipped();
            return TeaModel.build(map, self);
        }

        public AddKnowledgeTagsResponseBodyDataSkipped setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public AddKnowledgeTagsResponseBodyDataSkipped setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public AddKnowledgeTagsResponseBodyDataSkipped setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class AddKnowledgeTagsResponseBodyData extends TeaModel {
        /**
         * <p>The location of the knowledge base file.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucketName/path/to/file.pdf</p>
         */
        @NameInMap("FileLocation")
        public String fileLocation;

        /**
         * <p>The message.</p>
         * 
         * <strong>example:</strong>
         * <p>1 tag skipped</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The number of tags that were successfully updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Replaced")
        public Integer replaced;

        /**
         * <p>The list of skipped tags.</p>
         */
        @NameInMap("Skipped")
        public java.util.List<AddKnowledgeTagsResponseBodyDataSkipped> skipped;

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
         * <p>The number of tags that were successfully added.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Written")
        public Integer written;

        public static AddKnowledgeTagsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddKnowledgeTagsResponseBodyData self = new AddKnowledgeTagsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddKnowledgeTagsResponseBodyData setFileLocation(String fileLocation) {
            this.fileLocation = fileLocation;
            return this;
        }
        public String getFileLocation() {
            return this.fileLocation;
        }

        public AddKnowledgeTagsResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AddKnowledgeTagsResponseBodyData setReplaced(Integer replaced) {
            this.replaced = replaced;
            return this;
        }
        public Integer getReplaced() {
            return this.replaced;
        }

        public AddKnowledgeTagsResponseBodyData setSkipped(java.util.List<AddKnowledgeTagsResponseBodyDataSkipped> skipped) {
            this.skipped = skipped;
            return this;
        }
        public java.util.List<AddKnowledgeTagsResponseBodyDataSkipped> getSkipped() {
            return this.skipped;
        }

        public AddKnowledgeTagsResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public AddKnowledgeTagsResponseBodyData setWritten(Integer written) {
            this.written = written;
            return this;
        }
        public Integer getWritten() {
            return this.written;
        }

    }

}
