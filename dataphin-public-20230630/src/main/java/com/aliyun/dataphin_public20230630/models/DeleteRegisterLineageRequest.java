// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteRegisterLineageRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeleteRegisterLineageCommand")
    public DeleteRegisterLineageRequestDeleteRegisterLineageCommand deleteRegisterLineageCommand;

    /**
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
        @NameInMap("IsDirect")
        public Boolean isDirect;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Source")
        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineagesSource source;

        /**
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
         * <p>PHYSICAL_TABLE, PHYSICAL_VIEW, PHYSICAL_MATERIALIZED_VIEW, DATASOURCE_TABLE, DATASOURCE_VIEW, DATASOURCE_MATERIALIZED_VIEW, DIM_NORMAL, DIM_LEVEL, DIM_ENUM, DIM_VIRTUAL, FACT_EVENT, FACT_PROCESS, FACT_SNAPSHOT,SUM_BIZ_UNIT</p>
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
        @NameInMap("CascadeDeleteLineage")
        public Boolean cascadeDeleteLineage;

        @NameInMap("DetailedLineages")
        public java.util.List<DeleteRegisterLineageRequestDeleteRegisterLineageCommandDetailedLineages> detailedLineages;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Source")
        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandSource source;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Target")
        public DeleteRegisterLineageRequestDeleteRegisterLineageCommandTarget target;

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
