// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetSnapshotCallbackAuthRequest extends TeaModel {
    @NameInMap("CallbackAuthKey")
    public String callbackAuthKey;

    @NameInMap("CallbackReqAuth")
    public String callbackReqAuth;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static SetSnapshotCallbackAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        SetSnapshotCallbackAuthRequest self = new SetSnapshotCallbackAuthRequest();
        return TeaModel.build(map, self);
    }

    public SetSnapshotCallbackAuthRequest setCallbackAuthKey(String callbackAuthKey) {
        this.callbackAuthKey = callbackAuthKey;
        return this;
    }
    public String getCallbackAuthKey() {
        return this.callbackAuthKey;
    }

    public SetSnapshotCallbackAuthRequest setCallbackReqAuth(String callbackReqAuth) {
        this.callbackReqAuth = callbackReqAuth;
        return this;
    }
    public String getCallbackReqAuth() {
        return this.callbackReqAuth;
    }

    public SetSnapshotCallbackAuthRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetSnapshotCallbackAuthRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
