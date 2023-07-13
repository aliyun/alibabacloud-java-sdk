// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryLicenseDeviceListResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request fails. For more information, see the **"Error codes"** section in this topic.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response message.</p>
     */
    @NameInMap("Data")
    public QueryLicenseDeviceListResponseBodyData data;

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

    public static QueryLicenseDeviceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLicenseDeviceListResponseBody self = new QueryLicenseDeviceListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLicenseDeviceListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryLicenseDeviceListResponseBody setData(QueryLicenseDeviceListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLicenseDeviceListResponseBodyData getData() {
        return this.data;
    }

    public QueryLicenseDeviceListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLicenseDeviceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLicenseDeviceListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryLicenseDeviceListResponseBodyDataDeviceListItem extends TeaModel {
        /**
         * <p>The DeviceName of the device.</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The expiration time of the license.</p>
         */
        @NameInMap("ExpiryTime")
        public Long expiryTime;

        /**
         * <p>The time when the license was bound to the device.</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The device ID.</p>
         */
        @NameInMap("IotId")
        public String iotId;

        /**
         * <p>The license type that indicates the audio and video specifications. Valid values: **480P** and **720P**.</p>
         */
        @NameInMap("LicenseCode")
        public String licenseCode;

        /**
         * <p>The **ProductKey** of the product to which the device belongs.</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        /**
         * <p>The ProductName of the product.</p>
         */
        @NameInMap("ProductName")
        public String productName;

        public static QueryLicenseDeviceListResponseBodyDataDeviceListItem build(java.util.Map<String, ?> map) throws Exception {
            QueryLicenseDeviceListResponseBodyDataDeviceListItem self = new QueryLicenseDeviceListResponseBodyDataDeviceListItem();
            return TeaModel.build(map, self);
        }

        public QueryLicenseDeviceListResponseBodyDataDeviceListItem setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryLicenseDeviceListResponseBodyDataDeviceListItem setExpiryTime(Long expiryTime) {
            this.expiryTime = expiryTime;
            return this;
        }
        public Long getExpiryTime() {
            return this.expiryTime;
        }

        public QueryLicenseDeviceListResponseBodyDataDeviceListItem setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryLicenseDeviceListResponseBodyDataDeviceListItem setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryLicenseDeviceListResponseBodyDataDeviceListItem setLicenseCode(String licenseCode) {
            this.licenseCode = licenseCode;
            return this;
        }
        public String getLicenseCode() {
            return this.licenseCode;
        }

        public QueryLicenseDeviceListResponseBodyDataDeviceListItem setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryLicenseDeviceListResponseBodyDataDeviceListItem setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

    }

    public static class QueryLicenseDeviceListResponseBodyDataDeviceList extends TeaModel {
        @NameInMap("item")
        public java.util.List<QueryLicenseDeviceListResponseBodyDataDeviceListItem> item;

        public static QueryLicenseDeviceListResponseBodyDataDeviceList build(java.util.Map<String, ?> map) throws Exception {
            QueryLicenseDeviceListResponseBodyDataDeviceList self = new QueryLicenseDeviceListResponseBodyDataDeviceList();
            return TeaModel.build(map, self);
        }

        public QueryLicenseDeviceListResponseBodyDataDeviceList setItem(java.util.List<QueryLicenseDeviceListResponseBodyDataDeviceListItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<QueryLicenseDeviceListResponseBodyDataDeviceListItem> getItem() {
            return this.item;
        }

    }

    public static class QueryLicenseDeviceListResponseBodyData extends TeaModel {
        /**
         * <p>The information about the devices.</p>
         */
        @NameInMap("DeviceList")
        public QueryLicenseDeviceListResponseBodyDataDeviceList deviceList;

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

        public static QueryLicenseDeviceListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLicenseDeviceListResponseBodyData self = new QueryLicenseDeviceListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLicenseDeviceListResponseBodyData setDeviceList(QueryLicenseDeviceListResponseBodyDataDeviceList deviceList) {
            this.deviceList = deviceList;
            return this;
        }
        public QueryLicenseDeviceListResponseBodyDataDeviceList getDeviceList() {
            return this.deviceList;
        }

        public QueryLicenseDeviceListResponseBodyData setPageId(Integer pageId) {
            this.pageId = pageId;
            return this;
        }
        public Integer getPageId() {
            return this.pageId;
        }

        public QueryLicenseDeviceListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryLicenseDeviceListResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
