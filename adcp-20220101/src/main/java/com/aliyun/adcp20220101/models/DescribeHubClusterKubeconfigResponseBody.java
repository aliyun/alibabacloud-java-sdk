// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribeHubClusterKubeconfigResponseBody extends TeaModel {
    /**
     * <p>The content of the kubeconfig file.</p>
     */
    @NameInMap("Kubeconfig")
    public String kubeconfig;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeHubClusterKubeconfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHubClusterKubeconfigResponseBody self = new DescribeHubClusterKubeconfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHubClusterKubeconfigResponseBody setKubeconfig(String kubeconfig) {
        this.kubeconfig = kubeconfig;
        return this;
    }
    public String getKubeconfig() {
        return this.kubeconfig;
    }

    public DescribeHubClusterKubeconfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
