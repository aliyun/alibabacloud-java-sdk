// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryChannelItemBillDownloadUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public QueryChannelItemBillDownloadUrlResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryChannelItemBillDownloadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryChannelItemBillDownloadUrlResponseBody self = new QueryChannelItemBillDownloadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryChannelItemBillDownloadUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryChannelItemBillDownloadUrlResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryChannelItemBillDownloadUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryChannelItemBillDownloadUrlResponseBody setModel(QueryChannelItemBillDownloadUrlResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryChannelItemBillDownloadUrlResponseBodyModel getModel() {
        return this.model;
    }

    public QueryChannelItemBillDownloadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryChannelItemBillDownloadUrlResponseBodyModelData extends TeaModel {
        @NameInMap("BillId")
        public String billId;

        @NameInMap("FileDownloadUrl")
        public String fileDownloadUrl;

        @NameInMap("Message")
        public String message;

        public static QueryChannelItemBillDownloadUrlResponseBodyModelData build(java.util.Map<String, ?> map) throws Exception {
            QueryChannelItemBillDownloadUrlResponseBodyModelData self = new QueryChannelItemBillDownloadUrlResponseBodyModelData();
            return TeaModel.build(map, self);
        }

        public QueryChannelItemBillDownloadUrlResponseBodyModelData setBillId(String billId) {
            this.billId = billId;
            return this;
        }
        public String getBillId() {
            return this.billId;
        }

        public QueryChannelItemBillDownloadUrlResponseBodyModelData setFileDownloadUrl(String fileDownloadUrl) {
            this.fileDownloadUrl = fileDownloadUrl;
            return this;
        }
        public String getFileDownloadUrl() {
            return this.fileDownloadUrl;
        }

        public QueryChannelItemBillDownloadUrlResponseBodyModelData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class QueryChannelItemBillDownloadUrlResponseBodyModel extends TeaModel {
        @NameInMap("Data")
        public java.util.List<QueryChannelItemBillDownloadUrlResponseBodyModelData> data;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static QueryChannelItemBillDownloadUrlResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryChannelItemBillDownloadUrlResponseBodyModel self = new QueryChannelItemBillDownloadUrlResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryChannelItemBillDownloadUrlResponseBodyModel setData(java.util.List<QueryChannelItemBillDownloadUrlResponseBodyModelData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryChannelItemBillDownloadUrlResponseBodyModelData> getData() {
            return this.data;
        }

        public QueryChannelItemBillDownloadUrlResponseBodyModel setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public QueryChannelItemBillDownloadUrlResponseBodyModel setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryChannelItemBillDownloadUrlResponseBodyModel setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
