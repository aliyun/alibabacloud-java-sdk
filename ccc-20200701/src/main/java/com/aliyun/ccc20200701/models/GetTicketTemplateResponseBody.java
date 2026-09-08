// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetTicketTemplateResponseBody extends TeaModel {
    /**
     * <p>Response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data.</p>
     */
    @NameInMap("Data")
    public GetTicketTemplateResponseBodyData data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Response message.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>List of error parameters.</p>
     */
    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BF268B34-09C2-43FD-BAC4-5D31EA633111</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetTicketTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTicketTemplateResponseBody self = new GetTicketTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTicketTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTicketTemplateResponseBody setData(GetTicketTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTicketTemplateResponseBodyData getData() {
        return this.data;
    }

    public GetTicketTemplateResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTicketTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTicketTemplateResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public GetTicketTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetTicketTemplateResponseBodyDataTicketFields extends TeaModel {
        /**
         * <p>Whether the field is an array.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Array")
        public Boolean array;

        /**
         * <p>Extension attributes.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Attributes")
        public String attributes;

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1717664210000</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>Creator.</p>
         * 
         * <strong>example:</strong>
         * <p>creator@cccV2-kmz</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>Data type.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>Description.</p>
         * 
         * <strong>example:</strong>
         * <p>姓名描述</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Whether the field is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>Display name.</p>
         * 
         * <strong>example:</strong>
         * <p>姓名</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>Display order in lists.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DisplayOrder")
        public Integer displayOrder;

        /**
         * <p>Editor type.</p>
         * 
         * <strong>example:</strong>
         * <p>textbox</p>
         */
        @NameInMap("EditorType")
        public String editorType;

        /**
         * <p>Maximum length.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("MaxLength")
        public Integer maxLength;

        /**
         * <p>Numeric maximum value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Maximum")
        public Double maximum;

        /**
         * <p>Minimum length.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinLength")
        public Integer minLength;

        /**
         * <p>Numeric minimum value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Minimum")
        public Double minimum;

        /**
         * <p>Name.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Regular expression validation rule.</p>
         * 
         * <strong>example:</strong>
         * <p>^</p>
         */
        @NameInMap("Pattern")
        public String pattern;

        /**
         * <p>Error message for regular expression validation.</p>
         * 
         * <strong>example:</strong>
         * <p>不是有效的email地址</p>
         */
        @NameInMap("PatternErrorMessage")
        public String patternErrorMessage;

        /**
         * <p>Whether the field is read-only.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ReadOnly")
        public Boolean readOnly;

        /**
         * <p>Whether the field is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Required")
        public Boolean required;

        /**
         * <p>Whether the field is a system field.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("System")
        public Boolean system;

        /**
         * <p>Update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1717664210000</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        public static GetTicketTemplateResponseBodyDataTicketFields build(java.util.Map<String, ?> map) throws Exception {
            GetTicketTemplateResponseBodyDataTicketFields self = new GetTicketTemplateResponseBodyDataTicketFields();
            return TeaModel.build(map, self);
        }

        public GetTicketTemplateResponseBodyDataTicketFields setArray(Boolean array) {
            this.array = array;
            return this;
        }
        public Boolean getArray() {
            return this.array;
        }

        public GetTicketTemplateResponseBodyDataTicketFields setAttributes(String attributes) {
            this.attributes = attributes;
            return this;
        }
        public String getAttributes() {
            return this.attributes;
        }

        public GetTicketTemplateResponseBodyDataTicketFields setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public GetTicketTemplateResponseBodyDataTicketFields setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetTicketTemplateResponseBodyDataTicketFields setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetTicketTemplateResponseBodyDataTicketFields setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetTicketTemplateResponseBodyDataTicketFields setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public GetTicketTemplateResponseBodyDataTicketFields setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetTicketTemplateResponseBodyDataTicketFields setDisplayOrder(Integer displayOrder) {
            this.displayOrder = displayOrder;
            return this;
        }
        public Integer getDisplayOrder() {
            return this.displayOrder;
        }

        public GetTicketTemplateResponseBodyDataTicketFields setEditorType(String editorType) {
            this.editorType = editorType;
            return this;
        }
        public String getEditorType() {
            return this.editorType;
        }

        public GetTicketTemplateResponseBodyDataTicketFields setMaxLength(Integer maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        public Integer getMaxLength() {
            return this.maxLength;
        }

        public GetTicketTemplateResponseBodyDataTicketFields setMaximum(Double maximum) {
            this.maximum = maximum;
            return this;
        }
        public Double getMaximum() {
            return this.maximum;
        }

        public GetTicketTemplateResponseBodyDataTicketFields setMinLength(Integer minLength) {
            this.minLength = minLength;
            return this;
        }
        public Integer getMinLength() {
            return this.minLength;
        }

        public GetTicketTemplateResponseBodyDataTicketFields setMinimum(Double minimum) {
            this.minimum = minimum;
            return this;
        }
        public Double getMinimum() {
            return this.minimum;
        }

        public GetTicketTemplateResponseBodyDataTicketFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTicketTemplateResponseBodyDataTicketFields setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public GetTicketTemplateResponseBodyDataTicketFields setPatternErrorMessage(String patternErrorMessage) {
            this.patternErrorMessage = patternErrorMessage;
            return this;
        }
        public String getPatternErrorMessage() {
            return this.patternErrorMessage;
        }

        public GetTicketTemplateResponseBodyDataTicketFields setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public GetTicketTemplateResponseBodyDataTicketFields setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public GetTicketTemplateResponseBodyDataTicketFields setSystem(Boolean system) {
            this.system = system;
            return this;
        }
        public Boolean getSystem() {
            return this.system;
        }

        public GetTicketTemplateResponseBodyDataTicketFields setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

    }

    public static class GetTicketTemplateResponseBodyData extends TeaModel {
        /**
         * <p>Ticket category ID.</p>
         * 
         * <strong>example:</strong>
         * <p>43c2671b-****-4223-86d0-6bd187905cc8</p>
         */
        @NameInMap("CategoryId")
        public String categoryId;

        /**
         * <p>Template editor.</p>
         * 
         * <strong>example:</strong>
         * <p>editor-xxx@ccc-test</p>
         */
        @NameInMap("Editor")
        public String editor;

        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Template name.</p>
         * 
         * <strong>example:</strong>
         * <p>测试模板。</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Workflow information.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;id\&quot;:\&quot;TICKET_START\&quot;,\&quot;name\&quot;:\&quot;开始\&quot;,\&quot;nodeIndex\&quot;:0,\&quot;properties\&quot;:{\&quot;position\&quot;:{\&quot;x\&quot;:250,\&quot;y\&quot;:200}},\&quot;type\&quot;:\&quot;TICKET_START\&quot;,\&quot;events\&quot;:[{\&quot;edgeId\&quot;:\&quot;8bd07339\&quot;,\&quot;sourceAnchor\&quot;:0,\&quot;next\&quot;:\&quot;APPROVAL__JNBSSREc\&quot;,\&quot;targetAnchor\&quot;:0}]},{\&quot;id\&quot;:\&quot;TICKET_FINISH\&quot;,\&quot;name\&quot;:\&quot;结束\&quot;,\&quot;nodeIndex\&quot;:9999,\&quot;properties\&quot;:{\&quot;position\&quot;:{\&quot;x\&quot;:767,\&quot;y\&quot;:206}},\&quot;type\&quot;:\&quot;TICKET_FINISH\&quot;,\&quot;events\&quot;:[]},{\&quot;id\&quot;:\&quot;APPROVAL__JNBSSREc\&quot;,\&quot;name\&quot;:\&quot;流程节点\&quot;,\&quot;nodeIndex\&quot;:1,\&quot;properties\&quot;:{\&quot;skillGroupId\&quot;:\&quot;chat001@cccV2-kmz\&quot;,\&quot;position\&quot;:{\&quot;x\&quot;:537,\&quot;y\&quot;:164.5}},\&quot;type\&quot;:\&quot;APPROVAL\&quot;,\&quot;events\&quot;:[{\&quot;edgeId\&quot;:\&quot;74031613\&quot;,\&quot;sourceAnchor\&quot;:1,\&quot;next\&quot;:\&quot;TICKET_FINISH\&quot;,\&quot;targetAnchor\&quot;:0}]}]</p>
         */
        @NameInMap("ProcessDefinition")
        public String processDefinition;

        /**
         * <p>Status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>Template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4ca2e2-c8d19b82c-d7ce393ac8197d3ab</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>List of template fields.</p>
         */
        @NameInMap("TicketFields")
        public java.util.List<GetTicketTemplateResponseBodyDataTicketFields> ticketFields;

        /**
         * <p>Last modified time.</p>
         * 
         * <strong>example:</strong>
         * <p>1717664210000</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        public static GetTicketTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTicketTemplateResponseBodyData self = new GetTicketTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTicketTemplateResponseBodyData setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public GetTicketTemplateResponseBodyData setEditor(String editor) {
            this.editor = editor;
            return this;
        }
        public String getEditor() {
            return this.editor;
        }

        public GetTicketTemplateResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetTicketTemplateResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTicketTemplateResponseBodyData setProcessDefinition(String processDefinition) {
            this.processDefinition = processDefinition;
            return this;
        }
        public String getProcessDefinition() {
            return this.processDefinition;
        }

        public GetTicketTemplateResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetTicketTemplateResponseBodyData setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetTicketTemplateResponseBodyData setTicketFields(java.util.List<GetTicketTemplateResponseBodyDataTicketFields> ticketFields) {
            this.ticketFields = ticketFields;
            return this;
        }
        public java.util.List<GetTicketTemplateResponseBodyDataTicketFields> getTicketFields() {
            return this.ticketFields;
        }

        public GetTicketTemplateResponseBodyData setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

    }

}
