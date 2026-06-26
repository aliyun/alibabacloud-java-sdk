// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListUserRolesRequest extends TeaModel {
    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token used to retrieve the next page of data. If the response does not provide this token, pass an empty string (&quot;&quot;).</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("pageToken")
    public String pageToken;

    /**
     * <p>The resource descriptor for the user.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::[accountId]:user/user_name</p>
     */
    @NameInMap("userPrincipal")
    public String userPrincipal;

    public static ListUserRolesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserRolesRequest self = new ListUserRolesRequest();
        return TeaModel.build(map, self);
    }

    public ListUserRolesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUserRolesRequest setPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    public String getPageToken() {
        return this.pageToken;
    }

    public ListUserRolesRequest setUserPrincipal(String userPrincipal) {
        this.userPrincipal = userPrincipal;
        return this;
    }
    public String getUserPrincipal() {
        return this.userPrincipal;
    }

}
