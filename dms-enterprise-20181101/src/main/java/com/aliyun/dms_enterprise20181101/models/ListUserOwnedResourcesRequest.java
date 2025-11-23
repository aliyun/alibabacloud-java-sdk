// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListUserOwnedResourcesRequest extends TeaModel {
    /**
     * <p>The database name.</p>
     * 
     * <strong>example:</strong>
     * <p>db_name</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The type of the database instance. For more information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/198106.html">DbType parameter</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>MYSQL</p>
     */
    @NameInMap("DbType")
    public String dbType;

    /**
     * <p>The type of the environment in which the database instance is deployed. Valid values:</p>
     * <ul>
     * <li><strong>product</strong>: production environment.</li>
     * <li><strong>dev</strong>: development environment.</li>
     * <li><strong>pre</strong>: pre-release environment.</li>
     * <li><strong>test</strong>: test environment.</li>
     * <li><strong>sit</strong>: system integration testing (SIT) environment.</li>
     * <li><strong>uat</strong>: user acceptance testing (UAT) environment.</li>
     * <li><strong>pet</strong>: stress testing environment.</li>
     * <li><strong>stag</strong>: staging environment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>product</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>Specifies whether the database is a logical database. Valid values:</p>
     * <ul>
     * <li><strong>true.</strong>: The database is a logical database</li>
     * <li><strong>false</strong>: The database is a physical database.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Logic")
    public Boolean logic;

    /**
     * <p>The type of the owner. Valid values:</p>
     * <ul>
     * <li>INSTANCE: an owner of an instance.</li>
     * <li>DATABASE: an owner of a physical database.</li>
     * <li>TABLE: an owner of a physical table.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>INSTANCE</p>
     */
    @NameInMap("OwnerType")
    public String ownerType;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p>To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see the <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a> section of the &quot;Manage DMS tenants&quot; topic.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The ID of the user.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1***</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static ListUserOwnedResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserOwnedResourcesRequest self = new ListUserOwnedResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListUserOwnedResourcesRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public ListUserOwnedResourcesRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public ListUserOwnedResourcesRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public ListUserOwnedResourcesRequest setLogic(Boolean logic) {
        this.logic = logic;
        return this;
    }
    public Boolean getLogic() {
        return this.logic;
    }

    public ListUserOwnedResourcesRequest setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

    public ListUserOwnedResourcesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListUserOwnedResourcesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserOwnedResourcesRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public ListUserOwnedResourcesRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
