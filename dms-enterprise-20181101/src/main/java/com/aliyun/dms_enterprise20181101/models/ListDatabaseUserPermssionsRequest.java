// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDatabaseUserPermssionsRequest extends TeaModel {
    /**
     * <p>The ID of the database.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("DbId")
    public String dbId;

    /**
     * <p>Specifies whether the database is a logical database.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Logic")
    public Boolean logic;

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
     * <p>The type of the permission. Valid values:</p>
     * <ul>
     * <li>DATABASE: permissions on databases</li>
     * <li>TABLE: permissions on tables</li>
     * <li>COLUMN: permissions on fields</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DATABASE</p>
     */
    @NameInMap("PermType")
    public String permType;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p>: To view the ID of the tenant, log on to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">Manage DMS tenants</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The nickname of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>search_user_name</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static ListDatabaseUserPermssionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatabaseUserPermssionsRequest self = new ListDatabaseUserPermssionsRequest();
        return TeaModel.build(map, self);
    }

    public ListDatabaseUserPermssionsRequest setDbId(String dbId) {
        this.dbId = dbId;
        return this;
    }
    public String getDbId() {
        return this.dbId;
    }

    public ListDatabaseUserPermssionsRequest setLogic(Boolean logic) {
        this.logic = logic;
        return this;
    }
    public Boolean getLogic() {
        return this.logic;
    }

    public ListDatabaseUserPermssionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDatabaseUserPermssionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDatabaseUserPermssionsRequest setPermType(String permType) {
        this.permType = permType;
        return this;
    }
    public String getPermType() {
        return this.permType;
    }

    public ListDatabaseUserPermssionsRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public ListDatabaseUserPermssionsRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
