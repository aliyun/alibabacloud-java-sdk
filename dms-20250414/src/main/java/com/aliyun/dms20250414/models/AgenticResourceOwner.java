// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class AgenticResourceOwner extends TeaModel {
    /**
     * <p>The UUID of the Catalog to which the resource belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>mc-HZ-5d9fbt8wW4AnGZNddXg4f</p>
     */
    @NameInMap("CatalogUuid")
    public String catalogUuid;

    /**
     * <p>The qualified name of the database. This field has a value only when ResourceType is DATABASE and the downstream backfills the value. This field is provided for direct display on the frontend. For MySQL, this is the database name itself. For PostgreSQL or SQL Server, this is in the format of DatabaseName.SchemaName.</p>
     * 
     * <strong>example:</strong>
     * <p>finance.public</p>
     */
    @NameInMap("DatabaseQualifiedName")
    public String databaseQualifiedName;

    /**
     * <p>The UUID of the database. This field has a value only when ResourceType is DATABASE.</p>
     * 
     * <strong>example:</strong>
     * <p>md-HZ-vXR1ezNGjiDjiV13Gos1N</p>
     */
    @NameInMap("DatabaseUuid")
    public String databaseUuid;

    /**
     * <p>The principal ID of the operator who registered this ownership relationship. In the &quot;My Assets&quot; scenario, the downstream does not return this field, and the value is null.</p>
     * 
     * <strong>example:</strong>
     * <p>usr_6ieggks7zuy6gpfdmgzsjdso</p>
     */
    @NameInMap("GrantBy")
    public String grantBy;

    /**
     * <p>The source channel of the ownership. Valid values:</p>
     * <ul>
     * <li>CONSOLE: Manually registered in the console.</li>
     * <li>Other values: Written by the system built-in ownership mechanism.</li>
     * </ul>
     * <p>In the &quot;My Assets&quot; scenario, the downstream does not return this field, and the value is null.</p>
     * 
     * <strong>example:</strong>
     * <p>CONSOLE</p>
     */
    @NameInMap("GrantFrom")
    public String grantFrom;

    /**
     * <p>The Owner principal ID. This is a gateway internal principal ID with the usr_ or agt_ prefix, not an Alibaba Cloud UID.</p>
     * 
     * <strong>example:</strong>
     * <p>usr_wlwp5a7uruanebg5bbdqqf5n</p>
     */
    @NameInMap("OwnerPrincipalId")
    public String ownerPrincipalId;

    /**
     * <p>The Owner principal type. Valid values:</p>
     * <ul>
     * <li>USER: Human user.</li>
     * <li>AGENT: Managed Agent.</li>
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
     * <li>INSTANCE: Instance-level ownership. The coordinate contains only CatalogUuid.</li>
     * <li>DATABASE: Database-level ownership. The coordinate contains CatalogUuid + DatabaseUuid.</li>
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

    public AgenticResourceOwner setCatalogUuid(String catalogUuid) {
        this.catalogUuid = catalogUuid;
        return this;
    }
    public String getCatalogUuid() {
        return this.catalogUuid;
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
