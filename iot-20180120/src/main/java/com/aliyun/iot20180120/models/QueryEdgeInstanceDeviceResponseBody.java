// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryEdgeInstanceDeviceResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryEdgeInstanceDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeInstanceDeviceResponseBody self = new QueryEdgeInstanceDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEdgeInstanceDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEdgeInstanceDeviceResponseBody setData(QueryEdgeInstanceDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryEdgeInstanceDeviceResponseBodyData getData() {
        return this.data;
    }

    public QueryEdgeInstanceDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryEdgeInstanceDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEdgeInstanceDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryEdgeInstanceDeviceResponseBodyDataDeviceList extends TeaModel {
        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DriverId")
        public String driverId;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("ProductKey")
        public String productKey;

        public static QueryEdgeInstanceDeviceResponseBodyDataDeviceList build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceDeviceResponseBodyDataDeviceList self = new QueryEdgeInstanceDeviceResponseBodyDataDeviceList();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceDeviceResponseBodyDataDeviceList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryEdgeInstanceDeviceResponseBodyDataDeviceList setDriverId(String driverId) {
            this.driverId = driverId;
            return this;
        }
        public String getDriverId() {
            return this.driverId;
        }

        public QueryEdgeInstanceDeviceResponseBodyDataDeviceList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryEdgeInstanceDeviceResponseBodyDataDeviceList setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

    }

    public static class QueryEdgeInstanceDeviceResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("DeviceList")
        public java.util.List<QueryEdgeInstanceDeviceResponseBodyDataDeviceList> deviceList;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static QueryEdgeInstanceDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceDeviceResponseBodyData self = new QueryEdgeInstanceDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceDeviceResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryEdgeInstanceDeviceResponseBodyData setDeviceList(java.util.List<QueryEdgeInstanceDeviceResponseBodyDataDeviceList> deviceList) {
            this.deviceList = deviceList;
            return this;
        }
        public java.util.List<QueryEdgeInstanceDeviceResponseBodyDataDeviceList> getDeviceList() {
            return this.deviceList;
        }

        public QueryEdgeInstanceDeviceResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryEdgeInstanceDeviceResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
