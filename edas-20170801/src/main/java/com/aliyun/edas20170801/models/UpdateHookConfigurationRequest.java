// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateHookConfigurationRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d498****-1dd8ec229862</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the application instance group.</p>
     * 
     * <strong>example:</strong>
     * <p>d498****-1dd8ec229862</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The script to mount. Set the value in the JSON format. Example: <code>[{&quot;ignoreFail&quot;:false,&quot;name&quot;:&quot;postprepareInstanceEnvironmentOnScaleOut&quot;,&quot;script&quot;:&quot;ls&quot;},{&quot;ignoreFail&quot;:true,&quot;name&quot;:&quot;postdeleteInstanceDataOnScaleIn&quot;,&quot;script&quot;:&quot;&quot;},{&quot;ignoreFail&quot;:true,&quot;name&quot;:&quot;prestartInstance&quot;,&quot;script&quot;:&quot;&quot;},{&quot;ignoreFail&quot;:true,&quot;name&quot;:&quot;poststartInstance&quot;,&quot;script&quot;:&quot;&quot;},{&quot;ignoreFail&quot;:true,&quot;name&quot;:&quot;prestopInstance&quot;,&quot;script&quot;:&quot;&quot;},{&quot;ignoreFail&quot;:true,&quot;name&quot;:&quot;poststopInstance&quot;,&quot;script&quot;:&quot;&quot;}]</code></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;ignoreFail&quot;:false,&quot;name&quot;:&quot;postprepareInstanceEnvironmentOnScaleOut&quot;,&quot;script&quot;:&quot;ls&quot;}]</p>
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
