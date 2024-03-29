// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListRepositoryCommitDiffResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListRepositoryCommitDiffResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static ListRepositoryCommitDiffResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryCommitDiffResponseBody self = new ListRepositoryCommitDiffResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRepositoryCommitDiffResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListRepositoryCommitDiffResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListRepositoryCommitDiffResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRepositoryCommitDiffResponseBody setResult(java.util.List<ListRepositoryCommitDiffResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListRepositoryCommitDiffResponseBodyResult> getResult() {
        return this.result;
    }

    public ListRepositoryCommitDiffResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListRepositoryCommitDiffResponseBodyResult extends TeaModel {
        @NameInMap("AMode")
        public String AMode;

        @NameInMap("BMode")
        public String BMode;

        @NameInMap("DeletedFile")
        public Boolean deletedFile;

        @NameInMap("Diff")
        public String diff;

        @NameInMap("IsBinary")
        public Boolean isBinary;

        @NameInMap("IsNewLfs")
        public Boolean isNewLfs;

        @NameInMap("IsOldLfs")
        public Boolean isOldLfs;

        @NameInMap("NewFile")
        public Boolean newFile;

        @NameInMap("NewId")
        public String newId;

        @NameInMap("NewPath")
        public String newPath;

        @NameInMap("OldId")
        public String oldId;

        @NameInMap("OldPath")
        public String oldPath;

        @NameInMap("RenamedFile")
        public Boolean renamedFile;

        public static ListRepositoryCommitDiffResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryCommitDiffResponseBodyResult self = new ListRepositoryCommitDiffResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListRepositoryCommitDiffResponseBodyResult setAMode(String AMode) {
            this.AMode = AMode;
            return this;
        }
        public String getAMode() {
            return this.AMode;
        }

        public ListRepositoryCommitDiffResponseBodyResult setBMode(String BMode) {
            this.BMode = BMode;
            return this;
        }
        public String getBMode() {
            return this.BMode;
        }

        public ListRepositoryCommitDiffResponseBodyResult setDeletedFile(Boolean deletedFile) {
            this.deletedFile = deletedFile;
            return this;
        }
        public Boolean getDeletedFile() {
            return this.deletedFile;
        }

        public ListRepositoryCommitDiffResponseBodyResult setDiff(String diff) {
            this.diff = diff;
            return this;
        }
        public String getDiff() {
            return this.diff;
        }

        public ListRepositoryCommitDiffResponseBodyResult setIsBinary(Boolean isBinary) {
            this.isBinary = isBinary;
            return this;
        }
        public Boolean getIsBinary() {
            return this.isBinary;
        }

        public ListRepositoryCommitDiffResponseBodyResult setIsNewLfs(Boolean isNewLfs) {
            this.isNewLfs = isNewLfs;
            return this;
        }
        public Boolean getIsNewLfs() {
            return this.isNewLfs;
        }

        public ListRepositoryCommitDiffResponseBodyResult setIsOldLfs(Boolean isOldLfs) {
            this.isOldLfs = isOldLfs;
            return this;
        }
        public Boolean getIsOldLfs() {
            return this.isOldLfs;
        }

        public ListRepositoryCommitDiffResponseBodyResult setNewFile(Boolean newFile) {
            this.newFile = newFile;
            return this;
        }
        public Boolean getNewFile() {
            return this.newFile;
        }

        public ListRepositoryCommitDiffResponseBodyResult setNewId(String newId) {
            this.newId = newId;
            return this;
        }
        public String getNewId() {
            return this.newId;
        }

        public ListRepositoryCommitDiffResponseBodyResult setNewPath(String newPath) {
            this.newPath = newPath;
            return this;
        }
        public String getNewPath() {
            return this.newPath;
        }

        public ListRepositoryCommitDiffResponseBodyResult setOldId(String oldId) {
            this.oldId = oldId;
            return this;
        }
        public String getOldId() {
            return this.oldId;
        }

        public ListRepositoryCommitDiffResponseBodyResult setOldPath(String oldPath) {
            this.oldPath = oldPath;
            return this;
        }
        public String getOldPath() {
            return this.oldPath;
        }

        public ListRepositoryCommitDiffResponseBodyResult setRenamedFile(Boolean renamedFile) {
            this.renamedFile = renamedFile;
            return this;
        }
        public Boolean getRenamedFile() {
            return this.renamedFile;
        }

    }

}
