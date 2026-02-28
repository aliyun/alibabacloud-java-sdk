// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySpeechLicenseDeviceListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QuerySpeechLicenseDeviceListResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceStatus")
        public String deviceStatus;

        @NameInMap("ExpiryTime")
        public Long expiryTime;

        @NameInMap("InSpecifiedGroup")
        public Boolean inSpecifiedGroup;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("LicenseStatus")
        public String licenseStatus;

        @NameInMap("ProductKey")
        public String productKey;

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
        @NameInMap("DeviceList")
        public QuerySpeechLicenseDeviceListResponseBodyDataDeviceList deviceList;

        @NameInMap("PageId")
        public Integer pageId;

        @NameInMap("PageSize")
        public Integer pageSize;

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
