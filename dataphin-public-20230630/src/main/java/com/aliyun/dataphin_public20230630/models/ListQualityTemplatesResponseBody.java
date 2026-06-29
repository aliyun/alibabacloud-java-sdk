// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListQualityTemplatesResponseBody extends TeaModel {
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
     * <p>The details of the backend exception.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The paged query result.</p>
     */
    @NameInMap("PageResult")
    public ListQualityTemplatesResponseBodyPageResult pageResult;

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

    public static ListQualityTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQualityTemplatesResponseBody self = new ListQualityTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQualityTemplatesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListQualityTemplatesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListQualityTemplatesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListQualityTemplatesResponseBody setPageResult(ListQualityTemplatesResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListQualityTemplatesResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListQualityTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQualityTemplatesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListQualityTemplatesResponseBodyPageResultQualityTemplateListFormPropertyList extends TeaModel {
        /**
         * <p>The control type.</p>
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

        public static ListQualityTemplatesResponseBodyPageResultQualityTemplateListFormPropertyList build(java.util.Map<String, ?> map) throws Exception {
            ListQualityTemplatesResponseBodyPageResultQualityTemplateListFormPropertyList self = new ListQualityTemplatesResponseBodyPageResultQualityTemplateListFormPropertyList();
            return TeaModel.build(map, self);
        }

        public ListQualityTemplatesResponseBodyPageResultQualityTemplateListFormPropertyList setComponentType(String componentType) {
            this.componentType = componentType;
            return this;
        }
        public String getComponentType() {
            return this.componentType;
        }

        public ListQualityTemplatesResponseBodyPageResultQualityTemplateListFormPropertyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListQualityTemplatesResponseBodyPageResultQualityTemplateListFormPropertyList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListQualityTemplatesResponseBodyPageResultQualityTemplateList extends TeaModel {
        /**
         * <p>The template category. Valid values:</p>
         * <ul>
         * <li>CONSISTENT: consistency</li>
         * <li>EFFECTIVE: validity</li>
         * <li>TIMELINESE: timeliness</li>
         * <li>ACCURATE: accuracy</li>
         * <li>UNIQUENESS: uniqueness</li>
         * <li>COMPLETENESS: completeness</li>
         * <li>STABILITY: stability</li>
         * <li>CUSTOM: custom.</li>
         * </ul>
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
         * <p>一致性</p>
         */
        @NameInMap("CatalogName")
        public String catalogName;

        /**
         * <p>The creation time.</p>
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
        public java.util.List<ListQualityTemplatesResponseBodyPageResultQualityTemplateListFormPropertyList> formPropertyList;

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
         * <p>The modification time.</p>
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
         * <p>The supported data source types, such as MySQL, Oracle, Microsoft SQL Server, MaxCompute, and Hive.</p>
         */
        @NameInMap("SupportDataSourceTypeList")
        public java.util.List<String> supportDataSourceTypeList;

        /**
         * <p>The templatetype. Valid values:</p>
         * <ul>
         * <li>FIELD_NULL_VALUE_VALIDATE: field null value check</li>
         * <li>FIELD_EMPTY_STRING_VALIDATE: field empty character string check</li>
         * <li>FIELD_UNIQUE_VALIDATE: field uniqueness check</li>
         * <li>FIELD_GROUP_COUNT_VALIDATE: field unique value count check</li>
         * <li>FIELD_DUPLICATE_VALUE_COUNT_VALIDATE: field duplicate value count check</li>
         * <li>FUNCTION_TIME_COMPARE: time function comparison</li>
         * <li>SINGLE_TABLE_TIME_COMPARE: non-partitioned table time field comparison</li>
         * <li>DOUBLE_TABLE_TIME_COMPARE: two-table time field comparison</li>
         * <li>FIELD_FORMAT_VALIDATE: field format check</li>
         * <li>FIELD_LENGTH_VALIDATE: field length check</li>
         * <li>FIELD_VALUE_RANGE_VALIDATE: field value range check</li>
         * <li>CODE_TABLE_COMPARE: lookup table reference comparison</li>
         * <li>STANDARD_CODE_TABLE_COMPARE: data standard lookup table reference comparison</li>
         * <li>SINGLE_TABLE_FIELD_VALUE_COMPARE: non-partitioned table field value consistency comparison</li>
         * <li>SINGLE_TABLE_FIELD_STATISTICAL_COMPARE: non-partitioned table field statistical value consistency comparison</li>
         * <li>SINGLE_TABLE_FIELD_EXP_COMPARE: non-partitioned table field business logic consistency comparison</li>
         * <li>DOUBLE_TABLE_FIELD_VALUE_COMPARE: two-table field value consistency comparison</li>
         * <li>DOUBLE_TABLE_FIELD_STATISTICAL_COMPARE: two-table field statistical value consistency comparison</li>
         * <li>CROSS_DOUBLE_TABLE_FIELD_STATISTICAL_COMPARE: cross-source two-table field statistical value consistency comparison</li>
         * <li>DOUBLE_TABLE_FIELD_EXP_COMPARE: two-table field business logic consistency comparison</li>
         * <li>TABLE_STABILITY_VALIDATE: table stability check</li>
         * <li>TABLE_FLUCTUATION_VALIDATE: table fluctuation check</li>
         * <li>FIELD_STABILITY_VALIDATE: field stability check</li>
         * <li>FIELD_FLUCTUATION_VALIDATE: field fluctuation check</li>
         * <li>CUSTOM_STATISTICAL_VALIDATE: custom statistical metric check</li>
         * <li>CUSTOM_DATA_DETAILS_VALIDATE: custom data details check</li>
         * <li>DATASOURCE_AVAILABLE_CHECK: data source connectivity monitoring</li>
         * <li>TABLE_SCHEMA_CHECK: table schema change monitoring</li>
         * <li>REAL_TIME_OFFLINE_COMPARE: real-time and offline comparison</li>
         * <li>REAL_TIME_STATISTICAL_VALIDATE: real-time statistical value monitoring</li>
         * <li>REAL_TIME_MULTI_CHAIN_COMPARE: real-time multi-link comparison.</li>
         * </ul>
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
         * <p>字段空值校验</p>
         */
        @NameInMap("TypeName")
        public String typeName;

        public static ListQualityTemplatesResponseBodyPageResultQualityTemplateList build(java.util.Map<String, ?> map) throws Exception {
            ListQualityTemplatesResponseBodyPageResultQualityTemplateList self = new ListQualityTemplatesResponseBodyPageResultQualityTemplateList();
            return TeaModel.build(map, self);
        }

        public ListQualityTemplatesResponseBodyPageResultQualityTemplateList setCatalog(String catalog) {
            this.catalog = catalog;
            return this;
        }
        public String getCatalog() {
            return this.catalog;
        }

        public ListQualityTemplatesResponseBodyPageResultQualityTemplateList setCatalogName(String catalogName) {
            this.catalogName = catalogName;
            return this;
        }
        public String getCatalogName() {
            return this.catalogName;
        }

        public ListQualityTemplatesResponseBodyPageResultQualityTemplateList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListQualityTemplatesResponseBodyPageResultQualityTemplateList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListQualityTemplatesResponseBodyPageResultQualityTemplateList setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ListQualityTemplatesResponseBodyPageResultQualityTemplateList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListQualityTemplatesResponseBodyPageResultQualityTemplateList setFormPropertyList(java.util.List<ListQualityTemplatesResponseBodyPageResultQualityTemplateListFormPropertyList> formPropertyList) {
            this.formPropertyList = formPropertyList;
            return this;
        }
        public java.util.List<ListQualityTemplatesResponseBodyPageResultQualityTemplateListFormPropertyList> getFormPropertyList() {
            return this.formPropertyList;
        }

        public ListQualityTemplatesResponseBodyPageResultQualityTemplateList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListQualityTemplatesResponseBodyPageResultQualityTemplateList setIsSystemTemplate(Boolean isSystemTemplate) {
            this.isSystemTemplate = isSystemTemplate;
            return this;
        }
        public Boolean getIsSystemTemplate() {
            return this.isSystemTemplate;
        }

        public ListQualityTemplatesResponseBodyPageResultQualityTemplateList setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListQualityTemplatesResponseBodyPageResultQualityTemplateList setModifierName(String modifierName) {
            this.modifierName = modifierName;
            return this;
        }
        public String getModifierName() {
            return this.modifierName;
        }

        public ListQualityTemplatesResponseBodyPageResultQualityTemplateList setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListQualityTemplatesResponseBodyPageResultQualityTemplateList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListQualityTemplatesResponseBodyPageResultQualityTemplateList setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListQualityTemplatesResponseBodyPageResultQualityTemplateList setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public ListQualityTemplatesResponseBodyPageResultQualityTemplateList setSupportAllDataSourceType(Boolean supportAllDataSourceType) {
            this.supportAllDataSourceType = supportAllDataSourceType;
            return this;
        }
        public Boolean getSupportAllDataSourceType() {
            return this.supportAllDataSourceType;
        }

        public ListQualityTemplatesResponseBodyPageResultQualityTemplateList setSupportDataSourceTypeList(java.util.List<String> supportDataSourceTypeList) {
            this.supportDataSourceTypeList = supportDataSourceTypeList;
            return this;
        }
        public java.util.List<String> getSupportDataSourceTypeList() {
            return this.supportDataSourceTypeList;
        }

        public ListQualityTemplatesResponseBodyPageResultQualityTemplateList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListQualityTemplatesResponseBodyPageResultQualityTemplateList setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

    }

    public static class ListQualityTemplatesResponseBodyPageResult extends TeaModel {
        /**
         * <p>The list of quality templates.</p>
         */
        @NameInMap("QualityTemplateList")
        public java.util.List<ListQualityTemplatesResponseBodyPageResultQualityTemplateList> qualityTemplateList;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>68</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListQualityTemplatesResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListQualityTemplatesResponseBodyPageResult self = new ListQualityTemplatesResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListQualityTemplatesResponseBodyPageResult setQualityTemplateList(java.util.List<ListQualityTemplatesResponseBodyPageResultQualityTemplateList> qualityTemplateList) {
            this.qualityTemplateList = qualityTemplateList;
            return this;
        }
        public java.util.List<ListQualityTemplatesResponseBodyPageResultQualityTemplateList> getQualityTemplateList() {
            return this.qualityTemplateList;
        }

        public ListQualityTemplatesResponseBodyPageResult setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
