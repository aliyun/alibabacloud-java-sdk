// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyClusterNodePoolShrinkRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>Only ECK cluster IDs with the eck- prefix are supported. You can obtain the ID by calling the DescribeClustersV1 operation. Serverless cluster IDs returned by the DescribeCluster operation are not supported. The cluster must be in the running state. After creation, it usually takes 10 to 20 minutes to complete initialization.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eck-xxxxxxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The Kubernetes configuration.</p>
     */
    @NameInMap("KubernetesConfig")
    public String kubernetesConfigShrink;

    /**
     * <p>The node pool information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodepoolInfo")
    public String nodepoolInfoShrink;

    /**
     * <p>The scaling group configuration.</p>
     */
    @NameInMap("ScalingGroup")
    public String scalingGroupShrink;

    public static ModifyClusterNodePoolShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterNodePoolShrinkRequest self = new ModifyClusterNodePoolShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClusterNodePoolShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyClusterNodePoolShrinkRequest setKubernetesConfigShrink(String kubernetesConfigShrink) {
        this.kubernetesConfigShrink = kubernetesConfigShrink;
        return this;
    }
    public String getKubernetesConfigShrink() {
        return this.kubernetesConfigShrink;
    }

    public ModifyClusterNodePoolShrinkRequest setNodepoolInfoShrink(String nodepoolInfoShrink) {
        this.nodepoolInfoShrink = nodepoolInfoShrink;
        return this;
    }
    public String getNodepoolInfoShrink() {
        return this.nodepoolInfoShrink;
    }

    public ModifyClusterNodePoolShrinkRequest setScalingGroupShrink(String scalingGroupShrink) {
        this.scalingGroupShrink = scalingGroupShrink;
        return this;
    }
    public String getScalingGroupShrink() {
        return this.scalingGroupShrink;
    }

}
