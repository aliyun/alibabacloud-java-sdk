// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListUsersRequest extends TeaModel {
    // The number of the page to return.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page.
    // 
    // >  Valid values: 10, 20, 50, and 100. Default value: 10.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The role that is assigned to the user. Valid values:
    // 
    // *   **USER**: a regular user role.
    // *   **DBA**: a database administrator (DBA) role.
    // *   **ADMIN**: a Data Management (DMS) administrator role.
    // *   **SECURITY_ADMIN**: a security administrator role.
    // *   **STRUCT_READ_ONLY**: a schema read-only user role.
    // 
    // >  To check your role, move the pointer over the profile picture in the upper-right corner of the DMS console.
    @NameInMap("Role")
    public String role;

    // The search keyword. Fuzzy match is supported.
    @NameInMap("SearchKey")
    public String searchKey;

    // The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to query the ID of the tenant.
    @NameInMap("Tid")
    public Long tid;

    // The status of the user. Valid values:
    // 
    // *   **NORMAL**: The user is normal.
    // *   **DISABLE**: The user is disabled.
    // *   **DELETE**: The user is deleted.
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
