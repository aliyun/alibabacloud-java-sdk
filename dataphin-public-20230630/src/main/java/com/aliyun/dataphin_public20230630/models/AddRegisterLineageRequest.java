// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class AddRegisterLineageRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AddRegisterLineageCommand")
    public AddRegisterLineageRequestAddRegisterLineageCommand addRegisterLineageCommand;

    /**
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
         * <strong>example:</strong>
         * <p>dataphin</p>
         */
        @NameInMap("Catalog")
        public String catalog;

        /**
         * <strong>example:</strong>
         * <p>DEV, PROD</p>
         */
        @NameInMap("Env")
        public String env;

        @NameInMap("ExtProperties")
        public java.util.Map<String, ?> extProperties;

        /**
         * <strong>example:</strong>
         * <p>odps.300000001.project1.table1.column1</p>
         */
        @NameInMap("Guid")
        public String guid;

        /**
         * <strong>example:</strong>
         * <p>COLUMN</p>
         */
        @NameInMap("MetadataType")
        public String metadataType;

        /**
         * <strong>example:</strong>
         * <p>column1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>odps.300000001.project1.table1</p>
         */
        @NameInMap("ParentGuid")
        public String parentGuid;

        /**
         * <strong>example:</strong>
         * <p>BY_GUID, BY_PROPERTY</p>
         */
        @NameInMap("ReferenceType")
        public String referenceType;

        /**
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
         * <strong>example:</strong>
         * <p>dataphin</p>
         */
        @NameInMap("Catalog")
        public String catalog;

        /**
         * <strong>example:</strong>
         * <p>DEV, PROD</p>
         */
        @NameInMap("Env")
        public String env;

        @NameInMap("ExtProperties")
        public java.util.Map<String, ?> extProperties;

        /**
         * <strong>example:</strong>
         * <p>odps.300000001.project1.table1.column1</p>
         */
        @NameInMap("Guid")
        public String guid;

        /**
         * <strong>example:</strong>
         * <p>COLUMN</p>
         */
        @NameInMap("MetadataType")
        public String metadataType;

        /**
         * <strong>example:</strong>
         * <p>column1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>odps.300000001.project1.table1</p>
         */
        @NameInMap("ParentGuid")
        public String parentGuid;

        /**
         * <strong>example:</strong>
         * <p>BY_GUID, BY_PROPERTY</p>
         */
        @NameInMap("ReferenceType")
        public String referenceType;

        /**
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
        @NameInMap("IsDirect")
        public Boolean isDirect;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Source")
        public AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineagesSource source;

        /**
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
         * <strong>example:</strong>
         * <p>dataphin</p>
         */
        @NameInMap("Catalog")
        public String catalog;

        /**
         * <strong>example:</strong>
         * <p>DEV, PROD</p>
         */
        @NameInMap("Env")
        public String env;

        @NameInMap("ExtProperties")
        public java.util.Map<String, ?> extProperties;

        /**
         * <strong>example:</strong>
         * <p>odps.300000001.project1.table1</p>
         */
        @NameInMap("Guid")
        public String guid;

        /**
         * <strong>example:</strong>
         * <p>PHYSICAL_TABLE, PHYSICAL_VIEW, PHYSICAL_MATERIALIZED_VIEW, DATASOURCE_TABLE, DATASOURCE_VIEW, DATASOURCE_MATERIALIZED_VIEW, DIM_NORMAL, DIM_LEVEL, DIM_ENUM, DIM_VIRTUAL, FACT_EVENT, FACT_PROCESS, FACT_SNAPSHOT, SUM_BIZ_UNIT</p>
         */
        @NameInMap("MetadataSubType")
        public String metadataSubType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        @NameInMap("MetadataType")
        public String metadataType;

        /**
         * <strong>example:</strong>
         * <p>table1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BY_GUID, BY_PROPERTY</p>
         */
        @NameInMap("ReferenceType")
        public String referenceType;

        /**
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
         * <strong>example:</strong>
         * <p>dataphin</p>
         */
        @NameInMap("Catalog")
        public String catalog;

        /**
         * <strong>example:</strong>
         * <p>DEV, PROD</p>
         */
        @NameInMap("Env")
        public String env;

        @NameInMap("ExtProperties")
        public java.util.Map<String, ?> extProperties;

        /**
         * <strong>example:</strong>
         * <p>odps.300000001.project1.table1</p>
         */
        @NameInMap("Guid")
        public String guid;

        /**
         * <strong>example:</strong>
         * <p>PHYSICAL_TABLE, PHYSICAL_VIEW, PHYSICAL_MATERIALIZED_VIEW, DATASOURCE_TABLE, DATASOURCE_VIEW, DATASOURCE_MATERIALIZED_VIEW, DIM_NORMAL, DIM_LEVEL, DIM_ENUM, DIM_VIRTUAL, FACT_EVENT, FACT_PROCESS, FACT_SNAPSHOT, SUM_BIZ_UNIT</p>
         */
        @NameInMap("MetadataSubType")
        public String metadataSubType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        @NameInMap("MetadataType")
        public String metadataType;

        /**
         * <strong>example:</strong>
         * <p>table1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BY_GUID, BY_PROPERTY</p>
         */
        @NameInMap("ReferenceType")
        public String referenceType;

        /**
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
        @NameInMap("CheckAssetExist")
        public Boolean checkAssetExist;

        @NameInMap("DetailedLineages")
        public java.util.List<AddRegisterLineageRequestAddRegisterLineageCommandDetailedLineages> detailedLineages;

        @NameInMap("RelationProperties")
        public java.util.Map<String, ?> relationProperties;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Source")
        public AddRegisterLineageRequestAddRegisterLineageCommandSource source;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Target")
        public AddRegisterLineageRequestAddRegisterLineageCommandTarget target;

        /**
         * <strong>example:</strong>
         * <p>300001234</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        /**
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
