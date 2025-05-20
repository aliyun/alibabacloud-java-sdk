// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListUserRolesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public String maxResults;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("pageToken")
    public String pageToken;

    /**
     * <strong>example:</strong>
     * <p>acs:ram::[accountId]:user/user_name</p>
     */
    @NameInMap("userPrincipal")
    public String userPrincipal;

    public static ListUserRolesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserRolesRequest self = new ListUserRolesRequest();
        return TeaModel.build(map, self);
    }

    public ListUserRolesRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
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
