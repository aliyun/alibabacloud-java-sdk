// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class SeverityNotifyConfig extends TeaModel {
    @NameInMap("receivers")
    public java.util.List<DirectNotifyReceiver> receivers;

    @NameInMap("sendRecoverNotification")
    public Boolean sendRecoverNotification;

    public static SeverityNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
        SeverityNotifyConfig self = new SeverityNotifyConfig();
        return TeaModel.build(map, self);
    }

    public SeverityNotifyConfig setReceivers(java.util.List<DirectNotifyReceiver> receivers) {
        this.receivers = receivers;
        return this;
    }
    public java.util.List<DirectNotifyReceiver> getReceivers() {
        return this.receivers;
    }

    public SeverityNotifyConfig setSendRecoverNotification(Boolean sendRecoverNotification) {
        this.sendRecoverNotification = sendRecoverNotification;
        return this;
    }
    public Boolean getSendRecoverNotification() {
        return this.sendRecoverNotification;
    }

}
