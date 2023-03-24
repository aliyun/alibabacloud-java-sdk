// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetUserMFAInfoRequest extends TeaModel {
    /**
     * <p>The logon name of the RAM user. This parameter is differently set in the following scenarios:</p>
     * <br>
     * <p>*   If you use a RAM user to call this operation, this parameter can be left empty. If you do not specify this parameter, the information of the MFA device that is bound to the RAM user is queried.</p>
     * <p>*   If you use an Alibaba Cloud account to call this operation, you must set this parameter to the logon name of the RAM user that you want to query.</p>
     */
    @NameInMap("UserPrincipalName")
    public String userPrincipalName;

    public static GetUserMFAInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserMFAInfoRequest self = new GetUserMFAInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetUserMFAInfoRequest setUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

}
