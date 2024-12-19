// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QuerySupplierItemBillDownloadUrlResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LogsId")
    public String logsId;

    /**
     * <strong>example:</strong>
     * <p>The  BillPeriod is mandatory for this action.</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public QuerySupplierItemBillDownloadUrlResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>3B55509D-20AC-5BD5-9A81-D6B7382E****</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>BILL-1000*****00139120150</p>
         */
        @NameInMap("BillId")
        public String billId;

        /**
         * <strong>example:</strong>
         * <p><a href="http://linkedmall-product.oss-cn-hangzhou.aliyuncs.com/LMALL2*****60001/2619709162">http://linkedmall-product.oss-cn-hangzhou.aliyuncs.com/LMALL2*****60001/2619709162</a>****</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>685</p>
         */
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
