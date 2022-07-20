// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SetAuditConfigRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Channel")
    public String channel;

    @NameInMap("LegalSwitch")
    public String legalSwitch;

    public static SetAuditConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAuditConfigRequest self = new SetAuditConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetAuditConfigRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SetAuditConfigRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public SetAuditConfigRequest setLegalSwitch(String legalSwitch) {
        this.legalSwitch = legalSwitch;
        return this;
    }
    public String getLegalSwitch() {
        return this.legalSwitch;
    }

}
