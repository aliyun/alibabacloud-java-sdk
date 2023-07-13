// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySpeechLicenseDeviceListResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The result of the request.</p>
     */
    @NameInMap("Data")
    public QuerySpeechLicenseDeviceListResponseBodyData data;

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

    public static QuerySpeechLicenseDeviceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySpeechLicenseDeviceListResponseBody self = new QuerySpeechLicenseDeviceListResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySpeechLicenseDeviceListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySpeechLicenseDeviceListResponseBody setData(QuerySpeechLicenseDeviceListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySpeechLicenseDeviceListResponseBodyData getData() {
        return this.data;
    }

    public QuerySpeechLicenseDeviceListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySpeechLicenseDeviceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySpeechLicenseDeviceListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySpeechLicenseDeviceListResponseBodyDataDeviceListItem extends TeaModel {
        /**
         * <p>The DeviceName of the device.</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The status of the device.</p>
         * <br>
         * <p>*   **ONLINE**: The device is online.</p>
         * <p>*   **OFFLINE**: The device is offline.</p>
         * <p>*   **UNACTIVE**: The device is not activated.</p>
         * <p>*   **DISABLE**: The device is disabled.</p>
         * <p>*   **DELETE**: The device is deleted.</p>
         */
        @NameInMap("DeviceStatus")
        public String deviceStatus;

        /**
         * <p>The expiration time of the license.</p>
         */
        @NameInMap("ExpiryTime")
        public Long expiryTime;

        /**
         * <p>Indicates whether the device belongs to the specified device group.</p>
         */
        @NameInMap("InSpecifiedGroup")
        public Boolean inSpecifiedGroup;

        /**
         * <p>The ID of the device. The ID is the unique identifier that is issued by IoT Platform to the device.</p>
         */
        @NameInMap("IotId")
        public String iotId;

        /**
         * <p>The license status.</p>
         * <br>
         * <p>*   **NORMAL**: The license is valid.</p>
         * <p>*   **EXPIRE**: The license is expired.</p>
         * <p>*   **EXPIRING**: The license is about to expire.</p>
         */
        @NameInMap("LicenseStatus")
        public String licenseStatus;

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

        public static QuerySpeechLicenseDeviceListResponseBodyDataDeviceListItem build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechLicenseDeviceListResponseBodyDataDeviceListItem self = new QuerySpeechLicenseDeviceListResponseBodyDataDeviceListItem();
            return TeaModel.build(map, self);
        }

        public QuerySpeechLicenseDeviceListResponseBodyDataDeviceListItem setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QuerySpeechLicenseDeviceListResponseBodyDataDeviceListItem setDeviceStatus(String deviceStatus) {
            this.deviceStatus = deviceStatus;
            return this;
        }
        public String getDeviceStatus() {
            return this.deviceStatus;
        }

        public QuerySpeechLicenseDeviceListResponseBodyDataDeviceListItem setExpiryTime(Long expiryTime) {
            this.expiryTime = expiryTime;
            return this;
        }
        public Long getExpiryTime() {
            return this.expiryTime;
        }

        public QuerySpeechLicenseDeviceListResponseBodyDataDeviceListItem setInSpecifiedGroup(Boolean inSpecifiedGroup) {
            this.inSpecifiedGroup = inSpecifiedGroup;
            return this;
        }
        public Boolean getInSpecifiedGroup() {
            return this.inSpecifiedGroup;
        }

        public QuerySpeechLicenseDeviceListResponseBodyDataDeviceListItem setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QuerySpeechLicenseDeviceListResponseBodyDataDeviceListItem setLicenseStatus(String licenseStatus) {
            this.licenseStatus = licenseStatus;
            return this;
        }
        public String getLicenseStatus() {
            return this.licenseStatus;
        }

        public QuerySpeechLicenseDeviceListResponseBodyDataDeviceListItem setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QuerySpeechLicenseDeviceListResponseBodyDataDeviceListItem setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

    }

    public static class QuerySpeechLicenseDeviceListResponseBodyDataDeviceList extends TeaModel {
        @NameInMap("item")
        public java.util.List<QuerySpeechLicenseDeviceListResponseBodyDataDeviceListItem> item;

        public static QuerySpeechLicenseDeviceListResponseBodyDataDeviceList build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechLicenseDeviceListResponseBodyDataDeviceList self = new QuerySpeechLicenseDeviceListResponseBodyDataDeviceList();
            return TeaModel.build(map, self);
        }

        public QuerySpeechLicenseDeviceListResponseBodyDataDeviceList setItem(java.util.List<QuerySpeechLicenseDeviceListResponseBodyDataDeviceListItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<QuerySpeechLicenseDeviceListResponseBodyDataDeviceListItem> getItem() {
            return this.item;
        }

    }

    public static class QuerySpeechLicenseDeviceListResponseBodyData extends TeaModel {
        /**
         * <p>The information about devices.</p>
         */
        @NameInMap("DeviceList")
        public QuerySpeechLicenseDeviceListResponseBodyDataDeviceList deviceList;

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

        public static QuerySpeechLicenseDeviceListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechLicenseDeviceListResponseBodyData self = new QuerySpeechLicenseDeviceListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySpeechLicenseDeviceListResponseBodyData setDeviceList(QuerySpeechLicenseDeviceListResponseBodyDataDeviceList deviceList) {
            this.deviceList = deviceList;
            return this;
        }
        public QuerySpeechLicenseDeviceListResponseBodyDataDeviceList getDeviceList() {
            return this.deviceList;
        }

        public QuerySpeechLicenseDeviceListResponseBodyData setPageId(Integer pageId) {
            this.pageId = pageId;
            return this;
        }
        public Integer getPageId() {
            return this.pageId;
        }

        public QuerySpeechLicenseDeviceListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QuerySpeechLicenseDeviceListResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
