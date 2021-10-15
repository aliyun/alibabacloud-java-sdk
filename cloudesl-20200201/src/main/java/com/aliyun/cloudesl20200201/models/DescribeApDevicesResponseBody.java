// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeApDevicesResponseBody extends TeaModel {
    @NameInMap("ApDevices")
    public java.util.List<DescribeApDevicesResponseBodyApDevices> apDevices;

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

    public DescribeApDevicesResponseBody setApDevices(java.util.List<DescribeApDevicesResponseBodyApDevices> apDevices) {
        this.apDevices = apDevices;
        return this;
    }
    public java.util.List<DescribeApDevicesResponseBodyApDevices> getApDevices() {
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

    public static class DescribeApDevicesResponseBodyApDevices extends TeaModel {
        @NameInMap("Status")
        public Boolean status;

        @NameInMap("StoreId")
        public String storeId;

        @NameInMap("Model")
        public String model;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("BeActivate")
        public Boolean beActivate;

        @NameInMap("Mac")
        public String mac;

        public static DescribeApDevicesResponseBodyApDevices build(java.util.Map<String, ?> map) throws Exception {
            DescribeApDevicesResponseBodyApDevices self = new DescribeApDevicesResponseBodyApDevices();
            return TeaModel.build(map, self);
        }

        public DescribeApDevicesResponseBodyApDevices setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public DescribeApDevicesResponseBodyApDevices setStoreId(String storeId) {
            this.storeId = storeId;
            return this;
        }
        public String getStoreId() {
            return this.storeId;
        }

        public DescribeApDevicesResponseBodyApDevices setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public DescribeApDevicesResponseBodyApDevices setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeApDevicesResponseBodyApDevices setBeActivate(Boolean beActivate) {
            this.beActivate = beActivate;
            return this;
        }
        public Boolean getBeActivate() {
            return this.beActivate;
        }

        public DescribeApDevicesResponseBodyApDevices setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

    }

}
