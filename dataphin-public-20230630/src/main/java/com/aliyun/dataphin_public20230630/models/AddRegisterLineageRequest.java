// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class AddRegisterLineageRequest extends TeaModel {
    /**
     * <p>The command for registering and adding data lineage.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AddRegisterLineageCommand")
    public AddRegisterLineageRequestAddRegisterLineageCommand addRegisterLineageCommand;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static AddRegisterLineageRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRegisterLineageRequest self = new AddRegisterLineageRequest();
        return TeaModel.build(map, self);
    }

    public AddRegisterLineageRequest setAddRegisterLineageCommand(AddRegisterLineageRequestAddRegisterLineageCommand addRegisterLineageCommand) {
        this.addRegisterLineageCommand = addRegisterLineageCommand;
        return this;
    }
    public AddRegisterLineageRequestAddRegisterLineageCommand getAddRegisterLineageCommand() {
        return this.addRegisterLineageCommand;
    }

    public AddRegisterLineageRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineagesSource extends TeaModel {
        /**
         * <p>The catalog property of the asset. For tables, the catalog of both compute source tables and logical tables is uniformly set to dataphin. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
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
         * <p>odps.300000001.project1.table1.column1</p>
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
         * <p>The asset reference data type. Valid values: BY_GUID and BY_PROPERTY.</p>
         * 
         * <strong>example:</strong>
         * <p>BY_GUID, BY_PROPERTY</p>
         */
        @NameInMap("ReferenceType")
        public String referenceType;

        /**
         * <p>The schema property of the asset. For tables, this is typically the project or business unit. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
         * 
         * <strong>example:</strong>
         * <p>project1, bizUnit1</p>
         */
        @NameInMap("Schema")
        public String schema;

        public static AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineagesSource build(java.util.Map<String, ?> map) throws Exception {
            AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineagesSource self = new AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineagesSource();
            return TeaModel.build(map, self);
        }

        public AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineagesSource setCatalog(String catalog) {
            this.catalog = catalog;
            return this;
        }
        public String getCatalog() {
            return this.catalog;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineagesSource setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineagesSource setExtProperties(java.util.Map<String, ?> extProperties) {
            this.extProperties = extProperties;
            return this;
        }
        public java.util.Map<String, ?> getExtProperties() {
            return this.extProperties;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineagesSource setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineagesSource setMetadataType(String metadataType) {
            this.metadataType = metadataType;
            return this;
        }
        public String getMetadataType() {
            return this.metadataType;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineagesSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineagesSource setParentGuid(String parentGuid) {
            this.parentGuid = parentGuid;
            return this;
        }
        public String getParentGuid() {
            return this.parentGuid;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineagesSource setReferenceType(String referenceType) {
            this.referenceType = referenceType;
            return this;
        }
        public String getReferenceType() {
            return this.referenceType;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineagesSource setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

    }

    public static class AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineagesTarget extends TeaModel {
        /**
         * <p>The catalog property of the asset. For tables, the catalog of both compute source tables and logical tables is uniformly set to dataphin. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
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
         * <p>odps.300000001.project1.table1.column1</p>
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
         * <p>The asset reference data type. Valid values: BY_GUID and BY_PROPERTY.</p>
         * 
         * <strong>example:</strong>
         * <p>BY_GUID, BY_PROPERTY</p>
         */
        @NameInMap("ReferenceType")
        public String referenceType;

        /**
         * <p>The schema property of the asset. For tables, this is typically the project or business unit. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
         * 
         * <strong>example:</strong>
         * <p>project1, bizUnit1</p>
         */
        @NameInMap("Schema")
        public String schema;

        public static AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineagesTarget build(java.util.Map<String, ?> map) throws Exception {
            AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineagesTarget self = new AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineagesTarget();
            return TeaModel.build(map, self);
        }

        public AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineagesTarget setCatalog(String catalog) {
            this.catalog = catalog;
            return this;
        }
        public String getCatalog() {
            return this.catalog;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineagesTarget setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineagesTarget setExtProperties(java.util.Map<String, ?> extProperties) {
            this.extProperties = extProperties;
            return this;
        }
        public java.util.Map<String, ?> getExtProperties() {
            return this.extProperties;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineagesTarget setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineagesTarget setMetadataType(String metadataType) {
            this.metadataType = metadataType;
            return this;
        }
        public String getMetadataType() {
            return this.metadataType;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineagesTarget setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineagesTarget setParentGuid(String parentGuid) {
            this.parentGuid = parentGuid;
            return this;
        }
        public String getParentGuid() {
            return this.parentGuid;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineagesTarget setReferenceType(String referenceType) {
            this.referenceType = referenceType;
            return this;
        }
        public String getReferenceType() {
            return this.referenceType;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineagesTarget setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

    }

    public static class AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineages extends TeaModel {
        /**
         * <p>Specifies whether this is a direct lineage relationship. Default value: true.</p>
         */
        @NameInMap("IsDirect")
        public Boolean isDirect;

        /**
         * <p>The source asset reference.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Source")
        public AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineagesSource source;

        /**
         * <p>The target asset reference.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Target")
        public AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineagesTarget target;

        public static AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineages build(java.util.Map<String, ?> map) throws Exception {
            AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineages self = new AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineages();
            return TeaModel.build(map, self);
        }

        public AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineages setIsDirect(Boolean isDirect) {
            this.isDirect = isDirect;
            return this;
        }
        public Boolean getIsDirect() {
            return this.isDirect;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineages setSource(AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineagesSource source) {
            this.source = source;
            return this;
        }
        public AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineagesSource getSource() {
            return this.source;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineages setTarget(AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineagesTarget target) {
            this.target = target;
            return this;
        }
        public AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineagesTarget getTarget() {
            return this.target;
        }

    }

    public static class AddRegisterLineageRequestAddRegisterLineageCommandSource extends TeaModel {
        /**
         * <p>The catalog property of the asset. For tables, the catalog of both compute source tables and logical tables is uniformly set to dataphin. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
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
         * <p>The asset reference data type. Valid values: BY_GUID and BY_PROPERTY.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BY_GUID, BY_PROPERTY</p>
         */
        @NameInMap("ReferenceType")
        public String referenceType;

        /**
         * <p>The schema property of the asset. For tables, this is typically the project or business unit. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
         * 
         * <strong>example:</strong>
         * <p>project1, bizUnit1</p>
         */
        @NameInMap("Schema")
        public String schema;

        public static AddRegisterLineageRequestAddRegisterLineageCommandSource build(java.util.Map<String, ?> map) throws Exception {
            AddRegisterLineageRequestAddRegisterLineageCommandSource self = new AddRegisterLineageRequestAddRegisterLineageCommandSource();
            return TeaModel.build(map, self);
        }

        public AddRegisterLineageRequestAddRegisterLineageCommandSource setCatalog(String catalog) {
            this.catalog = catalog;
            return this;
        }
        public String getCatalog() {
            return this.catalog;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommandSource setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommandSource setExtProperties(java.util.Map<String, ?> extProperties) {
            this.extProperties = extProperties;
            return this;
        }
        public java.util.Map<String, ?> getExtProperties() {
            return this.extProperties;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommandSource setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommandSource setMetadataSubType(String metadataSubType) {
            this.metadataSubType = metadataSubType;
            return this;
        }
        public String getMetadataSubType() {
            return this.metadataSubType;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommandSource setMetadataType(String metadataType) {
            this.metadataType = metadataType;
            return this;
        }
        public String getMetadataType() {
            return this.metadataType;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommandSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommandSource setReferenceType(String referenceType) {
            this.referenceType = referenceType;
            return this;
        }
        public String getReferenceType() {
            return this.referenceType;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommandSource setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

    }

    public static class AddRegisterLineageRequestAddRegisterLineageCommandTarget extends TeaModel {
        /**
         * <p>The catalog property of the asset. For tables, the catalog of both compute source tables and logical tables is uniformly set to dataphin. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
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
         * <p>The asset reference data type. Valid values: BY_GUID and BY_PROPERTY.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BY_GUID, BY_PROPERTY</p>
         */
        @NameInMap("ReferenceType")
        public String referenceType;

        /**
         * <p>The schema property of the asset. For tables, this is typically the project or business unit. This property is used to identify the corresponding asset by property when referenceType is set to BY_PROPERTY. If referenceType is set to BY_GUID, this property does not need to be specified.</p>
         * 
         * <strong>example:</strong>
         * <p>project1, bizUnit1</p>
         */
        @NameInMap("Schema")
        public String schema;

        public static AddRegisterLineageRequestAddRegisterLineageCommandTarget build(java.util.Map<String, ?> map) throws Exception {
            AddRegisterLineageRequestAddRegisterLineageCommandTarget self = new AddRegisterLineageRequestAddRegisterLineageCommandTarget();
            return TeaModel.build(map, self);
        }

        public AddRegisterLineageRequestAddRegisterLineageCommandTarget setCatalog(String catalog) {
            this.catalog = catalog;
            return this;
        }
        public String getCatalog() {
            return this.catalog;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommandTarget setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommandTarget setExtProperties(java.util.Map<String, ?> extProperties) {
            this.extProperties = extProperties;
            return this;
        }
        public java.util.Map<String, ?> getExtProperties() {
            return this.extProperties;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommandTarget setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommandTarget setMetadataSubType(String metadataSubType) {
            this.metadataSubType = metadataSubType;
            return this;
        }
        public String getMetadataSubType() {
            return this.metadataSubType;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommandTarget setMetadataType(String metadataType) {
            this.metadataType = metadataType;
            return this;
        }
        public String getMetadataType() {
            return this.metadataType;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommandTarget setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommandTarget setReferenceType(String referenceType) {
            this.referenceType = referenceType;
            return this;
        }
        public String getReferenceType() {
            return this.referenceType;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommandTarget setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

    }

    public static class AddRegisterLineageRequestAddRegisterLineageCommand extends TeaModel {
        /**
         * <p>Specifies whether to check the existence of the asset. By default, the existence is not checked.</p>
         */
        @NameInMap("CheckAssetExist")
        public Boolean checkAssetExist;

        /**
         * <p>The detailed lineage relationships. For tables, these are field-level lineage relationships. If you do not want to add field-level lineage, leave this parameter empty.</p>
         */
        @NameInMap("DetailedLineages")
        public java.util.List<AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineages> detailedLineages;

        /**
         * <p>The lineage relationship properties.</p>
         */
        @NameInMap("RelationProperties")
        public java.util.Map<String, ?> relationProperties;

        /**
         * <p>The source asset.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Source")
        public AddRegisterLineageRequestAddRegisterLineageCommandSource source;

        /**
         * <p>The target asset.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Target")
        public AddRegisterLineageRequestAddRegisterLineageCommandTarget target;

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

        public static AddRegisterLineageRequestAddRegisterLineageCommand build(java.util.Map<String, ?> map) throws Exception {
            AddRegisterLineageRequestAddRegisterLineageCommand self = new AddRegisterLineageRequestAddRegisterLineageCommand();
            return TeaModel.build(map, self);
        }

        public AddRegisterLineageRequestAddRegisterLineageCommand setCheckAssetExist(Boolean checkAssetExist) {
            this.checkAssetExist = checkAssetExist;
            return this;
        }
        public Boolean getCheckAssetExist() {
            return this.checkAssetExist;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommand setDetailedLineages(java.util.List<AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineages> detailedLineages) {
            this.detailedLineages = detailedLineages;
            return this;
        }
        public java.util.List<AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineages> getDetailedLineages() {
            return this.detailedLineages;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommand setRelationProperties(java.util.Map<String, ?> relationProperties) {
            this.relationProperties = relationProperties;
            return this;
        }
        public java.util.Map<String, ?> getRelationProperties() {
            return this.relationProperties;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommand setSource(AddRegisterLineageRequestAddRegisterLineageCommandSource source) {
            this.source = source;
            return this;
        }
        public AddRegisterLineageRequestAddRegisterLineageCommandSource getSource() {
            return this.source;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommand setTarget(AddRegisterLineageRequestAddRegisterLineageCommandTarget target) {
            this.target = target;
            return this;
        }
        public AddRegisterLineageRequestAddRegisterLineageCommandTarget getTarget() {
            return this.target;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommand setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public AddRegisterLineageRequestAddRegisterLineageCommand setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
