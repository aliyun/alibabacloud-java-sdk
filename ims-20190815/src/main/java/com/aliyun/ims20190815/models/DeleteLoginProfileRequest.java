// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteLoginProfileRequest extends TeaModel {
    /**
     * <p>The logon name of the RAM user.</p>
     */
    @NameInMap("UserPrincipalName")
    public String userPrincipalName;

    public static DeleteLoginProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLoginProfileRequest self = new DeleteLoginProfileRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLoginProfileRequest setUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

}
