// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetAssetTypeAttributeCodesResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of property definitions.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetAssetTypeAttributeCodesResponseBodyData> data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The backend exception details.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAssetTypeAttributeCodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAssetTypeAttributeCodesResponseBody self = new GetAssetTypeAttributeCodesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAssetTypeAttributeCodesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAssetTypeAttributeCodesResponseBody setData(java.util.List<GetAssetTypeAttributeCodesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetAssetTypeAttributeCodesResponseBodyData> getData() {
        return this.data;
    }

    public GetAssetTypeAttributeCodesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAssetTypeAttributeCodesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAssetTypeAttributeCodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAssetTypeAttributeCodesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAssetTypeAttributeCodesResponseBodyDataEnumValues extends TeaModel {
        /**
         * <p>The display name of the option.</p>
         * 
         * <strong>example:</strong>
         * <p>Core</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The option value.</p>
         * 
         * <strong>example:</strong>
         * <p>L1</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetAssetTypeAttributeCodesResponseBodyDataEnumValues build(java.util.Map<String, ?> map) throws Exception {
            GetAssetTypeAttributeCodesResponseBodyDataEnumValues self = new GetAssetTypeAttributeCodesResponseBodyDataEnumValues();
            return TeaModel.build(map, self);
        }

        public GetAssetTypeAttributeCodesResponseBodyDataEnumValues setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetAssetTypeAttributeCodesResponseBodyDataEnumValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetAssetTypeAttributeCodesResponseBodyData extends TeaModel {
        /**
         * <p>The property code (unique identifier).</p>
         * 
         * <strong>example:</strong>
         * <p>data_level</p>
         */
        @NameInMap("AttributeCode")
        public String attributeCode;

        /**
         * <p>The property name (display name).</p>
         * 
         * <strong>example:</strong>
         * <p>Data level</p>
         */
        @NameInMap("AttributeName")
        public String attributeName;

        /**
         * <p>The property source. Valid values:</p>
         * <ul>
         * <li>SYSTEM: system preset.</li>
         * <li>CUSTOM: custom.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("AttributeSource")
        public String attributeSource;

        /**
         * <p>The property type. Valid values:</p>
         * <ul>
         * <li>MANAGEMENT: management property.</li>
         * <li>TECHNICAL: technical property.</li>
         * <li>BUSINESS: business property.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MANAGEMENT</p>
         */
        @NameInMap("AttributeType")
        public String attributeType;

        /**
         * <p>The property description.</p>
         * 
         * <strong>example:</strong>
         * <p>Data asset level classification</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The location where the property can be edited. Valid values:</p>
         * <ul>
         * <li>ASSET: asset catalog.</li>
         * <li>DEVELOPMENT: development.</li>
         * </ul>
         */
        @NameInMap("EditableIn")
        public java.util.List<String> editableIn;

        /**
         * <p>The source of dropdown options. Valid values:</p>
         * <ul>
         * <li>MANUAL: manual input.</li>
         * <li>SYSTEM_REFERENCE: reference to a system property.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MANUAL</p>
         */
        @NameInMap("EnumSourceType")
        public String enumSourceType;

        /**
         * <p>The list of dropdown options. This parameter has a value only when EnumSourceType is set to MANUAL.</p>
         */
        @NameInMap("EnumValues")
        public java.util.List<GetAssetTypeAttributeCodesResponseBodyDataEnumValues> enumValues;

        /**
         * <p>The input mode. Valid values:</p>
         * <ul>
         * <li>CUSTOM_INPUT: custom input.</li>
         * <li>DROPDOWN_SINGLE: single-select dropdown.</li>
         * <li>DROPDOWN_MULTI: multi-select dropdown.</li>
         * <li>HYPERLINK: hyperlink.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DROPDOWN_SINGLE</p>
         */
        @NameInMap("InputMode")
        public String inputMode;

        /**
         * <p>The hyperlink navigation method. This parameter has a value only when InputMode is set to HYPERLINK. Valid values:</p>
         * <ul>
         * <li>CURRENT_PAGE: opens in the current page.</li>
         * <li>NEW_PAGE: opens in a new page.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NEW_PAGE</p>
         */
        @NameInMap("LinkTarget")
        public String linkTarget;

        /**
         * <p>The maximum length. This parameter is valid only when ValueType is set to STRING.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxLength")
        public Integer maxLength;

        /**
         * <p>Indicates whether the property is required.</p>
         */
        @NameInMap("Required")
        public Boolean required;

        /**
         * <p>The type of the referenced system property. This parameter has a value only when EnumSourceType is set to SYSTEM_REFERENCE.</p>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("SystemReferenceType")
        public String systemReferenceType;

        /**
         * <p>The data type of the property value.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("ValueType")
        public String valueType;

        /**
         * <p>The location where the property is visible. Valid values:</p>
         * <ul>
         * <li>ASSET: asset catalog.</li>
         * <li>DEVELOPMENT: development.</li>
         * </ul>
         */
        @NameInMap("VisibleIn")
        public java.util.List<String> visibleIn;

        public static GetAssetTypeAttributeCodesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAssetTypeAttributeCodesResponseBodyData self = new GetAssetTypeAttributeCodesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAssetTypeAttributeCodesResponseBodyData setAttributeCode(String attributeCode) {
            this.attributeCode = attributeCode;
            return this;
        }
        public String getAttributeCode() {
            return this.attributeCode;
        }

        public GetAssetTypeAttributeCodesResponseBodyData setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public GetAssetTypeAttributeCodesResponseBodyData setAttributeSource(String attributeSource) {
            this.attributeSource = attributeSource;
            return this;
        }
        public String getAttributeSource() {
            return this.attributeSource;
        }

        public GetAssetTypeAttributeCodesResponseBodyData setAttributeType(String attributeType) {
            this.attributeType = attributeType;
            return this;
        }
        public String getAttributeType() {
            return this.attributeType;
        }

        public GetAssetTypeAttributeCodesResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAssetTypeAttributeCodesResponseBodyData setEditableIn(java.util.List<String> editableIn) {
            this.editableIn = editableIn;
            return this;
        }
        public java.util.List<String> getEditableIn() {
            return this.editableIn;
        }

        public GetAssetTypeAttributeCodesResponseBodyData setEnumSourceType(String enumSourceType) {
            this.enumSourceType = enumSourceType;
            return this;
        }
        public String getEnumSourceType() {
            return this.enumSourceType;
        }

        public GetAssetTypeAttributeCodesResponseBodyData setEnumValues(java.util.List<GetAssetTypeAttributeCodesResponseBodyDataEnumValues> enumValues) {
            this.enumValues = enumValues;
            return this;
        }
        public java.util.List<GetAssetTypeAttributeCodesResponseBodyDataEnumValues> getEnumValues() {
            return this.enumValues;
        }

        public GetAssetTypeAttributeCodesResponseBodyData setInputMode(String inputMode) {
            this.inputMode = inputMode;
            return this;
        }
        public String getInputMode() {
            return this.inputMode;
        }

        public GetAssetTypeAttributeCodesResponseBodyData setLinkTarget(String linkTarget) {
            this.linkTarget = linkTarget;
            return this;
        }
        public String getLinkTarget() {
            return this.linkTarget;
        }

        public GetAssetTypeAttributeCodesResponseBodyData setMaxLength(Integer maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        public Integer getMaxLength() {
            return this.maxLength;
        }

        public GetAssetTypeAttributeCodesResponseBodyData setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public GetAssetTypeAttributeCodesResponseBodyData setSystemReferenceType(String systemReferenceType) {
            this.systemReferenceType = systemReferenceType;
            return this;
        }
        public String getSystemReferenceType() {
            return this.systemReferenceType;
        }

        public GetAssetTypeAttributeCodesResponseBodyData setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

        public GetAssetTypeAttributeCodesResponseBodyData setVisibleIn(java.util.List<String> visibleIn) {
            this.visibleIn = visibleIn;
            return this;
        }
        public java.util.List<String> getVisibleIn() {
            return this.visibleIn;
        }

    }

}
