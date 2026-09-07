// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class AddKnowledgeUploadUserResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public AddKnowledgeUploadUserResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddKnowledgeUploadUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddKnowledgeUploadUserResponseBody self = new AddKnowledgeUploadUserResponseBody();
        return TeaModel.build(map, self);
    }

    public AddKnowledgeUploadUserResponseBody setData(AddKnowledgeUploadUserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddKnowledgeUploadUserResponseBodyData getData() {
        return this.data;
    }

    public AddKnowledgeUploadUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddKnowledgeUploadUserResponseBodyDataSkipped extends TeaModel {
        /**
         * <p>The reason why the user was skipped.</p>
         * 
         * <strong>example:</strong>
         * <p>conflicts error</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The username of the authorized user.</p>
         * 
         * <strong>example:</strong>
         * <p>test_user</p>
         */
        @NameInMap("User")
        public String user;

        public static AddKnowledgeUploadUserResponseBodyDataSkipped build(java.util.Map<String, ?> map) throws Exception {
            AddKnowledgeUploadUserResponseBodyDataSkipped self = new AddKnowledgeUploadUserResponseBodyDataSkipped();
            return TeaModel.build(map, self);
        }

        public AddKnowledgeUploadUserResponseBodyDataSkipped setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public AddKnowledgeUploadUserResponseBodyDataSkipped setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class AddKnowledgeUploadUserResponseBodyData extends TeaModel {
        /**
         * <p>The location of the knowledge base file.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucketName/path/to/file.pfg</p>
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
         * <p>The list of skipped users.</p>
         */
        @NameInMap("Skipped")
        public java.util.List<AddKnowledgeUploadUserResponseBodyDataSkipped> skipped;

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
         * <p>The number of users that were successfully added.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Written")
        public Integer written;

        public static AddKnowledgeUploadUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddKnowledgeUploadUserResponseBodyData self = new AddKnowledgeUploadUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddKnowledgeUploadUserResponseBodyData setFileLocation(String fileLocation) {
            this.fileLocation = fileLocation;
            return this;
        }
        public String getFileLocation() {
            return this.fileLocation;
        }

        public AddKnowledgeUploadUserResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AddKnowledgeUploadUserResponseBodyData setSkipped(java.util.List<AddKnowledgeUploadUserResponseBodyDataSkipped> skipped) {
            this.skipped = skipped;
            return this;
        }
        public java.util.List<AddKnowledgeUploadUserResponseBodyDataSkipped> getSkipped() {
            return this.skipped;
        }

        public AddKnowledgeUploadUserResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public AddKnowledgeUploadUserResponseBodyData setWritten(Integer written) {
            this.written = written;
            return this;
        }
        public Integer getWritten() {
            return this.written;
        }

    }

}
