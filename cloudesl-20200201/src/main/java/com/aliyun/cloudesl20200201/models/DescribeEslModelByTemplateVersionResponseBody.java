// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeEslModelByTemplateVersionResponseBody extends TeaModel {
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
    public java.util.List<DescribeEslModelByTemplateVersionResponseBodyEslModels> eslModels;

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

    public static DescribeEslModelByTemplateVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEslModelByTemplateVersionResponseBody self = new DescribeEslModelByTemplateVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEslModelByTemplateVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeEslModelByTemplateVersionResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeEslModelByTemplateVersionResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeEslModelByTemplateVersionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeEslModelByTemplateVersionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeEslModelByTemplateVersionResponseBody setEslModels(java.util.List<DescribeEslModelByTemplateVersionResponseBodyEslModels> eslModels) {
        this.eslModels = eslModels;
        return this;
    }
    public java.util.List<DescribeEslModelByTemplateVersionResponseBodyEslModels> getEslModels() {
        return this.eslModels;
    }

    public DescribeEslModelByTemplateVersionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeEslModelByTemplateVersionResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEslModelByTemplateVersionResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEslModelByTemplateVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEslModelByTemplateVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeEslModelByTemplateVersionResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeEslModelByTemplateVersionResponseBodyEslModels extends TeaModel {
        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("EslPhysicalSize")
        public String eslPhysicalSize;

        @NameInMap("EslSize")
        public String eslSize;

        @NameInMap("Image")
        public String image;

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

        public static DescribeEslModelByTemplateVersionResponseBodyEslModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeEslModelByTemplateVersionResponseBodyEslModels self = new DescribeEslModelByTemplateVersionResponseBodyEslModels();
            return TeaModel.build(map, self);
        }

        public DescribeEslModelByTemplateVersionResponseBodyEslModels setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public DescribeEslModelByTemplateVersionResponseBodyEslModels setEslPhysicalSize(String eslPhysicalSize) {
            this.eslPhysicalSize = eslPhysicalSize;
            return this;
        }
        public String getEslPhysicalSize() {
            return this.eslPhysicalSize;
        }

        public DescribeEslModelByTemplateVersionResponseBodyEslModels setEslSize(String eslSize) {
            this.eslSize = eslSize;
            return this;
        }
        public String getEslSize() {
            return this.eslSize;
        }

        public DescribeEslModelByTemplateVersionResponseBodyEslModels setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public DescribeEslModelByTemplateVersionResponseBodyEslModels setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public DescribeEslModelByTemplateVersionResponseBodyEslModels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEslModelByTemplateVersionResponseBodyEslModels setScreenHeight(Integer screenHeight) {
            this.screenHeight = screenHeight;
            return this;
        }
        public Integer getScreenHeight() {
            return this.screenHeight;
        }

        public DescribeEslModelByTemplateVersionResponseBodyEslModels setScreenWidth(Integer screenWidth) {
            this.screenWidth = screenWidth;
            return this;
        }
        public Integer getScreenWidth() {
            return this.screenWidth;
        }

        public DescribeEslModelByTemplateVersionResponseBodyEslModels setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

}
