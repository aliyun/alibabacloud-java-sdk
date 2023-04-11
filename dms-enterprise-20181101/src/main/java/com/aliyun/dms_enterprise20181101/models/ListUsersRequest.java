// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListUsersRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>**</p>
     * <br>
     * <p>Valid values: 10, 20, 50, and 100.**** Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The role that is assigned to the user. Valid values:</p>
     * <br>
     * <p>*   **USER**: a regular user.</p>
     * <p>*   **DBA** : a database administrator (DBA).</p>
     * <p>*   **ADMIN**: a Data Management (DMS) administrator.</p>
     * <p>*   **SECURITY_ADMIN**: a security administrator.</p>
     * <p>*   **STRUCT_READ_ONLY**: a schema read-only user.</p>
     * <br>
     * <p>>  To check your role, move the pointer over the profile picture in the upper-right corner of the DMS console.</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>The search keyword. Fuzzy match is supported.</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to obtain the tenant ID.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The status of the user. Valid values:</p>
     * <br>
     * <p>*   **NORMAL**: The user is normal.</p>
     * <p>*   **DISABLE**: The user is disabled.</p>
     * <p>*   **DELETE**: The user is deleted.</p>
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
