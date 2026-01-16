// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeClusterUserKubeconfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>apiVersion: v1
     * clusters:</p>
     * <ul>
     * <li>cluster:
     *   certificate-authority-data: x
     *   server: <a href="https://111.111.111.111:6443">https://111.111.111.111:6443</a>
     * name: kubernetes
     * contexts:</li>
     * <li>context:
     *   cluster: kubernetes
     *   user: user
     * name: eck-xxxxx
     * current-context: eck-xxxx
     * kind: Config
     * preferences: {}
     * users:</li>
     * <li>name: user
     * user:
     *   client-certificate-data: x
     *   client-key-data: x</li>
     * </ul>
     */
    @NameInMap("Config")
    public Object config;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C0003E8B-B930-4F59-ADC0-0E209A9012A8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClusterUserKubeconfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterUserKubeconfigResponseBody self = new DescribeClusterUserKubeconfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterUserKubeconfigResponseBody setConfig(Object config) {
        this.config = config;
        return this;
    }
    public Object getConfig() {
        return this.config;
    }

    public DescribeClusterUserKubeconfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
