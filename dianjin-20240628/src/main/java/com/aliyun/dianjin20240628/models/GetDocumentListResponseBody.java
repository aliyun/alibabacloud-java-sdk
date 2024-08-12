// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetDocumentListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("cost")
    public Long cost;

    @NameInMap("data")
    public GetDocumentListResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("dataType")
    public String dataType;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>5E3FBAF1-17AF-53B7-AF0A-CDCEEB6DE658</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>2024-04-24 11:54:34</p>
     */
    @NameInMap("time")
    public String time;

    public static GetDocumentListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentListResponseBody self = new GetDocumentListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDocumentListResponseBody setCost(Long cost) {
        this.cost = cost;
        return this;
    }
    public Long getCost() {
        return this.cost;
    }

    public GetDocumentListResponseBody setData(GetDocumentListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDocumentListResponseBodyData getData() {
        return this.data;
    }

    public GetDocumentListResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public GetDocumentListResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetDocumentListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDocumentListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDocumentListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDocumentListResponseBody setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public static class GetDocumentListResponseBodyDataRecords extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>8326748346</p>
         */
        @NameInMap("docId")
        public String docId;

        @NameInMap("documentMeta")
        public java.util.Map<String, ?> documentMeta;

        /**
         * <strong>example:</strong>
         * <p>pdf</p>
         */
        @NameInMap("fileType")
        public String fileType;

        /**
         * <strong>example:</strong>
         * <p>2024-01-01 00:00:00</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2024-01-01 00:00:00</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>skjdhshbv</p>
         */
        @NameInMap("libraryId")
        public String libraryId;

        /**
         * <strong>example:</strong>
         * <p>WaitRefresh</p>
         */
        @NameInMap("statusCode")
        public String statusCode;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("url")
        public String url;

        public static GetDocumentListResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            GetDocumentListResponseBodyDataRecords self = new GetDocumentListResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public GetDocumentListResponseBodyDataRecords setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public GetDocumentListResponseBodyDataRecords setDocumentMeta(java.util.Map<String, ?> documentMeta) {
            this.documentMeta = documentMeta;
            return this;
        }
        public java.util.Map<String, ?> getDocumentMeta() {
            return this.documentMeta;
        }

        public GetDocumentListResponseBodyDataRecords setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public GetDocumentListResponseBodyDataRecords setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetDocumentListResponseBodyDataRecords setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetDocumentListResponseBodyDataRecords setLibraryId(String libraryId) {
            this.libraryId = libraryId;
            return this;
        }
        public String getLibraryId() {
            return this.libraryId;
        }

        public GetDocumentListResponseBodyDataRecords setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

        public GetDocumentListResponseBodyDataRecords setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetDocumentListResponseBodyDataRecords setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetDocumentListResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("currentPage")
        public Long currentPage;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Long pageSize;

        @NameInMap("records")
        public java.util.List<GetDocumentListResponseBodyDataRecords> records;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("totalPages")
        public Long totalPages;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("totalRecords")
        public Long totalRecords;

        public static GetDocumentListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDocumentListResponseBodyData self = new GetDocumentListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDocumentListResponseBodyData setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public GetDocumentListResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetDocumentListResponseBodyData setRecords(java.util.List<GetDocumentListResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<GetDocumentListResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public GetDocumentListResponseBodyData setTotalPages(Long totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Long getTotalPages() {
            return this.totalPages;
        }

        public GetDocumentListResponseBodyData setTotalRecords(Long totalRecords) {
            this.totalRecords = totalRecords;
            return this;
        }
        public Long getTotalRecords() {
            return this.totalRecords;
        }

    }

}
