// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateClusterSpecRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p>zh: Chinese</p>
     * </li>
     * <li><p>en: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>Specifies whether to automatically pay after placing an order. If this value is false, this interface will return a payment URL for the order, which you can manually confirm to pay</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-09k1q11****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The destination engine specifications.</p>
     * 
     * <strong>example:</strong>
     * <p>MSE_SC_2_4_200_c</p>
     */
    @NameInMap("ClusterSpecification")
    public String clusterSpecification;

    /**
     * <p>The number of destination nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("InstanceCount")
    public Integer instanceCount;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-cn-st21ri2****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The MSE version.</p>
     * 
     * <strong>example:</strong>
     * <p>mse_pro</p>
     */
    @NameInMap("MseVersion")
    public String mseVersion;

    /**
     * <p>Internet bandwidth</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
