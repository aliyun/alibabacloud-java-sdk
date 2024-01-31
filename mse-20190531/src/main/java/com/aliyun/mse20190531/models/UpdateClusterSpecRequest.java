// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateClusterSpecRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The destination engine specifications.</p>
     */
    @NameInMap("ClusterSpecification")
    public String clusterSpecification;

    /**
     * <p>The number of destination nodes.</p>
     */
    @NameInMap("InstanceCount")
    public Integer instanceCount;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The MSE version.</p>
     */
    @NameInMap("MseVersion")
    public String mseVersion;

    @NameInMap("PubNetworkFlow")
    public Integer pubNetworkFlow;

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

    public UpdateClusterSpecRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
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

    public UpdateClusterSpecRequest setPubNetworkFlow(Integer pubNetworkFlow) {
        this.pubNetworkFlow = pubNetworkFlow;
        return this;
    }
    public Integer getPubNetworkFlow() {
        return this.pubNetworkFlow;
    }

}
