// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribeHubClusterKubeconfigResponseBody extends TeaModel {
    /**
     * <p>The content of the kubeconfig file.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;\napiVersion: v1\nclusters:\n- cluster:\n    server: <a href="https://172.16.11.***:6443%5C%5Cn">https://172.16.11.***:6443\\n</a>    certificate-authority-data: LS0tLS1CRU=...\n  name: kubernetes\ncontexts:\n- context:\n    cluster: kubernetes\n    user: \&quot;kubernetes-a****\&quot;\n  name: kubernetes-admin-cc2cbf5802bec4bfa9fae4014d8c****\ncurrent-context: kubernetes-admin-cc2cbf5802bec4bfa9fae4014d8c9****\nkind: Config\npreferences: {}\nusers:\n- name: \&quot;kubernetes-admin\&quot;\n  user:\n    client-certificate-data: LS0tLS1CRU...\n    client-key-data: LS0tCg==...\n&quot;</p>
     */
    @NameInMap("Kubeconfig")
    public String kubeconfig;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5BE4C329-DCC2-5B61-8F66-112B7D7FC712</p>
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
