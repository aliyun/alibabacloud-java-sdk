// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class SeverityNotifyConfig extends TeaModel {
    /**
     * <p>The list of notification recipients. Each recipient specifies a type, an identifier, and the enabled channels.</p>
     */
    @NameInMap("receivers")
    public java.util.List<DirectNotifyReceiver> receivers;

    /**
     * <p>Specifies whether to send recovery notifications for this severity level. If this parameter is left empty, the value falls back to the top-level sendRecoverNotification parameter.</p>
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
