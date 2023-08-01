// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ImportK8sClusterRequest extends TeaModel {
    /**
     * <p>The ID of the ACK cluster or serverless Kubernetes cluster. You can obtain the cluster ID by calling the GetK8sCluster operation. For more information, see [GetK8sCluster](~~181437~~).</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Specifies whether to enable the integration with Alibaba Cloud Service Mesh (ASM). Valid values:</p>
     * <br>
     * <p>*   true: Enables the integration with ASM.</p>
     * <p>*   false: Disables the integration with ASM.</p>
     */
    @NameInMap("EnableAsm")
    public Boolean enableAsm;

    /**
     * <p>You can ignore this parameter.</p>
     */
    @NameInMap("Mode")
    public Integer mode;

    /**
     * <p>The ID of the namespace. It is in the format of `Region ID:Identifier of the microservices namespace`. Example: `cn-hangzhou:doc`.</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    public static ImportK8sClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportK8sClusterRequest self = new ImportK8sClusterRequest();
        return TeaModel.build(map, self);
    }

    public ImportK8sClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ImportK8sClusterRequest setEnableAsm(Boolean enableAsm) {
        this.enableAsm = enableAsm;
        return this;
    }
    public Boolean getEnableAsm() {
        return this.enableAsm;
    }

    public ImportK8sClusterRequest setMode(Integer mode) {
        this.mode = mode;
        return this;
    }
    public Integer getMode() {
        return this.mode;
    }

    public ImportK8sClusterRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

}
