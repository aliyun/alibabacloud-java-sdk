// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListKnowledgeUploadUserResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListKnowledgeUploadUserResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListKnowledgeUploadUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgeUploadUserResponseBody self = new ListKnowledgeUploadUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListKnowledgeUploadUserResponseBody setData(ListKnowledgeUploadUserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListKnowledgeUploadUserResponseBodyData getData() {
        return this.data;
    }

    public ListKnowledgeUploadUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListKnowledgeUploadUserResponseBodyData extends TeaModel {
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
         * <p>The list of authorized users.</p>
         */
        @NameInMap("Users")
        public java.util.List<String> users;

        public static ListKnowledgeUploadUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeUploadUserResponseBodyData self = new ListKnowledgeUploadUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeUploadUserResponseBodyData setFileLocation(String fileLocation) {
            this.fileLocation = fileLocation;
            return this;
        }
        public String getFileLocation() {
            return this.fileLocation;
        }

        public ListKnowledgeUploadUserResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListKnowledgeUploadUserResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ListKnowledgeUploadUserResponseBodyData setUsers(java.util.List<String> users) {
            this.users = users;
            return this;
        }
        public java.util.List<String> getUsers() {
            return this.users;
        }

    }

}
