// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class UpdateDataLakeDatabaseRequest extends TeaModel {
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
     * <p>The storage path of the database. Supported protocols include oss, s3, and s3a.</p>
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
    public java.util.Map<String, String> parameters;

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

    public static UpdateDataLakeDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataLakeDatabaseRequest self = new UpdateDataLakeDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataLakeDatabaseRequest setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public UpdateDataLakeDatabaseRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public UpdateDataLakeDatabaseRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDataLakeDatabaseRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public UpdateDataLakeDatabaseRequest setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
    }

    public UpdateDataLakeDatabaseRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public UpdateDataLakeDatabaseRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

}
