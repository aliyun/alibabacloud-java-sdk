// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListFileResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data field returned by the operation.</p>
     */
    @NameInMap("Data")
    public ListFileResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Requests throttling triggered.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8F97A63B-xxxx-527F-9D6E-467B6A7E8CF1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status code returned by the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the operation was successful. Valid values:</p>
     * <ul>
     * <li>true: Successful. </li>
     * <li>false: Failed.</li>
     * </ul>
     * 
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
         * <p>The ID of the category to which the file belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cate_cdd11b1b79a74e8bbd675c356a91ee35xxxxxxxx</p>
         */
        @NameInMap("CategoryId")
        public String categoryId;

        /**
         * <p>The timestamp when the file was added to Alibaba Cloud Model Studio. Format: yyyy-MM-dd HH:mm:ss. Time zone: UTC+8.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-09 11:03:35</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The file ID, which is the <code>FileId</code> returned by the <strong>AddFile</strong> operation. You can also obtain it on the &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a> page by clicking the icon next to the file name.</p>
         * 
         * <strong>example:</strong>
         * <p>file_5ff599b3455a45db8c41b0054b361518_xxxxxxxx</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>product-overview.pdf</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The file format type. Valid values: pdf, docx, doc, txt, md, pptx, ppt, xlsx, xls, html, png, jpg, jpeg, bmp, and gif.</p>
         * 
         * <strong>example:</strong>
         * <p>docx</p>
         */
        @NameInMap("FileType")
        public String fileType;

        @NameInMap("ParseErrorMessage")
        public String parseErrorMessage;

        /**
         * <p>The document parser. Valid values:</p>
         * <ul>
         * <li>DASHSCOPE_DOCMIND: Alibaba Cloud intelligent document parsing.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DASHSCOPE_DOCMIND</p>
         */
        @NameInMap("Parser")
        public String parser;

        /**
         * <p>The file size in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>512</p>
         */
        @NameInMap("SizeInBytes")
        public Long sizeInBytes;

        /**
         * <p>The file parsing status. Valid values:</p>
         * <ul>
         * <li>INIT: Initialization state, waiting to be scheduled.</li>
         * <li>PARSING: Parsing in progress.</li>
         * <li>PARSE_SUCCESS: Parsing completed.</li>
         * <li>PARSE_FAILED: Parsing failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PARSE_SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The list of tags associated with the file. A document can be associated with multiple tags.</p>
         */
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

        public ListFileResponseBodyDataFileList setParseErrorMessage(String parseErrorMessage) {
            this.parseErrorMessage = parseErrorMessage;
            return this;
        }
        public String getParseErrorMessage() {
            return this.parseErrorMessage;
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
         * <p>The list of files in the category.</p>
         */
        @NameInMap("FileList")
        public java.util.List<ListFileResponseBodyDataFileList> fileList;

        /**
         * <p>Indicates whether there is a next page of category data that matches the query conditions. Valid values:</p>
         * <ul>
         * <li>true: Yes.</li>
         * <li>false: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasNext")
        public Boolean hasNext;

        /**
         * <p>The number of entries per page for paging.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The pagination token returned by this call.</p>
         * 
         * <strong>example:</strong>
         * <p>4jzbJk9J6lNeuXD9hP0viA==</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The total number of entries in the returned results.</p>
         * 
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
