// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateClusterSpecRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // 网关名称
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ClusterSpecification")
    public String clusterSpecification;

    // 节点数量
    @NameInMap("InstanceCount")
    public Integer instanceCount;

    // 节点规格
    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateClusterSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterSpecRequest self = new UpdateClusterSpecRequest();
        return TeaModel.build(map, self);
    }

    public UpdateClusterSpecRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateClusterSpecRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateClusterSpecRequest setClusterSpecification(String clusterSpecification) {
        this.clusterSpecification = clusterSpecification;
        return this;
    }
    public String getClusterSpecification() {
        return this.clusterSpecification;
    }

    public UpdateClusterSpecRequest setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    public UpdateClusterSpecRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
