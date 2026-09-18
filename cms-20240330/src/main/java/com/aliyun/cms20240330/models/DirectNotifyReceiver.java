// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DirectNotifyReceiver extends TeaModel {
    /**
     * <p>The list of notification methods. This parameter is valid only for personnel types (CONTACT/GROUP/DUTY). Valid values: SMS, CALL, EMAIL.</p>
     */
    @NameInMap("channels")
    public java.util.List<String> channels;

    /**
     * <p>The list of Notification Recipient identifiers. For personnel types, this is the identifier of a contact, contact group, or on-call schedule. For IM types, this is the webhook identifier.</p>
     */
    @NameInMap("identifiers")
    public java.util.List<String> identifiers;

    /**
     * <p>The Notification Recipient object type. Personnel types (CONTACT/GROUP/DUTY) require the channels parameter to specify notification methods. IM types (DINGTALK/FEISHU/SLACK/WEIXIN/WEBHOOK) do not require the channels parameter.</p>
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
