// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DirectNotifyReceiver extends TeaModel {
    @NameInMap("channels")
    public java.util.List<String> channels;

    @NameInMap("identifiers")
    public java.util.List<String> identifiers;

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
