// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveRecordNotifyConfigRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("NotifyUrl")
    public String notifyUrl;

    @NameInMap("OnDemandUrl")
    public String onDemandUrl;

    @NameInMap("NeedStatusNotify")
    public Boolean needStatusNotify;

    public static UpdateLiveRecordNotifyConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveRecordNotifyConfigRequest self = new UpdateLiveRecordNotifyConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveRecordNotifyConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public UpdateLiveRecordNotifyConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateLiveRecordNotifyConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateLiveRecordNotifyConfigRequest setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public UpdateLiveRecordNotifyConfigRequest setOnDemandUrl(String onDemandUrl) {
        this.onDemandUrl = onDemandUrl;
        return this;
    }
    public String getOnDemandUrl() {
        return this.onDemandUrl;
    }

    public UpdateLiveRecordNotifyConfigRequest setNeedStatusNotify(Boolean needStatusNotify) {
        this.needStatusNotify = needStatusNotify;
        return this;
    }
    public Boolean getNeedStatusNotify() {
        return this.needStatusNotify;
    }

}
