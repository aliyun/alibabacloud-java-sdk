// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateClusterNodePoolShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eck-xxxxxxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("KubernetesConfig")
    public String kubernetesConfigShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodepoolInfo")
    public String nodepoolInfoShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ScalingGroup")
    public String scalingGroupShrink;

    public static CreateClusterNodePoolShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterNodePoolShrinkRequest self = new CreateClusterNodePoolShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterNodePoolShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateClusterNodePoolShrinkRequest setKubernetesConfigShrink(String kubernetesConfigShrink) {
        this.kubernetesConfigShrink = kubernetesConfigShrink;
        return this;
    }
    public String getKubernetesConfigShrink() {
        return this.kubernetesConfigShrink;
    }

    public CreateClusterNodePoolShrinkRequest setNodepoolInfoShrink(String nodepoolInfoShrink) {
        this.nodepoolInfoShrink = nodepoolInfoShrink;
        return this;
    }
    public String getNodepoolInfoShrink() {
        return this.nodepoolInfoShrink;
    }

    public CreateClusterNodePoolShrinkRequest setScalingGroupShrink(String scalingGroupShrink) {
        this.scalingGroupShrink = scalingGroupShrink;
        return this;
    }
    public String getScalingGroupShrink() {
        return this.scalingGroupShrink;
    }

}
