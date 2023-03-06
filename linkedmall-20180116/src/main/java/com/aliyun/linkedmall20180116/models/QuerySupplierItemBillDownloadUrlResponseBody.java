// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QuerySupplierItemBillDownloadUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public QuerySupplierItemBillDownloadUrlResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    public static QuerySupplierItemBillDownloadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySupplierItemBillDownloadUrlResponseBody self = new QuerySupplierItemBillDownloadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySupplierItemBillDownloadUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySupplierItemBillDownloadUrlResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QuerySupplierItemBillDownloadUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySupplierItemBillDownloadUrlResponseBody setModel(QuerySupplierItemBillDownloadUrlResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QuerySupplierItemBillDownloadUrlResponseBodyModel getModel() {
        return this.model;
    }

    public QuerySupplierItemBillDownloadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QuerySupplierItemBillDownloadUrlResponseBodyModelData extends TeaModel {
        @NameInMap("BillId")
        public String billId;

        @NameInMap("FileDownloadUrl")
        public String fileDownloadUrl;

        @NameInMap("Message")
        public String message;

        public static QuerySupplierItemBillDownloadUrlResponseBodyModelData build(java.util.Map<String, ?> map) throws Exception {
            QuerySupplierItemBillDownloadUrlResponseBodyModelData self = new QuerySupplierItemBillDownloadUrlResponseBodyModelData();
            return TeaModel.build(map, self);
        }

        public QuerySupplierItemBillDownloadUrlResponseBodyModelData setBillId(String billId) {
            this.billId = billId;
            return this;
        }
        public String getBillId() {
            return this.billId;
        }

        public QuerySupplierItemBillDownloadUrlResponseBodyModelData setFileDownloadUrl(String fileDownloadUrl) {
            this.fileDownloadUrl = fileDownloadUrl;
            return this;
        }
        public String getFileDownloadUrl() {
            return this.fileDownloadUrl;
        }

        public QuerySupplierItemBillDownloadUrlResponseBodyModelData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class QuerySupplierItemBillDownloadUrlResponseBodyModel extends TeaModel {
        @NameInMap("Data")
        public java.util.List<QuerySupplierItemBillDownloadUrlResponseBodyModelData> data;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static QuerySupplierItemBillDownloadUrlResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QuerySupplierItemBillDownloadUrlResponseBodyModel self = new QuerySupplierItemBillDownloadUrlResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QuerySupplierItemBillDownloadUrlResponseBodyModel setData(java.util.List<QuerySupplierItemBillDownloadUrlResponseBodyModelData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QuerySupplierItemBillDownloadUrlResponseBodyModelData> getData() {
            return this.data;
        }

        public QuerySupplierItemBillDownloadUrlResponseBodyModel setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public QuerySupplierItemBillDownloadUrlResponseBodyModel setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QuerySupplierItemBillDownloadUrlResponseBodyModel setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
