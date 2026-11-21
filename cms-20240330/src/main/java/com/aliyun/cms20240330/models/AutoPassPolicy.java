// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AutoPassPolicy extends TeaModel {
    /**
     * <p>The selected command prefix. The array must contain exactly one prefix. You must specify either this parameter or fullCommand.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;starops sls&quot;]</p>
     */
    @NameInMap("commandPrefix")
    public java.util.List<String> commandPrefix;

    /**
     * <p>The full command for exact matching. The command must not be empty. You must specify either this parameter or commandPrefix.</p>
     * 
     * <strong>example:</strong>
     * <p>starops tool list</p>
     */
    @NameInMap("fullCommand")
    public String fullCommand;

    /**
     * <p>The version required for a valid rule. The current version is v1.0.0.</p>
     * 
     * <strong>example:</strong>
     * <p>v1.0.0</p>
     */
    @NameInMap("version")
    public String version;

    public static AutoPassPolicy build(java.util.Map<String, ?> map) throws Exception {
        AutoPassPolicy self = new AutoPassPolicy();
        return TeaModel.build(map, self);
    }

    public AutoPassPolicy setCommandPrefix(java.util.List<String> commandPrefix) {
        this.commandPrefix = commandPrefix;
        return this;
    }
    public java.util.List<String> getCommandPrefix() {
        return this.commandPrefix;
    }

    public AutoPassPolicy setFullCommand(String fullCommand) {
        this.fullCommand = fullCommand;
        return this;
    }
    public String getFullCommand() {
        return this.fullCommand;
    }

    public AutoPassPolicy setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
