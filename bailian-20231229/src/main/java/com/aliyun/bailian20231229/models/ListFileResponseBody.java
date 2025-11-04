// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListFileResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListFileResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Requests throttling triggered.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>8F97A63B-55F1-527F-9D6E-467B6A7E8CF1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFileResponseBody self = new ListFileResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListFileResponseBody setData(ListFileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListFileResponseBodyData getData() {
        return this.data;
    }

    public ListFileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFileResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListFileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListFileResponseBodyDataFileList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cate_cdd11b1b79a74e8bbd675c356a91ee3510024405</p>
         */
        @NameInMap("CategoryId")
        public String categoryId;

        /**
         * <strong>example:</strong>
         * <p>2023-08-18 11:03:35</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The document ID, which is the <code>FileId</code> parameter returned by the <a href="~~AddFile~~">AddFile</a> operation. To view the ID, click the icon next to the file name on the <a href="https://bailian.console.alibabacloud.com/#/data-center">Data Management</a> page.</p>
         * 
         * <strong>example:</strong>
         * <p>file_5ff599b3455a45db8c41b0054b361518_10098576</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <strong>example:</strong>
         * <p>auto-test-1721096109278.pdf</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>docx</p>
         */
        @NameInMap("FileType")
        public String fileType;

        /**
         * <strong>example:</strong>
         * <p>DASHSCOPE_DOCMIND</p>
         */
        @NameInMap("Parser")
        public String parser;

        /**
         * <strong>example:</strong>
         * <p>512</p>
         */
        @NameInMap("SizeInBytes")
        public Long sizeInBytes;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public java.util.List<String> tags;

        public static ListFileResponseBodyDataFileList build(java.util.Map<String, ?> map) throws Exception {
            ListFileResponseBodyDataFileList self = new ListFileResponseBodyDataFileList();
            return TeaModel.build(map, self);
        }

        public ListFileResponseBodyDataFileList setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public ListFileResponseBodyDataFileList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListFileResponseBodyDataFileList setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public ListFileResponseBodyDataFileList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListFileResponseBodyDataFileList setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public ListFileResponseBodyDataFileList setParser(String parser) {
            this.parser = parser;
            return this;
        }
        public String getParser() {
            return this.parser;
        }

        public ListFileResponseBodyDataFileList setSizeInBytes(Long sizeInBytes) {
            this.sizeInBytes = sizeInBytes;
            return this;
        }
        public Long getSizeInBytes() {
            return this.sizeInBytes;
        }

        public ListFileResponseBodyDataFileList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListFileResponseBodyDataFileList setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

    }

    public static class ListFileResponseBodyData extends TeaModel {
        /**
         * <p>The list of documents in the category.</p>
         */
        @NameInMap("FileList")
        public java.util.List<ListFileResponseBodyDataFileList> fileList;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasNext")
        public Boolean hasNext;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <strong>example:</strong>
         * <p>4jzbJk9J6lNeuXD9hP0viA==</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <strong>example:</strong>
         * <p>48</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListFileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListFileResponseBodyData self = new ListFileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListFileResponseBodyData setFileList(java.util.List<ListFileResponseBodyDataFileList> fileList) {
            this.fileList = fileList;
            return this;
        }
        public java.util.List<ListFileResponseBodyDataFileList> getFileList() {
            return this.fileList;
        }

        public ListFileResponseBodyData setHasNext(Boolean hasNext) {
            this.hasNext = hasNext;
            return this;
        }
        public Boolean getHasNext() {
            return this.hasNext;
        }

        public ListFileResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListFileResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListFileResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
