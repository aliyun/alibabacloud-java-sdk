// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetAddonSchemaResponseBody extends TeaModel {
    /**
     * <p>A list of data table fields.</p>
     */
    @NameInMap("fields")
    public java.util.List<GetAddonSchemaResponseBodyFields> fields;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E5B1D3D4-BB28-5996-8AD2-***********</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The type of the schema.</p>
     * 
     * <strong>example:</strong>
     * <p>common</p>
     */
    @NameInMap("type")
    public String type;

    public static GetAddonSchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAddonSchemaResponseBody self = new GetAddonSchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAddonSchemaResponseBody setFields(java.util.List<GetAddonSchemaResponseBodyFields> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<GetAddonSchemaResponseBodyFields> getFields() {
        return this.fields;
    }

    public GetAddonSchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAddonSchemaResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class GetAddonSchemaResponseBodyFieldsConditions extends TeaModel {
        /**
         * <p>The control mode of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>show</p>
         */
        @NameInMap("action")
        public String action;

        /**
         * <p>The name of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>store.storageTarget</p>
         */
        @NameInMap("field")
        public String field;

        /**
         * <p>The operator for the condition.</p>
         * 
         * <strong>example:</strong>
         * <p>==</p>
         */
        @NameInMap("op")
        public String op;

        /**
         * <p>The target value for the condition.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        @NameInMap("value")
        public Object value;

        public static GetAddonSchemaResponseBodyFieldsConditions build(java.util.Map<String, ?> map) throws Exception {
            GetAddonSchemaResponseBodyFieldsConditions self = new GetAddonSchemaResponseBodyFieldsConditions();
            return TeaModel.build(map, self);
        }

        public GetAddonSchemaResponseBodyFieldsConditions setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetAddonSchemaResponseBodyFieldsConditions setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public GetAddonSchemaResponseBodyFieldsConditions setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

        public GetAddonSchemaResponseBodyFieldsConditions setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

    }

    public static class GetAddonSchemaResponseBodyFieldsPropsDataSource extends TeaModel {
        /**
         * <p>The label.</p>
         * 
         * <strong>example:</strong>
         * <p>tagKey</p>
         */
        @NameInMap("label")
        public String label;

        /**
         * <p>The value of the label.</p>
         * 
         * <strong>example:</strong>
         * <p>tagValue</p>
         */
        @NameInMap("value")
        public String value;

        public static GetAddonSchemaResponseBodyFieldsPropsDataSource build(java.util.Map<String, ?> map) throws Exception {
            GetAddonSchemaResponseBodyFieldsPropsDataSource self = new GetAddonSchemaResponseBodyFieldsPropsDataSource();
            return TeaModel.build(map, self);
        }

        public GetAddonSchemaResponseBodyFieldsPropsDataSource setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetAddonSchemaResponseBodyFieldsPropsDataSource setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetAddonSchemaResponseBodyFieldsProps extends TeaModel {
        /**
         * <p>The information about the data source.</p>
         */
        @NameInMap("dataSource")
        public java.util.List<GetAddonSchemaResponseBodyFieldsPropsDataSource> dataSource;

        /**
         * <p>A collection of related data.</p>
         */
        @NameInMap("related")
        public java.util.List<String> related;

        /**
         * <p>The mode.</p>
         * 
         * <strong>example:</strong>
         * <p>single</p>
         */
        @NameInMap("selectMode")
        public String selectMode;

        public static GetAddonSchemaResponseBodyFieldsProps build(java.util.Map<String, ?> map) throws Exception {
            GetAddonSchemaResponseBodyFieldsProps self = new GetAddonSchemaResponseBodyFieldsProps();
            return TeaModel.build(map, self);
        }

        public GetAddonSchemaResponseBodyFieldsProps setDataSource(java.util.List<GetAddonSchemaResponseBodyFieldsPropsDataSource> dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public java.util.List<GetAddonSchemaResponseBodyFieldsPropsDataSource> getDataSource() {
            return this.dataSource;
        }

        public GetAddonSchemaResponseBodyFieldsProps setRelated(java.util.List<String> related) {
            this.related = related;
            return this;
        }
        public java.util.List<String> getRelated() {
            return this.related;
        }

        public GetAddonSchemaResponseBodyFieldsProps setSelectMode(String selectMode) {
            this.selectMode = selectMode;
            return this;
        }
        public String getSelectMode() {
            return this.selectMode;
        }

    }

    public static class GetAddonSchemaResponseBodyFieldsValidation extends TeaModel {
        /**
         * <p>The maximum value. The value is inclusive.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("max")
        public Integer max;

        /**
         * <p>The maximum length that is supported by the text control.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("maxLength")
        public Integer maxLength;

        /**
         * <p>The details.</p>
         * 
         * <strong>example:</strong>
         * <p>length limit</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>The minimum value.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("min")
        public Integer min;

        /**
         * <p>The minimum length.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("minLength")
        public Integer minLength;

        /**
         * <p>The regular expression.</p>
         * 
         * <strong>example:</strong>
         * <p>^(http|https)://</p>
         */
        @NameInMap("regular")
        public String regular;

        /**
         * <p>Specifies whether the parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("required")
        public Boolean required;

        public static GetAddonSchemaResponseBodyFieldsValidation build(java.util.Map<String, ?> map) throws Exception {
            GetAddonSchemaResponseBodyFieldsValidation self = new GetAddonSchemaResponseBodyFieldsValidation();
            return TeaModel.build(map, self);
        }

        public GetAddonSchemaResponseBodyFieldsValidation setMax(Integer max) {
            this.max = max;
            return this;
        }
        public Integer getMax() {
            return this.max;
        }

        public GetAddonSchemaResponseBodyFieldsValidation setMaxLength(Integer maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        public Integer getMaxLength() {
            return this.maxLength;
        }

        public GetAddonSchemaResponseBodyFieldsValidation setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetAddonSchemaResponseBodyFieldsValidation setMin(Integer min) {
            this.min = min;
            return this;
        }
        public Integer getMin() {
            return this.min;
        }

        public GetAddonSchemaResponseBodyFieldsValidation setMinLength(Integer minLength) {
            this.minLength = minLength;
            return this;
        }
        public Integer getMinLength() {
            return this.minLength;
        }

        public GetAddonSchemaResponseBodyFieldsValidation setRegular(String regular) {
            this.regular = regular;
            return this;
        }
        public String getRegular() {
            return this.regular;
        }

        public GetAddonSchemaResponseBodyFieldsValidation setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

    }

    public static class GetAddonSchemaResponseBodyFields extends TeaModel {
        /**
         * <p>A list of display conditions.</p>
         */
        @NameInMap("conditions")
        public java.util.List<GetAddonSchemaResponseBodyFieldsConditions> conditions;

        /**
         * <p>The default value.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql.default</p>
         */
        @NameInMap("defaultValue")
        public Object defaultValue;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL datasource</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Specifies whether the field is hidden. Valid values: \<code>true\\</code> (hidden) and \<code>false\\</code> (displayed).</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("disabled")
        public Boolean disabled;

        /**
         * <p>The type of the element.</p>
         * 
         * <strong>example:</strong>
         * <p>input</p>
         */
        @NameInMap("element")
        public String element;

        /**
         * <p>The path of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql.host</p>
         */
        @NameInMap("fieldPath")
        public String fieldPath;

        /**
         * <p>The display name of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        @NameInMap("label")
        public String label;

        /**
         * <p>The name of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>host</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The placeholder text.</p>
         * 
         * <strong>example:</strong>
         * <p>Please enter the metrics collection interval</p>
         */
        @NameInMap("placeholder")
        public String placeholder;

        /**
         * <p>Other properties of the component.</p>
         */
        @NameInMap("props")
        public GetAddonSchemaResponseBodyFieldsProps props;

        /**
         * <p>The type of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The validation rule for the field.</p>
         */
        @NameInMap("validation")
        public GetAddonSchemaResponseBodyFieldsValidation validation;

        public static GetAddonSchemaResponseBodyFields build(java.util.Map<String, ?> map) throws Exception {
            GetAddonSchemaResponseBodyFields self = new GetAddonSchemaResponseBodyFields();
            return TeaModel.build(map, self);
        }

        public GetAddonSchemaResponseBodyFields setConditions(java.util.List<GetAddonSchemaResponseBodyFieldsConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<GetAddonSchemaResponseBodyFieldsConditions> getConditions() {
            return this.conditions;
        }

        public GetAddonSchemaResponseBodyFields setDefaultValue(Object defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public Object getDefaultValue() {
            return this.defaultValue;
        }

        public GetAddonSchemaResponseBodyFields setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAddonSchemaResponseBodyFields setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public GetAddonSchemaResponseBodyFields setElement(String element) {
            this.element = element;
            return this;
        }
        public String getElement() {
            return this.element;
        }

        public GetAddonSchemaResponseBodyFields setFieldPath(String fieldPath) {
            this.fieldPath = fieldPath;
            return this;
        }
        public String getFieldPath() {
            return this.fieldPath;
        }

        public GetAddonSchemaResponseBodyFields setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetAddonSchemaResponseBodyFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAddonSchemaResponseBodyFields setPlaceholder(String placeholder) {
            this.placeholder = placeholder;
            return this;
        }
        public String getPlaceholder() {
            return this.placeholder;
        }

        public GetAddonSchemaResponseBodyFields setProps(GetAddonSchemaResponseBodyFieldsProps props) {
            this.props = props;
            return this;
        }
        public GetAddonSchemaResponseBodyFieldsProps getProps() {
            return this.props;
        }

        public GetAddonSchemaResponseBodyFields setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetAddonSchemaResponseBodyFields setValidation(GetAddonSchemaResponseBodyFieldsValidation validation) {
            this.validation = validation;
            return this;
        }
        public GetAddonSchemaResponseBodyFieldsValidation getValidation() {
            return this.validation;
        }

    }

}
