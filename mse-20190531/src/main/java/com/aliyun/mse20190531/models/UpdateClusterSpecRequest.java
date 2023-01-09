// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateClusterSpecRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The ID of the cluster.
    @NameInMap("ClusterId")
    public String clusterId;

    // The destination engine specifications.
    @NameInMap("ClusterSpecification")
    public String clusterSpecification;

    // The number of destination nodes.
    @NameInMap("InstanceCount")
    public Integer instanceCount;

    // The ID of the instance.
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
