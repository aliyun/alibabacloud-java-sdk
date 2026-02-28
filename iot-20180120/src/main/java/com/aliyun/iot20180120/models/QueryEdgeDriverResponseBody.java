// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeDriverResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryEdgeDriverResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryEdgeDriverResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeDriverResponseBody self = new QueryEdgeDriverResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEdgeDriverResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEdgeDriverResponseBody setData(QueryEdgeDriverResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryEdgeDriverResponseBodyData getData() {
        return this.data;
    }

    public QueryEdgeDriverResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryEdgeDriverResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEdgeDriverResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryEdgeDriverResponseBodyDataDriverList extends TeaModel {
        @NameInMap("CpuArch")
        public String cpuArch;

        @NameInMap("DriverId")
        public String driverId;

        @NameInMap("DriverName")
        public String driverName;

        @NameInMap("DriverProtocol")
        public String driverProtocol;

        @NameInMap("GmtCreateTimestamp")
        public Long gmtCreateTimestamp;

        @NameInMap("GmtModifiedTimestamp")
        public Long gmtModifiedTimestamp;

        @NameInMap("IsApply")
        public Boolean isApply;

        @NameInMap("IsBuiltIn")
        public Boolean isBuiltIn;

        @NameInMap("Runtime")
        public String runtime;

        @NameInMap("Type")
        public Integer type;

        public static QueryEdgeDriverResponseBodyDataDriverList build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeDriverResponseBodyDataDriverList self = new QueryEdgeDriverResponseBodyDataDriverList();
            return TeaModel.build(map, self);
        }

        public QueryEdgeDriverResponseBodyDataDriverList setCpuArch(String cpuArch) {
            this.cpuArch = cpuArch;
            return this;
        }
        public String getCpuArch() {
            return this.cpuArch;
        }

        public QueryEdgeDriverResponseBodyDataDriverList setDriverId(String driverId) {
            this.driverId = driverId;
            return this;
        }
        public String getDriverId() {
            return this.driverId;
        }

        public QueryEdgeDriverResponseBodyDataDriverList setDriverName(String driverName) {
            this.driverName = driverName;
            return this;
        }
        public String getDriverName() {
            return this.driverName;
        }

        public QueryEdgeDriverResponseBodyDataDriverList setDriverProtocol(String driverProtocol) {
            this.driverProtocol = driverProtocol;
            return this;
        }
        public String getDriverProtocol() {
            return this.driverProtocol;
        }

        public QueryEdgeDriverResponseBodyDataDriverList setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public QueryEdgeDriverResponseBodyDataDriverList setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
            this.gmtModifiedTimestamp = gmtModifiedTimestamp;
            return this;
        }
        public Long getGmtModifiedTimestamp() {
            return this.gmtModifiedTimestamp;
        }

        public QueryEdgeDriverResponseBodyDataDriverList setIsApply(Boolean isApply) {
            this.isApply = isApply;
            return this;
        }
        public Boolean getIsApply() {
            return this.isApply;
        }

        public QueryEdgeDriverResponseBodyDataDriverList setIsBuiltIn(Boolean isBuiltIn) {
            this.isBuiltIn = isBuiltIn;
            return this;
        }
        public Boolean getIsBuiltIn() {
            return this.isBuiltIn;
        }

        public QueryEdgeDriverResponseBodyDataDriverList setRuntime(String runtime) {
            this.runtime = runtime;
            return this;
        }
        public String getRuntime() {
            return this.runtime;
        }

        public QueryEdgeDriverResponseBodyDataDriverList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class QueryEdgeDriverResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("DriverList")
        public java.util.List<QueryEdgeDriverResponseBodyDataDriverList> driverList;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static QueryEdgeDriverResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeDriverResponseBodyData self = new QueryEdgeDriverResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryEdgeDriverResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryEdgeDriverResponseBodyData setDriverList(java.util.List<QueryEdgeDriverResponseBodyDataDriverList> driverList) {
            this.driverList = driverList;
            return this;
        }
        public java.util.List<QueryEdgeDriverResponseBodyDataDriverList> getDriverList() {
            return this.driverList;
        }

        public QueryEdgeDriverResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryEdgeDriverResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
