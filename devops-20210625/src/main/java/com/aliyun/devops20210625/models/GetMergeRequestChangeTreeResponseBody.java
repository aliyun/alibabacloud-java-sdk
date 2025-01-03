// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetMergeRequestChangeTreeResponseBody extends TeaModel {
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
     * <p>HC93CE1A-8D7A-13A9-8306-7465DE2E5C0F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public GetMergeRequestChangeTreeResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetMergeRequestChangeTreeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMergeRequestChangeTreeResponseBody self = new GetMergeRequestChangeTreeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMergeRequestChangeTreeResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMergeRequestChangeTreeResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMergeRequestChangeTreeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMergeRequestChangeTreeResponseBody setResult(GetMergeRequestChangeTreeResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetMergeRequestChangeTreeResponseBodyResult getResult() {
        return this.result;
    }

    public GetMergeRequestChangeTreeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMergeRequestChangeTreeResponseBodyResultChangedFilesInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("addLines")
        public Long addLines;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("binaryFile")
        public Boolean binaryFile;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("delLines")
        public Long delLines;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("deletedFile")
        public Boolean deletedFile;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("newFile")
        public Boolean newFile;

        /**
         * <strong>example:</strong>
         * <p>test.txt</p>
         */
        @NameInMap("newPath")
        public String newPath;

        /**
         * <strong>example:</strong>
         * <p>test.txt</p>
         */
        @NameInMap("oldPath")
        public String oldPath;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("renamedFile")
        public Boolean renamedFile;

        public static GetMergeRequestChangeTreeResponseBodyResultChangedFilesInfos build(java.util.Map<String, ?> map) throws Exception {
            GetMergeRequestChangeTreeResponseBodyResultChangedFilesInfos self = new GetMergeRequestChangeTreeResponseBodyResultChangedFilesInfos();
            return TeaModel.build(map, self);
        }

        public GetMergeRequestChangeTreeResponseBodyResultChangedFilesInfos setAddLines(Long addLines) {
            this.addLines = addLines;
            return this;
        }
        public Long getAddLines() {
            return this.addLines;
        }

        public GetMergeRequestChangeTreeResponseBodyResultChangedFilesInfos setBinaryFile(Boolean binaryFile) {
            this.binaryFile = binaryFile;
            return this;
        }
        public Boolean getBinaryFile() {
            return this.binaryFile;
        }

        public GetMergeRequestChangeTreeResponseBodyResultChangedFilesInfos setDelLines(Long delLines) {
            this.delLines = delLines;
            return this;
        }
        public Long getDelLines() {
            return this.delLines;
        }

        public GetMergeRequestChangeTreeResponseBodyResultChangedFilesInfos setDeletedFile(Boolean deletedFile) {
            this.deletedFile = deletedFile;
            return this;
        }
        public Boolean getDeletedFile() {
            return this.deletedFile;
        }

        public GetMergeRequestChangeTreeResponseBodyResultChangedFilesInfos setNewFile(Boolean newFile) {
            this.newFile = newFile;
            return this;
        }
        public Boolean getNewFile() {
            return this.newFile;
        }

        public GetMergeRequestChangeTreeResponseBodyResultChangedFilesInfos setNewPath(String newPath) {
            this.newPath = newPath;
            return this;
        }
        public String getNewPath() {
            return this.newPath;
        }

        public GetMergeRequestChangeTreeResponseBodyResultChangedFilesInfos setOldPath(String oldPath) {
            this.oldPath = oldPath;
            return this;
        }
        public String getOldPath() {
            return this.oldPath;
        }

        public GetMergeRequestChangeTreeResponseBodyResultChangedFilesInfos setRenamedFile(Boolean renamedFile) {
            this.renamedFile = renamedFile;
            return this;
        }
        public Boolean getRenamedFile() {
            return this.renamedFile;
        }

    }

    public static class GetMergeRequestChangeTreeResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("changedFilesCount")
        public Long changedFilesCount;

        @NameInMap("changedFilesInfos")
        public java.util.List<GetMergeRequestChangeTreeResponseBodyResultChangedFilesInfos> changedFilesInfos;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("totalAddLines")
        public Long totalAddLines;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("totalDelLines")
        public Long totalDelLines;

        public static GetMergeRequestChangeTreeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetMergeRequestChangeTreeResponseBodyResult self = new GetMergeRequestChangeTreeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetMergeRequestChangeTreeResponseBodyResult setChangedFilesCount(Long changedFilesCount) {
            this.changedFilesCount = changedFilesCount;
            return this;
        }
        public Long getChangedFilesCount() {
            return this.changedFilesCount;
        }

        public GetMergeRequestChangeTreeResponseBodyResult setChangedFilesInfos(java.util.List<GetMergeRequestChangeTreeResponseBodyResultChangedFilesInfos> changedFilesInfos) {
            this.changedFilesInfos = changedFilesInfos;
            return this;
        }
        public java.util.List<GetMergeRequestChangeTreeResponseBodyResultChangedFilesInfos> getChangedFilesInfos() {
            return this.changedFilesInfos;
        }

        public GetMergeRequestChangeTreeResponseBodyResult setTotalAddLines(Long totalAddLines) {
            this.totalAddLines = totalAddLines;
            return this;
        }
        public Long getTotalAddLines() {
            return this.totalAddLines;
        }

        public GetMergeRequestChangeTreeResponseBodyResult setTotalDelLines(Long totalDelLines) {
            this.totalDelLines = totalDelLines;
            return this;
        }
        public Long getTotalDelLines() {
            return this.totalDelLines;
        }

    }

}
