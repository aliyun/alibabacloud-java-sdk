// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class DescribeEslDevicesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("EslDevices")
    public DescribeEslDevicesResponseBodyEslDevices eslDevices;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeEslDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEslDevicesResponseBody self = new DescribeEslDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEslDevicesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeEslDevicesResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeEslDevicesResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeEslDevicesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeEslDevicesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeEslDevicesResponseBody setEslDevices(DescribeEslDevicesResponseBodyEslDevices eslDevices) {
        this.eslDevices = eslDevices;
        return this;
    }
    public DescribeEslDevicesResponseBodyEslDevices getEslDevices() {
        return this.eslDevices;
    }

    public DescribeEslDevicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeEslDevicesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEslDevicesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEslDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEslDevicesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeEslDevicesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeEslDevicesResponseBodyEslDevicesEslDeviceInfo extends TeaModel {
        @NameInMap("BatteryLevel")
        public Integer batteryLevel;

        @NameInMap("BeBind")
        public Boolean beBind;

        @NameInMap("CompanyId")
        public String companyId;

        @NameInMap("ConnectAp")
        public String connectAp;

        @NameInMap("EslBarCode")
        public String eslBarCode;

        @NameInMap("EslStatus")
        public String eslStatus;

        @NameInMap("ItemActionPrice")
        public Integer itemActionPrice;

        @NameInMap("ItemBarCode")
        public String itemBarCode;

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("ItemPriceUnit")
        public String itemPriceUnit;

        @NameInMap("ItemTitle")
        public String itemTitle;

        @NameInMap("LastCommunicateTime")
        public String lastCommunicateTime;

        @NameInMap("Mac")
        public String mac;

        @NameInMap("Model")
        public String model;

        @NameInMap("PositionCode")
        public String positionCode;

        @NameInMap("ScreenHeight")
        public Integer screenHeight;

        @NameInMap("ScreenWidth")
        public Integer screenWidth;

        @NameInMap("ShelfCode")
        public String shelfCode;

        @NameInMap("StoreId")
        public String storeId;

        @NameInMap("Type")
        public String type;

        @NameInMap("Vendor")
        public String vendor;

        public static DescribeEslDevicesResponseBodyEslDevicesEslDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeEslDevicesResponseBodyEslDevicesEslDeviceInfo self = new DescribeEslDevicesResponseBodyEslDevicesEslDeviceInfo();
            return TeaModel.build(map, self);
        }

        public DescribeEslDevicesResponseBodyEslDevicesEslDeviceInfo setBatteryLevel(Integer batteryLevel) {
            this.batteryLevel = batteryLevel;
            return this;
        }
        public Integer getBatteryLevel() {
            return this.batteryLevel;
        }

        public DescribeEslDevicesResponseBodyEslDevicesEslDeviceInfo setBeBind(Boolean beBind) {
            this.beBind = beBind;
            return this;
        }
        public Boolean getBeBind() {
            return this.beBind;
        }

        public DescribeEslDevicesResponseBodyEslDevicesEslDeviceInfo setCompanyId(String companyId) {
            this.companyId = companyId;
            return this;
        }
        public String getCompanyId() {
            return this.companyId;
        }

        public DescribeEslDevicesResponseBodyEslDevicesEslDeviceInfo setConnectAp(String connectAp) {
            this.connectAp = connectAp;
            return this;
        }
        public String getConnectAp() {
            return this.connectAp;
        }

        public DescribeEslDevicesResponseBodyEslDevicesEslDeviceInfo setEslBarCode(String eslBarCode) {
            this.eslBarCode = eslBarCode;
            return this;
        }
        public String getEslBarCode() {
            return this.eslBarCode;
        }

        public DescribeEslDevicesResponseBodyEslDevicesEslDeviceInfo setEslStatus(String eslStatus) {
            this.eslStatus = eslStatus;
            return this;
        }
        public String getEslStatus() {
            return this.eslStatus;
        }

        public DescribeEslDevicesResponseBodyEslDevicesEslDeviceInfo setItemActionPrice(Integer itemActionPrice) {
            this.itemActionPrice = itemActionPrice;
            return this;
        }
        public Integer getItemActionPrice() {
            return this.itemActionPrice;
        }

        public DescribeEslDevicesResponseBodyEslDevicesEslDeviceInfo setItemBarCode(String itemBarCode) {
            this.itemBarCode = itemBarCode;
            return this;
        }
        public String getItemBarCode() {
            return this.itemBarCode;
        }

        public DescribeEslDevicesResponseBodyEslDevicesEslDeviceInfo setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public DescribeEslDevicesResponseBodyEslDevicesEslDeviceInfo setItemPriceUnit(String itemPriceUnit) {
            this.itemPriceUnit = itemPriceUnit;
            return this;
        }
        public String getItemPriceUnit() {
            return this.itemPriceUnit;
        }

        public DescribeEslDevicesResponseBodyEslDevicesEslDeviceInfo setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public DescribeEslDevicesResponseBodyEslDevicesEslDeviceInfo setLastCommunicateTime(String lastCommunicateTime) {
            this.lastCommunicateTime = lastCommunicateTime;
            return this;
        }
        public String getLastCommunicateTime() {
            return this.lastCommunicateTime;
        }

        public DescribeEslDevicesResponseBodyEslDevicesEslDeviceInfo setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public DescribeEslDevicesResponseBodyEslDevicesEslDeviceInfo setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public DescribeEslDevicesResponseBodyEslDevicesEslDeviceInfo setPositionCode(String positionCode) {
            this.positionCode = positionCode;
            return this;
        }
        public String getPositionCode() {
            return this.positionCode;
        }

        public DescribeEslDevicesResponseBodyEslDevicesEslDeviceInfo setScreenHeight(Integer screenHeight) {
            this.screenHeight = screenHeight;
            return this;
        }
        public Integer getScreenHeight() {
            return this.screenHeight;
        }

        public DescribeEslDevicesResponseBodyEslDevicesEslDeviceInfo setScreenWidth(Integer screenWidth) {
            this.screenWidth = screenWidth;
            return this;
        }
        public Integer getScreenWidth() {
            return this.screenWidth;
        }

        public DescribeEslDevicesResponseBodyEslDevicesEslDeviceInfo setShelfCode(String shelfCode) {
            this.shelfCode = shelfCode;
            return this;
        }
        public String getShelfCode() {
            return this.shelfCode;
        }

        public DescribeEslDevicesResponseBodyEslDevicesEslDeviceInfo setStoreId(String storeId) {
            this.storeId = storeId;
            return this;
        }
        public String getStoreId() {
            return this.storeId;
        }

        public DescribeEslDevicesResponseBodyEslDevicesEslDeviceInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeEslDevicesResponseBodyEslDevicesEslDeviceInfo setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

    public static class DescribeEslDevicesResponseBodyEslDevices extends TeaModel {
        @NameInMap("EslDeviceInfo")
        public java.util.List<DescribeEslDevicesResponseBodyEslDevicesEslDeviceInfo> eslDeviceInfo;

        public static DescribeEslDevicesResponseBodyEslDevices build(java.util.Map<String, ?> map) throws Exception {
            DescribeEslDevicesResponseBodyEslDevices self = new DescribeEslDevicesResponseBodyEslDevices();
            return TeaModel.build(map, self);
        }

        public DescribeEslDevicesResponseBodyEslDevices setEslDeviceInfo(java.util.List<DescribeEslDevicesResponseBodyEslDevicesEslDeviceInfo> eslDeviceInfo) {
            this.eslDeviceInfo = eslDeviceInfo;
            return this;
        }
        public java.util.List<DescribeEslDevicesResponseBodyEslDevicesEslDeviceInfo> getEslDeviceInfo() {
            return this.eslDeviceInfo;
        }

    }

}
