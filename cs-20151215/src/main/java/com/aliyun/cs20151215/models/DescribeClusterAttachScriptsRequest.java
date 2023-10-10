// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterAttachScriptsRequest extends TeaModel {
    /**
     * <p>The CPU architecture of the node. Valid values: `amd64`, `arm`, and `arm64`.</p>
     * <br>
     * <p>Default value: `amd64`.</p>
     * <br>
     * <p>>  This parameter is required if you want to add the existing node to a Container Service for Kubernetes (ACK) Edge cluster.</p>
     */
    @NameInMap("arch")
    public String arch;

    /**
     * <p>Specifies whether to mount data disks to an existing instance when you add the instance to the cluster. You can add data disks to store container data and images. Valid values:</p>
     * <br>
     * <p>*   `true`: mounts data disks to the existing instance that you want to add. After a data disk is mounted, the original data on the disk is erased. Back up data before you mount a data disk.</p>
     * <p>*   `false`: does not mount data disks to the existing instance.</p>
     * <br>
     * <p>Default value: `false`.</p>
     * <br>
     * <p>How a data disk is mounted:</p>
     * <br>
     * <p>*   If the Elastic Compute Service (ECS) instances are already mounted with data disks and the file system of the last data disk is not initialized, the system automatically formats this data disk to ext4 and mounts it to /var/lib/docker and /var/lib/kubelet.</p>
     * <p>*   If no data disk is mounted to the ECS instance, the system does not purchase a new data disk.</p>
     */
    @NameInMap("format_disk")
    public Boolean formatDisk;

    /**
     * <p>Specifies whether to retain the name of the existing instance when it is added to the cluster. If you do not retain the instance name, the instance is named in the `worker-k8s-for-cs-<clusterid>` format. Valid values:</p>
     * <br>
     * <p>*   `true`: retains the instance name.</p>
     * <p>*   `false`: does not retain the instance name.</p>
     * <br>
     * <p>Default value: `true`</p>
     */
    @NameInMap("keep_instance_name")
    public Boolean keepInstanceName;

    /**
     * <p>The ID of the node pool to which you want to add an existing node. This parameter allows you to add an existing node to a specified node pool.</p>
     * <br>
     * <p>>  If you do not specify a node pool ID, the node is added to the default node pool.</p>
     */
    @NameInMap("nodepool_id")
    public String nodepoolId;

    /**
     * <p>The node configurations for the existing instance that you want to add as a node.</p>
     * <br>
     * <p>>  This parameter is required if you want to add the existing node to an ACK Edge cluster.</p>
     */
    @NameInMap("options")
    public String options;

    /**
     * <p>After you specify the list of RDS instances, the ECS instances in the cluster are automatically added to the whitelist of the RDS instances.</p>
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
