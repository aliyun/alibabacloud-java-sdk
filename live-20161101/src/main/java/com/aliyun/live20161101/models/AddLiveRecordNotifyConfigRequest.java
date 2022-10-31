// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveRecordNotifyConfigRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("NeedStatusNotify")
    public Boolean needStatusNotify;

    @NameInMap("NotifyUrl")
    public String notifyUrl;

    @NameInMap("OnDemandUrl")
    public String onDemandUrl;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static AddLiveRecordNotifyConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLiveRecordNotifyConfigRequest self = new AddLiveRecordNotifyConfigRequest();
        return TeaModel.build(map, self);
    }

    public AddLiveRecordNotifyConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddLiveRecordNotifyConfigRequest setNeedStatusNotify(Boolean needStatusNotify) {
        this.needStatusNotify = needStatusNotify;
        return this;
    }
    public Boolean getNeedStatusNotify() {
        return this.needStatusNotify;
    }

    public AddLiveRecordNotifyConfigRequest setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public AddLiveRecordNotifyConfigRequest setOnDemandUrl(String onDemandUrl) {
        this.onDemandUrl = onDemandUrl;
        return this;
    }
    public String getOnDemandUrl() {
        return this.onDemandUrl;
    }

    public AddLiveRecordNotifyConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddLiveRecordNotifyConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
