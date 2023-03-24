// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UnbindMFADeviceRequest extends TeaModel {
    /**
     * <p>The logon name of the RAM user.</p>
     */
    @NameInMap("UserPrincipalName")
    public String userPrincipalName;

    public static UnbindMFADeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindMFADeviceRequest self = new UnbindMFADeviceRequest();
        return TeaModel.build(map, self);
    }

    public UnbindMFADeviceRequest setUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

}
