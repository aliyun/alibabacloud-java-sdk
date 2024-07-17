// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListUserRolesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>token!</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>PageSize</p>
     * 
     * <strong>example:</strong>
     * <p>-1/100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>acs:ram::1111:user/userName</p>
     */
    @NameInMap("PrincipalArn")
    public String principalArn;

    /**
     * <p>role name pattern filter</p>
     * 
     * <strong>example:</strong>
     * <p>.<em>test.</em></p>
     */
    @NameInMap("RoleNamePattern")
    public String roleNamePattern;

    public static ListUserRolesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserRolesRequest self = new ListUserRolesRequest();
        return TeaModel.build(map, self);
    }

    public ListUserRolesRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListUserRolesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserRolesRequest setPrincipalArn(String principalArn) {
        this.principalArn = principalArn;
        return this;
    }
    public String getPrincipalArn() {
        return this.principalArn;
    }

    public ListUserRolesRequest setRoleNamePattern(String roleNamePattern) {
        this.roleNamePattern = roleNamePattern;
        return this;
    }
    public String getRoleNamePattern() {
        return this.roleNamePattern;
    }

}
