// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListAuthorizedDatabasesForUserRequest extends TeaModel {
    /**
     * <p>The type of databases. Valid values:</p>
     * <ul>
     * <li><strong>MySQL</strong></li>
     * <li><strong>SQLServer</strong></li>
     * <li><strong>PostgreSQL</strong></li>
     * <li><strong>Oracle</strong></li>
     * <li><strong>DRDS</strong></li>
     * <li><strong>OceanBase</strong></li>
     * <li><strong>Mongo</strong></li>
     * <li><strong>Redis</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
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
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The search keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>policy_test</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The ID of the tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The ID of the user. You can call the <a href="https://help.aliyun.com/document_detail/465816.html">GetUser</a> operation to query the user ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>51****</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static ListAuthorizedDatabasesForUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedDatabasesForUserRequest self = new ListAuthorizedDatabasesForUserRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedDatabasesForUserRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public ListAuthorizedDatabasesForUserRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public ListAuthorizedDatabasesForUserRequest setLogic(Boolean logic) {
        this.logic = logic;
        return this;
    }
    public Boolean getLogic() {
        return this.logic;
    }

    public ListAuthorizedDatabasesForUserRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListAuthorizedDatabasesForUserRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListAuthorizedDatabasesForUserRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public ListAuthorizedDatabasesForUserRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public ListAuthorizedDatabasesForUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
