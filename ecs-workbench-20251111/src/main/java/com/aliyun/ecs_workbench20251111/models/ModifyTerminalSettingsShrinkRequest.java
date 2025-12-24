// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs_workbench20251111.models;

import com.aliyun.tea.*;

public class ModifyTerminalSettingsShrinkRequest extends TeaModel {
    /**
     * <p>免密登录配置</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PasswordlessLoginConfig")
    public String passwordlessLoginConfigShrink;

    public static ModifyTerminalSettingsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTerminalSettingsShrinkRequest self = new ModifyTerminalSettingsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTerminalSettingsShrinkRequest setPasswordlessLoginConfigShrink(String passwordlessLoginConfigShrink) {
        this.passwordlessLoginConfigShrink = passwordlessLoginConfigShrink;
        return this;
    }
    public String getPasswordlessLoginConfigShrink() {
        return this.passwordlessLoginConfigShrink;
    }

}
