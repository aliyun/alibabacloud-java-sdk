// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListRoleUsersRequest extends TeaModel {
    /**
     * <p>The pagination token, which is returned from the returned result. If none is returned, an empty string or \&quot;\&quot;is passed.</p>
     * 
     * <strong>example:</strong>
     * <p>token!</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>The size of each page. The maximum value is 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>-1/100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the role.</p>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("RoleName")
    public String roleName;

    /**
     * <p>The regular expression that matches the user name.</p>
     * 
     * <strong>example:</strong>
     * <p>.<em>user.</em></p>
     */
    @NameInMap("UserNamePattern")
    public String userNamePattern;

    public static ListRoleUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRoleUsersRequest self = new ListRoleUsersRequest();
        return TeaModel.build(map, self);
    }

    public ListRoleUsersRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListRoleUsersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRoleUsersRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public ListRoleUsersRequest setUserNamePattern(String userNamePattern) {
        this.userNamePattern = userNamePattern;
        return this;
    }
    public String getUserNamePattern() {
        return this.userNamePattern;
    }

}
