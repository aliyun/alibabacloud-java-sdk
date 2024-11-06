// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeClusterKubeConfigResponseBody extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c8f0377146d104687ac562eef9403****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The cluster certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>apiVersion: v1
     * clusters:</p>
     * <ul>
     * <li>cluster:
     *   certificate-authority-data:***
     *   server: https://****:6443
     * name: kubernetes
     * contexts:</li>
     * <li>context:
     *   cluster: kubernetes
     *   user: &quot;2580306074811*****&quot;
     * name: 258*******
     * kind: Config
     * users:</li>
     * <li>name: &quot;2580306074811*****&quot;
     * user:
     *   client-certificate-data:***
     *   client-key-data: ***</li>
     * </ul>
     */
    @NameInMap("Kubeconfig")
    public String kubeconfig;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClusterKubeConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterKubeConfigResponseBody self = new DescribeClusterKubeConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterKubeConfigResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeClusterKubeConfigResponseBody setKubeconfig(String kubeconfig) {
        this.kubeconfig = kubeconfig;
        return this;
    }
    public String getKubeconfig() {
        return this.kubeconfig;
    }

    public DescribeClusterKubeConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
