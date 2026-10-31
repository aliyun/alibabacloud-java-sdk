// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetQualityTemplateResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

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
     * <p>The template object details.</p>
     */
    @NameInMap("QualityTemplateInfo")
    public GetQualityTemplateResponseBodyQualityTemplateInfo qualityTemplateInfo;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetQualityTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQualityTemplateResponseBody self = new GetQualityTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQualityTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetQualityTemplateResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetQualityTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQualityTemplateResponseBody setQualityTemplateInfo(GetQualityTemplateResponseBodyQualityTemplateInfo qualityTemplateInfo) {
        this.qualityTemplateInfo = qualityTemplateInfo;
        return this;
    }
    public GetQualityTemplateResponseBodyQualityTemplateInfo getQualityTemplateInfo() {
        return this.qualityTemplateInfo;
    }

    public GetQualityTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQualityTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetQualityTemplateResponseBodyQualityTemplateInfoFormPropertyList extends TeaModel {
        /**
         * <p>The component type.</p>
         * 
         * <strong>example:</strong>
         * <p>expression</p>
         */
        @NameInMap("ComponentType")
        public String componentType;

        /**
         * <p>The property name.</p>
         * 
         * <strong>example:</strong>
         * <p>col</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The property value.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetQualityTemplateResponseBodyQualityTemplateInfoFormPropertyList build(java.util.Map<String, ?> map) throws Exception {
            GetQualityTemplateResponseBodyQualityTemplateInfoFormPropertyList self = new GetQualityTemplateResponseBodyQualityTemplateInfoFormPropertyList();
            return TeaModel.build(map, self);
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfoFormPropertyList setComponentType(String componentType) {
            this.componentType = componentType;
            return this;
        }
        public String getComponentType() {
            return this.componentType;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfoFormPropertyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfoFormPropertyList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetQualityTemplateResponseBodyQualityTemplateInfo extends TeaModel {
        /**
         * <p>The template category. Valid values: CONSISTENT: consistency, EFFECTIVE: effectiveness, TIMELINESE: timeliness, ACCURATE: accuracy, UNIQUENESS: uniqueness, COMPLETENESS: completeness, STABILITY: stability, and CUSTOM: custom.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSISTENT</p>
         */
        @NameInMap("Catalog")
        public String catalog;

        /**
         * <p>The display name of the template category.</p>
         * 
         * <strong>example:</strong>
         * <p>Consistency</p>
         */
        @NameInMap("CatalogName")
        public String catalogName;

        /**
         * <p>The creation time. The format is YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The user ID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The name of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        /**
         * <p>The template description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The rule configuration key-value pairs.</p>
         */
        @NameInMap("FormPropertyList")
        public java.util.List<GetQualityTemplateResponseBodyQualityTemplateInfoFormPropertyList> formPropertyList;

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Indicates whether the template is a system template.</p>
         */
        @NameInMap("IsSystemTemplate")
        public Boolean isSystemTemplate;

        /**
         * <p>The user ID of the last modifier.</p>
         * 
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("Modifier")
        public String modifier;

        /**
         * <p>The name of the last modifier.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ModifierName")
        public String modifierName;

        /**
         * <p>The update time. The format is YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The user ID of the owner.</p>
         * 
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The name of the owner.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <p>Indicates whether all data source types are supported.</p>
         */
        @NameInMap("SupportAllDataSourceType")
        public Boolean supportAllDataSourceType;

        /**
         * <p>The supported specific data source types, such as MySQL, Oracle, Microsoft SQL Server, MaxCompute, and Hive.</p>
         */
        @NameInMap("SupportDataSourceTypeList")
        public java.util.List<String> supportDataSourceTypeList;

        /**
         * <p>The templatetype. Valid values: FIELD_NULL_VALUE_VALIDATE: field null value check, FIELD_EMPTY_STRING_VALIDATE: field empty character string check, FIELD_UNIQUE_VALIDATE: field uniqueness check, FIELD_GROUP_COUNT_VALIDATE: field unique value count check, FIELD_DUPLICATE_VALUE_COUNT_VALIDATE: field duplicate value count check, FUNCTION_TIME_COMPARE: time function comparison, SINGLE_TABLE_TIME_COMPARE: non-partitioned table time field comparison, DOUBLE_TABLE_TIME_COMPARE: double-table time field comparison, FIELD_FORMAT_VALIDATE: field format check, FIELD_LENGTH_VALIDATE: field length check, FIELD_VALUE_RANGE_VALIDATE: field value range check, CODE_TABLE_COMPARE: lookup table reference comparison, STANDARD_CODE_TABLE_COMPARE: data standard lookup table reference comparison, SINGLE_TABLE_FIELD_VALUE_COMPARE: non-partitioned table field value consistency comparison, SINGLE_TABLE_FIELD_STATISTICAL_COMPARE: non-partitioned table field statistical value consistency comparison, SINGLE_TABLE_FIELD_EXP_COMPARE: non-partitioned table field business logic consistency comparison, DOUBLE_TABLE_FIELD_VALUE_COMPARE: double-table field value consistency comparison, DOUBLE_TABLE_FIELD_STATISTICAL_COMPARE: double-table field statistical value consistency comparison, CROSS_DOUBLE_TABLE_FIELD_STATISTICAL_COMPARE: cross-source double-table field statistical value consistency comparison, DOUBLE_TABLE_FIELD_EXP_COMPARE: double-table field business logic consistency comparison, TABLE_STABILITY_VALIDATE: table stability check, TABLE_FLUCTUATION_VALIDATE: table fluctuation check, FIELD_STABILITY_VALIDATE: field stability check, FIELD_FLUCTUATION_VALIDATE: field fluctuation check, CUSTOM_STATISTICAL_VALIDATE: custom statistical metric check, CUSTOM_DATA_DETAILS_VALIDATE: custom data details check, DATASOURCE_AVAILABLE_CHECK: data source connectivity check, TABLE_SCHEMA_CHECK: table schema change check, REAL_TIME_OFFLINE_COMPARE: real-time and offline comparison, REAL_TIME_STATISTICAL_VALIDATE: real-time statistical value check, and REAL_TIME_MULTI_CHAIN_COMPARE: real-time multi-link comparison.</p>
         * 
         * <strong>example:</strong>
         * <p>FIELD_NULL_VALUE_VALIDATE</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The display name of the templatetype.</p>
         * 
         * <strong>example:</strong>
         * <p>Field null value check</p>
         */
        @NameInMap("TypeName")
        public String typeName;

        public static GetQualityTemplateResponseBodyQualityTemplateInfo build(java.util.Map<String, ?> map) throws Exception {
            GetQualityTemplateResponseBodyQualityTemplateInfo self = new GetQualityTemplateResponseBodyQualityTemplateInfo();
            return TeaModel.build(map, self);
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfo setCatalog(String catalog) {
            this.catalog = catalog;
            return this;
        }
        public String getCatalog() {
            return this.catalog;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfo setCatalogName(String catalogName) {
            this.catalogName = catalogName;
            return this;
        }
        public String getCatalogName() {
            return this.catalogName;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfo setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfo setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfo setFormPropertyList(java.util.List<GetQualityTemplateResponseBodyQualityTemplateInfoFormPropertyList> formPropertyList) {
            this.formPropertyList = formPropertyList;
            return this;
        }
        public java.util.List<GetQualityTemplateResponseBodyQualityTemplateInfoFormPropertyList> getFormPropertyList() {
            return this.formPropertyList;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfo setIsSystemTemplate(Boolean isSystemTemplate) {
            this.isSystemTemplate = isSystemTemplate;
            return this;
        }
        public Boolean getIsSystemTemplate() {
            return this.isSystemTemplate;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfo setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfo setModifierName(String modifierName) {
            this.modifierName = modifierName;
            return this;
        }
        public String getModifierName() {
            return this.modifierName;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfo setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfo setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfo setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfo setSupportAllDataSourceType(Boolean supportAllDataSourceType) {
            this.supportAllDataSourceType = supportAllDataSourceType;
            return this;
        }
        public Boolean getSupportAllDataSourceType() {
            return this.supportAllDataSourceType;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfo setSupportDataSourceTypeList(java.util.List<String> supportDataSourceTypeList) {
            this.supportDataSourceTypeList = supportDataSourceTypeList;
            return this;
        }
        public java.util.List<String> getSupportDataSourceTypeList() {
            return this.supportDataSourceTypeList;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfo setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

    }

}
