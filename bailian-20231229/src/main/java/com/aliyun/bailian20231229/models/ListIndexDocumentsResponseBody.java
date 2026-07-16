// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListIndexDocumentsResponseBody extends TeaModel {
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
    public ListIndexDocumentsResponseBodyData data;

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

    public static ListIndexDocumentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIndexDocumentsResponseBody self = new ListIndexDocumentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIndexDocumentsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListIndexDocumentsResponseBody setData(ListIndexDocumentsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListIndexDocumentsResponseBodyData getData() {
        return this.data;
    }

    public ListIndexDocumentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListIndexDocumentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIndexDocumentsResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListIndexDocumentsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListIndexDocumentsResponseBodyDataDocuments extends TeaModel {
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
         * <p>product-overview</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The file size, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>996765</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>For document search or audio/video search knowledge bases, this parameter specifies the category ID, which is the <code>CategoryId</code> returned by the <strong>AddCategory</strong> operation. You can also obtain it by clicking the ID icon next to the category name on the Files tab of <a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a>.</p>
         * <p>For data query or image Q&amp;A knowledge bases, this parameter specifies the data table ID. You can obtain it by clicking the ID icon next to the data table name on the Tables tab of <a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a>.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <p>For document search knowledge bases, this parameter specifies the category ID, which is the <code>CategoryId</code> returned by the <strong>AddCategory</strong> operation. You can also obtain it by clicking the ID icon next to the category name on the Files tab of <a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a>.</p>
         * <p>For data query or image Q&amp;A knowledge bases, this parameter specifies the data table ID. You can obtain it by clicking the ID icon next to the data table name on the Tables tab of <a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a>.</p>
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

        public static ListIndexDocumentsResponseBodyDataDocuments build(java.util.Map<String, ?> map) throws Exception {
            ListIndexDocumentsResponseBodyDataDocuments self = new ListIndexDocumentsResponseBodyDataDocuments();
            return TeaModel.build(map, self);
        }

        public ListIndexDocumentsResponseBodyDataDocuments setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListIndexDocumentsResponseBodyDataDocuments setDocumentType(String documentType) {
            this.documentType = documentType;
            return this;
        }
        public String getDocumentType() {
            return this.documentType;
        }

        public ListIndexDocumentsResponseBodyDataDocuments setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListIndexDocumentsResponseBodyDataDocuments setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListIndexDocumentsResponseBodyDataDocuments setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListIndexDocumentsResponseBodyDataDocuments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListIndexDocumentsResponseBodyDataDocuments setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public ListIndexDocumentsResponseBodyDataDocuments setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public ListIndexDocumentsResponseBodyDataDocuments setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListIndexDocumentsResponseBodyData extends TeaModel {
        /**
         * <p>The list of files in the knowledge base, sorted by document import time in descending order (consistent with the console).</p>
         */
        @NameInMap("Documents")
        public java.util.List<ListIndexDocumentsResponseBodyDataDocuments> documents;

        /**
         * <p>The knowledge base ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pno97txxxx</p>
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

        public static ListIndexDocumentsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListIndexDocumentsResponseBodyData self = new ListIndexDocumentsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListIndexDocumentsResponseBodyData setDocuments(java.util.List<ListIndexDocumentsResponseBodyDataDocuments> documents) {
            this.documents = documents;
            return this;
        }
        public java.util.List<ListIndexDocumentsResponseBodyDataDocuments> getDocuments() {
            return this.documents;
        }

        public ListIndexDocumentsResponseBodyData setIndexId(String indexId) {
            this.indexId = indexId;
            return this;
        }
        public String getIndexId() {
            return this.indexId;
        }

        public ListIndexDocumentsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListIndexDocumentsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListIndexDocumentsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
