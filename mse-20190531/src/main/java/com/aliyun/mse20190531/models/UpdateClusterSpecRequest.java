// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateClusterSpecRequest extends TeaModel {
    /**
     * <p>system error</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>mse-200-021</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>mse-100-001</p>
     */
    @NameInMap("ClusterSpecification")
    public String clusterSpecification;

    /**
     * <p>cluster not found</p>
     */
    @NameInMap("InstanceCount")
    public Integer instanceCount;

    /**
     * <p>clusterNotFound</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>systemError</p>
     */
    @NameInMap("MseVersion")
    public String mseVersion;

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

    public UpdateClusterSpecRequest setMseVersion(String mseVersion) {
        this.mseVersion = mseVersion;
        return this;
    }
    public String getMseVersion() {
        return this.mseVersion;
    }

}
