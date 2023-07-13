// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryProjectShareDeviceListResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The result of the request.</p>
     */
    @NameInMap("Data")
    public QueryProjectShareDeviceListResponseBodyData data;

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

    public static QueryProjectShareDeviceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryProjectShareDeviceListResponseBody self = new QueryProjectShareDeviceListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryProjectShareDeviceListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryProjectShareDeviceListResponseBody setData(QueryProjectShareDeviceListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryProjectShareDeviceListResponseBodyData getData() {
        return this.data;
    }

    public QueryProjectShareDeviceListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryProjectShareDeviceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryProjectShareDeviceListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryProjectShareDeviceListResponseBodyDataDeviceListItems extends TeaModel {
        /**
         * <p>The DeviceName of the device.</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

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

        /**
         * <p>Indicates whether the project was shared to the device.</p>
         * <br>
         * <p>*   **1**: The project was shared.</p>
         * <p>*   **0**: The project failed to be shared.</p>
         */
        @NameInMap("Sharable")
        public Long sharable;

        public static QueryProjectShareDeviceListResponseBodyDataDeviceListItems build(java.util.Map<String, ?> map) throws Exception {
            QueryProjectShareDeviceListResponseBodyDataDeviceListItems self = new QueryProjectShareDeviceListResponseBodyDataDeviceListItems();
            return TeaModel.build(map, self);
        }

        public QueryProjectShareDeviceListResponseBodyDataDeviceListItems setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryProjectShareDeviceListResponseBodyDataDeviceListItems setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryProjectShareDeviceListResponseBodyDataDeviceListItems setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryProjectShareDeviceListResponseBodyDataDeviceListItems setSharable(Long sharable) {
            this.sharable = sharable;
            return this;
        }
        public Long getSharable() {
            return this.sharable;
        }

    }

    public static class QueryProjectShareDeviceListResponseBodyDataDeviceList extends TeaModel {
        @NameInMap("items")
        public java.util.List<QueryProjectShareDeviceListResponseBodyDataDeviceListItems> items;

        public static QueryProjectShareDeviceListResponseBodyDataDeviceList build(java.util.Map<String, ?> map) throws Exception {
            QueryProjectShareDeviceListResponseBodyDataDeviceList self = new QueryProjectShareDeviceListResponseBodyDataDeviceList();
            return TeaModel.build(map, self);
        }

        public QueryProjectShareDeviceListResponseBodyDataDeviceList setItems(java.util.List<QueryProjectShareDeviceListResponseBodyDataDeviceListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QueryProjectShareDeviceListResponseBodyDataDeviceListItems> getItems() {
            return this.items;
        }

    }

    public static class QueryProjectShareDeviceListResponseBodyData extends TeaModel {
        /**
         * <p>The information about devices that you queried.</p>
         */
        @NameInMap("DeviceList")
        public QueryProjectShareDeviceListResponseBodyDataDeviceList deviceList;

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

        public static QueryProjectShareDeviceListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryProjectShareDeviceListResponseBodyData self = new QueryProjectShareDeviceListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryProjectShareDeviceListResponseBodyData setDeviceList(QueryProjectShareDeviceListResponseBodyDataDeviceList deviceList) {
            this.deviceList = deviceList;
            return this;
        }
        public QueryProjectShareDeviceListResponseBodyDataDeviceList getDeviceList() {
            return this.deviceList;
        }

        public QueryProjectShareDeviceListResponseBodyData setPageId(Integer pageId) {
            this.pageId = pageId;
            return this;
        }
        public Integer getPageId() {
            return this.pageId;
        }

        public QueryProjectShareDeviceListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryProjectShareDeviceListResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
