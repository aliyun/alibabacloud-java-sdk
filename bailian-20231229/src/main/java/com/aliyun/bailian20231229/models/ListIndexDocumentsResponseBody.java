// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListIndexDocumentsResponseBody extends TeaModel {
    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
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
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indications whether the API call is successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
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
         * <p>The error status code of document import.</p>
         * 
         * <strong>example:</strong>
         * <p>110002</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The format of the document. Valid values: pdf, docx, doc, txt, md, pptx, ppt, and EXCEL.</p>
         * 
         * <strong>example:</strong>
         * <p>pdf</p>
         */
        @NameInMap("DocumentType")
        public String documentType;

        /**
         * <p>The primary key ID of the document.</p>
         * 
         * <strong>example:</strong>
         * <p>doc_c134aa2073204a5d936d870bf960f56a10024701</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The error message of document import.</p>
         * 
         * <strong>example:</strong>
         * <p>check fileUrlKey[file_path] / fileNameKey[null] / fileExtensionKey[file_extension] is invalid</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The name of the document.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The size of the document. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>996764</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>For unstructured knowledge base, this parameter is the category ID, which is the <code>CategoryId</code> returned by the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/api-bailian-2023-12-29-addcategory">AddCategory</a> interface. To view the category ID, you can click the ID icon next to the category name on the Unstructured Data tab of the <a href="https://bailian.console.aliyun.com/#/data-center">Data Management</a> page.</p>
         * <p>For structured knowledge base, this parameter is the data table ID. To view the table ID, you can click the ID icon next to the table name on the Structured Data tab of the <a href="https://bailian.console.aliyun.com/#/data-center">Data Management</a> page.</p>
         * 
         * <strong>example:</strong>
         * <p>cate_21a407a3372c4ba7aedc649709143f0c10021401</p>
         */
        @NameInMap("SourceId")
        public String sourceId;

        /**
         * <p>The import status of the document. Valid values:</p>
         * <ul>
         * <li>INSERT_ERROR</li>
         * <li>RUNNING</li>
         * <li>DELETED</li>
         * <li>FINISH</li>
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
         * <p>The list of documents in the knowledge base.</p>
         */
        @NameInMap("Documents")
        public java.util.List<ListIndexDocumentsResponseBodyDataDocuments> documents;

        /**
         * <p>The primary key ID of the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>pno97tn8iu</p>
         */
        @NameInMap("IndexId")
        public String indexId;

        /**
         * <p>The specified page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The specified number of documents on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of documents returned.</p>
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
