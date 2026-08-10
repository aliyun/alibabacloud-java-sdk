// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class IPConfig extends TeaModel {
    @NameInMap("description")
    public String description;

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
