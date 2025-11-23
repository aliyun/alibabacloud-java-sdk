// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListAuthorizedInstancesForUserRequest extends TeaModel {
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
     * <blockquote>
     * <p>To view the ID of the tenant, go to the DMS console and move the pointer over the profile picture in the upper-right corner. For more information, see the <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a> section of the &quot;Manage DMS tenants&quot; topic.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The ID of the user. You can call the <a href="https://help.aliyun.com/document_detail/465816.html">GetUser</a> operation to query the user ID.</p>
     * <blockquote>
     * <p>If IdentityType is set to USER, this parameter is required.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>51****</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static ListAuthorizedInstancesForUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedInstancesForUserRequest self = new ListAuthorizedInstancesForUserRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedInstancesForUserRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public ListAuthorizedInstancesForUserRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public ListAuthorizedInstancesForUserRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListAuthorizedInstancesForUserRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListAuthorizedInstancesForUserRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public ListAuthorizedInstancesForUserRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public ListAuthorizedInstancesForUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
