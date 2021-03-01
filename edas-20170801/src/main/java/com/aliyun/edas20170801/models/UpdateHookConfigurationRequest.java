// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateHookConfigurationRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Hooks")
    public String hooks;

    public static UpdateHookConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHookConfigurationRequest self = new UpdateHookConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHookConfigurationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateHookConfigurationRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UpdateHookConfigurationRequest setHooks(String hooks) {
        this.hooks = hooks;
        return this;
    }
    public String getHooks() {
        return this.hooks;
    }

}
