// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class MicroSandboxConfig extends TeaModel {
    @NameInMap("osType")
    public String osType;

    @NameInMap("readyCommand")
    public String readyCommand;

    @NameInMap("startCommand")
    public String startCommand;

    public static MicroSandboxConfig build(java.util.Map<String, ?> map) throws Exception {
        MicroSandboxConfig self = new MicroSandboxConfig();
        return TeaModel.build(map, self);
    }

    public MicroSandboxConfig setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public MicroSandboxConfig setReadyCommand(String readyCommand) {
        this.readyCommand = readyCommand;
        return this;
    }
    public String getReadyCommand() {
        return this.readyCommand;
    }

    public MicroSandboxConfig setStartCommand(String startCommand) {
        this.startCommand = startCommand;
        return this;
    }
    public String getStartCommand() {
        return this.startCommand;
    }

}
