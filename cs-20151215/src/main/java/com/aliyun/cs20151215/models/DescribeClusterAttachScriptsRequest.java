// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterAttachScriptsRequest extends TeaModel {
    /**
     * <p>The CPU architecture of the node. Valid values: <code>amd64</code>, <code>arm</code>, and <code>arm64</code>.</p>
     * <p>Default value: <code>amd64</code>.</p>
     * <blockquote>
     * <p> This parameter is required if you want to add a node to an ACK Edge cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>amd64</p>
     */
    @NameInMap("arch")
    public String arch;

    /**
     * <p>The expiration time of the token that is generated. The value is a UNIX timestamp. For example, a value of 1739980800 indicates 00:00:00 (UTC+8) on February 20, 2025.</p>
     * 
     * <strong>example:</strong>
     * <p>1740037333</p>
     */
    @NameInMap("expired")
    public Long expired;

    /**
     * <p>Specifies whether to mount data disks to an existing instance when you manually add this instance to the cluster. You can use data disks to store container data and images. Valid values:</p>
     * <ul>
     * <li><code>true</code>: mounts data disks to the instance that you want to add. After a data disk is mounted, the original data on the disk is erased. Back up data before you mount a data disk.</li>
     * <li><code>false</code>: does not mount data disks to the instance.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * <p>How a data disk is mounted:</p>
     * <ul>
     * <li>If the Elastic Compute Service (ECS) instances are already mounted with data disks and the file system of the last data disk is uninitialized, the system automatically formats this data disk to ext4 and uses the disk to store the data in the /var/lib/docker and /var/lib/kubelet directories.</li>
     * <li>If no data disk is mounted to the ECS instance, the system does not purchase a new data disk.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("format_disk")
    public Boolean formatDisk;

    /**
     * <p>Specifies whether to retain the name of an existing instance when it is added to the cluster. If you do not retain the instance name, the instance is renamed in the <code>worker-k8s-for-cs-&lt;clusterid&gt;</code> format. Valid values:</p>
     * <ul>
     * <li><code>true</code>: retains the instance name.</li>
     * <li><code>false</code>: does not retain the instance name.</li>
     * </ul>
     * <p>Default value: <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("keep_instance_name")
    public Boolean keepInstanceName;

    /**
     * <p>The ID of the node pool to which you want to add an existing node.</p>
     * <blockquote>
     * <p> If you do not specify a node pool ID, the node is added to the default node pool.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>np1c9229d9be2d432c93f77a88fca0****</p>
     */
    @NameInMap("nodepool_id")
    public String nodepoolId;

    /**
     * <p>The node configurations for the node that you want to add.</p>
     * <blockquote>
     * <p> This parameter is required if you want to add a node to an ACK Edge cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;enableIptables\&quot;: true,\&quot;manageRuntime\&quot;: true,\&quot;quiet\&quot;: true,\&quot;allowedClusterAddons\&quot;: [\&quot;kube-proxy\&quot;,\&quot;flannel\&quot;,\&quot;coredns\&quot;]}</p>
     */
    @NameInMap("options")
    public String options;

    /**
     * <p>A list of ApsaraDB RDS instances. ECS instances in the cluster are automatically added to the whitelist of the ApsaraDB RDS instances.</p>
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
