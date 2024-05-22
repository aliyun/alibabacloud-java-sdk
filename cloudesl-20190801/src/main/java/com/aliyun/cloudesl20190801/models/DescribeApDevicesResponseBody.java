// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class DescribeApDevicesResponseBody extends TeaModel {
    @NameInMap("ApDevices")
    public DescribeApDevicesResponseBodyApDevices apDevices;

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

    public static DescribeApDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApDevicesResponseBody self = new DescribeApDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApDevicesResponseBody setApDevices(DescribeApDevicesResponseBodyApDevices apDevices) {
        this.apDevices = apDevices;
        return this;
    }
    public DescribeApDevicesResponseBodyApDevices getApDevices() {
        return this.apDevices;
    }

    public DescribeApDevicesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeApDevicesResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeApDevicesResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeApDevicesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeApDevicesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeApDevicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeApDevicesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApDevicesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApDevicesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeApDevicesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeApDevicesResponseBodyApDevicesApInfo extends TeaModel {
        @NameInMap("IsActivate")
        public Boolean isActivate;

        @NameInMap("Mac")
        public String mac;

        @NameInMap("Model")
        public String model;

        @NameInMap("Status")
        public Boolean status;

        public static DescribeApDevicesResponseBodyApDevicesApInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeApDevicesResponseBodyApDevicesApInfo self = new DescribeApDevicesResponseBodyApDevicesApInfo();
            return TeaModel.build(map, self);
        }

        public DescribeApDevicesResponseBodyApDevicesApInfo setIsActivate(Boolean isActivate) {
            this.isActivate = isActivate;
            return this;
        }
        public Boolean getIsActivate() {
            return this.isActivate;
        }

        public DescribeApDevicesResponseBodyApDevicesApInfo setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public DescribeApDevicesResponseBodyApDevicesApInfo setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public DescribeApDevicesResponseBodyApDevicesApInfo setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

    }

    public static class DescribeApDevicesResponseBodyApDevices extends TeaModel {
        @NameInMap("ApInfo")
        public java.util.List<DescribeApDevicesResponseBodyApDevicesApInfo> apInfo;

        public static DescribeApDevicesResponseBodyApDevices build(java.util.Map<String, ?> map) throws Exception {
            DescribeApDevicesResponseBodyApDevices self = new DescribeApDevicesResponseBodyApDevices();
            return TeaModel.build(map, self);
        }

        public DescribeApDevicesResponseBodyApDevices setApInfo(java.util.List<DescribeApDevicesResponseBodyApDevicesApInfo> apInfo) {
            this.apInfo = apInfo;
            return this;
        }
        public java.util.List<DescribeApDevicesResponseBodyApDevicesApInfo> getApInfo() {
            return this.apInfo;
        }

    }

}
