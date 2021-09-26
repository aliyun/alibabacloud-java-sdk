// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DeleteSecurityWhiteListRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("PortRange")
    public String portRange;

    @NameInMap("WhiteIp")
    public String whiteIp;

    public static DeleteSecurityWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityWhiteListRequest self = new DeleteSecurityWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityWhiteListRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteSecurityWhiteListRequest setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }
    public String getPortRange() {
        return this.portRange;
    }

    public DeleteSecurityWhiteListRequest setWhiteIp(String whiteIp) {
        this.whiteIp = whiteIp;
        return this;
    }
    public String getWhiteIp() {
        return this.whiteIp;
    }

}
