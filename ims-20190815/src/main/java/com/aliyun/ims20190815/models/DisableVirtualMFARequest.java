// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DisableVirtualMFARequest extends TeaModel {
    /**
     * <p>The logon name of the RAM user.</p>
     */
    @NameInMap("UserPrincipalName")
    public String userPrincipalName;

    public static DisableVirtualMFARequest build(java.util.Map<String, ?> map) throws Exception {
        DisableVirtualMFARequest self = new DisableVirtualMFARequest();
        return TeaModel.build(map, self);
    }

    public DisableVirtualMFARequest setUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

}
