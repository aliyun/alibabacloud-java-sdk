// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetDocumentPageResponseBody extends TeaModel {
    /**
     * <p>Interface response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Response data.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetDocumentPageResponseBodyData> data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Prompt message for the response result.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Pagination information.</p>
     */
    @NameInMap("PageInfo")
    public GetDocumentPageResponseBodyPageInfo pageInfo;

    /**
     * <p>Request ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>04DAD7B4-E1DA-5C2C-8E5C-A1EDC880CF60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. - <strong>true</strong>: The call was successful. - <strong>false</strong>: The call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDocumentPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentPageResponseBody self = new GetDocumentPageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDocumentPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDocumentPageResponseBody setData(java.util.List<GetDocumentPageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDocumentPageResponseBodyData> getData() {
        return this.data;
    }

    public GetDocumentPageResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDocumentPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDocumentPageResponseBody setPageInfo(GetDocumentPageResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public GetDocumentPageResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public GetDocumentPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDocumentPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDocumentPageResponseBodyData extends TeaModel {
        /**
         * <p>Delivered by.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("DeliveredBy")
        public String deliveredBy;

        /**
         * <p>Report name.</p>
         * 
         * <strong>example:</strong>
         * <p>季度报告</p>
         */
        @NameInMap("DocumentName")
        public String documentName;

        /**
         * <p>Service report type.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DocumentType")
        public String documentType;

        /**
         * <p>Document primary key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>346409</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("ReportStatus")
        public String reportStatus;

        /**
         * <p>Report generation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-21 17:26:34</p>
         */
        @NameInMap("UploadTime")
        public String uploadTime;

        public static GetDocumentPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDocumentPageResponseBodyData self = new GetDocumentPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDocumentPageResponseBodyData setDeliveredBy(String deliveredBy) {
            this.deliveredBy = deliveredBy;
            return this;
        }
        public String getDeliveredBy() {
            return this.deliveredBy;
        }

        public GetDocumentPageResponseBodyData setDocumentName(String documentName) {
            this.documentName = documentName;
            return this;
        }
        public String getDocumentName() {
            return this.documentName;
        }

        public GetDocumentPageResponseBodyData setDocumentType(String documentType) {
            this.documentType = documentType;
            return this;
        }
        public String getDocumentType() {
            return this.documentType;
        }

        public GetDocumentPageResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDocumentPageResponseBodyData setReportStatus(String reportStatus) {
            this.reportStatus = reportStatus;
            return this;
        }
        public String getReportStatus() {
            return this.reportStatus;
        }

        public GetDocumentPageResponseBodyData setUploadTime(String uploadTime) {
            this.uploadTime = uploadTime;
            return this;
        }
        public String getUploadTime() {
            return this.uploadTime;
        }

    }

    public static class GetDocumentPageResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The current page number in pagination queries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of data items displayed per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of data items found.</p>
         * 
         * <strong>example:</strong>
         * <p>3149</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static GetDocumentPageResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetDocumentPageResponseBodyPageInfo self = new GetDocumentPageResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public GetDocumentPageResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public GetDocumentPageResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetDocumentPageResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
