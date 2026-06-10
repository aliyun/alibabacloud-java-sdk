// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterAttachScriptsRequest extends TeaModel {
    /**
     * <p>The CPU architecture of the node. Supported CPU architectures include <code>amd64</code>, <code>arm</code>, and <code>arm64</code>.</p>
     * <p>Default value: <code>amd64</code>.</p>
     * <blockquote>
     * <p>This parameter is required if the cluster is a managed edge cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>amd64</p>
     */
    @NameInMap("arch")
    public String arch;

    /**
     * <p>The Unix timestamp that indicates when the generated token expires. For example, the timestamp 1739980800 corresponds to 00:00:00 on February 20, 2025 (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>1740037333</p>
     */
    @NameInMap("expired")
    public Long expired;

    /**
     * <p>Specifies whether to mount a data disk to the instance and store containers and images on the data disk when you manually add an existing instance to the cluster. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Mounts the data disk to the instance. The original data on the data disk will be erased. Back up your data before you proceed.</p>
     * </li>
     * <li><p><code>false</code>: Does not mount the data disk to the instance.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * <p>Data disk mounting rules:</p>
     * <ul>
     * <li><p>If an ECS instance has data disks attached and the last data disk is uninitialized, the system automatically formats that disk to ext4 and uses it to store content for <code>/var/lib/docker</code> and <code>/var/lib/kubelet</code>.</p>
     * </li>
     * <li><p>If no data disk is attached to the ECS instance, the system does not mount a new data disk.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("format_disk")
    public Boolean formatDisk;

    /**
     * <p>Specifies whether to retain the instance name when the instance is added to the cluster. If you do not retain the instance name, the system renames the instance to use the <code>worker-k8s-for-cs-&lt;clusterid&gt;</code> format. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Retains the instance name.</p>
     * </li>
     * <li><p><code>false</code>: Does not retain the instance name. The system renames the instance based on a system rule.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("keep_instance_name")
    public Boolean keepInstanceName;

    /**
     * <p>The node pool ID. You can add the node to a specific node pool.</p>
     * <blockquote>
     * <p>If you do not specify a node pool ID, the node is added to the default node pool.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>np1c9229d9be2d432c93f77a88fca0****</p>
     */
    @NameInMap("nodepool_id")
    public String nodepoolId;

    @NameInMap("one_time_token")
    public Boolean oneTimeToken;

    /**
     * <p>The configuration parameters for node attachment.</p>
     * <blockquote>
     * <p>This parameter is required if the cluster is a managed edge cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;enableIptables&quot;: true,&quot;manageRuntime&quot;: true,&quot;quiet&quot;: true,&quot;allowedClusterAddons&quot;: [&quot;kube-proxy&quot;,&quot;flannel&quot;,&quot;coredns&quot;]}</p>
     */
    @NameInMap("options")
    public String options;

    /**
     * <p>If you specify a list of RDS instances, the system automatically adds the ECS instances of the cluster nodes to the access whitelists of the specified RDS instances.</p>
     */
    @NameInMap("rds_instances")
    public java.util.List<String> rdsInstances;

    public static DescribeClusterAttachScriptsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterAttachScriptsRequest self = new DescribeClusterAttachScriptsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterAttachScriptsRequest setArch(String arch) {
        this.arch = arch;
        return this;
    }
    public String getArch() {
        return this.arch;
    }

    public DescribeClusterAttachScriptsRequest setExpired(Long expired) {
        this.expired = expired;
        return this;
    }
    public Long getExpired() {
        return this.expired;
    }

    public DescribeClusterAttachScriptsRequest setFormatDisk(Boolean formatDisk) {
        this.formatDisk = formatDisk;
        return this;
    }
    public Boolean getFormatDisk() {
        return this.formatDisk;
    }

    public DescribeClusterAttachScriptsRequest setKeepInstanceName(Boolean keepInstanceName) {
        this.keepInstanceName = keepInstanceName;
        return this;
    }
    public Boolean getKeepInstanceName() {
        return this.keepInstanceName;
    }

    public DescribeClusterAttachScriptsRequest setNodepoolId(String nodepoolId) {
        this.nodepoolId = nodepoolId;
        return this;
    }
    public String getNodepoolId() {
        return this.nodepoolId;
    }

    public DescribeClusterAttachScriptsRequest setOneTimeToken(Boolean oneTimeToken) {
        this.oneTimeToken = oneTimeToken;
        return this;
    }
    public Boolean getOneTimeToken() {
        return this.oneTimeToken;
    }

    public DescribeClusterAttachScriptsRequest setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public DescribeClusterAttachScriptsRequest setRdsInstances(java.util.List<String> rdsInstances) {
        this.rdsInstances = rdsInstances;
        return this;
    }
    public java.util.List<String> getRdsInstances() {
        return this.rdsInstances;
    }

}
