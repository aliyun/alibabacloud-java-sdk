// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateHookConfigurationRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the application instance group.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The script to mount. Set the value in the JSON format. Example: `[{"ignoreFail":false,"name":"postprepareInstanceEnvironmentOnScaleOut","script":"ls"},{"ignoreFail":true,"name":"postdeleteInstanceDataOnScaleIn","script":""},{"ignoreFail":true,"name":"prestartInstance","script":""},{"ignoreFail":true,"name":"poststartInstance","script":""},{"ignoreFail":true,"name":"prestopInstance","script":""},{"ignoreFail":true,"name":"poststopInstance","script":""}]`</p>
     */
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
