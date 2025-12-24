// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs_workbench20251111.models;

import com.aliyun.tea.*;

public class DescribeTerminalSettingsResponseBody extends TeaModel {
    @NameInMap("PasswordlessLoginConfig")
    public DescribeTerminalSettingsResponseBodyPasswordlessLoginConfig passwordlessLoginConfig;

    /**
     * <p>请求ID</p>
     * 
     * <strong>example:</strong>
     * <p>47348885-C929-489A-93D7-B2E99D50D77B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeTerminalSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTerminalSettingsResponseBody self = new DescribeTerminalSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTerminalSettingsResponseBody setPasswordlessLoginConfig(DescribeTerminalSettingsResponseBodyPasswordlessLoginConfig passwordlessLoginConfig) {
        this.passwordlessLoginConfig = passwordlessLoginConfig;
        return this;
    }
    public DescribeTerminalSettingsResponseBodyPasswordlessLoginConfig getPasswordlessLoginConfig() {
        return this.passwordlessLoginConfig;
    }

    public DescribeTerminalSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeTerminalSettingsResponseBodyPasswordlessLoginConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        public static DescribeTerminalSettingsResponseBodyPasswordlessLoginConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeTerminalSettingsResponseBodyPasswordlessLoginConfig self = new DescribeTerminalSettingsResponseBodyPasswordlessLoginConfig();
            return TeaModel.build(map, self);
        }

        public DescribeTerminalSettingsResponseBodyPasswordlessLoginConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

}
