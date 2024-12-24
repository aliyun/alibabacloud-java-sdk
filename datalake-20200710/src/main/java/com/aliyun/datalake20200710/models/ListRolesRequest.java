// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListRolesRequest extends TeaModel {
    /**
     * <p>The page turning token, which is used to obtain the next page of data. If not provided in the response result, a string (&quot;&quot;) or empty string (&quot;) is empty string.</p>
     * 
     * <strong>example:</strong>
     * <p>token!</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>the number of entries returned on each page, the maximum value is 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>-1/100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The regular expression that matches the role name. Fuzzy search is supported, such as.\<em>test.\</em>.</p>
     * 
     * <strong>example:</strong>
     * <p>.<em>test.</em></p>
     */
    @NameInMap("RoleNamePattern")
    public String roleNamePattern;

    public static ListRolesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRolesRequest self = new ListRolesRequest();
        return TeaModel.build(map, self);
    }

    public ListRolesRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListRolesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRolesRequest setRoleNamePattern(String roleNamePattern) {
        this.roleNamePattern = roleNamePattern;
        return this;
    }
    public String getRoleNamePattern() {
        return this.roleNamePattern;
    }

}
