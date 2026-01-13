// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ProtocolConfiguration extends TeaModel {
    /**
     * <p>详细的协议配置信息</p>
     */
    @NameInMap("protocolSettings")
    public java.util.List<ProtocolSettings> protocolSettings;

    /**
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("type")
    @Deprecated
    public String type;

    public static ProtocolConfiguration build(java.util.Map<String, ?> map) throws Exception {
        ProtocolConfiguration self = new ProtocolConfiguration();
        return TeaModel.build(map, self);
    }

    public ProtocolConfiguration setProtocolSettings(java.util.List<ProtocolSettings> protocolSettings) {
        this.protocolSettings = protocolSettings;
        return this;
    }
    public java.util.List<ProtocolSettings> getProtocolSettings() {
        return this.protocolSettings;
    }

    @Deprecated
    public ProtocolConfiguration setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
