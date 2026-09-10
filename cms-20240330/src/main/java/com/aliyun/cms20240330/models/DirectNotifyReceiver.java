// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DirectNotifyReceiver extends TeaModel {
    /**
     * <p>The list of notification channels. This parameter is valid only for person types (CONTACT/GROUP/DUTY). Valid values: SMS, CALL, EMAIL.</p>
     */
    @NameInMap("channels")
    public java.util.List<String> channels;

    /**
     * <p>The list of notification recipient identifiers. For person types, this is the identifier of the contact, contact group, or on-call schedule. For IM types, this is the webhook identifier.</p>
     */
    @NameInMap("identifiers")
    public java.util.List<String> identifiers;

    /**
     * <p>The Notification Recipient type. For person types (CONTACT/GROUP/DUTY), you must specify notification channels by using the channels parameter. For IM types (DINGTALK/FEISHU/SLACK/WEIXIN/WEBHOOK), the channels parameter is not required.</p>
     * 
     * <strong>example:</strong>
     * <p>CONTACT</p>
     */
    @NameInMap("targetType")
    public String targetType;

    public static DirectNotifyReceiver build(java.util.Map<String, ?> map) throws Exception {
        DirectNotifyReceiver self = new DirectNotifyReceiver();
        return TeaModel.build(map, self);
    }

    public DirectNotifyReceiver setChannels(java.util.List<String> channels) {
        this.channels = channels;
        return this;
    }
    public java.util.List<String> getChannels() {
        return this.channels;
    }

    public DirectNotifyReceiver setIdentifiers(java.util.List<String> identifiers) {
        this.identifiers = identifiers;
        return this;
    }
    public java.util.List<String> getIdentifiers() {
        return this.identifiers;
    }

    public DirectNotifyReceiver setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
