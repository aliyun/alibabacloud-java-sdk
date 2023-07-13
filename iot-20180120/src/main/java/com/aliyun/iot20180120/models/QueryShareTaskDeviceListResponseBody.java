// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryShareTaskDeviceListResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The result of the request.</p>
     */
    @NameInMap("Data")
    public QueryShareTaskDeviceListResponseBodyData data;

    /**
     * <p>The error message returned if the request fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryShareTaskDeviceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryShareTaskDeviceListResponseBody self = new QueryShareTaskDeviceListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryShareTaskDeviceListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryShareTaskDeviceListResponseBody setData(QueryShareTaskDeviceListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryShareTaskDeviceListResponseBodyData getData() {
        return this.data;
    }

    public QueryShareTaskDeviceListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryShareTaskDeviceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryShareTaskDeviceListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryShareTaskDeviceListResponseBodyDataDeviceListItems extends TeaModel {
        /**
         * <p>The DeviceName of the device.</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The time when the device was added to the sharing task.</p>
         */
        @NameInMap("GmtAdded")
        public Long gmtAdded;

        /**
         * <p>The ID of the device. The ID is the unique identifier that is issued by IoT Platform to the device.</p>
         */
        @NameInMap("IotId")
        public String iotId;

        /**
         * <p>The **ProductKey** of the product to which the device belongs.</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        public static QueryShareTaskDeviceListResponseBodyDataDeviceListItems build(java.util.Map<String, ?> map) throws Exception {
            QueryShareTaskDeviceListResponseBodyDataDeviceListItems self = new QueryShareTaskDeviceListResponseBodyDataDeviceListItems();
            return TeaModel.build(map, self);
        }

        public QueryShareTaskDeviceListResponseBodyDataDeviceListItems setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryShareTaskDeviceListResponseBodyDataDeviceListItems setGmtAdded(Long gmtAdded) {
            this.gmtAdded = gmtAdded;
            return this;
        }
        public Long getGmtAdded() {
            return this.gmtAdded;
        }

        public QueryShareTaskDeviceListResponseBodyDataDeviceListItems setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryShareTaskDeviceListResponseBodyDataDeviceListItems setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

    }

    public static class QueryShareTaskDeviceListResponseBodyDataDeviceList extends TeaModel {
        @NameInMap("items")
        public java.util.List<QueryShareTaskDeviceListResponseBodyDataDeviceListItems> items;

        public static QueryShareTaskDeviceListResponseBodyDataDeviceList build(java.util.Map<String, ?> map) throws Exception {
            QueryShareTaskDeviceListResponseBodyDataDeviceList self = new QueryShareTaskDeviceListResponseBodyDataDeviceList();
            return TeaModel.build(map, self);
        }

        public QueryShareTaskDeviceListResponseBodyDataDeviceList setItems(java.util.List<QueryShareTaskDeviceListResponseBodyDataDeviceListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QueryShareTaskDeviceListResponseBodyDataDeviceListItems> getItems() {
            return this.items;
        }

    }

    public static class QueryShareTaskDeviceListResponseBodyData extends TeaModel {
        /**
         * <p>The devices in the sharing task.</p>
         */
        @NameInMap("DeviceList")
        public QueryShareTaskDeviceListResponseBodyDataDeviceList deviceList;

        /**
         * <p>The page number.</p>
         */
        @NameInMap("PageId")
        public Integer pageId;

        /**
         * <p>The number of entries per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static QueryShareTaskDeviceListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryShareTaskDeviceListResponseBodyData self = new QueryShareTaskDeviceListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryShareTaskDeviceListResponseBodyData setDeviceList(QueryShareTaskDeviceListResponseBodyDataDeviceList deviceList) {
            this.deviceList = deviceList;
            return this;
        }
        public QueryShareTaskDeviceListResponseBodyDataDeviceList getDeviceList() {
            return this.deviceList;
        }

        public QueryShareTaskDeviceListResponseBodyData setPageId(Integer pageId) {
            this.pageId = pageId;
            return this;
        }
        public Integer getPageId() {
            return this.pageId;
        }

        public QueryShareTaskDeviceListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryShareTaskDeviceListResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
