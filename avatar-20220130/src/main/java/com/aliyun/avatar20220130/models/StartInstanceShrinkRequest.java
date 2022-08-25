// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class StartInstanceShrinkRequest extends TeaModel {
    @NameInMap("App")
    public String appShrink;

    @NameInMap("Channel")
    public String channelShrink;

    @NameInMap("CommandRequest")
    public String commandRequestShrink;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("User")
    public String userShrink;

    public static StartInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartInstanceShrinkRequest self = new StartInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StartInstanceShrinkRequest setAppShrink(String appShrink) {
        this.appShrink = appShrink;
        return this;
    }
    public String getAppShrink() {
        return this.appShrink;
    }

    public StartInstanceShrinkRequest setChannelShrink(String channelShrink) {
        this.channelShrink = channelShrink;
        return this;
    }
    public String getChannelShrink() {
        return this.channelShrink;
    }

    public StartInstanceShrinkRequest setCommandRequestShrink(String commandRequestShrink) {
        this.commandRequestShrink = commandRequestShrink;
        return this;
    }
    public String getCommandRequestShrink() {
        return this.commandRequestShrink;
    }

    public StartInstanceShrinkRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public StartInstanceShrinkRequest setUserShrink(String userShrink) {
        this.userShrink = userShrink;
        return this;
    }
    public String getUserShrink() {
        return this.userShrink;
    }

}
