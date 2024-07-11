// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SearchDatabaseRequest extends TeaModel {
    /**
     * <p>The type of the database. For more information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/198106.html">DbType parameter</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>MYSQL</p>
     */
    @NameInMap("DbType")
    public String dbType;

    /**
     * <p>The environment type of the database. For more information, see <a href="https://help.aliyun.com/document_detail/163309.html">Change the environment type of an instance</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>The number of the page to return.</p>
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
     * <p>The keyword that is used to search for databases.</p>
     * 
     * <strong>example:</strong>
     * <p>testdb</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The query range based on permissions. Valid values:</p>
     * <ul>
     * <li><strong>HAS_PERMSSION</strong>: searches for databases on which the current user has permissions.</li>
     * <li><strong>OWNER</strong>: searches for databases owned by the current user.</li>
     * <li><strong>MY_FOCUS</strong>: searches for databases that the current user follows.</li>
     * <li><strong>UNKNOWN</strong>: searches for all databases.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HAS_PERMSSION</p>
     */
    @NameInMap("SearchRange")
    public String searchRange;

    /**
     * <p>The category of the database. Valid values:</p>
     * <ul>
     * <li><strong>DB</strong>: single database or logical database.</li>
     * <li><strong>SINGLE_DB</strong>: single database.</li>
     * <li><strong>LOGIC_DB</strong>: logical database.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SINGLE_DB</p>
     */
    @NameInMap("SearchTarget")
    public String searchTarget;

    /**
     * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> operation to query the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static SearchDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchDatabaseRequest self = new SearchDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public SearchDatabaseRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public SearchDatabaseRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public SearchDatabaseRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchDatabaseRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchDatabaseRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public SearchDatabaseRequest setSearchRange(String searchRange) {
        this.searchRange = searchRange;
        return this;
    }
    public String getSearchRange() {
        return this.searchRange;
    }

    public SearchDatabaseRequest setSearchTarget(String searchTarget) {
        this.searchTarget = searchTarget;
        return this;
    }
    public String getSearchTarget() {
        return this.searchTarget;
    }

    public SearchDatabaseRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
