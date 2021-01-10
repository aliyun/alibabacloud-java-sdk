// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceDeviceByDriverResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public QueryEdgeInstanceDeviceByDriverResponseBodyData data;

    public static QueryEdgeInstanceDeviceByDriverResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeInstanceDeviceByDriverResponseBody self = new QueryEdgeInstanceDeviceByDriverResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEdgeInstanceDeviceByDriverResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEdgeInstanceDeviceByDriverResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryEdgeInstanceDeviceByDriverResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEdgeInstanceDeviceByDriverResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryEdgeInstanceDeviceByDriverResponseBody setData(QueryEdgeInstanceDeviceByDriverResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryEdgeInstanceDeviceByDriverResponseBodyData getData() {
        return this.data;
    }

    public static class QueryEdgeInstanceDeviceByDriverResponseBodyDataDeviceList extends TeaModel {
        @NameInMap("IotId")
        public String iotId;

        public static QueryEdgeInstanceDeviceByDriverResponseBodyDataDeviceList build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceDeviceByDriverResponseBodyDataDeviceList self = new QueryEdgeInstanceDeviceByDriverResponseBodyDataDeviceList();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceDeviceByDriverResponseBodyDataDeviceList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

    public static class QueryEdgeInstanceDeviceByDriverResponseBodyData extends TeaModel {
        @NameInMap("Total")
        public Integer total;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("DeviceList")
        public java.util.List<QueryEdgeInstanceDeviceByDriverResponseBodyDataDeviceList> deviceList;

        public static QueryEdgeInstanceDeviceByDriverResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceDeviceByDriverResponseBodyData self = new QueryEdgeInstanceDeviceByDriverResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceDeviceByDriverResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryEdgeInstanceDeviceByDriverResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryEdgeInstanceDeviceByDriverResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryEdgeInstanceDeviceByDriverResponseBodyData setDeviceList(java.util.List<QueryEdgeInstanceDeviceByDriverResponseBodyDataDeviceList> deviceList) {
            this.deviceList = deviceList;
            return this;
        }
        public java.util.List<QueryEdgeInstanceDeviceByDriverResponseBodyDataDeviceList> getDeviceList() {
            return this.deviceList;
        }

    }

}
