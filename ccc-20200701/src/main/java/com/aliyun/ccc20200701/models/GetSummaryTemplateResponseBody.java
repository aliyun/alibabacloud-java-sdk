// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetSummaryTemplateResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data.</p>
     */
    @NameInMap("Data")
    public GetSummaryTemplateResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The list of error parameters.</p>
     */
    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30C7D235-DDCF-4C7F-A462-5E2598252C2B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetSummaryTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSummaryTemplateResponseBody self = new GetSummaryTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSummaryTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSummaryTemplateResponseBody setData(GetSummaryTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSummaryTemplateResponseBodyData getData() {
        return this.data;
    }

    public GetSummaryTemplateResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetSummaryTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSummaryTemplateResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public GetSummaryTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSummaryTemplateResponseBodyDataPropertyList extends TeaModel {
        /**
         * <p>Indicates whether the field is an array.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Array")
        public Boolean array;

        /**
         * <p>The extended properties.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Attributes")
        public String attributes;

        /**
         * <p>The time when the field was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1717664210000</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The user who created the field.</p>
         * 
         * <strong>example:</strong>
         * <p>cretor-xxx@ccc-test</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The data type.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The description of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>Description-xxxx</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the field is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>DisplayName-A</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The display order in the list.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DisplayOrder")
        public Integer displayOrder;

        /**
         * <p>The type of the editor.</p>
         * 
         * <strong>example:</strong>
         * <p>textbox</p>
         */
        @NameInMap("EditorType")
        public String editorType;

        /**
         * <p>The maximum length.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("MaxLength")
        public Integer maxLength;

        /**
         * <p>The maximum value of the number.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Maximum")
        public Double maximum;

        /**
         * <p>The minimum length.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinLength")
        public Integer minLength;

        /**
         * <p>The minimum value of the number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Minimum")
        public Double minimum;

        /**
         * <p>The name of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>Name-A</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The validation rule that is specified by a regular expression.</p>
         * 
         * <strong>example:</strong>
         * <p>^</p>
         */
        @NameInMap("Pattern")
        public String pattern;

        /**
         * <p>The error message that is returned when the regular expression fails to pass the validation.</p>
         * 
         * <strong>example:</strong>
         * <p>不是有效的email地址</p>
         */
        @NameInMap("PatternErrorMessage")
        public String patternErrorMessage;

        /**
         * <p>Indicates whether the field is read-only.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ReadOnly")
        public Boolean readOnly;

        /**
         * <p>Indicates whether the field is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Required")
        public Boolean required;

        /**
         * <p>Indicates whether the field is a system field.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("System")
        public Boolean system;

        /**
         * <p>The time when the field was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1717664210000</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        public static GetSummaryTemplateResponseBodyDataPropertyList build(java.util.Map<String, ?> map) throws Exception {
            GetSummaryTemplateResponseBodyDataPropertyList self = new GetSummaryTemplateResponseBodyDataPropertyList();
            return TeaModel.build(map, self);
        }

        public GetSummaryTemplateResponseBodyDataPropertyList setArray(Boolean array) {
            this.array = array;
            return this;
        }
        public Boolean getArray() {
            return this.array;
        }

        public GetSummaryTemplateResponseBodyDataPropertyList setAttributes(String attributes) {
            this.attributes = attributes;
            return this;
        }
        public String getAttributes() {
            return this.attributes;
        }

        public GetSummaryTemplateResponseBodyDataPropertyList setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public GetSummaryTemplateResponseBodyDataPropertyList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetSummaryTemplateResponseBodyDataPropertyList setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetSummaryTemplateResponseBodyDataPropertyList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetSummaryTemplateResponseBodyDataPropertyList setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public GetSummaryTemplateResponseBodyDataPropertyList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetSummaryTemplateResponseBodyDataPropertyList setDisplayOrder(Integer displayOrder) {
            this.displayOrder = displayOrder;
            return this;
        }
        public Integer getDisplayOrder() {
            return this.displayOrder;
        }

        public GetSummaryTemplateResponseBodyDataPropertyList setEditorType(String editorType) {
            this.editorType = editorType;
            return this;
        }
        public String getEditorType() {
            return this.editorType;
        }

        public GetSummaryTemplateResponseBodyDataPropertyList setMaxLength(Integer maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        public Integer getMaxLength() {
            return this.maxLength;
        }

        public GetSummaryTemplateResponseBodyDataPropertyList setMaximum(Double maximum) {
            this.maximum = maximum;
            return this;
        }
        public Double getMaximum() {
            return this.maximum;
        }

        public GetSummaryTemplateResponseBodyDataPropertyList setMinLength(Integer minLength) {
            this.minLength = minLength;
            return this;
        }
        public Integer getMinLength() {
            return this.minLength;
        }

        public GetSummaryTemplateResponseBodyDataPropertyList setMinimum(Double minimum) {
            this.minimum = minimum;
            return this;
        }
        public Double getMinimum() {
            return this.minimum;
        }

        public GetSummaryTemplateResponseBodyDataPropertyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSummaryTemplateResponseBodyDataPropertyList setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public GetSummaryTemplateResponseBodyDataPropertyList setPatternErrorMessage(String patternErrorMessage) {
            this.patternErrorMessage = patternErrorMessage;
            return this;
        }
        public String getPatternErrorMessage() {
            return this.patternErrorMessage;
        }

        public GetSummaryTemplateResponseBodyDataPropertyList setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public GetSummaryTemplateResponseBodyDataPropertyList setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public GetSummaryTemplateResponseBodyDataPropertyList setSystem(Boolean system) {
            this.system = system;
            return this;
        }
        public Boolean getSystem() {
            return this.system;
        }

        public GetSummaryTemplateResponseBodyDataPropertyList setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

    }

    public static class GetSummaryTemplateResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the summary category.</p>
         * 
         * <strong>example:</strong>
         * <p>8939-4223-86d0-6bd187905cc8</p>
         */
        @NameInMap("CategoryId")
        public String categoryId;

        /**
         * <p>The user who edited the template.</p>
         * 
         * <strong>example:</strong>
         * <p>editor-xxx@ccc-test</p>
         */
        @NameInMap("Editor")
        public String editor;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>测试模板</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of template fields.</p>
         */
        @NameInMap("PropertyList")
        public java.util.List<GetSummaryTemplateResponseBodyDataPropertyList> propertyList;

        /**
         * <p>The status code.</p>
         * <ul>
         * <li><p>Enabled: The template is enabled.</p>
         * </li>
         * <li><p>Disabled: The template is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>43c2671b-8939-4223-86d0-6bd187905cc8_1717664210492</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        public static GetSummaryTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSummaryTemplateResponseBodyData self = new GetSummaryTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSummaryTemplateResponseBodyData setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public GetSummaryTemplateResponseBodyData setEditor(String editor) {
            this.editor = editor;
            return this;
        }
        public String getEditor() {
            return this.editor;
        }

        public GetSummaryTemplateResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetSummaryTemplateResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSummaryTemplateResponseBodyData setPropertyList(java.util.List<GetSummaryTemplateResponseBodyDataPropertyList> propertyList) {
            this.propertyList = propertyList;
            return this;
        }
        public java.util.List<GetSummaryTemplateResponseBodyDataPropertyList> getPropertyList() {
            return this.propertyList;
        }

        public GetSummaryTemplateResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetSummaryTemplateResponseBodyData setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
