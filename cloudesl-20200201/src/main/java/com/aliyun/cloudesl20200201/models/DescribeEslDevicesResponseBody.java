// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

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
    public java.util.List<DescribeEslDevicesResponseBodyEslDevices> eslDevices;

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

    public DescribeEslDevicesResponseBody setEslDevices(java.util.List<DescribeEslDevicesResponseBodyEslDevices> eslDevices) {
        this.eslDevices = eslDevices;
        return this;
    }
    public java.util.List<DescribeEslDevicesResponseBodyEslDevices> getEslDevices() {
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

    public static class DescribeEslDevicesResponseBodyEslDevices extends TeaModel {
        @NameInMap("BatteryLevel")
        public Integer batteryLevel;

        @NameInMap("EslBarCode")
        public String eslBarCode;

        @NameInMap("EslSignal")
        public Integer eslSignal;

        @NameInMap("EslStatus")
        public String eslStatus;

        @NameInMap("LastCommunicateTime")
        public String lastCommunicateTime;

        @NameInMap("LayoutId")
        public String layoutId;

        @NameInMap("LayoutName")
        public String layoutName;

        @NameInMap("Mac")
        public String mac;

        @NameInMap("Model")
        public String model;

        @NameInMap("ScreenHeight")
        public Integer screenHeight;

        @NameInMap("ScreenWidth")
        public Integer screenWidth;

        @NameInMap("StoreId")
        public String storeId;

        @NameInMap("Type")
        public String type;

        @NameInMap("TypeEncode")
        public String typeEncode;

        public static DescribeEslDevicesResponseBodyEslDevices build(java.util.Map<String, ?> map) throws Exception {
            DescribeEslDevicesResponseBodyEslDevices self = new DescribeEslDevicesResponseBodyEslDevices();
            return TeaModel.build(map, self);
        }

        public DescribeEslDevicesResponseBodyEslDevices setBatteryLevel(Integer batteryLevel) {
            this.batteryLevel = batteryLevel;
            return this;
        }
        public Integer getBatteryLevel() {
            return this.batteryLevel;
        }

        public DescribeEslDevicesResponseBodyEslDevices setEslBarCode(String eslBarCode) {
            this.eslBarCode = eslBarCode;
            return this;
        }
        public String getEslBarCode() {
            return this.eslBarCode;
        }

        public DescribeEslDevicesResponseBodyEslDevices setEslSignal(Integer eslSignal) {
            this.eslSignal = eslSignal;
            return this;
        }
        public Integer getEslSignal() {
            return this.eslSignal;
        }

        public DescribeEslDevicesResponseBodyEslDevices setEslStatus(String eslStatus) {
            this.eslStatus = eslStatus;
            return this;
        }
        public String getEslStatus() {
            return this.eslStatus;
        }

        public DescribeEslDevicesResponseBodyEslDevices setLastCommunicateTime(String lastCommunicateTime) {
            this.lastCommunicateTime = lastCommunicateTime;
            return this;
        }
        public String getLastCommunicateTime() {
            return this.lastCommunicateTime;
        }

        public DescribeEslDevicesResponseBodyEslDevices setLayoutId(String layoutId) {
            this.layoutId = layoutId;
            return this;
        }
        public String getLayoutId() {
            return this.layoutId;
        }

        public DescribeEslDevicesResponseBodyEslDevices setLayoutName(String layoutName) {
            this.layoutName = layoutName;
            return this;
        }
        public String getLayoutName() {
            return this.layoutName;
        }

        public DescribeEslDevicesResponseBodyEslDevices setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public DescribeEslDevicesResponseBodyEslDevices setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public DescribeEslDevicesResponseBodyEslDevices setScreenHeight(Integer screenHeight) {
            this.screenHeight = screenHeight;
            return this;
        }
        public Integer getScreenHeight() {
            return this.screenHeight;
        }

        public DescribeEslDevicesResponseBodyEslDevices setScreenWidth(Integer screenWidth) {
            this.screenWidth = screenWidth;
            return this;
        }
        public Integer getScreenWidth() {
            return this.screenWidth;
        }

        public DescribeEslDevicesResponseBodyEslDevices setStoreId(String storeId) {
            this.storeId = storeId;
            return this;
        }
        public String getStoreId() {
            return this.storeId;
        }

        public DescribeEslDevicesResponseBodyEslDevices setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeEslDevicesResponseBodyEslDevices setTypeEncode(String typeEncode) {
            this.typeEncode = typeEncode;
            return this;
        }
        public String getTypeEncode() {
            return this.typeEncode;
        }

    }

}
