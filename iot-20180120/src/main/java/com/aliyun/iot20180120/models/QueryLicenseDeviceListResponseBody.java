// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryLicenseDeviceListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryLicenseDeviceListResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("ExpiryTime")
        public Long expiryTime;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("LicenseCode")
        public String licenseCode;

        @NameInMap("ProductKey")
        public String productKey;

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
        @NameInMap("DeviceList")
        public QueryLicenseDeviceListResponseBodyDataDeviceList deviceList;

        @NameInMap("PageId")
        public Integer pageId;

        @NameInMap("PageSize")
        public Integer pageSize;

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
