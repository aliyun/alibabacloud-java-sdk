// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ProtocolConfiguration extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("type")
    public String type;

    public static ProtocolConfiguration build(java.util.Map<String, ?> map) throws Exception {
        ProtocolConfiguration self = new ProtocolConfiguration();
        return TeaModel.build(map, self);
    }

    public ProtocolConfiguration setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
