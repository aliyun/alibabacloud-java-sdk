// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeAvailableEslModelsResponseBody extends TeaModel {
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

    @NameInMap("EslModels")
    public java.util.List<DescribeAvailableEslModelsResponseBodyEslModels> eslModels;

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

    public static DescribeAvailableEslModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableEslModelsResponseBody self = new DescribeAvailableEslModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableEslModelsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAvailableEslModelsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeAvailableEslModelsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeAvailableEslModelsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeAvailableEslModelsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeAvailableEslModelsResponseBody setEslModels(java.util.List<DescribeAvailableEslModelsResponseBodyEslModels> eslModels) {
        this.eslModels = eslModels;
        return this;
    }
    public java.util.List<DescribeAvailableEslModelsResponseBodyEslModels> getEslModels() {
        return this.eslModels;
    }

    public DescribeAvailableEslModelsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAvailableEslModelsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAvailableEslModelsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAvailableEslModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAvailableEslModelsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeAvailableEslModelsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAvailableEslModelsResponseBodyEslModels extends TeaModel {
        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("EslSize")
        public String eslSize;

        @NameInMap("ModelId")
        public String modelId;

        @NameInMap("Name")
        public String name;

        @NameInMap("ScreenHeight")
        public Integer screenHeight;

        @NameInMap("ScreenWidth")
        public Integer screenWidth;

        @NameInMap("Vendor")
        public String vendor;

        public static DescribeAvailableEslModelsResponseBodyEslModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableEslModelsResponseBodyEslModels self = new DescribeAvailableEslModelsResponseBodyEslModels();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableEslModelsResponseBodyEslModels setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public DescribeAvailableEslModelsResponseBodyEslModels setEslSize(String eslSize) {
            this.eslSize = eslSize;
            return this;
        }
        public String getEslSize() {
            return this.eslSize;
        }

        public DescribeAvailableEslModelsResponseBodyEslModels setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public DescribeAvailableEslModelsResponseBodyEslModels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAvailableEslModelsResponseBodyEslModels setScreenHeight(Integer screenHeight) {
            this.screenHeight = screenHeight;
            return this;
        }
        public Integer getScreenHeight() {
            return this.screenHeight;
        }

        public DescribeAvailableEslModelsResponseBodyEslModels setScreenWidth(Integer screenWidth) {
            this.screenWidth = screenWidth;
            return this;
        }
        public Integer getScreenWidth() {
            return this.screenWidth;
        }

        public DescribeAvailableEslModelsResponseBodyEslModels setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

}
