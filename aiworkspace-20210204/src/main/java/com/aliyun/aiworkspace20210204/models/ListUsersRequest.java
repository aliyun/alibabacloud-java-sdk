// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListUsersRequest extends TeaModel {
    // 账户类型列表，以逗号分隔
    @NameInMap("AccountTypes")
    public String accountTypes;

    // 分页，从1开始，默认1
    @NameInMap("PageNumber")
    public Long pageNumber;

    // 页大小，默认20
    @NameInMap("PageSize")
    public Long pageSize;

    // 用户 Id 列表，以逗号分隔
    @NameInMap("UserIds")
    public String userIds;

    // 用户名
    @NameInMap("UserName")
    public String userName;

    public static ListUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUsersRequest self = new ListUsersRequest();
        return TeaModel.build(map, self);
    }

    public ListUsersRequest setAccountTypes(String accountTypes) {
        this.accountTypes = accountTypes;
        return this;
    }
    public String getAccountTypes() {
        return this.accountTypes;
    }

    public ListUsersRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListUsersRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListUsersRequest setUserIds(String userIds) {
        this.userIds = userIds;
        return this;
    }
    public String getUserIds() {
        return this.userIds;
    }

    public ListUsersRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
