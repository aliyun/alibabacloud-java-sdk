// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AttachInstanceSDGShrinkRequest extends TeaModel {
    /**
     * <p>The cloud disk access protocol type. Valid values:</p>
     * <ul>
     * <li><p>iscsi: the default protocol for standard cloud disks. Both rbd cloud disks and standard cloud disks support this protocol.</p>
     * </li>
     * <li><p>rbd: the default protocol for rbd cloud disks. Only rbd cloud disks support this mount protocol.</p>
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
     * <li>rbd: rbd cloud disk.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If no shared cloud disk type is specified, a standard cloud disk is created by default.</li>
     * <li>An rbd shared cloud disk can be created only when the parent disk type is rbd.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("DiskType")
    public String diskType;

    /**
     * <p>The list of instance IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    /**
     * <p>The file loading rate optimization parameter.</p>
     */
    @NameInMap("LoadOpt")
    public String loadOptShrink;

    /**
     * <p>The ID of the SDG.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sdg-xxxx</p>
     */
    @NameInMap("SDGId")
    public String SDGId;

    public static AttachInstanceSDGShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachInstanceSDGShrinkRequest self = new AttachInstanceSDGShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AttachInstanceSDGShrinkRequest setDiskAccessProtocol(String diskAccessProtocol) {
        this.diskAccessProtocol = diskAccessProtocol;
        return this;
    }
    public String getDiskAccessProtocol() {
        return this.diskAccessProtocol;
    }

    public AttachInstanceSDGShrinkRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public AttachInstanceSDGShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

    public AttachInstanceSDGShrinkRequest setLoadOptShrink(String loadOptShrink) {
        this.loadOptShrink = loadOptShrink;
        return this;
    }
    public String getLoadOptShrink() {
        return this.loadOptShrink;
    }

    public AttachInstanceSDGShrinkRequest setSDGId(String SDGId) {
        this.SDGId = SDGId;
        return this;
    }
    public String getSDGId() {
        return this.SDGId;
    }

}
