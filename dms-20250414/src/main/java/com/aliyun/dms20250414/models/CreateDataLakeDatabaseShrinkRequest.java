// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateDataLakeDatabaseShrinkRequest extends TeaModel {
    /**
     * <p>The name of the data catalog.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hive</p>
     */
    @NameInMap("CatalogName")
    public String catalogName;

    /**
     * <p>The name of the database.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The description of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The storage path of the database. The path supports the oss, s3, and s3a protocols.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://path/to/database</p>
     */
    @NameInMap("Location")
    public String location;

    /**
     * <p>The key-value pairs of the database properties.</p>
     */
    @NameInMap("Parameters")
    public String parametersShrink;

    /**
     * <p>The tenant ID.</p>
     * <blockquote>
     * <p>Hover over your profile picture in the upper-right corner of the DMS console to obtain the tenant ID. For details, see <a href="https://help.aliyun.com/document_detail/181330.html">View tenant information</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3****</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("WorkspaceId")
    public Long workspaceId;

    public static CreateDataLakeDatabaseShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataLakeDatabaseShrinkRequest self = new CreateDataLakeDatabaseShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataLakeDatabaseShrinkRequest setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public CreateDataLakeDatabaseShrinkRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public CreateDataLakeDatabaseShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDataLakeDatabaseShrinkRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public CreateDataLakeDatabaseShrinkRequest setParametersShrink(String parametersShrink) {
        this.parametersShrink = parametersShrink;
        return this;
    }
    public String getParametersShrink() {
        return this.parametersShrink;
    }

    public CreateDataLakeDatabaseShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public CreateDataLakeDatabaseShrinkRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

}
