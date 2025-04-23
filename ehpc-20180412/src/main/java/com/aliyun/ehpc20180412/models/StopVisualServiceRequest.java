// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class StopVisualServiceRequest extends TeaModel {
    /**
     * <p>The CIDR block or IP address that is allowed to access the VNC service. This parameter is used to assign a security group to the E-HPC cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><code>100.168.**.**</code></p>
     */
    @NameInMap("CidrIp")
    public String cidrIp;

    /**
     * <p>The cluster ID.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-jeJki6****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The fixed port. Set the value to 12016.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12016</p>
     */
    @NameInMap("Port")
    public Integer port;

    public static StopVisualServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        StopVisualServiceRequest self = new StopVisualServiceRequest();
        return TeaModel.build(map, self);
    }

    public StopVisualServiceRequest setCidrIp(String cidrIp) {
        this.cidrIp = cidrIp;
        return this;
    }
    public String getCidrIp() {
        return this.cidrIp;
    }

    public StopVisualServiceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public StopVisualServiceRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

}
