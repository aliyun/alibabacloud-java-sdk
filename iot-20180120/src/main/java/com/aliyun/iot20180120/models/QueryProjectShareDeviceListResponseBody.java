// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryProjectShareDeviceListResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
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
     * 
     * <strong>example:</strong>
     * <p>An internal error occurred. Try again later.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>671D0F8F-FDC7-4B12-93FA-336C079C965A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The ID of the device. The ID is the unique identifier that is issued by IoT Platform to the device.</p>
         * 
         * <strong>example:</strong>
         * <p>Q7uOhVRdZRRlDnTLv****00100</p>
         */
        @NameInMap("IotId")
        public String iotId;

        /**
         * <p>The <strong>ProductKey</strong> of the product to which the device belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>a1BwAGV****</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        /**
         * <p>Indicates whether the project was shared to the device.</p>
         * <ul>
         * <li><strong>1</strong>: The project was shared.</li>
         * <li><strong>0</strong>: The project failed to be shared.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageId")
        public Integer pageId;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
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
