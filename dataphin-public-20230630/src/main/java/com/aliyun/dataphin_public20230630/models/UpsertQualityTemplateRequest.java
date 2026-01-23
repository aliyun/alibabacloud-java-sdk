// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpsertQualityTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
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
         * <strong>example:</strong>
         * <p>expression</p>
         */
        @NameInMap("ComponentType")
        public String componentType;

        /**
         * <strong>example:</strong>
         * <p>col</p>
         */
        @NameInMap("Name")
        public String name;

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSISTENT</p>
         */
        @NameInMap("Catalog")
        public String catalog;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("FormPropertyList")
        public java.util.List<UpsertQualityTemplateRequestUpsertCommandFormPropertyList> formPropertyList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("Owner")
        public String owner;

        @NameInMap("SupportDataSourceTypeList")
        public java.util.List<String> supportDataSourceTypeList;

        /**
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
