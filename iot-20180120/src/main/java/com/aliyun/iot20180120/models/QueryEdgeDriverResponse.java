// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeDriverResponse extends TeaModel {
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
    public QueryEdgeDriverResponseData data;

    public static QueryEdgeDriverResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeDriverResponse self = new QueryEdgeDriverResponse();
        return TeaModel.build(map, self);
    }

    public QueryEdgeDriverResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEdgeDriverResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryEdgeDriverResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEdgeDriverResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryEdgeDriverResponse setData(QueryEdgeDriverResponseData data) {
        this.data = data;
        return this;
    }
    public QueryEdgeDriverResponseData getData() {
        return this.data;
    }

    public static class QueryEdgeDriverResponseDataDriverList extends TeaModel {
        @NameInMap("DriverId")
        @Validation(required = true)
        public String driverId;

        @NameInMap("DriverName")
        @Validation(required = true)
        public String driverName;

        @NameInMap("DriverProtocol")
        @Validation(required = true)
        public String driverProtocol;

        @NameInMap("Runtime")
        @Validation(required = true)
        public String runtime;

        @NameInMap("CpuArch")
        @Validation(required = true)
        public String cpuArch;

        @NameInMap("Type")
        @Validation(required = true)
        public Integer type;

        @NameInMap("IsBuiltIn")
        @Validation(required = true)
        public Boolean isBuiltIn;

        @NameInMap("GmtCreateTimestamp")
        @Validation(required = true)
        public Long gmtCreateTimestamp;

        @NameInMap("GmtModifiedTimestamp")
        @Validation(required = true)
        public Long gmtModifiedTimestamp;

        public static QueryEdgeDriverResponseDataDriverList build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeDriverResponseDataDriverList self = new QueryEdgeDriverResponseDataDriverList();
            return TeaModel.build(map, self);
        }

        public QueryEdgeDriverResponseDataDriverList setDriverId(String driverId) {
            this.driverId = driverId;
            return this;
        }
        public String getDriverId() {
            return this.driverId;
        }

        public QueryEdgeDriverResponseDataDriverList setDriverName(String driverName) {
            this.driverName = driverName;
            return this;
        }
        public String getDriverName() {
            return this.driverName;
        }

        public QueryEdgeDriverResponseDataDriverList setDriverProtocol(String driverProtocol) {
            this.driverProtocol = driverProtocol;
            return this;
        }
        public String getDriverProtocol() {
            return this.driverProtocol;
        }

        public QueryEdgeDriverResponseDataDriverList setRuntime(String runtime) {
            this.runtime = runtime;
            return this;
        }
        public String getRuntime() {
            return this.runtime;
        }

        public QueryEdgeDriverResponseDataDriverList setCpuArch(String cpuArch) {
            this.cpuArch = cpuArch;
            return this;
        }
        public String getCpuArch() {
            return this.cpuArch;
        }

        public QueryEdgeDriverResponseDataDriverList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public QueryEdgeDriverResponseDataDriverList setIsBuiltIn(Boolean isBuiltIn) {
            this.isBuiltIn = isBuiltIn;
            return this;
        }
        public Boolean getIsBuiltIn() {
            return this.isBuiltIn;
        }

        public QueryEdgeDriverResponseDataDriverList setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public QueryEdgeDriverResponseDataDriverList setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
            this.gmtModifiedTimestamp = gmtModifiedTimestamp;
            return this;
        }
        public Long getGmtModifiedTimestamp() {
            return this.gmtModifiedTimestamp;
        }

    }

    public static class QueryEdgeDriverResponseData extends TeaModel {
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
        public java.util.List<QueryEdgeDriverResponseDataDriverList> driverList;

        public static QueryEdgeDriverResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeDriverResponseData self = new QueryEdgeDriverResponseData();
            return TeaModel.build(map, self);
        }

        public QueryEdgeDriverResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryEdgeDriverResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryEdgeDriverResponseData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryEdgeDriverResponseData setDriverList(java.util.List<QueryEdgeDriverResponseDataDriverList> driverList) {
            this.driverList = driverList;
            return this;
        }
        public java.util.List<QueryEdgeDriverResponseDataDriverList> getDriverList() {
            return this.driverList;
        }

    }

}
