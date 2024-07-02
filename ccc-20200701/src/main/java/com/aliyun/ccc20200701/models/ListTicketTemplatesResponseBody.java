// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListTicketTemplatesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListTicketTemplatesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <strong>example:</strong>
     * <p>8707EB29-BAED-4302-B999-40BA61877437</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListTicketTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTicketTemplatesResponseBody self = new ListTicketTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTicketTemplatesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTicketTemplatesResponseBody setData(ListTicketTemplatesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTicketTemplatesResponseBodyData getData() {
        return this.data;
    }

    public ListTicketTemplatesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListTicketTemplatesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTicketTemplatesResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListTicketTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListTicketTemplatesResponseBodyDataListTicketFields extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Array")
        public Boolean array;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Attribute")
        public String attribute;

        /**
         * <strong>example:</strong>
         * <p>1715780670000</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <strong>example:</strong>
         * <p>creator</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>String</p>
         */
        @NameInMap("DataType")
        public String dataType;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DisplayOrder")
        public Integer displayOrder;

        /**
         * <strong>example:</strong>
         * <p>textbox</p>
         */
        @NameInMap("EditorType")
        public String editorType;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("MaxLength")
        public Integer maxLength;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Maximum")
        public Double maximum;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinLength")
        public Integer minLength;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Minimum")
        public Double minimum;

        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>^</p>
         */
        @NameInMap("Pattern")
        public String pattern;

        @NameInMap("PatternErrorMessage")
        public String patternErrorMessage;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ReadOnly")
        public Boolean readOnly;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Required")
        public Boolean required;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("System")
        public Boolean system;

        /**
         * <strong>example:</strong>
         * <p>1715780670000</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        public static ListTicketTemplatesResponseBodyDataListTicketFields build(java.util.Map<String, ?> map) throws Exception {
            ListTicketTemplatesResponseBodyDataListTicketFields self = new ListTicketTemplatesResponseBodyDataListTicketFields();
            return TeaModel.build(map, self);
        }

        public ListTicketTemplatesResponseBodyDataListTicketFields setArray(Boolean array) {
            this.array = array;
            return this;
        }
        public Boolean getArray() {
            return this.array;
        }

        public ListTicketTemplatesResponseBodyDataListTicketFields setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }
        public String getAttribute() {
            return this.attribute;
        }

        public ListTicketTemplatesResponseBodyDataListTicketFields setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public ListTicketTemplatesResponseBodyDataListTicketFields setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListTicketTemplatesResponseBodyDataListTicketFields setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public ListTicketTemplatesResponseBodyDataListTicketFields setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTicketTemplatesResponseBodyDataListTicketFields setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public ListTicketTemplatesResponseBodyDataListTicketFields setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListTicketTemplatesResponseBodyDataListTicketFields setDisplayOrder(Integer displayOrder) {
            this.displayOrder = displayOrder;
            return this;
        }
        public Integer getDisplayOrder() {
            return this.displayOrder;
        }

        public ListTicketTemplatesResponseBodyDataListTicketFields setEditorType(String editorType) {
            this.editorType = editorType;
            return this;
        }
        public String getEditorType() {
            return this.editorType;
        }

        public ListTicketTemplatesResponseBodyDataListTicketFields setMaxLength(Integer maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        public Integer getMaxLength() {
            return this.maxLength;
        }

        public ListTicketTemplatesResponseBodyDataListTicketFields setMaximum(Double maximum) {
            this.maximum = maximum;
            return this;
        }
        public Double getMaximum() {
            return this.maximum;
        }

        public ListTicketTemplatesResponseBodyDataListTicketFields setMinLength(Integer minLength) {
            this.minLength = minLength;
            return this;
        }
        public Integer getMinLength() {
            return this.minLength;
        }

        public ListTicketTemplatesResponseBodyDataListTicketFields setMinimum(Double minimum) {
            this.minimum = minimum;
            return this;
        }
        public Double getMinimum() {
            return this.minimum;
        }

        public ListTicketTemplatesResponseBodyDataListTicketFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTicketTemplatesResponseBodyDataListTicketFields setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public ListTicketTemplatesResponseBodyDataListTicketFields setPatternErrorMessage(String patternErrorMessage) {
            this.patternErrorMessage = patternErrorMessage;
            return this;
        }
        public String getPatternErrorMessage() {
            return this.patternErrorMessage;
        }

        public ListTicketTemplatesResponseBodyDataListTicketFields setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public ListTicketTemplatesResponseBodyDataListTicketFields setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public ListTicketTemplatesResponseBodyDataListTicketFields setSystem(Boolean system) {
            this.system = system;
            return this;
        }
        public Boolean getSystem() {
            return this.system;
        }

        public ListTicketTemplatesResponseBodyDataListTicketFields setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

    }

    public static class ListTicketTemplatesResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AppliedVersion")
        public String appliedVersion;

        /**
         * <strong>example:</strong>
         * <p>43c2671b-*****-4223-86d0-6bd187905cc8</p>
         */
        @NameInMap("CategoryId")
        public String categoryId;

        /**
         * <strong>example:</strong>
         * <p>creator@ccc-test</p>
         */
        @NameInMap("Editor")
        public String editor;

        /**
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>1715780670000</p>
         */
        @NameInMap("LatestVersion")
        public String latestVersion;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProcessDefinition")
        public String processDefinition;

        /**
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>b5c21219-3a1e-4bc0-92e7-da66e057d2f6</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TicketFields")
        public java.util.List<ListTicketTemplatesResponseBodyDataListTicketFields> ticketFields;

        /**
         * <strong>example:</strong>
         * <p>1715780670000</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        public static ListTicketTemplatesResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListTicketTemplatesResponseBodyDataList self = new ListTicketTemplatesResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListTicketTemplatesResponseBodyDataList setAppliedVersion(String appliedVersion) {
            this.appliedVersion = appliedVersion;
            return this;
        }
        public String getAppliedVersion() {
            return this.appliedVersion;
        }

        public ListTicketTemplatesResponseBodyDataList setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public ListTicketTemplatesResponseBodyDataList setEditor(String editor) {
            this.editor = editor;
            return this;
        }
        public String getEditor() {
            return this.editor;
        }

        public ListTicketTemplatesResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListTicketTemplatesResponseBodyDataList setLatestVersion(String latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }
        public String getLatestVersion() {
            return this.latestVersion;
        }

        public ListTicketTemplatesResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTicketTemplatesResponseBodyDataList setProcessDefinition(String processDefinition) {
            this.processDefinition = processDefinition;
            return this;
        }
        public String getProcessDefinition() {
            return this.processDefinition;
        }

        public ListTicketTemplatesResponseBodyDataList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListTicketTemplatesResponseBodyDataList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListTicketTemplatesResponseBodyDataList setTicketFields(java.util.List<ListTicketTemplatesResponseBodyDataListTicketFields> ticketFields) {
            this.ticketFields = ticketFields;
            return this;
        }
        public java.util.List<ListTicketTemplatesResponseBodyDataListTicketFields> getTicketFields() {
            return this.ticketFields;
        }

        public ListTicketTemplatesResponseBodyDataList setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

    }

    public static class ListTicketTemplatesResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListTicketTemplatesResponseBodyDataList> list;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListTicketTemplatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTicketTemplatesResponseBodyData self = new ListTicketTemplatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTicketTemplatesResponseBodyData setList(java.util.List<ListTicketTemplatesResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListTicketTemplatesResponseBodyDataList> getList() {
            return this.list;
        }

        public ListTicketTemplatesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListTicketTemplatesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListTicketTemplatesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
