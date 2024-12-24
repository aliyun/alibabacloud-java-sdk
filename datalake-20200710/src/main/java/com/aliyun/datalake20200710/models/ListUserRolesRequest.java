// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListUserRolesRequest extends TeaModel {
    /**
     * <p>The page turning token, which is used to obtain the next page of data. If not provided in the response result, a string (&quot;&quot;) or empty string (&quot;) is empty string.</p>
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
     * <p>Used to uniquely identify a RAM user or RAM role. The OSS URL is in the following format:</p>
     * <ul>
     * <li>RAM user: acs:ram::[accountId]:user/[userName].</li>
     * <li>RAM role: acs:ram::[accountId]:role/[roleName].</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1111:user/userName</p>
     */
    @NameInMap("PrincipalArn")
    public String principalArn;

    /**
     * <p>The regular expression that matches the role name. Fuzzy search is supported.</p>
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
