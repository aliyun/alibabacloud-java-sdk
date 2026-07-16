// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListIndexFileDetailsResponseBody extends TeaModel {
    /**
     * <p>The error status code.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data field returned by the operation.</p>
     */
    @NameInMap("Data")
    public ListIndexFileDetailsResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Required parameter(%s) missing or invalid, please check the request parameters.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>35A267BF-xxxx-54DB-8394-AA3B0742D833</p>
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
     * <li>true: Successful.</li>
     * <li>false: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListIndexFileDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIndexFileDetailsResponseBody self = new ListIndexFileDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIndexFileDetailsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListIndexFileDetailsResponseBody setData(ListIndexFileDetailsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListIndexFileDetailsResponseBodyData getData() {
        return this.data;
    }

    public ListIndexFileDetailsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListIndexFileDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIndexFileDetailsResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListIndexFileDetailsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListIndexFileDetailsResponseBodyDataDocuments extends TeaModel {
        /**
         * <p>The custom chunking mode.</p>
         * 
         * <strong>example:</strong>
         * <p>DashSplitter</p>
         */
        @NameInMap("ChunkMode")
        public String chunkMode;

        /**
         * <p>The segment length, which is the number of characters in each text chunk.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("ChunkSize")
        public String chunkSize;

        /**
         * <p>The error status code for file import.</p>
         * 
         * <strong>example:</strong>
         * <p>110002</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The file format type. Valid values: pdf, docx, doc, txt, md, pptx, ppt, png, jpg, jpeg, bmp, gif, and EXCEL.</p>
         * 
         * <strong>example:</strong>
         * <p>pdf</p>
         */
        @NameInMap("DocumentType")
        public String documentType;

        /**
         * <p>Indicates whether Excel file headers support concatenation.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableHeaders")
        public String enableHeaders;

        /**
         * <p>The time when the file was imported to the knowledge base, in UNIX timestamp format.</p>
         * 
         * <strong>example:</strong>
         * <p>1744856423000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The file ID.</p>
         * 
         * <strong>example:</strong>
         * <p>doc_c134aa2073204a5d936d870bf960f56axxxxxxxx</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The error message for file import.</p>
         * 
         * <strong>example:</strong>
         * <p>check fileUrlKey[file_path] / fileNameKey[null] / fileExtensionKey[file_extension] is invalid</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>翻译平台运维文档</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The overlap length between segments.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("OverlapSize")
        public String overlapSize;

        /**
         * <p>The file size, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>996764</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The category ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cate_21a407a3372c4ba7aedc649709143f0cxxxxxxxx</p>
         */
        @NameInMap("SourceId")
        public String sourceId;

        /**
         * <p>The file import status. Valid values:</p>
         * <ul>
         * <li>INSERT_ERROR: File import failed.</li>
         * <li>RUNNING: File import in progress.</li>
         * <li>DELETED: File deleted.</li>
         * <li>FINISH: File import succeeded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The sentence separator.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot; &quot;</p>
         */
        @NameInMap("separator")
        public String separator;

        public static ListIndexFileDetailsResponseBodyDataDocuments build(java.util.Map<String, ?> map) throws Exception {
            ListIndexFileDetailsResponseBodyDataDocuments self = new ListIndexFileDetailsResponseBodyDataDocuments();
            return TeaModel.build(map, self);
        }

        public ListIndexFileDetailsResponseBodyDataDocuments setChunkMode(String chunkMode) {
            this.chunkMode = chunkMode;
            return this;
        }
        public String getChunkMode() {
            return this.chunkMode;
        }

        public ListIndexFileDetailsResponseBodyDataDocuments setChunkSize(String chunkSize) {
            this.chunkSize = chunkSize;
            return this;
        }
        public String getChunkSize() {
            return this.chunkSize;
        }

        public ListIndexFileDetailsResponseBodyDataDocuments setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListIndexFileDetailsResponseBodyDataDocuments setDocumentType(String documentType) {
            this.documentType = documentType;
            return this;
        }
        public String getDocumentType() {
            return this.documentType;
        }

        public ListIndexFileDetailsResponseBodyDataDocuments setEnableHeaders(String enableHeaders) {
            this.enableHeaders = enableHeaders;
            return this;
        }
        public String getEnableHeaders() {
            return this.enableHeaders;
        }

        public ListIndexFileDetailsResponseBodyDataDocuments setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListIndexFileDetailsResponseBodyDataDocuments setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListIndexFileDetailsResponseBodyDataDocuments setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListIndexFileDetailsResponseBodyDataDocuments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListIndexFileDetailsResponseBodyDataDocuments setOverlapSize(String overlapSize) {
            this.overlapSize = overlapSize;
            return this;
        }
        public String getOverlapSize() {
            return this.overlapSize;
        }

        public ListIndexFileDetailsResponseBodyDataDocuments setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public ListIndexFileDetailsResponseBodyDataDocuments setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public ListIndexFileDetailsResponseBodyDataDocuments setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListIndexFileDetailsResponseBodyDataDocuments setSeparator(String separator) {
            this.separator = separator;
            return this;
        }
        public String getSeparator() {
            return this.separator;
        }

    }

    public static class ListIndexFileDetailsResponseBodyData extends TeaModel {
        /**
         * <p>The list of files in the knowledge base, sorted by file import time in descending order (consistent with the console).</p>
         */
        @NameInMap("Documents")
        public java.util.List<ListIndexFileDetailsResponseBodyDataDocuments> documents;

        /**
         * <p>The knowledge base ID.</p>
         * 
         * <strong>example:</strong>
         * <p>79c0alxxxx</p>
         */
        @NameInMap("IndexId")
        public String indexId;

        /**
         * <p>The returned page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The returned number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of returned results.</p>
         * 
         * <strong>example:</strong>
         * <p>2437</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListIndexFileDetailsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListIndexFileDetailsResponseBodyData self = new ListIndexFileDetailsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListIndexFileDetailsResponseBodyData setDocuments(java.util.List<ListIndexFileDetailsResponseBodyDataDocuments> documents) {
            this.documents = documents;
            return this;
        }
        public java.util.List<ListIndexFileDetailsResponseBodyDataDocuments> getDocuments() {
            return this.documents;
        }

        public ListIndexFileDetailsResponseBodyData setIndexId(String indexId) {
            this.indexId = indexId;
            return this;
        }
        public String getIndexId() {
            return this.indexId;
        }

        public ListIndexFileDetailsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListIndexFileDetailsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListIndexFileDetailsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
