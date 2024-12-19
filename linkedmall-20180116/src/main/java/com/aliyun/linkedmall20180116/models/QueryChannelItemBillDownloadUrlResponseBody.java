// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryChannelItemBillDownloadUrlResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
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
     * <p>The TenantId or BillPeriod is mandatory for this action.</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public QueryChannelItemBillDownloadUrlResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>5127621C-****-5DCA-9745-2936B31DFD12</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>BILL-10000014****3410148</p>
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
