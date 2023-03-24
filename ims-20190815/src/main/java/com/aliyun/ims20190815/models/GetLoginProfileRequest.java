// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetLoginProfileRequest extends TeaModel {
    /**
     * <p>The logon name of the RAM user.</p>
     */
    @NameInMap("UserPrincipalName")
    public String userPrincipalName;

    public static GetLoginProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLoginProfileRequest self = new GetLoginProfileRequest();
        return TeaModel.build(map, self);
    }

    public GetLoginProfileRequest setUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

}
