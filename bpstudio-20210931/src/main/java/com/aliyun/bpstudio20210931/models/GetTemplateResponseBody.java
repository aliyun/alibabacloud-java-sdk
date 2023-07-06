// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class GetTemplateResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The details of the template.</p>
     */
    @NameInMap("Data")
    public GetTemplateResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateResponseBody self = new GetTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTemplateResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetTemplateResponseBody setData(GetTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTemplateResponseBodyData getData() {
        return this.data;
    }

    public GetTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetTemplateResponseBodyDataVariables extends TeaModel {
        @NameInMap("Attribute")
        public String attribute;

        @NameInMap("DataType")
        public String dataType;

        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("Variable")
        public String variable;

        public static GetTemplateResponseBodyDataVariables build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateResponseBodyDataVariables self = new GetTemplateResponseBodyDataVariables();
            return TeaModel.build(map, self);
        }

        public GetTemplateResponseBodyDataVariables setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }
        public String getAttribute() {
            return this.attribute;
        }

        public GetTemplateResponseBodyDataVariables setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetTemplateResponseBodyDataVariables setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetTemplateResponseBodyDataVariables setVariable(String variable) {
            this.variable = variable;
            return this;
        }
        public String getVariable() {
            return this.variable;
        }

    }

    public static class GetTemplateResponseBodyData extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("ImageURL")
        public String imageURL;

        @NameInMap("Name")
        public String name;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("Variables")
        public java.util.List<GetTemplateResponseBodyDataVariables> variables;

        public static GetTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateResponseBodyData self = new GetTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTemplateResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetTemplateResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetTemplateResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

        public GetTemplateResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTemplateResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetTemplateResponseBodyData setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetTemplateResponseBodyData setVariables(java.util.List<GetTemplateResponseBodyDataVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<GetTemplateResponseBodyDataVariables> getVariables() {
            return this.variables;
        }

    }

}
