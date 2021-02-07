// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetAccessKeyLastUsedRequest extends TeaModel {
    @NameInMap("UserPrincipalName")
    public String userPrincipalName;

    @NameInMap("UserAccessKeyId")
    public String userAccessKeyId;

    @NameInMap("AkProxySuffix")
    public String akProxySuffix;

    public static GetAccessKeyLastUsedRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccessKeyLastUsedRequest self = new GetAccessKeyLastUsedRequest();
        return TeaModel.build(map, self);
    }

    public GetAccessKeyLastUsedRequest setUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

    public GetAccessKeyLastUsedRequest setUserAccessKeyId(String userAccessKeyId) {
        this.userAccessKeyId = userAccessKeyId;
        return this;
    }
    public String getUserAccessKeyId() {
        return this.userAccessKeyId;
    }

    public GetAccessKeyLastUsedRequest setAkProxySuffix(String akProxySuffix) {
        this.akProxySuffix = akProxySuffix;
        return this;
    }
    public String getAkProxySuffix() {
        return this.akProxySuffix;
    }

}
