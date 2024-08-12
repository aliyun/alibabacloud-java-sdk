// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetFilterDocumentListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("cost")
    public Long cost;

    @NameInMap("data")
    public GetFilterDocumentListResponseBodyData data;

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
     * <p>7ADF010C-FD89-569D-A079-2D4D5247E943</p>
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
     * <p>2024-01-01 00:00:00</p>
     */
    @NameInMap("time")
    public String time;

    public static GetFilterDocumentListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFilterDocumentListResponseBody self = new GetFilterDocumentListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFilterDocumentListResponseBody setCost(Long cost) {
        this.cost = cost;
        return this;
    }
    public Long getCost() {
        return this.cost;
    }

    public GetFilterDocumentListResponseBody setData(GetFilterDocumentListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetFilterDocumentListResponseBodyData getData() {
        return this.data;
    }

    public GetFilterDocumentListResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public GetFilterDocumentListResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetFilterDocumentListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFilterDocumentListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFilterDocumentListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetFilterDocumentListResponseBody setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public static class GetFilterDocumentListResponseBodyDataRecords extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>29368126816</p>
         */
        @NameInMap("docId")
        public String docId;

        /**
         * <strong>example:</strong>
         * <p>{&quot;a&quot;: &quot;1&quot;}</p>
         */
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
         * <p>sdfgsjdfg</p>
         */
        @NameInMap("libraryId")
        public String libraryId;

        /**
         * <strong>example:</strong>
         * <p>WaitRefresh</p>
         */
        @NameInMap("statusCode")
        public String statusCode;

        @NameInMap("title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("url")
        public String url;

        public static GetFilterDocumentListResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            GetFilterDocumentListResponseBodyDataRecords self = new GetFilterDocumentListResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public GetFilterDocumentListResponseBodyDataRecords setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public GetFilterDocumentListResponseBodyDataRecords setDocumentMeta(java.util.Map<String, ?> documentMeta) {
            this.documentMeta = documentMeta;
            return this;
        }
        public java.util.Map<String, ?> getDocumentMeta() {
            return this.documentMeta;
        }

        public GetFilterDocumentListResponseBodyDataRecords setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public GetFilterDocumentListResponseBodyDataRecords setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetFilterDocumentListResponseBodyDataRecords setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetFilterDocumentListResponseBodyDataRecords setLibraryId(String libraryId) {
            this.libraryId = libraryId;
            return this;
        }
        public String getLibraryId() {
            return this.libraryId;
        }

        public GetFilterDocumentListResponseBodyDataRecords setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

        public GetFilterDocumentListResponseBodyDataRecords setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetFilterDocumentListResponseBodyDataRecords setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetFilterDocumentListResponseBodyData extends TeaModel {
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
        public java.util.List<GetFilterDocumentListResponseBodyDataRecords> records;

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

        public static GetFilterDocumentListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFilterDocumentListResponseBodyData self = new GetFilterDocumentListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFilterDocumentListResponseBodyData setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public GetFilterDocumentListResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetFilterDocumentListResponseBodyData setRecords(java.util.List<GetFilterDocumentListResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<GetFilterDocumentListResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public GetFilterDocumentListResponseBodyData setTotalPages(Long totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Long getTotalPages() {
            return this.totalPages;
        }

        public GetFilterDocumentListResponseBodyData setTotalRecords(Long totalRecords) {
            this.totalRecords = totalRecords;
            return this;
        }
        public Long getTotalRecords() {
            return this.totalRecords;
        }

    }

}
