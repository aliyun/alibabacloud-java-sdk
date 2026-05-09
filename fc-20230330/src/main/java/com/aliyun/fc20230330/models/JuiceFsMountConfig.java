// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class JuiceFsMountConfig extends TeaModel {
    @NameInMap("args")
    public java.util.List<String> args;

    @NameInMap("mountDir")
    public String mountDir;

    @NameInMap("remoteDir")
    public String remoteDir;

    @NameInMap("token")
    public String token;

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
