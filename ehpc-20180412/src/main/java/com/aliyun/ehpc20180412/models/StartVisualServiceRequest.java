// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class StartVisualServiceRequest extends TeaModel {
    /**
     * <p>A public IP address of logon nodes in the cluster.</p>
     */
    @NameInMap("CidrIp")
    public String cidrIp;

    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The fixed port. Set the value to 12016</p>
     */
    @NameInMap("Port")
    public Integer port;

    public static StartVisualServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        StartVisualServiceRequest self = new StartVisualServiceRequest();
        return TeaModel.build(map, self);
    }

    public StartVisualServiceRequest setCidrIp(String cidrIp) {
        this.cidrIp = cidrIp;
        return this;
    }
    public String getCidrIp() {
        return this.cidrIp;
    }

    public StartVisualServiceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public StartVisualServiceRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

}
