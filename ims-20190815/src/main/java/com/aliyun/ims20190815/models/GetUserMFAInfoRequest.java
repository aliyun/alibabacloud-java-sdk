// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetUserMFAInfoRequest extends TeaModel {
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
