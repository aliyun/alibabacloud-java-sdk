// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class AttachInstancesToNodePoolRequest extends TeaModel {
    /**
     * <p><strong>[Deprecated]</strong> Use <code>format_disk_option</code> instead. Valid values:</p>
     * <ul>
     * <li><code>true</code>: equivalent to setting <code>format_disk_option</code> to <code>DataDisk</code>.</li>
     * <li><code>false</code>: equivalent to setting <code>format_disk_option</code> to <code>SystemDisk</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("format_disk")
    @Deprecated
    public Boolean formatDisk;

    /**
     * <p>The disk formatting method. This parameter is mutually exclusive with <code>format_disk</code> set to <code>true</code>. Valid values:</p>
     * <ul>
     * <li><code>SystemDisk</code>: No additional initialization is performed. Container runtime data is stored on the system cloud disk or any disk that is already mounted to the relevant directory during import.</li>
     * <li><code>DataDisk</code>: If a data cloud disk or local disk is mounted, the last disk is formatted and mounted to store container runtime data.</li>
     * <li><code>NodePoolDiskConfig</code>: Initializes data cloud disks based on the configuration of the imported node pool. Cloud disks and elastic ephemeral disks are matched based on the <code>disk_name</code> field of the node pool and the <code>DiskName</code> field of the block storage. Local disks are matched sequentially based on the PCI address order. Node pool configurations that do not match any disk are ignored.</li>
     * </ul>
     * <blockquote>
     * <p>Warning: The <code>DataDisk</code> option is retained only for historical compatibility and is strongly discouraged.
     * This option uses the last disk in lexicographical order of device names under <code>/dev</code> (NVMe is preferred). Note that nvme9 takes precedence over nvme10. Operating systems with newer kernels such as Alinux 4 cannot guarantee a stable device order.</p>
     * </blockquote>
     * <p>Disks with recognizable file systems during import skip the formatting step and are mounted directly.</p>
     * 
     * <strong>example:</strong>
     * <p>NodePoolDiskConfig</p>
     */
    @NameInMap("format_disk_option")
    public String formatDiskOption;

    /**
     * <p>The list of ECS instances to be added.</p>
     */
    @NameInMap("instances")
    public java.util.List<String> instances;

    /**
     * <p>Specifies whether to retain the original instance name. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Retains the instance name.</p>
     * </li>
     * <li><p><code>false</code>: Does not retain the instance name.</p>
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
     * <p>The SSH logon password for the instances to be added.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("password")
    public String password;

    public static AttachInstancesToNodePoolRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachInstancesToNodePoolRequest self = new AttachInstancesToNodePoolRequest();
        return TeaModel.build(map, self);
    }

    @Deprecated
    public AttachInstancesToNodePoolRequest setFormatDisk(Boolean formatDisk) {
        this.formatDisk = formatDisk;
        return this;
    }
    public Boolean getFormatDisk() {
        return this.formatDisk;
    }

    public AttachInstancesToNodePoolRequest setFormatDiskOption(String formatDiskOption) {
        this.formatDiskOption = formatDiskOption;
        return this;
    }
    public String getFormatDiskOption() {
        return this.formatDiskOption;
    }

    public AttachInstancesToNodePoolRequest setInstances(java.util.List<String> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<String> getInstances() {
        return this.instances;
    }

    public AttachInstancesToNodePoolRequest setKeepInstanceName(Boolean keepInstanceName) {
        this.keepInstanceName = keepInstanceName;
        return this;
    }
    public Boolean getKeepInstanceName() {
        return this.keepInstanceName;
    }

    public AttachInstancesToNodePoolRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
