// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeployInstanceSDGShrinkRequest extends TeaModel {
    /**
     * <p>The SDG deployment type. Set the value to shared, which indicates read/write splitting shared deployment. In this mode, the SDG content is read-only, and data updates are written to the local storage of the instance.</p>
     * <p>This parameter is required. Currently, only the value shared is supported. If this parameter is not specified, the service returns a Parameter.Invalid error.</p>
     * 
     * <strong>example:</strong>
     * <p>shared</p>
     */
    @NameInMap("DeploymentType")
    public String deploymentType;

    /**
     * <p>The access protocol type of the cloud disk. Valid values:</p>
     * <ul>
     * <li><p>iscsi: the default protocol for standard cloud disks. Both RBD cloud disks and standard cloud disks support this protocol.</p>
     * </li>
     * <li><p>rbd: the default protocol for RBD cloud disks. Only RBD cloud disks support this mount protocol.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>iscsi</p>
     */
    @NameInMap("DiskAccessProtocol")
    public String diskAccessProtocol;

    /**
     * <p>The type of the shared cloud disk to be created. Valid values:</p>
     * <ul>
     * <li>standard: standard cloud disk.</li>
     * <li>rbd: RBD cloud disk.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If this parameter is not specified, a standard cloud disk is created by default.</li>
     * <li>An RBD shared cloud disk can be created only when the source disk type is RBD.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("DiskType")
    public String diskType;

    /**
     * <p>The list of instance IDs. The value is a JSON array. A maximum of 100 IDs can be specified.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    /**
     * <p>The ID of the SDG.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sdg-xxxx</p>
     */
    @NameInMap("SDGId")
    public String SDGId;

    public static DeployInstanceSDGShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployInstanceSDGShrinkRequest self = new DeployInstanceSDGShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeployInstanceSDGShrinkRequest setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
        return this;
    }
    public String getDeploymentType() {
        return this.deploymentType;
    }

    public DeployInstanceSDGShrinkRequest setDiskAccessProtocol(String diskAccessProtocol) {
        this.diskAccessProtocol = diskAccessProtocol;
        return this;
    }
    public String getDiskAccessProtocol() {
        return this.diskAccessProtocol;
    }

    public DeployInstanceSDGShrinkRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public DeployInstanceSDGShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

    public DeployInstanceSDGShrinkRequest setSDGId(String SDGId) {
        this.SDGId = SDGId;
        return this;
    }
    public String getSDGId() {
        return this.SDGId;
    }

}
