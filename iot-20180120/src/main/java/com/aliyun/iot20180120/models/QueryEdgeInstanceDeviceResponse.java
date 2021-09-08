// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceDeviceResponse extends TeaModel {
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
    public QueryEdgeInstanceDeviceResponseData data;

    public static QueryEdgeInstanceDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeInstanceDeviceResponse self = new QueryEdgeInstanceDeviceResponse();
        return TeaModel.build(map, self);
    }

    public QueryEdgeInstanceDeviceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEdgeInstanceDeviceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryEdgeInstanceDeviceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEdgeInstanceDeviceResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryEdgeInstanceDeviceResponse setData(QueryEdgeInstanceDeviceResponseData data) {
        this.data = data;
        return this;
    }
    public QueryEdgeInstanceDeviceResponseData getData() {
        return this.data;
    }

    public static class QueryEdgeInstanceDeviceResponseDataDeviceList extends TeaModel {
        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        @NameInMap("ProductKey")
        @Validation(required = true)
        public String productKey;

        @NameInMap("DeviceName")
        @Validation(required = true)
        public String deviceName;

        @NameInMap("DriverId")
        @Validation(required = true)
        public String driverId;

        public static QueryEdgeInstanceDeviceResponseDataDeviceList build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceDeviceResponseDataDeviceList self = new QueryEdgeInstanceDeviceResponseDataDeviceList();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceDeviceResponseDataDeviceList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryEdgeInstanceDeviceResponseDataDeviceList setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryEdgeInstanceDeviceResponseDataDeviceList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryEdgeInstanceDeviceResponseDataDeviceList setDriverId(String driverId) {
            this.driverId = driverId;
            return this;
        }
        public String getDriverId() {
            return this.driverId;
        }

    }

    public static class QueryEdgeInstanceDeviceResponseData extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("CurrentPage")
        @Validation(required = true)
        public Integer currentPage;

        @NameInMap("DeviceList")
        @Validation(required = true)
        public java.util.List<QueryEdgeInstanceDeviceResponseDataDeviceList> deviceList;

        public static QueryEdgeInstanceDeviceResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceDeviceResponseData self = new QueryEdgeInstanceDeviceResponseData();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceDeviceResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryEdgeInstanceDeviceResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryEdgeInstanceDeviceResponseData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryEdgeInstanceDeviceResponseData setDeviceList(java.util.List<QueryEdgeInstanceDeviceResponseDataDeviceList> deviceList) {
            this.deviceList = deviceList;
            return this;
        }
        public java.util.List<QueryEdgeInstanceDeviceResponseDataDeviceList> getDeviceList() {
            return this.deviceList;
        }

    }

}
