// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceFileListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("CurrentPage")
    @Validation(required = true)
    public Integer currentPage;

    @NameInMap("PageCount")
    @Validation(required = true)
    public Integer pageCount;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryDeviceFileListResponseData data;

    public static QueryDeviceFileListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceFileListResponse self = new QueryDeviceFileListResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceFileListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceFileListResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceFileListResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceFileListResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceFileListResponse setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryDeviceFileListResponse setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public QueryDeviceFileListResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDeviceFileListResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public QueryDeviceFileListResponse setData(QueryDeviceFileListResponseData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceFileListResponseData getData() {
        return this.data;
    }

    public static class QueryDeviceFileListResponseDataFileSummary extends TeaModel {
        @NameInMap("FileId")
        @Validation(required = true)
        public String fileId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Size")
        @Validation(required = true)
        public String size;

        @NameInMap("UtcCreatedOn")
        @Validation(required = true)
        public String utcCreatedOn;

        public static QueryDeviceFileListResponseDataFileSummary build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceFileListResponseDataFileSummary self = new QueryDeviceFileListResponseDataFileSummary();
            return TeaModel.build(map, self);
        }

        public QueryDeviceFileListResponseDataFileSummary setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public QueryDeviceFileListResponseDataFileSummary setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryDeviceFileListResponseDataFileSummary setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public QueryDeviceFileListResponseDataFileSummary setUtcCreatedOn(String utcCreatedOn) {
            this.utcCreatedOn = utcCreatedOn;
            return this;
        }
        public String getUtcCreatedOn() {
            return this.utcCreatedOn;
        }

    }

    public static class QueryDeviceFileListResponseData extends TeaModel {
        @NameInMap("FileSummary")
        @Validation(required = true)
        public java.util.List<QueryDeviceFileListResponseDataFileSummary> fileSummary;

        public static QueryDeviceFileListResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceFileListResponseData self = new QueryDeviceFileListResponseData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceFileListResponseData setFileSummary(java.util.List<QueryDeviceFileListResponseDataFileSummary> fileSummary) {
            this.fileSummary = fileSummary;
            return this;
        }
        public java.util.List<QueryDeviceFileListResponseDataFileSummary> getFileSummary() {
            return this.fileSummary;
        }

    }

}
