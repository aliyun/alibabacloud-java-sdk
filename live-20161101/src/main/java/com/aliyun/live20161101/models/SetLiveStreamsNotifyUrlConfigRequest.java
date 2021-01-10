// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveStreamsNotifyUrlConfigRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("NotifyUrl")
    public String notifyUrl;

    @NameInMap("NotifyType")
    public String notifyType;

    @NameInMap("AuthType")
    public String authType;

    @NameInMap("AuthKey")
    public String authKey;

    public static SetLiveStreamsNotifyUrlConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLiveStreamsNotifyUrlConfigRequest self = new SetLiveStreamsNotifyUrlConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetLiveStreamsNotifyUrlConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetLiveStreamsNotifyUrlConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetLiveStreamsNotifyUrlConfigRequest setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public SetLiveStreamsNotifyUrlConfigRequest setNotifyType(String notifyType) {
        this.notifyType = notifyType;
        return this;
    }
    public String getNotifyType() {
        return this.notifyType;
    }

    public SetLiveStreamsNotifyUrlConfigRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public SetLiveStreamsNotifyUrlConfigRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

}
