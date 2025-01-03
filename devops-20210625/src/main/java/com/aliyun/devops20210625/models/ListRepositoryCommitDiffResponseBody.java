// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListRepositoryCommitDiffResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
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
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0EE38A4E-8991-532A-8E8B-5C22B5D2E058</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListRepositoryCommitDiffResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
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
        /**
         * <strong>example:</strong>
         * <p>100644</p>
         */
        @NameInMap("aMode")
        public String aMode;

        /**
         * <strong>example:</strong>
         * <p>100755</p>
         */
        @NameInMap("bMode")
        public String bMode;

        @NameInMap("deletedFile")
        public Boolean deletedFile;

        /**
         * <strong>example:</strong>
         * <p>--- /dev/null\n+++ b/src/test/java/com/aliyun/codeupdemo/CodeupDemoApplicationTests.java\n@@ -0,0 +1,13 @@\n+package com.aliyun.codeupdemo;\n+\n+import org.junit.jupiter.api.Test;\n+import org.springframework.boot.test.context.SpringBootTest;\n+\n+@SpringBootTest\n+class CodeupDemoApplicationTest {\n+\n+ @Test\n+ void contextLoads() {\n+ }\n+\n+}\n</p>
         */
        @NameInMap("diff")
        public String diff;

        @NameInMap("isBinary")
        public Boolean isBinary;

        @NameInMap("isNewLfs")
        public Boolean isNewLfs;

        @NameInMap("isOldLfs")
        public Boolean isOldLfs;

        @NameInMap("newFile")
        public Boolean newFile;

        /**
         * <strong>example:</strong>
         * <p>6c268061a546378276559c713d0ad377d4xxxxxx</p>
         */
        @NameInMap("newId")
        public String newId;

        /**
         * <strong>example:</strong>
         * <p>src/test/java/com/aliyun/codeupdemo/CodeupDemoApplicationTests.java</p>
         */
        @NameInMap("newPath")
        public String newPath;

        /**
         * <strong>example:</strong>
         * <p>0000000000000000000000000000000000000000</p>
         */
        @NameInMap("oldId")
        public String oldId;

        /**
         * <strong>example:</strong>
         * <p>src/test/java/com/aliyun/codeupdemo/CodeupDemoApplicationTests.java</p>
         */
        @NameInMap("oldPath")
        public String oldPath;

        @NameInMap("renamedFile")
        public Boolean renamedFile;

        public static ListRepositoryCommitDiffResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryCommitDiffResponseBodyResult self = new ListRepositoryCommitDiffResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListRepositoryCommitDiffResponseBodyResult setAMode(String aMode) {
            this.aMode = aMode;
            return this;
        }
        public String getAMode() {
            return this.aMode;
        }

        public ListRepositoryCommitDiffResponseBodyResult setBMode(String bMode) {
            this.bMode = bMode;
            return this;
        }
        public String getBMode() {
            return this.bMode;
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
