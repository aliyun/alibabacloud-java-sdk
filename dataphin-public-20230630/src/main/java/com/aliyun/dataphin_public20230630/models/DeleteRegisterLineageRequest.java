// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteRegisterLineageRequest extends TeaModel {
    /**
     * <p>The command for deleting registered lineage.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeleteRegisterLineageCommand")
    public DeleteRegisterLineageRequestDeleteRegisterLineageCommand deleteRegisterLineageCommand;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static DeleteRegisterLineageRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRegisterLineageRequest self = new DeleteRegisterLineageRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRegisterLineageRequest setDeleteRegisterLineageCommand(DeleteRegisterLineageRequestDeleteRegisterLineageCommand deleteRegisterLineageCommand) {
        this.deleteRegisterLineageCommand = deleteRegisterLineageCommand;
        return this;
    }
    public DeleteRegisterLineageRequestDeleteRegisterLineageCommand getDeleteRegisterLineageCommand() {
        return this.deleteRegisterLineageCommand;
    }

    public DeleteRegisterLineageRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineagesSource extends TeaModel {
        /**
         * <p>The catalog asset property. For tables, the catalog of both compute source tables and logical tables is uniformly set to dataphin. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
         * 
         * <strong>example:</strong>
         * <p>dataphin</p>
         */
        @NameInMap("Catalog")
        public String catalog;

        /**
         * <p>The environment to which the asset belongs. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
         * 
         * <strong>example:</strong>
         * <p>DEV, PROD</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <p>The extended properties.</p>
         */
        @NameInMap("ExtProperties")
        public java.util.Map<String, ?> extProperties;

        /**
         * <p>The GUID of the asset. This parameter is required when referenceType is set to BY_GUID.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.300000001.project1.table1</p>
         */
        @NameInMap("Guid")
        public String guid;

        /**
         * <p>The asset type. Set this parameter based on the actual scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>COLUMN</p>
         */
        @NameInMap("MetadataType")
        public String metadataType;

        /**
         * <p>The name of the asset. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
         * 
         * <strong>example:</strong>
         * <p>column1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The GUID of the parent asset. If the current object is a field, parentGuid is the GUID of the table to which the field belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.300000001.project1.table1</p>
         */
        @NameInMap("ParentGuid")
        public String parentGuid;

        /**
         * <p>The asset reference data type. Valid values: BY_GUID, BY_PROPERTY.</p>
         * 
         * <strong>example:</strong>
         * <p>BY_GUID, BY_PROPERTY</p>
         */
        @NameInMap("ReferenceType")
        public String referenceType;

        /**
         * <p>The schema asset property. For tables, this is typically the project or business unit. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
         * 
         * <strong>example:</strong>
         * <p>project1, bizUnit1</p>
         */
        @NameInMap("Schema")
        public String schema;

        public static DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineagesSource build(java.util.Map<String, ?> map) throws Exception {
            DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineagesSource self = new DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineagesSource();
            return TeaModel.build(map, self);
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineagesSource setCatalog(String catalog) {
            this.catalog = catalog;
            return this;
        }
        public String getCatalog() {
            return this.catalog;
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineagesSource setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineagesSource setExtProperties(java.util.Map<String, ?> extProperties) {
            this.extProperties = extProperties;
            return this;
        }
        public java.util.Map<String, ?> getExtProperties() {
            return this.extProperties;
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineagesSource setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineagesSource setMetadataType(String metadataType) {
            this.metadataType = metadataType;
            return this;
        }
        public String getMetadataType() {
            return this.metadataType;
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineagesSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineagesSource setParentGuid(String parentGuid) {
            this.parentGuid = parentGuid;
            return this;
        }
        public String getParentGuid() {
            return this.parentGuid;
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineagesSource setReferenceType(String referenceType) {
            this.referenceType = referenceType;
            return this;
        }
        public String getReferenceType() {
            return this.referenceType;
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineagesSource setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

    }

    public static class DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineagesTarget extends TeaModel {
        /**
         * <p>The catalog asset property. For tables, the catalog of both compute source tables and logical tables is uniformly set to dataphin. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
         * 
         * <strong>example:</strong>
         * <p>dataphin</p>
         */
        @NameInMap("Catalog")
        public String catalog;

        /**
         * <p>The environment to which the asset belongs. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
         * 
         * <strong>example:</strong>
         * <p>DEV, PROD</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <p>The extended properties.</p>
         */
        @NameInMap("ExtProperties")
        public java.util.Map<String, ?> extProperties;

        /**
         * <p>The GUID of the asset. This parameter is required when referenceType is set to BY_GUID.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.300000001.project1.table1</p>
         */
        @NameInMap("Guid")
        public String guid;

        /**
         * <p>The asset type. Set this parameter based on the actual scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>COLUMN</p>
         */
        @NameInMap("MetadataType")
        public String metadataType;

        /**
         * <p>The name of the asset. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
         * 
         * <strong>example:</strong>
         * <p>column1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The GUID of the parent asset. If the current object is a field, parentGuid is the GUID of the table to which the field belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.300000001.project1.table1</p>
         */
        @NameInMap("ParentGuid")
        public String parentGuid;

        /**
         * <p>The asset reference data type. Valid values: BY_GUID, BY_PROPERTY.</p>
         * 
         * <strong>example:</strong>
         * <p>BY_GUID, BY_PROPERTY</p>
         */
        @NameInMap("ReferenceType")
        public String referenceType;

        /**
         * <p>The schema asset property. For tables, this is typically the project or business unit. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
         * 
         * <strong>example:</strong>
         * <p>project1, bizUnit1</p>
         */
        @NameInMap("Schema")
        public String schema;

        public static DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineagesTarget build(java.util.Map<String, ?> map) throws Exception {
            DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineagesTarget self = new DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineagesTarget();
            return TeaModel.build(map, self);
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineagesTarget setCatalog(String catalog) {
            this.catalog = catalog;
            return this;
        }
        public String getCatalog() {
            return this.catalog;
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineagesTarget setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineagesTarget setExtProperties(java.util.Map<String, ?> extProperties) {
            this.extProperties = extProperties;
            return this;
        }
        public java.util.Map<String, ?> getExtProperties() {
            return this.extProperties;
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineagesTarget setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineagesTarget setMetadataType(String metadataType) {
            this.metadataType = metadataType;
            return this;
        }
        public String getMetadataType() {
            return this.metadataType;
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineagesTarget setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineagesTarget setParentGuid(String parentGuid) {
            this.parentGuid = parentGuid;
            return this;
        }
        public String getParentGuid() {
            return this.parentGuid;
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineagesTarget setReferenceType(String referenceType) {
            this.referenceType = referenceType;
            return this;
        }
        public String getReferenceType() {
            return this.referenceType;
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineagesTarget setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

    }

    public static class DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineages extends TeaModel {
        /**
         * <p>Specifies whether the lineage is direct. Default value: true.</p>
         */
        @NameInMap("IsDirect")
        public Boolean isDirect;

        /**
         * <p>The source asset reference.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Source")
        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineagesSource source;

        /**
         * <p>The target asset reference.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Target")
        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineagesTarget target;

        public static DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineages build(java.util.Map<String, ?> map) throws Exception {
            DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineages self = new DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineages();
            return TeaModel.build(map, self);
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineages setIsDirect(Boolean isDirect) {
            this.isDirect = isDirect;
            return this;
        }
        public Boolean getIsDirect() {
            return this.isDirect;
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineages setSource(DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineagesSource source) {
            this.source = source;
            return this;
        }
        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineagesSource getSource() {
            return this.source;
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineages setTarget(DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineagesTarget target) {
            this.target = target;
            return this;
        }
        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineagesTarget getTarget() {
            return this.target;
        }

    }

    public static class DeleteRegisterLineageRequestDeleteRegisterLineageCommandSource extends TeaModel {
        /**
         * <p>The catalog asset property. For tables, the catalog of both compute source tables and logical tables is uniformly set to dataphin. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
         * 
         * <strong>example:</strong>
         * <p>dataphin</p>
         */
        @NameInMap("Catalog")
        public String catalog;

        /**
         * <p>The environment to which the asset belongs. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
         * 
         * <strong>example:</strong>
         * <p>DEV, PROD</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <p>The extended properties.</p>
         */
        @NameInMap("ExtProperties")
        public java.util.Map<String, ?> extProperties;

        /**
         * <p>The GUID of the asset. This parameter is required when referenceType is set to BY_GUID.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.300000001.project1.table1</p>
         */
        @NameInMap("Guid")
        public String guid;

        /**
         * <p>The asset subtype. Specify this parameter only when metadataType is set to TABLE and referenceType is not set to BY_GUID.</p>
         * 
         * <strong>example:</strong>
         * <p>PHYSICAL_TABLE, PHYSICAL_VIEW, PHYSICAL_MATERIALIZED_VIEW, DATASOURCE_TABLE, DATASOURCE_VIEW, DATASOURCE_MATERIALIZED_VIEW, DIM_NORMAL, DIM_LEVEL, DIM_ENUM, DIM_VIRTUAL, FACT_EVENT, FACT_PROCESS, FACT_SNAPSHOT, SUM_BIZ_UNIT</p>
         */
        @NameInMap("MetadataSubType")
        public String metadataSubType;

        /**
         * <p>The asset type. Set this parameter based on the actual scenario.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        @NameInMap("MetadataType")
        public String metadataType;

        /**
         * <p>The name of the asset. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
         * 
         * <strong>example:</strong>
         * <p>table1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The asset reference data type. Valid values: BY_GUID, BY_PROPERTY.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BY_GUID, BY_PROPERTY</p>
         */
        @NameInMap("ReferenceType")
        public String referenceType;

        /**
         * <p>The schema asset property. For tables, this is typically the project or business unit. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
         * 
         * <strong>example:</strong>
         * <p>project1, bizUnit1</p>
         */
        @NameInMap("Schema")
        public String schema;

        public static DeleteRegisterLineageRequestDeleteRegisterLineageCommandSource build(java.util.Map<String, ?> map) throws Exception {
            DeleteRegisterLineageRequestDeleteRegisterLineageCommandSource self = new DeleteRegisterLineageRequestDeleteRegisterLineageCommandSource();
            return TeaModel.build(map, self);
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandSource setCatalog(String catalog) {
            this.catalog = catalog;
            return this;
        }
        public String getCatalog() {
            return this.catalog;
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandSource setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandSource setExtProperties(java.util.Map<String, ?> extProperties) {
            this.extProperties = extProperties;
            return this;
        }
        public java.util.Map<String, ?> getExtProperties() {
            return this.extProperties;
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandSource setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandSource setMetadataSubType(String metadataSubType) {
            this.metadataSubType = metadataSubType;
            return this;
        }
        public String getMetadataSubType() {
            return this.metadataSubType;
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandSource setMetadataType(String metadataType) {
            this.metadataType = metadataType;
            return this;
        }
        public String getMetadataType() {
            return this.metadataType;
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandSource setReferenceType(String referenceType) {
            this.referenceType = referenceType;
            return this;
        }
        public String getReferenceType() {
            return this.referenceType;
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandSource setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

    }

    public static class DeleteRegisterLineageRequestDeleteRegisterLineageCommandTarget extends TeaModel {
        /**
         * <p>The catalog asset property. For tables, the catalog of both compute source tables and logical tables is uniformly set to dataphin. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
         * 
         * <strong>example:</strong>
         * <p>dataphin</p>
         */
        @NameInMap("Catalog")
        public String catalog;

        /**
         * <p>The environment to which the asset belongs. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
         * 
         * <strong>example:</strong>
         * <p>DEV, PROD</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <p>The extended properties.</p>
         */
        @NameInMap("ExtProperties")
        public java.util.Map<String, ?> extProperties;

        /**
         * <p>The GUID of the asset. This parameter is required when referenceType is set to BY_GUID.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.300000001.project1.table1</p>
         */
        @NameInMap("Guid")
        public String guid;

        /**
         * <p>The asset subtype. Specify this parameter only when metadataType is set to TABLE and referenceType is not set to BY_GUID.</p>
         * 
         * <strong>example:</strong>
         * <p>PHYSICAL_TABLE, PHYSICAL_VIEW, PHYSICAL_MATERIALIZED_VIEW, DATASOURCE_TABLE, DATASOURCE_VIEW, DATASOURCE_MATERIALIZED_VIEW, DIM_NORMAL, DIM_LEVEL, DIM_ENUM, DIM_VIRTUAL, FACT_EVENT, FACT_PROCESS, FACT_SNAPSHOT,SUM_BIZ_UNIT</p>
         */
        @NameInMap("MetadataSubType")
        public String metadataSubType;

        /**
         * <p>The asset type. Set this parameter based on the actual scenario.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        @NameInMap("MetadataType")
        public String metadataType;

        /**
         * <p>The name of the asset. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
         * 
         * <strong>example:</strong>
         * <p>table1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The asset reference data type. Valid values: BY_GUID, BY_PROPERTY.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BY_GUID, BY_PROPERTY</p>
         */
        @NameInMap("ReferenceType")
        public String referenceType;

        /**
         * <p>The schema asset property. For tables, this is typically the project or business unit. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
         * 
         * <strong>example:</strong>
         * <p>project1, bizUnit1</p>
         */
        @NameInMap("Schema")
        public String schema;

        public static DeleteRegisterLineageRequestDeleteRegisterLineageCommandTarget build(java.util.Map<String, ?> map) throws Exception {
            DeleteRegisterLineageRequestDeleteRegisterLineageCommandTarget self = new DeleteRegisterLineageRequestDeleteRegisterLineageCommandTarget();
            return TeaModel.build(map, self);
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandTarget setCatalog(String catalog) {
            this.catalog = catalog;
            return this;
        }
        public String getCatalog() {
            return this.catalog;
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandTarget setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandTarget setExtProperties(java.util.Map<String, ?> extProperties) {
            this.extProperties = extProperties;
            return this;
        }
        public java.util.Map<String, ?> getExtProperties() {
            return this.extProperties;
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandTarget setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandTarget setMetadataSubType(String metadataSubType) {
            this.metadataSubType = metadataSubType;
            return this;
        }
        public String getMetadataSubType() {
            return this.metadataSubType;
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandTarget setMetadataType(String metadataType) {
            this.metadataType = metadataType;
            return this;
        }
        public String getMetadataType() {
            return this.metadataType;
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandTarget setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandTarget setReferenceType(String referenceType) {
            this.referenceType = referenceType;
            return this;
        }
        public String getReferenceType() {
            return this.referenceType;
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandTarget setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

    }

    public static class DeleteRegisterLineageRequestDeleteRegisterLineageCommand extends TeaModel {
        /**
         * <p>Specifies whether to automatically delete the object lineage after all detailed lineage entries are deleted. Default value: true.</p>
         */
        @NameInMap("CascadeDeleteLineage")
        public Boolean cascadeDeleteLineage;

        /**
         * <p>The detailed lineage relationships. For tables, the detailed lineage relationships refer to field-level lineage.</p>
         */
        @NameInMap("DetailedLineages")
        public java.util.List<DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineages> detailedLineages;

        /**
         * <p>The source of the lineage.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Source")
        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandSource source;

        /**
         * <p>The target of the lineage.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Target")
        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandTarget target;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>300001234</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        /**
         * <p>The ID of the current user.</p>
         * 
         * <strong>example:</strong>
         * <p>300004567</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static DeleteRegisterLineageRequestDeleteRegisterLineageCommand build(java.util.Map<String, ?> map) throws Exception {
            DeleteRegisterLineageRequestDeleteRegisterLineageCommand self = new DeleteRegisterLineageRequestDeleteRegisterLineageCommand();
            return TeaModel.build(map, self);
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommand setCascadeDeleteLineage(Boolean cascadeDeleteLineage) {
            this.cascadeDeleteLineage = cascadeDeleteLineage;
            return this;
        }
        public Boolean getCascadeDeleteLineage() {
            return this.cascadeDeleteLineage;
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommand setDetailedLineages(java.util.List<DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineages> detailedLineages) {
            this.detailedLineages = detailedLineages;
            return this;
        }
        public java.util.List<DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineages> getDetailedLineages() {
            return this.detailedLineages;
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommand setSource(DeleteRegisterLineageRequestDeleteRegisterLineageCommandSource source) {
            this.source = source;
            return this;
        }
        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandSource getSource() {
            return this.source;
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommand setTarget(DeleteRegisterLineageRequestDeleteRegisterLineageCommandTarget target) {
            this.target = target;
            return this;
        }
        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandTarget getTarget() {
            return this.target;
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommand setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public DeleteRegisterLineageRequestDeleteRegisterLineageCommand setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
