// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListMergeRequestFilesReadsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SYSTEM_UNKNOWN_ERROR</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>ASSDS-ASSASX-XSAXSA-XSAXSAXS</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListMergeRequestFilesReadsResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ListMergeRequestFilesReadsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMergeRequestFilesReadsResponseBody self = new ListMergeRequestFilesReadsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMergeRequestFilesReadsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListMergeRequestFilesReadsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListMergeRequestFilesReadsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMergeRequestFilesReadsResponseBody setResult(java.util.List<ListMergeRequestFilesReadsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListMergeRequestFilesReadsResponseBodyResult> getResult() {
        return this.result;
    }

    public ListMergeRequestFilesReadsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListMergeRequestFilesReadsResponseBodyResultReadUsers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>204485087002425236</p>
         */
        @NameInMap("aliyunPk")
        public String aliyunPk;

        /**
         * <strong>example:</strong>
         * <p><a href="https://tcs-devops.aliyuncs.com/thumbnail/112afcb7a6a35c3f67f1bea827c4/w/100/h/100">https://tcs-devops.aliyuncs.com/thumbnail/112afcb7a6a35c3f67f1bea827c4/w/100/h/100</a></p>
         */
        @NameInMap("avatarUrl")
        public String avatarUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        @NameInMap("email")
        public String email;

        /**
         * <strong>example:</strong>
         * <p>codeup</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>test-codeup</p>
         */
        @NameInMap("username")
        public String username;

        public static ListMergeRequestFilesReadsResponseBodyResultReadUsers build(java.util.Map<String, ?> map) throws Exception {
            ListMergeRequestFilesReadsResponseBodyResultReadUsers self = new ListMergeRequestFilesReadsResponseBodyResultReadUsers();
            return TeaModel.build(map, self);
        }

        public ListMergeRequestFilesReadsResponseBodyResultReadUsers setAliyunPk(String aliyunPk) {
            this.aliyunPk = aliyunPk;
            return this;
        }
        public String getAliyunPk() {
            return this.aliyunPk;
        }

        public ListMergeRequestFilesReadsResponseBodyResultReadUsers setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ListMergeRequestFilesReadsResponseBodyResultReadUsers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListMergeRequestFilesReadsResponseBodyResultReadUsers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMergeRequestFilesReadsResponseBodyResultReadUsers setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListMergeRequestFilesReadsResponseBodyResultReadUsers setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class ListMergeRequestFilesReadsResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("deletedFile")
        public String deletedFile;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("newFile")
        public Boolean newFile;

        /**
         * <strong>example:</strong>
         * <p>text.txt</p>
         */
        @NameInMap("newFilePath")
        public String newFilePath;

        /**
         * <strong>example:</strong>
         * <p>text.txt</p>
         */
        @NameInMap("oldFilePath")
        public String oldFilePath;

        @NameInMap("readUsers")
        public java.util.List<ListMergeRequestFilesReadsResponseBodyResultReadUsers> readUsers;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("renamedFile")
        public String renamedFile;

        public static ListMergeRequestFilesReadsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListMergeRequestFilesReadsResponseBodyResult self = new ListMergeRequestFilesReadsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListMergeRequestFilesReadsResponseBodyResult setDeletedFile(String deletedFile) {
            this.deletedFile = deletedFile;
            return this;
        }
        public String getDeletedFile() {
            return this.deletedFile;
        }

        public ListMergeRequestFilesReadsResponseBodyResult setNewFile(Boolean newFile) {
            this.newFile = newFile;
            return this;
        }
        public Boolean getNewFile() {
            return this.newFile;
        }

        public ListMergeRequestFilesReadsResponseBodyResult setNewFilePath(String newFilePath) {
            this.newFilePath = newFilePath;
            return this;
        }
        public String getNewFilePath() {
            return this.newFilePath;
        }

        public ListMergeRequestFilesReadsResponseBodyResult setOldFilePath(String oldFilePath) {
            this.oldFilePath = oldFilePath;
            return this;
        }
        public String getOldFilePath() {
            return this.oldFilePath;
        }

        public ListMergeRequestFilesReadsResponseBodyResult setReadUsers(java.util.List<ListMergeRequestFilesReadsResponseBodyResultReadUsers> readUsers) {
            this.readUsers = readUsers;
            return this;
        }
        public java.util.List<ListMergeRequestFilesReadsResponseBodyResultReadUsers> getReadUsers() {
            return this.readUsers;
        }

        public ListMergeRequestFilesReadsResponseBodyResult setRenamedFile(String renamedFile) {
            this.renamedFile = renamedFile;
            return this;
        }
        public String getRenamedFile() {
            return this.renamedFile;
        }

    }

}
