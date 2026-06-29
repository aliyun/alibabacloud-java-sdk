// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpsertQualityTemplateRequest extends TeaModel {
    /**
     * <p>Tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>Upsert command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpsertCommand")
    public UpsertQualityTemplateRequestUpsertCommand upsertCommand;

    public static UpsertQualityTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpsertQualityTemplateRequest self = new UpsertQualityTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpsertQualityTemplateRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpsertQualityTemplateRequest setUpsertCommand(UpsertQualityTemplateRequestUpsertCommand upsertCommand) {
        this.upsertCommand = upsertCommand;
        return this;
    }
    public UpsertQualityTemplateRequestUpsertCommand getUpsertCommand() {
        return this.upsertCommand;
    }

    public static class UpsertQualityTemplateRequestUpsertCommandFormPropertyList extends TeaModel {
        /**
         * <p>Component type.</p>
         * 
         * <strong>example:</strong>
         * <p>expression</p>
         */
        @NameInMap("ComponentType")
        public String componentType;

        /**
         * <p>Property name.</p>
         * 
         * <strong>example:</strong>
         * <p>col</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Property value.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpsertQualityTemplateRequestUpsertCommandFormPropertyList build(java.util.Map<String, ?> map) throws Exception {
            UpsertQualityTemplateRequestUpsertCommandFormPropertyList self = new UpsertQualityTemplateRequestUpsertCommandFormPropertyList();
            return TeaModel.build(map, self);
        }

        public UpsertQualityTemplateRequestUpsertCommandFormPropertyList setComponentType(String componentType) {
            this.componentType = componentType;
            return this;
        }
        public String getComponentType() {
            return this.componentType;
        }

        public UpsertQualityTemplateRequestUpsertCommandFormPropertyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpsertQualityTemplateRequestUpsertCommandFormPropertyList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpsertQualityTemplateRequestUpsertCommand extends TeaModel {
        /**
         * <p>Template category. Valid values: CONSISTENT: consistency. EFFECTIVE: validity. TIMELINESE: timeliness. ACCURATE: accuracy. UNIQUENESS: uniqueness. COMPLETENESS: completeness. STABILITY: stability. CUSTOM: custom.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSISTENT</p>
         */
        @NameInMap("Catalog")
        public String catalog;

        /**
         * <p>Template description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Rule configuration key-value pairs.</p>
         */
        @NameInMap("FormPropertyList")
        public java.util.List<UpsertQualityTemplateRequestUpsertCommandFormPropertyList> formPropertyList;

        /**
         * <p>Template ID. If specified, it indicates an update operation. If not specified, it indicates a creation operation.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Template name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Template owner ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>Supported data source types, such as MySQL, Oracle, Microsoft SQL Server, MaxCompute, and Hive.</p>
         */
        @NameInMap("SupportDataSourceTypeList")
        public java.util.List<String> supportDataSourceTypeList;

        /**
         * <p>Template type. Valid values: FIELD_NULL_VALUE_VALIDATE: field null value validation. FIELD_EMPTY_STRING_VALIDATE: field empty string validation. FIELD_UNIQUE_VALIDATE: field uniqueness validation. FIELD_GROUP_COUNT_VALIDATE: field unique value count validation. FIELD_DUPLICATE_VALUE_COUNT_VALIDATE: field duplicate value count validation. FUNCTION_TIME_COMPARE: time function comparison. SINGLE_TABLE_TIME_COMPARE: single-table time field comparison. DOUBLE_TABLE_TIME_COMPARE: cross-table time field comparison. FIELD_FORMAT_VALIDATE: field format validation. FIELD_LENGTH_VALIDATE: field length validation. FIELD_VALUE_RANGE_VALIDATE: field value range validation. CODE_TABLE_COMPARE: code table reference comparison. STANDARD_CODE_TABLE_COMPARE: data standard code table reference comparison. SINGLE_TABLE_FIELD_VALUE_COMPARE: single-table field value consistency comparison. SINGLE_TABLE_FIELD_STATISTICAL_COMPARE: single-table field statistical value consistency comparison. SINGLE_TABLE_FIELD_EXP_COMPARE: single-table field business logic consistency comparison. DOUBLE_TABLE_FIELD_VALUE_COMPARE: cross-table field value consistency comparison. DOUBLE_TABLE_FIELD_STATISTICAL_COMPARE: cross-table field statistical value consistency comparison. CROSS_DOUBLE_TABLE_FIELD_STATISTICAL_COMPARE: cross-source cross-table field statistical value consistency comparison. DOUBLE_TABLE_FIELD_EXP_COMPARE: cross-table field business logic consistency comparison. TABLE_STABILITY_VALIDATE: table stability validation. TABLE_FLUCTUATION_VALIDATE: table fluctuation validation. FIELD_STABILITY_VALIDATE: field stability validation. FIELD_FLUCTUATION_VALIDATE: field fluctuation validation. CUSTOM_STATISTICAL_VALIDATE: custom statistical metric validation. CUSTOM_DATA_DETAILS_VALIDATE: custom data details validation. DATASOURCE_AVAILABLE_CHECK: data source connectivity check. TABLE_SCHEMA_CHECK: table schema change detection. REAL_TIME_OFFLINE_COMPARE: real-time and offline comparison. REAL_TIME_STATISTICAL_VALIDATE: real-time statistical value monitoring. REAL_TIME_MULTI_CHAIN_COMPARE: real-time multi-chain comparison.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FIELD_NULL_VALUE_VALIDATE</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpsertQualityTemplateRequestUpsertCommand build(java.util.Map<String, ?> map) throws Exception {
            UpsertQualityTemplateRequestUpsertCommand self = new UpsertQualityTemplateRequestUpsertCommand();
            return TeaModel.build(map, self);
        }

        public UpsertQualityTemplateRequestUpsertCommand setCatalog(String catalog) {
            this.catalog = catalog;
            return this;
        }
        public String getCatalog() {
            return this.catalog;
        }

        public UpsertQualityTemplateRequestUpsertCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpsertQualityTemplateRequestUpsertCommand setFormPropertyList(java.util.List<UpsertQualityTemplateRequestUpsertCommandFormPropertyList> formPropertyList) {
            this.formPropertyList = formPropertyList;
            return this;
        }
        public java.util.List<UpsertQualityTemplateRequestUpsertCommandFormPropertyList> getFormPropertyList() {
            return this.formPropertyList;
        }

        public UpsertQualityTemplateRequestUpsertCommand setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpsertQualityTemplateRequestUpsertCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpsertQualityTemplateRequestUpsertCommand setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public UpsertQualityTemplateRequestUpsertCommand setSupportDataSourceTypeList(java.util.List<String> supportDataSourceTypeList) {
            this.supportDataSourceTypeList = supportDataSourceTypeList;
            return this;
        }
        public java.util.List<String> getSupportDataSourceTypeList() {
            return this.supportDataSourceTypeList;
        }

        public UpsertQualityTemplateRequestUpsertCommand setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
