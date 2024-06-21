// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ModifyGovernanceKubernetesClusterShrinkRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cd23228b3c80c4d4f9ad87cc3****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The information about the namespace for which Microservices Engine(MSE) Microservices Governance is enabled.</p>
     */
    @NameInMap("NamespaceInfos")
    public String namespaceInfosShrink;

    /**
     * <p>The ID of the region in which the instance resides. The region is supported by MSE.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyGovernanceKubernetesClusterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyGovernanceKubernetesClusterShrinkRequest self = new ModifyGovernanceKubernetesClusterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyGovernanceKubernetesClusterShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ModifyGovernanceKubernetesClusterShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyGovernanceKubernetesClusterShrinkRequest setNamespaceInfosShrink(String namespaceInfosShrink) {
        this.namespaceInfosShrink = namespaceInfosShrink;
        return this;
    }
    public String getNamespaceInfosShrink() {
        return this.namespaceInfosShrink;
    }

    public ModifyGovernanceKubernetesClusterShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
