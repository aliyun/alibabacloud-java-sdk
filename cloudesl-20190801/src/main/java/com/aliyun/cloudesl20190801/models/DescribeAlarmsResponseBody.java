// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class DescribeAlarmsResponseBody extends TeaModel {
    @NameInMap("Alarms")
    public DescribeAlarmsResponseBodyAlarms alarms;

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

    public static DescribeAlarmsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlarmsResponseBody self = new DescribeAlarmsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlarmsResponseBody setAlarms(DescribeAlarmsResponseBodyAlarms alarms) {
        this.alarms = alarms;
        return this;
    }
    public DescribeAlarmsResponseBodyAlarms getAlarms() {
        return this.alarms;
    }

    public DescribeAlarmsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAlarmsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeAlarmsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeAlarmsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeAlarmsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeAlarmsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAlarmsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAlarmsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAlarmsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAlarmsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeAlarmsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAlarmsResponseBodyAlarmsAlarmInfo extends TeaModel {
        @NameInMap("AlarmId")
        public String alarmId;

        @NameInMap("AlarmStatus")
        public String alarmStatus;

        @NameInMap("AlarmTime")
        public String alarmTime;

        @NameInMap("AlarmType")
        public String alarmType;

        @NameInMap("CompanyId")
        public String companyId;

        @NameInMap("DealTime")
        public String dealTime;

        @NameInMap("DealUserId")
        public Long dealUserId;

        @NameInMap("DeviceBarCode")
        public String deviceBarCode;

        @NameInMap("DeviceMac")
        public String deviceMac;

        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("ErrorType")
        public String errorType;

        @NameInMap("ItemBarCode")
        public String itemBarCode;

        @NameInMap("ItemTitle")
        public String itemTitle;

        @NameInMap("Model")
        public String model;

        @NameInMap("StoreId")
        public String storeId;

        @NameInMap("Vendor")
        public String vendor;

        public static DescribeAlarmsResponseBodyAlarmsAlarmInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmsResponseBodyAlarmsAlarmInfo self = new DescribeAlarmsResponseBodyAlarmsAlarmInfo();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmsResponseBodyAlarmsAlarmInfo setAlarmId(String alarmId) {
            this.alarmId = alarmId;
            return this;
        }
        public String getAlarmId() {
            return this.alarmId;
        }

        public DescribeAlarmsResponseBodyAlarmsAlarmInfo setAlarmStatus(String alarmStatus) {
            this.alarmStatus = alarmStatus;
            return this;
        }
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        public DescribeAlarmsResponseBodyAlarmsAlarmInfo setAlarmTime(String alarmTime) {
            this.alarmTime = alarmTime;
            return this;
        }
        public String getAlarmTime() {
            return this.alarmTime;
        }

        public DescribeAlarmsResponseBodyAlarmsAlarmInfo setAlarmType(String alarmType) {
            this.alarmType = alarmType;
            return this;
        }
        public String getAlarmType() {
            return this.alarmType;
        }

        public DescribeAlarmsResponseBodyAlarmsAlarmInfo setCompanyId(String companyId) {
            this.companyId = companyId;
            return this;
        }
        public String getCompanyId() {
            return this.companyId;
        }

        public DescribeAlarmsResponseBodyAlarmsAlarmInfo setDealTime(String dealTime) {
            this.dealTime = dealTime;
            return this;
        }
        public String getDealTime() {
            return this.dealTime;
        }

        public DescribeAlarmsResponseBodyAlarmsAlarmInfo setDealUserId(Long dealUserId) {
            this.dealUserId = dealUserId;
            return this;
        }
        public Long getDealUserId() {
            return this.dealUserId;
        }

        public DescribeAlarmsResponseBodyAlarmsAlarmInfo setDeviceBarCode(String deviceBarCode) {
            this.deviceBarCode = deviceBarCode;
            return this;
        }
        public String getDeviceBarCode() {
            return this.deviceBarCode;
        }

        public DescribeAlarmsResponseBodyAlarmsAlarmInfo setDeviceMac(String deviceMac) {
            this.deviceMac = deviceMac;
            return this;
        }
        public String getDeviceMac() {
            return this.deviceMac;
        }

        public DescribeAlarmsResponseBodyAlarmsAlarmInfo setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public DescribeAlarmsResponseBodyAlarmsAlarmInfo setErrorType(String errorType) {
            this.errorType = errorType;
            return this;
        }
        public String getErrorType() {
            return this.errorType;
        }

        public DescribeAlarmsResponseBodyAlarmsAlarmInfo setItemBarCode(String itemBarCode) {
            this.itemBarCode = itemBarCode;
            return this;
        }
        public String getItemBarCode() {
            return this.itemBarCode;
        }

        public DescribeAlarmsResponseBodyAlarmsAlarmInfo setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public DescribeAlarmsResponseBodyAlarmsAlarmInfo setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public DescribeAlarmsResponseBodyAlarmsAlarmInfo setStoreId(String storeId) {
            this.storeId = storeId;
            return this;
        }
        public String getStoreId() {
            return this.storeId;
        }

        public DescribeAlarmsResponseBodyAlarmsAlarmInfo setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

    public static class DescribeAlarmsResponseBodyAlarms extends TeaModel {
        @NameInMap("AlarmInfo")
        public java.util.List<DescribeAlarmsResponseBodyAlarmsAlarmInfo> alarmInfo;

        public static DescribeAlarmsResponseBodyAlarms build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmsResponseBodyAlarms self = new DescribeAlarmsResponseBodyAlarms();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmsResponseBodyAlarms setAlarmInfo(java.util.List<DescribeAlarmsResponseBodyAlarmsAlarmInfo> alarmInfo) {
            this.alarmInfo = alarmInfo;
            return this;
        }
        public java.util.List<DescribeAlarmsResponseBodyAlarmsAlarmInfo> getAlarmInfo() {
            return this.alarmInfo;
        }

    }

}
