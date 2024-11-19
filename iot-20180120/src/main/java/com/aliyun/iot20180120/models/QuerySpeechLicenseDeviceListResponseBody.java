// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySpeechLicenseDeviceListResponseBody extends TeaModel {
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
    public QuerySpeechLicenseDeviceListResponseBodyData data;

    /**
     * <p>The error message returned if the request fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
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
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The status of the device.</p>
         * <ul>
         * <li><strong>ONLINE</strong>: The device is online.</li>
         * <li><strong>OFFLINE</strong>: The device is offline.</li>
         * <li><strong>UNACTIVE</strong>: The device is not activated.</li>
         * <li><strong>DISABLE</strong>: The device is disabled.</li>
         * <li><strong>DELETE</strong>: The device is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ONLINE</p>
         */
        @NameInMap("DeviceStatus")
        public String deviceStatus;

        /**
         * <p>The expiration time of the license.</p>
         * 
         * <strong>example:</strong>
         * <p>1620624606000</p>
         */
        @NameInMap("ExpiryTime")
        public Long expiryTime;

        /**
         * <p>Indicates whether the device belongs to the specified device group.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("InSpecifiedGroup")
        public Boolean inSpecifiedGroup;

        /**
         * <p>The ID of the device. The ID is the unique identifier that is issued by IoT Platform to the device.</p>
         * 
         * <strong>example:</strong>
         * <p>Q7uOhVRdZRRlDnTLv****00100</p>
         */
        @NameInMap("IotId")
        public String iotId;

        /**
         * <p>The license status.</p>
         * <ul>
         * <li><strong>NORMAL</strong>: The license is valid.</li>
         * <li><strong>EXPIRE</strong>: The license is expired.</li>
         * <li><strong>EXPIRING</strong>: The license is about to expire.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("LicenseStatus")
        public String licenseStatus;

        /**
         * <p>The <strong>ProductKey</strong> of the product to which the device belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>a1BwAGV****</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        /**
         * <p>The ProductName of the product to which the device belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
