// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class NotifyChannel extends TeaModel {
    @NameInMap("channelType")
    public String channelType;

    @NameInMap("enabledSubChannels")
    public java.util.List<String> enabledSubChannels;

    @NameInMap("receivers")
    public java.util.List<String> receivers;

    public static NotifyChannel build(java.util.Map<String, ?> map) throws Exception {
        NotifyChannel self = new NotifyChannel();
        return TeaModel.build(map, self);
    }

    public NotifyChannel setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public NotifyChannel setEnabledSubChannels(java.util.List<String> enabledSubChannels) {
        this.enabledSubChannels = enabledSubChannels;
        return this;
    }
    public java.util.List<String> getEnabledSubChannels() {
        return this.enabledSubChannels;
    }

    public NotifyChannel setReceivers(java.util.List<String> receivers) {
        this.receivers = receivers;
        return this;
    }
    public java.util.List<String> getReceivers() {
        return this.receivers;
    }

}
