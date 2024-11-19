// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceDeviceResponseBody extends TeaModel {
    /**
     * <p>The return code of the operation. A value of Success indicates that the call was successful. Other values indicate that specific errors occurred. For more information, see <a href="https://help.aliyun.com/document_detail/135200.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data that is returned if the call was successful.</p>
     */
    @NameInMap("Data")
    public QueryEdgeInstanceDeviceResponseBodyData data;

    /**
     * <p>The error message that is returned if the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>request parameter error</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>AC76932E-E0C9-41EE-843D-B1CA3279B053</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. A value of true indicates that the call was successful. A value of false indicates that the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The name of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>test_tmp_zdy</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The ID of the driver.</p>
         * 
         * <strong>example:</strong>
         * <p>44c090ba7b104641a4b9bcf10241****</p>
         */
        @NameInMap("DriverId")
        public String driverId;

        /**
         * <p>The ID of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>XSpPdtxzE6ebtCkx****000101</p>
         */
        @NameInMap("IotId")
        public String iotId;

        /**
         * <p>The key that uniquely identifies the product to which the device belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>a1p5QfE****</p>
         */
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
        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The list of device information.</p>
         */
        @NameInMap("DeviceList")
        public java.util.List<QueryEdgeInstanceDeviceResponseBodyDataDeviceList> deviceList;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The number of devices.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
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
