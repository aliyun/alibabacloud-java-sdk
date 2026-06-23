// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterAttachScriptsRequest extends TeaModel {
    /**
     * <p>The CPU architecture of the node. Supported CPU architectures include <code>amd64</code>, <code>arm</code>, and <code>arm64</code>.</p>
     * <p>Default value: <code>amd64</code>.</p>
     * <blockquote>
     * <p>This parameter is required when the cluster type is managed edge cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>amd64</p>
     */
    @NameInMap("arch")
    public String arch;

    /**
     * <p>The expiration time of the generated token. The value is a UNIX timestamp. For example, 1739980800 indicates 2025-02-20 00:00:00.</p>
     * 
     * <strong>example:</strong>
     * <p>1740037333</p>
     */
    @NameInMap("expired")
    public Long expired;

    /**
     * <p>Specifies whether to mount data disks to the instance when you manually add the existing instance to the cluster. Container and image data is stored on the data disks. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Mounts data disks to the instance. Existing data on the data disks will be lost. Back up your data before you proceed.</li>
     * <li><code>false</code>: Does not mount data disks to the instance.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * <p>Data disk mounting rules:</p>
     * <ul>
     * <li>If data disks are already mounted to the ECS instance and the file system of the last data disk is not initialized, the system automatically formats the data disk as ext4 to store /var/lib/docker and /var/lib/kubelet.</li>
     * <li>If no data disks are mounted to the ECS instance, no new data disks are mounted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("format_disk")
    public Boolean formatDisk;

    /**
     * <p>Specifies whether to retain the instance name when adding an existing instance to the cluster. If the instance name is not retained, the instance name is in the format of <code>worker-k8s-for-cs-&lt;clusterid&gt;</code>. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Retains the instance name.</li>
     * <li><code>false</code>: Does not retain the instance name. The instance name is replaced based on system rules.</li>
     * </ul>
     * <p>Default value: <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("keep_instance_name")
    public Boolean keepInstanceName;

    /**
     * <p>The node pool ID. You can add the node to a specified node pool.</p>
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
     * <p>The configuration parameters for node registration.</p>
     * <blockquote>
     * <p>This parameter is required when the cluster type is managed edge cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;enableIptables&quot;: true,&quot;manageRuntime&quot;: true,&quot;quiet&quot;: true,&quot;allowedClusterAddons&quot;: [&quot;kube-proxy&quot;,&quot;flannel&quot;,&quot;coredns&quot;]}</p>
     */
    @NameInMap("options")
    public String options;

    /**
     * <p>If you specify a list of ApsaraDB RDS instances, the ECS instances in the cluster are automatically added to the whitelists of the specified ApsaraDB RDS instances.</p>
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
