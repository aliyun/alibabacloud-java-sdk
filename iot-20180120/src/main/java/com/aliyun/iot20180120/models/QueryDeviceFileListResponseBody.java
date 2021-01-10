// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceFileListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageCount")
    public Integer pageCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("Data")
    public QueryDeviceFileListResponseBodyData data;

    public static QueryDeviceFileListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceFileListResponseBody self = new QueryDeviceFileListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceFileListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceFileListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceFileListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceFileListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceFileListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryDeviceFileListResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public QueryDeviceFileListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDeviceFileListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public QueryDeviceFileListResponseBody setData(QueryDeviceFileListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceFileListResponseBodyData getData() {
        return this.data;
    }

    public static class QueryDeviceFileListResponseBodyDataFileSummary extends TeaModel {
        @NameInMap("FileId")
        public String fileId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Size")
        public String size;

        @NameInMap("UtcCreatedOn")
        public String utcCreatedOn;

        public static QueryDeviceFileListResponseBodyDataFileSummary build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceFileListResponseBodyDataFileSummary self = new QueryDeviceFileListResponseBodyDataFileSummary();
            return TeaModel.build(map, self);
        }

        public QueryDeviceFileListResponseBodyDataFileSummary setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public QueryDeviceFileListResponseBodyDataFileSummary setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryDeviceFileListResponseBodyDataFileSummary setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public QueryDeviceFileListResponseBodyDataFileSummary setUtcCreatedOn(String utcCreatedOn) {
            this.utcCreatedOn = utcCreatedOn;
            return this;
        }
        public String getUtcCreatedOn() {
            return this.utcCreatedOn;
        }

    }

    public static class QueryDeviceFileListResponseBodyData extends TeaModel {
        @NameInMap("FileSummary")
        public java.util.List<QueryDeviceFileListResponseBodyDataFileSummary> fileSummary;

        public static QueryDeviceFileListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceFileListResponseBodyData self = new QueryDeviceFileListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceFileListResponseBodyData setFileSummary(java.util.List<QueryDeviceFileListResponseBodyDataFileSummary> fileSummary) {
            this.fileSummary = fileSummary;
            return this;
        }
        public java.util.List<QueryDeviceFileListResponseBodyDataFileSummary> getFileSummary() {
            return this.fileSummary;
        }

    }

}
