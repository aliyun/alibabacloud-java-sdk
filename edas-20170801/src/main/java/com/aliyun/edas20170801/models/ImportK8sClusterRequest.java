// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ImportK8sClusterRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("EnableAsm")
    public Boolean enableAsm;

    @NameInMap("Mode")
    public Integer mode;

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
