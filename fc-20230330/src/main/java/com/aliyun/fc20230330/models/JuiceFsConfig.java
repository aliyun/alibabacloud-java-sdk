// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class JuiceFsConfig extends TeaModel {
    @NameInMap("envs")
    public java.util.Map<String, String> envs;

    @NameInMap("mountPoints")
    public java.util.List<JuiceFsMountConfig> mountPoints;

    public static JuiceFsConfig build(java.util.Map<String, ?> map) throws Exception {
        JuiceFsConfig self = new JuiceFsConfig();
        return TeaModel.build(map, self);
    }

    public JuiceFsConfig setEnvs(java.util.Map<String, String> envs) {
        this.envs = envs;
        return this;
    }
    public java.util.Map<String, String> getEnvs() {
        return this.envs;
    }

    public JuiceFsConfig setMountPoints(java.util.List<JuiceFsMountConfig> mountPoints) {
        this.mountPoints = mountPoints;
        return this;
    }
    public java.util.List<JuiceFsMountConfig> getMountPoints() {
        return this.mountPoints;
    }

}
