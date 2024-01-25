// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeTemplateByModelResponseBody extends TeaModel {
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

    @NameInMap("Items")
    public java.util.List<DescribeTemplateByModelResponseBodyItems> items;

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

    public static DescribeTemplateByModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplateByModelResponseBody self = new DescribeTemplateByModelResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTemplateByModelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeTemplateByModelResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeTemplateByModelResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeTemplateByModelResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeTemplateByModelResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeTemplateByModelResponseBody setItems(java.util.List<DescribeTemplateByModelResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeTemplateByModelResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeTemplateByModelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeTemplateByModelResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTemplateByModelResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTemplateByModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTemplateByModelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeTemplateByModelResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeTemplateByModelResponseBodyItems extends TeaModel {
        @NameInMap("BasePicture")
        public String basePicture;

        @NameInMap("Brand")
        public String brand;

        @NameInMap("EslSize")
        public String eslSize;

        @NameInMap("EslType")
        public String eslType;

        @NameInMap("Height")
        public Long height;

        @NameInMap("Layout")
        public String layout;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("TemplateSceneId")
        public String templateSceneId;

        @NameInMap("TemplateVersion")
        public String templateVersion;

        @NameInMap("Width")
        public Long width;

        public static DescribeTemplateByModelResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeTemplateByModelResponseBodyItems self = new DescribeTemplateByModelResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeTemplateByModelResponseBodyItems setBasePicture(String basePicture) {
            this.basePicture = basePicture;
            return this;
        }
        public String getBasePicture() {
            return this.basePicture;
        }

        public DescribeTemplateByModelResponseBodyItems setBrand(String brand) {
            this.brand = brand;
            return this;
        }
        public String getBrand() {
            return this.brand;
        }

        public DescribeTemplateByModelResponseBodyItems setEslSize(String eslSize) {
            this.eslSize = eslSize;
            return this;
        }
        public String getEslSize() {
            return this.eslSize;
        }

        public DescribeTemplateByModelResponseBodyItems setEslType(String eslType) {
            this.eslType = eslType;
            return this;
        }
        public String getEslType() {
            return this.eslType;
        }

        public DescribeTemplateByModelResponseBodyItems setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public DescribeTemplateByModelResponseBodyItems setLayout(String layout) {
            this.layout = layout;
            return this;
        }
        public String getLayout() {
            return this.layout;
        }

        public DescribeTemplateByModelResponseBodyItems setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public DescribeTemplateByModelResponseBodyItems setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public DescribeTemplateByModelResponseBodyItems setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public DescribeTemplateByModelResponseBodyItems setTemplateSceneId(String templateSceneId) {
            this.templateSceneId = templateSceneId;
            return this;
        }
        public String getTemplateSceneId() {
            return this.templateSceneId;
        }

        public DescribeTemplateByModelResponseBodyItems setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        public DescribeTemplateByModelResponseBodyItems setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

    }

}
