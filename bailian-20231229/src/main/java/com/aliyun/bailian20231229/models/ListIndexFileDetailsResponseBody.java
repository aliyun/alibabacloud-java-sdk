// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListIndexFileDetailsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>InvalidParameter</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListIndexFileDetailsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Required parameter(%s) missing or invalid, please check the request parameters.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>35A267BF-xxxx-54DB-8394-AA3B0742D833</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    /**
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
        @NameInMap("ChunkMode")
        public String chunkMode;

        @NameInMap("ChunkSize")
        public String chunkSize;

        @NameInMap("Code")
        public String code;

        @NameInMap("DocumentType")
        public String documentType;

        @NameInMap("EnableHeaders")
        public String enableHeaders;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public String id;

        @NameInMap("Message")
        public String message;

        @NameInMap("Name")
        public String name;

        @NameInMap("OverlapSize")
        public String overlapSize;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("SourceId")
        public String sourceId;

        @NameInMap("Status")
        public String status;

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
        @NameInMap("Documents")
        public java.util.List<ListIndexFileDetailsResponseBodyDataDocuments> documents;

        @NameInMap("IndexId")
        public String indexId;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

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
