// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDynamicGroupDevicesResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The devices returned after the request succeeds. The information is included in the **SimpleDeviceInfo** field.</p>
     */
    @NameInMap("Data")
    public QueryDynamicGroupDevicesResponseBodyData data;

    /**
     * <p>The error message returned if the request fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * <br>
     * <p>If NextToken is empty, no next page exists.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The total number of pages returned.</p>
     */
    @NameInMap("PageCount")
    public Integer pageCount;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

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

    /**
     * <p>The total number of devices.</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static QueryDynamicGroupDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDynamicGroupDevicesResponseBody self = new QueryDynamicGroupDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDynamicGroupDevicesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDynamicGroupDevicesResponseBody setData(QueryDynamicGroupDevicesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDynamicGroupDevicesResponseBodyData getData() {
        return this.data;
    }

    public QueryDynamicGroupDevicesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDynamicGroupDevicesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryDynamicGroupDevicesResponseBody setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public QueryDynamicGroupDevicesResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public QueryDynamicGroupDevicesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDynamicGroupDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDynamicGroupDevicesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDynamicGroupDevicesResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class QueryDynamicGroupDevicesResponseBodyDataSimpleDeviceInfo extends TeaModel {
        /**
         * <p>The time when the device was activated.</p>
         */
        @NameInMap("ActiveTime")
        public String activeTime;

        /**
         * <p>The identifier of the category to which the product belongs.</p>
         * <br>
         * <p>This parameter is returned if the product uses the Thing Specification Language (TSL) model of a standard category that is pre-defined by IoT Platform.</p>
         */
        @NameInMap("CategoryKey")
        public String categoryKey;

        /**
         * <p>The DeviceName of the device.</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The ID of the device. The ID is a unique identifier that is issued by IoT Platform to the device.</p>
         */
        @NameInMap("IotId")
        public String iotId;

        /**
         * <p>The last time when the device went online.</p>
         */
        @NameInMap("LastOnlineTime")
        public String lastOnlineTime;

        /**
         * <p>The alias of the device.</p>
         */
        @NameInMap("Nickname")
        public String nickname;

        /**
         * <p>The node type of the product. Valid values:</p>
         * <br>
         * <p>*   **0**: device. A device can connect to IoT Platform directly, or be attached to a gateway as a sub-device and then connect to IoT Platform. Sub-devices cannot be attached to a device.</p>
         * <p>*   **1**: gateway. Sub-devices can be attached to a gateway. A gateway can manage sub-devices, maintain topological relationships with sub-devices, and synchronize topological relationships to IoT Platform.</p>
         */
        @NameInMap("NodeType")
        public Integer nodeType;

        /**
         * <p>The **ProductKey** of the product to which the device belongs.</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        /**
         * <p>The ProductName of the product to which the device belongs.</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>The device status. Valid values:</p>
         * <br>
         * <p>*   **ONLINE**: The device is online.</p>
         * <p>*   **OFFLINE**: The device is offline.</p>
         * <p>*   **UNACTIVE**: The device is not activated.</p>
         * <p>*   **DISABLE**: The device is deactivated.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the device was activated. The time is in the UTC format.</p>
         */
        @NameInMap("UtcActiveTime")
        public String utcActiveTime;

        /**
         * <p>The last time when the device went online. The time is in the UTC format.</p>
         */
        @NameInMap("UtcLastOnlineTime")
        public String utcLastOnlineTime;

        public static QueryDynamicGroupDevicesResponseBodyDataSimpleDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDynamicGroupDevicesResponseBodyDataSimpleDeviceInfo self = new QueryDynamicGroupDevicesResponseBodyDataSimpleDeviceInfo();
            return TeaModel.build(map, self);
        }

        public QueryDynamicGroupDevicesResponseBodyDataSimpleDeviceInfo setActiveTime(String activeTime) {
            this.activeTime = activeTime;
            return this;
        }
        public String getActiveTime() {
            return this.activeTime;
        }

        public QueryDynamicGroupDevicesResponseBodyDataSimpleDeviceInfo setCategoryKey(String categoryKey) {
            this.categoryKey = categoryKey;
            return this;
        }
        public String getCategoryKey() {
            return this.categoryKey;
        }

        public QueryDynamicGroupDevicesResponseBodyDataSimpleDeviceInfo setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryDynamicGroupDevicesResponseBodyDataSimpleDeviceInfo setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryDynamicGroupDevicesResponseBodyDataSimpleDeviceInfo setLastOnlineTime(String lastOnlineTime) {
            this.lastOnlineTime = lastOnlineTime;
            return this;
        }
        public String getLastOnlineTime() {
            return this.lastOnlineTime;
        }

        public QueryDynamicGroupDevicesResponseBodyDataSimpleDeviceInfo setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public String getNickname() {
            return this.nickname;
        }

        public QueryDynamicGroupDevicesResponseBodyDataSimpleDeviceInfo setNodeType(Integer nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public Integer getNodeType() {
            return this.nodeType;
        }

        public QueryDynamicGroupDevicesResponseBodyDataSimpleDeviceInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryDynamicGroupDevicesResponseBodyDataSimpleDeviceInfo setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QueryDynamicGroupDevicesResponseBodyDataSimpleDeviceInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryDynamicGroupDevicesResponseBodyDataSimpleDeviceInfo setUtcActiveTime(String utcActiveTime) {
            this.utcActiveTime = utcActiveTime;
            return this;
        }
        public String getUtcActiveTime() {
            return this.utcActiveTime;
        }

        public QueryDynamicGroupDevicesResponseBodyDataSimpleDeviceInfo setUtcLastOnlineTime(String utcLastOnlineTime) {
            this.utcLastOnlineTime = utcLastOnlineTime;
            return this;
        }
        public String getUtcLastOnlineTime() {
            return this.utcLastOnlineTime;
        }

    }

    public static class QueryDynamicGroupDevicesResponseBodyData extends TeaModel {
        @NameInMap("SimpleDeviceInfo")
        public java.util.List<QueryDynamicGroupDevicesResponseBodyDataSimpleDeviceInfo> simpleDeviceInfo;

        public static QueryDynamicGroupDevicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDynamicGroupDevicesResponseBodyData self = new QueryDynamicGroupDevicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDynamicGroupDevicesResponseBodyData setSimpleDeviceInfo(java.util.List<QueryDynamicGroupDevicesResponseBodyDataSimpleDeviceInfo> simpleDeviceInfo) {
            this.simpleDeviceInfo = simpleDeviceInfo;
            return this;
        }
        public java.util.List<QueryDynamicGroupDevicesResponseBodyDataSimpleDeviceInfo> getSimpleDeviceInfo() {
            return this.simpleDeviceInfo;
        }

    }

}
