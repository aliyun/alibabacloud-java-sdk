// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class SeverityNotifyConfig extends TeaModel {
    /**
     * <p>The list of Notification Recipients. Each recipient specifies the type, identifier, and enabled channels.</p>
     */
    @NameInMap("receivers")
    public java.util.List<DirectNotifyReceiver> receivers;

    /**
     * <p>Specifies whether to send recovery notifications for this severity level. If this parameter is empty, the value falls back to the top-level sendRecoverNotification parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
