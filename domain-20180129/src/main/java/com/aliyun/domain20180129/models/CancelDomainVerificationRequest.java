// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CancelDomainVerificationRequest extends TeaModel {
    @NameInMap("ActionType")
    public String actionType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static CancelDomainVerificationRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelDomainVerificationRequest self = new CancelDomainVerificationRequest();
        return TeaModel.build(map, self);
    }

    public CancelDomainVerificationRequest setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

    public CancelDomainVerificationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CancelDomainVerificationRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CancelDomainVerificationRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
