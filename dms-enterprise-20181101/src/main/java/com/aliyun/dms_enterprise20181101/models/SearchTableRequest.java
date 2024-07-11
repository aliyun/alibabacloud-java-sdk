// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SearchTableRequest extends TeaModel {
    /**
     * <p>The type of database. Valid values:</p>
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
     * <p>The type of the environment to which databases belong. For more information, see <a href="https://help.aliyun.com/document_detail/163309.html">Change the environment type of an instance</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>PRODUCT</p>
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
     * <p>Specifies whether to return the GUID of each table.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ReturnGuid")
    public Boolean returnGuid;

    /**
     * <p>The keyword that is used to query tables.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The scope of tables that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>HAS_PERMSSION</strong>: the tables on which the current account has permissions.</li>
     * <li><strong>OWNER</strong>: the tables owned by the current account.</li>
     * <li><strong>MY_FOCUS</strong>: the tables that the current account follows.</li>
     * <li><strong>UNKNOWN</strong>: all tables.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OWNER</p>
     */
    @NameInMap("SearchRange")
    public String searchRange;

    /**
     * <p>The type of table that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>TABLE</strong>: physical and logical tables</li>
     * <li><strong>SINGLE_TABLE</strong>: physical tables</li>
     * <li><strong>LOGIC_TABLE</strong>: logical tables</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LOGIC_TABLE</p>
     */
    @NameInMap("SearchTarget")
    public String searchTarget;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p>To view the tenant ID, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a> section of the &quot;Manage DMS tenants&quot; topic.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static SearchTableRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchTableRequest self = new SearchTableRequest();
        return TeaModel.build(map, self);
    }

    public SearchTableRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public SearchTableRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public SearchTableRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchTableRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchTableRequest setReturnGuid(Boolean returnGuid) {
        this.returnGuid = returnGuid;
        return this;
    }
    public Boolean getReturnGuid() {
        return this.returnGuid;
    }

    public SearchTableRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public SearchTableRequest setSearchRange(String searchRange) {
        this.searchRange = searchRange;
        return this;
    }
    public String getSearchRange() {
        return this.searchRange;
    }

    public SearchTableRequest setSearchTarget(String searchTarget) {
        this.searchTarget = searchTarget;
        return this;
    }
    public String getSearchTarget() {
        return this.searchTarget;
    }

    public SearchTableRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
