// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterAttachScriptsRequest extends TeaModel {
    /**
     * <p>The CPU architecture of the node. Valid values: <code>amd64</code>, <code>arm</code>, and <code>arm64</code>.</p>
     * <p>Default value: <code>amd64</code>.</p>
     * <blockquote>
     * <p>Required when the cluster type is ACK Edge.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>amd64</p>
     */
    @NameInMap("arch")
    public String arch;

    /**
     * <p>The expiration time of the generated token. The time is in the UNIX timestamp format. For example, 1739980800 indicates 2025-02-20 00:00:00.</p>
     * 
     * <strong>example:</strong>
     * <p>1740037333</p>
     */
    @NameInMap("expired")
    public Long expired;

    /**
     * <p><strong>[Deprecated]</strong> Use <code>format_disk_option</code> instead.</p>
     * <ul>
     * <li><code>true</code>: Equivalent to setting <code>format_disk_option</code> to <code>DataDisk</code>.</li>
     * <li><code>false</code>: Equivalent to setting <code>format_disk_option</code> to <code>SystemDisk</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("format_disk")
    @Deprecated
    public Boolean formatDisk;

    /**
     * <p>The disk formatting method. This parameter is mutually exclusive with <code>format_disk</code> when <code>format_disk</code> is set to <code>true</code>. Valid values:</p>
     * <ul>
     * <li><code>SystemDisk</code>: No additional initialization is performed. Container runtime data is stored on the system cloud disk or any disk that is already mounted to the relevant directory during import.</li>
     * <li><code>DataDisk</code>: If a data cloud disk or local disk is mounted, the last disk is formatted and mounted to store container runtime data.</li>
     * <li><code>NodePoolDiskConfig</code>: Initializes data cloud disks based on the configurations of the imported node pool. Cloud disks and elastic ephemeral disks are matched based on the <code>disk_name</code> field of the node pool and the <code>DiskName</code> field of the block storage. Local disks are matched sequentially based on the PCI address order. Node pool configurations that do not match any disk are ignored.</li>
     * </ul>
     * <blockquote>
     * <p>Warning: The <code>DataDisk</code> option is retained only for historical compatibility and is strongly discouraged.
     * This option uses the last disk in lexicographical order of device names under <code>/dev</code> (NVMe is preferred). Note that nvme9 takes precedence over nvme10. Operating systems with newer kernels such as Alinux 4 cannot guarantee a stable device order.</p>
     * </blockquote>
     * <p>Disks with a recognizable file system during import skip the formatting step and are directly mounted.</p>
     * 
     * <strong>example:</strong>
     * <p>NodePoolDiskConfig</p>
     */
    @NameInMap("format_disk_option")
    public String formatDiskOption;

    /**
     * <p>Specifies whether to retain the instance name when adding an existing instance to the cluster. If you do not retain the instance name, the instance name format is <code>worker-k8s-for-cs-&lt;clusterid&gt;</code>. Valid values:</p>
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
     * <p>The ID of the node pool. Specifies the node pool to which the node is added.</p>
     * <blockquote>
     * <p>If you do not specify a node pool ID, the node is added to the default node pool by default.</p>
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
     * <p>The access configuration parameters for the node.</p>
     * <blockquote>
     * <p>Required when the cluster type is ACK Edge.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;enableIptables&quot;: true,&quot;manageRuntime&quot;: true,&quot;quiet&quot;: true,&quot;allowedClusterAddons&quot;: [&quot;kube-proxy&quot;,&quot;flannel&quot;,&quot;coredns&quot;]}</p>
     */
    @NameInMap("options")
    public String options;

    /**
     * <p>If an ApsaraDB RDS instance list is specified, the ECS instances of the cluster nodes are automatically added to the RDS access whitelist.</p>
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

    @Deprecated
    public DescribeClusterAttachScriptsRequest setFormatDisk(Boolean formatDisk) {
        this.formatDisk = formatDisk;
        return this;
    }
    public Boolean getFormatDisk() {
        return this.formatDisk;
    }

    public DescribeClusterAttachScriptsRequest setFormatDiskOption(String formatDiskOption) {
        this.formatDiskOption = formatDiskOption;
        return this;
    }
    public String getFormatDiskOption() {
        return this.formatDiskOption;
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
