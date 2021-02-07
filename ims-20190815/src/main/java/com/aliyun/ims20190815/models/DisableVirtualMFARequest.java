// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DisableVirtualMFARequest extends TeaModel {
    @NameInMap("UserPrincipalName")
    public String userPrincipalName;

    @NameInMap("AkProxySuffix")
    public String akProxySuffix;

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

    public DisableVirtualMFARequest setAkProxySuffix(String akProxySuffix) {
        this.akProxySuffix = akProxySuffix;
        return this;
    }
    public String getAkProxySuffix() {
        return this.akProxySuffix;
    }

}
