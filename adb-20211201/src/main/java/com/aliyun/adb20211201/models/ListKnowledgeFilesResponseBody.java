// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListKnowledgeFilesResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListKnowledgeFilesResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListKnowledgeFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgeFilesResponseBody self = new ListKnowledgeFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListKnowledgeFilesResponseBody setData(ListKnowledgeFilesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListKnowledgeFilesResponseBodyData getData() {
        return this.data;
    }

    public ListKnowledgeFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListKnowledgeFilesResponseBodyDataFiles extends TeaModel {
        /**
         * <p>The time when the file was added to the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-09 10:27:35</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The ID of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>137</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>The size of the file, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("FileSizeBytes")
        public Long fileSizeBytes;

        /**
         * <p>The Object Storage Service (OSS) URL of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucketName/path/to/file</p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <p>The format of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>mp4</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>Indicates whether the file is a directory.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDirectory")
        public Boolean isDirectory;

        /**
         * <p>The file_id of the content host.</p>
         * 
         * <strong>example:</strong>
         * <p>122</p>
         */
        @NameInMap("OwnerFileId")
        public Long ownerFileId;

        /**
         * <p>The total number of pages in the file, such as the number of pages in a PDF file.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PageCount")
        public Integer pageCount;

        /**
         * <p>The processing message of the knowledge base file.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        @NameInMap("ProcessMessage")
        public String processMessage;

        /**
         * <p>The status of the file in the knowledge base. Valid values:</p>
         * <ul>
         * <li><p>Processing: The file is being processed.</p>
         * </li>
         * <li><p>Finished: The file has been processed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("ProcessStatus")
        public String processStatus;

        /**
         * <p>The time when the file was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-10 10:23:46</p>
         */
        @NameInMap("UpdatedAt")
        public String updatedAt;

        public static ListKnowledgeFilesResponseBodyDataFiles build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeFilesResponseBodyDataFiles self = new ListKnowledgeFilesResponseBodyDataFiles();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeFilesResponseBodyDataFiles setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListKnowledgeFilesResponseBodyDataFiles setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public ListKnowledgeFilesResponseBodyDataFiles setFileSizeBytes(Long fileSizeBytes) {
            this.fileSizeBytes = fileSizeBytes;
            return this;
        }
        public Long getFileSizeBytes() {
            return this.fileSizeBytes;
        }

        public ListKnowledgeFilesResponseBodyDataFiles setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public ListKnowledgeFilesResponseBodyDataFiles setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public ListKnowledgeFilesResponseBodyDataFiles setIsDirectory(Boolean isDirectory) {
            this.isDirectory = isDirectory;
            return this;
        }
        public Boolean getIsDirectory() {
            return this.isDirectory;
        }

        public ListKnowledgeFilesResponseBodyDataFiles setOwnerFileId(Long ownerFileId) {
            this.ownerFileId = ownerFileId;
            return this;
        }
        public Long getOwnerFileId() {
            return this.ownerFileId;
        }

        public ListKnowledgeFilesResponseBodyDataFiles setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public ListKnowledgeFilesResponseBodyDataFiles setProcessMessage(String processMessage) {
            this.processMessage = processMessage;
            return this;
        }
        public String getProcessMessage() {
            return this.processMessage;
        }

        public ListKnowledgeFilesResponseBodyDataFiles setProcessStatus(String processStatus) {
            this.processStatus = processStatus;
            return this;
        }
        public String getProcessStatus() {
            return this.processStatus;
        }

        public ListKnowledgeFilesResponseBodyDataFiles setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

    public static class ListKnowledgeFilesResponseBodyData extends TeaModel {
        /**
         * <p>The list of file information.</p>
         */
        @NameInMap("Files")
        public java.util.List<ListKnowledgeFilesResponseBodyDataFiles> files;

        /**
         * <p>The message returned by the request.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The current page number.</p>
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
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

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
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListKnowledgeFilesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeFilesResponseBodyData self = new ListKnowledgeFilesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeFilesResponseBodyData setFiles(java.util.List<ListKnowledgeFilesResponseBodyDataFiles> files) {
            this.files = files;
            return this;
        }
        public java.util.List<ListKnowledgeFilesResponseBodyDataFiles> getFiles() {
            return this.files;
        }

        public ListKnowledgeFilesResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListKnowledgeFilesResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ListKnowledgeFilesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListKnowledgeFilesResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ListKnowledgeFilesResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
