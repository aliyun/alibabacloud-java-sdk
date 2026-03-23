// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ListValidateFileResponseBody extends TeaModel {
    /**
     * <p>The list of files.</p>
     */
    @NameInMap("Files")
    public java.util.List<ListValidateFileResponseBodyFiles> files;

    /**
     * <p>Indicates whether a next page of data exists.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasNext")
    public Boolean hasNext;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalPages")
    public Integer totalPages;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalSize")
    public Integer totalSize;

    public static ListValidateFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListValidateFileResponseBody self = new ListValidateFileResponseBody();
        return TeaModel.build(map, self);
    }

    public ListValidateFileResponseBody setFiles(java.util.List<ListValidateFileResponseBodyFiles> files) {
        this.files = files;
        return this;
    }
    public java.util.List<ListValidateFileResponseBodyFiles> getFiles() {
        return this.files;
    }

    public ListValidateFileResponseBody setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
        return this;
    }
    public Boolean getHasNext() {
        return this.hasNext;
    }

    public ListValidateFileResponseBody setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListValidateFileResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListValidateFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListValidateFileResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public ListValidateFileResponseBody setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Integer getTotalSize() {
        return this.totalSize;
    }

    public static class ListValidateFileResponseBodyFiles extends TeaModel {
        /**
         * <p>The number of addresses with the validation result \&quot;CatchAll\&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CatchAllNum")
        public String catchAllNum;

        /**
         * <p>The time when the task was completed.</p>
         * 
         * <strong>example:</strong>
         * <p>2000-01-01T00:00:00Z</p>
         */
        @NameInMap("CompleteTime")
        public String completeTime;

        /**
         * <p>The number of addresses with the validation result \&quot;DoNotMail\&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DoNotMailNum")
        public String doNotMailNum;

        /**
         * <p>The file ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>test.csv</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The number of addresses with the validation result \&quot;Invalid\&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("InvalidNum")
        public String invalidNum;

        /**
         * <p>Indicates whether the result can be downloaded.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDownloadable")
        public Boolean isDownloadable;

        /**
         * <p>The task execution progress.</p>
         * 
         * <strong>example:</strong>
         * <p>100%</p>
         */
        @NameInMap("Percentage")
        public String percentage;

        /**
         * <p>The number of addresses that have been validated.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ProcessedNum")
        public String processedNum;

        /**
         * <p>The status of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>completed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The number of addresses to validate in the task.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalNum")
        public String totalNum;

        /**
         * <p>The number of addresses with the validation result \&quot;Unknown\&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("UnknownNum")
        public String unknownNum;

        /**
         * <p>The time when the file was submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>2000-01-01T00:00:00Z</p>
         */
        @NameInMap("UploadTime")
        public String uploadTime;

        /**
         * <p>The number of addresses with the validation result \&quot;Valid\&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ValidNum")
        public String validNum;

        public static ListValidateFileResponseBodyFiles build(java.util.Map<String, ?> map) throws Exception {
            ListValidateFileResponseBodyFiles self = new ListValidateFileResponseBodyFiles();
            return TeaModel.build(map, self);
        }

        public ListValidateFileResponseBodyFiles setCatchAllNum(String catchAllNum) {
            this.catchAllNum = catchAllNum;
            return this;
        }
        public String getCatchAllNum() {
            return this.catchAllNum;
        }

        public ListValidateFileResponseBodyFiles setCompleteTime(String completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public String getCompleteTime() {
            return this.completeTime;
        }

        public ListValidateFileResponseBodyFiles setDoNotMailNum(String doNotMailNum) {
            this.doNotMailNum = doNotMailNum;
            return this;
        }
        public String getDoNotMailNum() {
            return this.doNotMailNum;
        }

        public ListValidateFileResponseBodyFiles setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public ListValidateFileResponseBodyFiles setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListValidateFileResponseBodyFiles setInvalidNum(String invalidNum) {
            this.invalidNum = invalidNum;
            return this;
        }
        public String getInvalidNum() {
            return this.invalidNum;
        }

        public ListValidateFileResponseBodyFiles setIsDownloadable(Boolean isDownloadable) {
            this.isDownloadable = isDownloadable;
            return this;
        }
        public Boolean getIsDownloadable() {
            return this.isDownloadable;
        }

        public ListValidateFileResponseBodyFiles setPercentage(String percentage) {
            this.percentage = percentage;
            return this;
        }
        public String getPercentage() {
            return this.percentage;
        }

        public ListValidateFileResponseBodyFiles setProcessedNum(String processedNum) {
            this.processedNum = processedNum;
            return this;
        }
        public String getProcessedNum() {
            return this.processedNum;
        }

        public ListValidateFileResponseBodyFiles setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListValidateFileResponseBodyFiles setTotalNum(String totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public String getTotalNum() {
            return this.totalNum;
        }

        public ListValidateFileResponseBodyFiles setUnknownNum(String unknownNum) {
            this.unknownNum = unknownNum;
            return this;
        }
        public String getUnknownNum() {
            return this.unknownNum;
        }

        public ListValidateFileResponseBodyFiles setUploadTime(String uploadTime) {
            this.uploadTime = uploadTime;
            return this;
        }
        public String getUploadTime() {
            return this.uploadTime;
        }

        public ListValidateFileResponseBodyFiles setValidNum(String validNum) {
            this.validNum = validNum;
            return this;
        }
        public String getValidNum() {
            return this.validNum;
        }

    }

}
