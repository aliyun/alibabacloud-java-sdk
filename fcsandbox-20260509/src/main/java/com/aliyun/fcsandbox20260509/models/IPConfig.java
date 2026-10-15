// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class IPConfig extends TeaModel {
    /**
     * <p>The description of the IP configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>应用固定出口</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The IP address or CIDR block.</p>
     * 
     * <strong>example:</strong>
     * <p>203.0.113.10</p>
     */
    @NameInMap("ipAddress")
    public String ipAddress;

    public static IPConfig build(java.util.Map<String, ?> map) throws Exception {
        IPConfig self = new IPConfig();
        return TeaModel.build(map, self);
    }

    public IPConfig setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public IPConfig setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

}
