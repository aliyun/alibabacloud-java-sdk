// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdateAccessKeyRequest extends TeaModel {
    @NameInMap("UserPrincipalName")
    public String userPrincipalName;

    @NameInMap("UserAccessKeyId")
    public String userAccessKeyId;

    @NameInMap("Status")
    public String status;

    @NameInMap("AkProxySuffix")
    public String akProxySuffix;

    public static UpdateAccessKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccessKeyRequest self = new UpdateAccessKeyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAccessKeyRequest setUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

    public UpdateAccessKeyRequest setUserAccessKeyId(String userAccessKeyId) {
        this.userAccessKeyId = userAccessKeyId;
        return this;
    }
    public String getUserAccessKeyId() {
        return this.userAccessKeyId;
    }

    public UpdateAccessKeyRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateAccessKeyRequest setAkProxySuffix(String akProxySuffix) {
        this.akProxySuffix = akProxySuffix;
        return this;
    }
    public String getAkProxySuffix() {
        return this.akProxySuffix;
    }

}
