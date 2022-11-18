// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryDistributionBillDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public QueryDistributionBillDetailResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMessage")
    public String subMessage;

    @NameInMap("Success")
    public Boolean success;

    public static QueryDistributionBillDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDistributionBillDetailResponseBody self = new QueryDistributionBillDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDistributionBillDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDistributionBillDetailResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryDistributionBillDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryDistributionBillDetailResponseBody setModel(QueryDistributionBillDetailResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryDistributionBillDetailResponseBodyModel getModel() {
        return this.model;
    }

    public QueryDistributionBillDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDistributionBillDetailResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryDistributionBillDetailResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryDistributionBillDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDistributionBillDetailResponseBodyModel extends TeaModel {
        @NameInMap("Data")
        public java.util.List<String> data;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static QueryDistributionBillDetailResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryDistributionBillDetailResponseBodyModel self = new QueryDistributionBillDetailResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryDistributionBillDetailResponseBodyModel setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

        public QueryDistributionBillDetailResponseBodyModel setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public QueryDistributionBillDetailResponseBodyModel setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryDistributionBillDetailResponseBodyModel setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
