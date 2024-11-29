// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class GetTemplateResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The details of the template.</p>
     */
    @NameInMap("Data")
    public GetTemplateResponseBodyData data;

    /**
     * <p>The interface returns information</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>A07FFDF2-78FA-1B48-9E38-88E833A93187</p>
     */
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
        /**
         * <p>The name of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>instance_name</p>
         */
        @NameInMap("Attribute")
        public String attribute;

        /**
         * <p>The type of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>String</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The default value of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>cadt-app-01</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("Options")
        public String options;

        /**
         * <p>The value of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>${name}</p>
         */
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

        public GetTemplateResponseBodyDataVariables setOptions(String options) {
            this.options = options;
            return this;
        }
        public String getOptions() {
            return this.options;
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
        /**
         * <p>The time when the template was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-09-22 17:08:31</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Template DescriptionD</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The path to the template schema image file</p>
         * 
         * <strong>example:</strong>
         * <p>bp-studio-template/sr-U37UD2YQCRJ75X5V.png</p>
         */
        @NameInMap("ImageURL")
        public String imageURL;

        /**
         * <p>The name of the template</p>
         * 
         * <strong>example:</strong>
         * <p>cadt-template</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzhfgmw4e6fwq</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Template ID</p>
         * 
         * <strong>example:</strong>
         * <p>XFKR6WYRVS24S07R</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The details of the template variables.</p>
         */
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
