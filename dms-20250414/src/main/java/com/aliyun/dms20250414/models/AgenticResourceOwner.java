// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class AgenticResourceOwner extends TeaModel {
    /**
     * <p>The instance alias. This display property comes from the catalog to which the resource belongs and is used only for frontend display to align with the data permission list. It is populated only in the My Assets or Managed Resources query scenarios and is null in other scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>Production database</p>
     */
    @NameInMap("CatalogAlias")
    public String catalogAlias;

    /**
     * <p>The instance data source type, used only for frontend display. It is populated only in the My Assets or Managed Resources query scenarios and is null in other scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>MYSQL</p>
     */
    @NameInMap("CatalogDataSourceType")
    public String catalogDataSourceType;

    /**
     * <p>The instance environment type, used only for frontend display. It is populated only in the My Assets or Managed Resources query scenarios and is null in other scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>prod</p>
     */
    @NameInMap("CatalogEnvType")
    public String catalogEnvType;

    /**
     * <p>The instance host, used only for frontend display. Built-in sample data sources are masked as ******. It is populated only in the My Assets or Managed Resources query scenarios and is null in other scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-xxxxxxxx.mysql.rds.aliyuncs.com</p>
     */
    @NameInMap("CatalogHost")
    public String catalogHost;

    /**
     * <p>The instance port, used only for frontend display. Built-in sample data sources are masked as ******. It is populated only in the My Assets or Managed Resources query scenarios and is null in other scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("CatalogPort")
    public String catalogPort;

    /**
     * <p>The UUID of the catalog to which the resource belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>mc-HZ-5d9fbt8wW4AnGZNddXg4f</p>
     */
    @NameInMap("CatalogUuid")
    public String catalogUuid;

    /**
     * <p>The UUID of the instance data source to which the resource belongs. It is used only for frontend display and instance locating. Non-sensitive connection information is not masked. It is populated only in the My Assets or Managed Resources query scenarios and is null in other scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>dsc-HZ-3f2b9a7c1d</p>
     */
    @NameInMap("DataSourceUuid")
    public String dataSourceUuid;

    /**
     * <p>The fully qualified name of the database. It has a value only when ResourceType is DATABASE and is populated by the downstream service, which facilitates direct frontend display. For MySQL, it is the database name itself. For PostgreSQL or SQL Server, it is in the format of DatabaseName.SchemaName.</p>
     * 
     * <strong>example:</strong>
     * <p>finance.public</p>
     */
    @NameInMap("DatabaseQualifiedName")
    public String databaseQualifiedName;

    /**
     * <p>The UUID of the database. It has a value only when ResourceType is DATABASE.</p>
     * 
     * <strong>example:</strong>
     * <p>md-HZ-vXR1ezNGjiDjiV13Gos1N</p>
     */
    @NameInMap("DatabaseUuid")
    public String databaseUuid;

    /**
     * <p>The principal ID of the operator who registered the ownership relationship. The downstream service does not return this field in the My Assets query scenario, and the value is null.</p>
     * 
     * <strong>example:</strong>
     * <p>usr_6ieggks7zuy6gpfdmgzsjdso</p>
     */
    @NameInMap("GrantBy")
    public String grantBy;

    /**
     * <p>The source channel of the ownership. CONSOLE indicates manual registration in the console. Other values indicate that the ownership is written by the built-in system. The downstream service does not return this field in the My Assets query scenario, and the value is null.</p>
     * 
     * <strong>example:</strong>
     * <p>CONSOLE</p>
     */
    @NameInMap("GrantFrom")
    public String grantFrom;

    /**
     * <p>The principal ID of the owner. This is the internal principal ID of the gateway with a usr_ or agt_ prefix, not the Alibaba Cloud UID.</p>
     * 
     * <strong>example:</strong>
     * <p>usr_wlwp5a7uruanebg5bbdqqf5n</p>
     */
    @NameInMap("OwnerPrincipalId")
    public String ownerPrincipalId;

    /**
     * <p>The principal type of the owner. Valid values:</p>
     * <ul>
     * <li>USER: Human user.</li>
     * <li>AGENT: Managed agent.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("OwnerPrincipalType")
    public String ownerPrincipalType;

    /**
     * <p>The ownership level. Valid values:</p>
     * <ul>
     * <li>INSTANCE: Instance-level ownership. The coordinate includes only CatalogUuid.</li>
     * <li>DATABASE: Database-level ownership. The coordinate includes CatalogUuid and DatabaseUuid.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DATABASE</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static AgenticResourceOwner build(java.util.Map<String, ?> map) throws Exception {
        AgenticResourceOwner self = new AgenticResourceOwner();
        return TeaModel.build(map, self);
    }

    public AgenticResourceOwner setCatalogAlias(String catalogAlias) {
        this.catalogAlias = catalogAlias;
        return this;
    }
    public String getCatalogAlias() {
        return this.catalogAlias;
    }

    public AgenticResourceOwner setCatalogDataSourceType(String catalogDataSourceType) {
        this.catalogDataSourceType = catalogDataSourceType;
        return this;
    }
    public String getCatalogDataSourceType() {
        return this.catalogDataSourceType;
    }

    public AgenticResourceOwner setCatalogEnvType(String catalogEnvType) {
        this.catalogEnvType = catalogEnvType;
        return this;
    }
    public String getCatalogEnvType() {
        return this.catalogEnvType;
    }

    public AgenticResourceOwner setCatalogHost(String catalogHost) {
        this.catalogHost = catalogHost;
        return this;
    }
    public String getCatalogHost() {
        return this.catalogHost;
    }

    public AgenticResourceOwner setCatalogPort(String catalogPort) {
        this.catalogPort = catalogPort;
        return this;
    }
    public String getCatalogPort() {
        return this.catalogPort;
    }

    public AgenticResourceOwner setCatalogUuid(String catalogUuid) {
        this.catalogUuid = catalogUuid;
        return this;
    }
    public String getCatalogUuid() {
        return this.catalogUuid;
    }

    public AgenticResourceOwner setDataSourceUuid(String dataSourceUuid) {
        this.dataSourceUuid = dataSourceUuid;
        return this;
    }
    public String getDataSourceUuid() {
        return this.dataSourceUuid;
    }

    public AgenticResourceOwner setDatabaseQualifiedName(String databaseQualifiedName) {
        this.databaseQualifiedName = databaseQualifiedName;
        return this;
    }
    public String getDatabaseQualifiedName() {
        return this.databaseQualifiedName;
    }

    public AgenticResourceOwner setDatabaseUuid(String databaseUuid) {
        this.databaseUuid = databaseUuid;
        return this;
    }
    public String getDatabaseUuid() {
        return this.databaseUuid;
    }

    public AgenticResourceOwner setGrantBy(String grantBy) {
        this.grantBy = grantBy;
        return this;
    }
    public String getGrantBy() {
        return this.grantBy;
    }

    public AgenticResourceOwner setGrantFrom(String grantFrom) {
        this.grantFrom = grantFrom;
        return this;
    }
    public String getGrantFrom() {
        return this.grantFrom;
    }

    public AgenticResourceOwner setOwnerPrincipalId(String ownerPrincipalId) {
        this.ownerPrincipalId = ownerPrincipalId;
        return this;
    }
    public String getOwnerPrincipalId() {
        return this.ownerPrincipalId;
    }

    public AgenticResourceOwner setOwnerPrincipalType(String ownerPrincipalType) {
        this.ownerPrincipalType = ownerPrincipalType;
        return this;
    }
    public String getOwnerPrincipalType() {
        return this.ownerPrincipalType;
    }

    public AgenticResourceOwner setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
