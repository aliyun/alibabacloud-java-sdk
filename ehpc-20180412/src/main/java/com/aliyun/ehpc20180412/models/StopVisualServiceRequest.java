// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class StopVisualServiceRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("CidrIp")
    public String cidrIp;

    @NameInMap("Port")
    public Integer port;

    public static StopVisualServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        StopVisualServiceRequest self = new StopVisualServiceRequest();
        return TeaModel.build(map, self);
    }

    public StopVisualServiceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public StopVisualServiceRequest setCidrIp(String cidrIp) {
        this.cidrIp = cidrIp;
        return this;
    }
    public String getCidrIp() {
        return this.cidrIp;
    }

    public StopVisualServiceRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

}
