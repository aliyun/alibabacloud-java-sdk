// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceDriverResponse extends TeaModel {
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

    @NameInMap("Data")
    @Validation(required = true)
    public QueryEdgeInstanceDriverResponseData data;

    public static QueryEdgeInstanceDriverResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeInstanceDriverResponse self = new QueryEdgeInstanceDriverResponse();
        return TeaModel.build(map, self);
    }

    public QueryEdgeInstanceDriverResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEdgeInstanceDriverResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryEdgeInstanceDriverResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEdgeInstanceDriverResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryEdgeInstanceDriverResponse setData(QueryEdgeInstanceDriverResponseData data) {
        this.data = data;
        return this;
    }
    public QueryEdgeInstanceDriverResponseData getData() {
        return this.data;
    }

    public static class QueryEdgeInstanceDriverResponseDataDriverList extends TeaModel {
        @NameInMap("DriverId")
        @Validation(required = true)
        public String driverId;

        @NameInMap("DriverVersion")
        @Validation(required = true)
        public String driverVersion;

        @NameInMap("OrderId")
        @Validation(required = true)
        public String orderId;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public String gmtCreate;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public String gmtModified;

        public static QueryEdgeInstanceDriverResponseDataDriverList build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceDriverResponseDataDriverList self = new QueryEdgeInstanceDriverResponseDataDriverList();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceDriverResponseDataDriverList setDriverId(String driverId) {
            this.driverId = driverId;
            return this;
        }
        public String getDriverId() {
            return this.driverId;
        }

        public QueryEdgeInstanceDriverResponseDataDriverList setDriverVersion(String driverVersion) {
            this.driverVersion = driverVersion;
            return this;
        }
        public String getDriverVersion() {
            return this.driverVersion;
        }

        public QueryEdgeInstanceDriverResponseDataDriverList setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QueryEdgeInstanceDriverResponseDataDriverList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryEdgeInstanceDriverResponseDataDriverList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

    }

    public static class QueryEdgeInstanceDriverResponseData extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("CurrentPage")
        @Validation(required = true)
        public Integer currentPage;

        @NameInMap("DriverList")
        @Validation(required = true)
        public java.util.List<QueryEdgeInstanceDriverResponseDataDriverList> driverList;

        public static QueryEdgeInstanceDriverResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceDriverResponseData self = new QueryEdgeInstanceDriverResponseData();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceDriverResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryEdgeInstanceDriverResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryEdgeInstanceDriverResponseData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryEdgeInstanceDriverResponseData setDriverList(java.util.List<QueryEdgeInstanceDriverResponseDataDriverList> driverList) {
            this.driverList = driverList;
            return this;
        }
        public java.util.List<QueryEdgeInstanceDriverResponseDataDriverList> getDriverList() {
            return this.driverList;
        }

    }

}
