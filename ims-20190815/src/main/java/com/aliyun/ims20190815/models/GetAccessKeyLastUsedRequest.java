// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetAccessKeyLastUsedRequest extends TeaModel {
    /**
     * <p>The ID of the AccessKey pair that you want to query.</p>
     */
    @NameInMap("UserAccessKeyId")
    public String userAccessKeyId;

    /**
     * <p>The logon name of the RAM user.</p>
     * <br>
     * <p>If this parameter is empty, the AccessKey pair of the current user is queried.</p>
     */
    @NameInMap("UserPrincipalName")
    public String userPrincipalName;

    public static GetAccessKeyLastUsedRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccessKeyLastUsedRequest self = new GetAccessKeyLastUsedRequest();
        return TeaModel.build(map, self);
    }

    public GetAccessKeyLastUsedRequest setUserAccessKeyId(String userAccessKeyId) {
        this.userAccessKeyId = userAccessKeyId;
        return this;
    }
    public String getUserAccessKeyId() {
        return this.userAccessKeyId;
    }

    public GetAccessKeyLastUsedRequest setUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

}
