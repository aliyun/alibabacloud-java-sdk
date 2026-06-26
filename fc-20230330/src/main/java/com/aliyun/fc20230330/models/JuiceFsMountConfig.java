// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class JuiceFsMountConfig extends TeaModel {
    /**
     * <p>An array of strings containing additional command-line arguments for the mount command. For example, use these arguments to set cache sizes or other performance-tuning options.</p>
     */
    @NameInMap("args")
    public java.util.List<String> args;

    /**
     * <p>The path within the function\&quot;s local filesystem to mount the volume. For example, /mnt/data. This parameter is required.</p>
     */
    @NameInMap("mountDir")
    public String mountDir;

    /**
     * <p>The subdirectory within the JuiceFS volume to mount. If not specified, the root of the volume is mounted.</p>
     */
    @NameInMap("remoteDir")
    public String remoteDir;

    /**
     * <p>The authentication token to access the JuiceFS volume.</p>
     */
    @NameInMap("token")
    public String token;

    /**
     * <p>The name of the JuiceFS volume to mount. This parameter is required.</p>
     */
    @NameInMap("volumeName")
    public String volumeName;

    public static JuiceFsMountConfig build(java.util.Map<String, ?> map) throws Exception {
        JuiceFsMountConfig self = new JuiceFsMountConfig();
        return TeaModel.build(map, self);
    }

    public JuiceFsMountConfig setArgs(java.util.List<String> args) {
        this.args = args;
        return this;
    }
    public java.util.List<String> getArgs() {
        return this.args;
    }

    public JuiceFsMountConfig setMountDir(String mountDir) {
        this.mountDir = mountDir;
        return this;
    }
    public String getMountDir() {
        return this.mountDir;
    }

    public JuiceFsMountConfig setRemoteDir(String remoteDir) {
        this.remoteDir = remoteDir;
        return this;
    }
    public String getRemoteDir() {
        return this.remoteDir;
    }

    public JuiceFsMountConfig setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public JuiceFsMountConfig setVolumeName(String volumeName) {
        this.volumeName = volumeName;
        return this;
    }
    public String getVolumeName() {
        return this.volumeName;
    }

}
