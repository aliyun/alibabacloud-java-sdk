// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs_workbench20251111.models;

import com.aliyun.tea.*;

public class ModifyTerminalSettingsRequest extends TeaModel {
    /**
     * <p>免密登录配置</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PasswordlessLoginConfig")
    public ModifyTerminalSettingsRequestPasswordlessLoginConfig passwordlessLoginConfig;

    public static ModifyTerminalSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTerminalSettingsRequest self = new ModifyTerminalSettingsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTerminalSettingsRequest setPasswordlessLoginConfig(ModifyTerminalSettingsRequestPasswordlessLoginConfig passwordlessLoginConfig) {
        this.passwordlessLoginConfig = passwordlessLoginConfig;
        return this;
    }
    public ModifyTerminalSettingsRequestPasswordlessLoginConfig getPasswordlessLoginConfig() {
        return this.passwordlessLoginConfig;
    }

    public static class ModifyTerminalSettingsRequestPasswordlessLoginConfig extends TeaModel {
        /**
         * <p>免密功能开关</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        public static ModifyTerminalSettingsRequestPasswordlessLoginConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyTerminalSettingsRequestPasswordlessLoginConfig self = new ModifyTerminalSettingsRequestPasswordlessLoginConfig();
            return TeaModel.build(map, self);
        }

        public ModifyTerminalSettingsRequestPasswordlessLoginConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

}
