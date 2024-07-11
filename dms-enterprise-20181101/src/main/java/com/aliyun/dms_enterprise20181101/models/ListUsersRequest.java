// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListUsersRequest extends TeaModel {
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
     * <p>**</p>
     * <p>Valid values: 10, 20, 50, and 100.**** Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The role that is assigned to the user. Valid values:</p>
     * <ul>
     * <li><strong>USER</strong>: a regular user.</li>
     * <li><strong>DBA</strong> : a database administrator (DBA).</li>
     * <li><strong>ADMIN</strong>: a Data Management (DMS) administrator.</li>
     * <li><strong>SECURITY_ADMIN</strong>: a security administrator.</li>
     * <li><strong>STRUCT_READ_ONLY</strong>: a schema read-only user.</li>
     * </ul>
     * <blockquote>
     * <p> To check your role, move the pointer over the profile picture in the upper-right corner of the DMS console.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>DBA</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>The search keyword. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> operation to obtain the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The status of the user. Valid values:</p>
     * <ul>
     * <li><strong>NORMAL</strong>: The user is normal.</li>
     * <li><strong>DISABLE</strong>: The user is disabled.</li>
     * <li><strong>DELETE</strong>: The user is deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("UserState")
    public String userState;

    public static ListUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUsersRequest self = new ListUsersRequest();
        return TeaModel.build(map, self);
    }

    public ListUsersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListUsersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUsersRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public ListUsersRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public ListUsersRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public ListUsersRequest setUserState(String userState) {
        this.userState = userState;
        return this;
    }
    public String getUserState() {
        return this.userState;
    }

}
