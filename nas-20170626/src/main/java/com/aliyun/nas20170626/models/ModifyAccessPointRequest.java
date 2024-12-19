// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyAccessPointRequest extends TeaModel {
    /**
     * <p>The name of the permission group.</p>
     * <p>This parameter is required for a General-purpose File Storage NAS (NAS) file system.</p>
     * <p>The default permission group for virtual private clouds (VPCs) is named DEFAULT_VPC_GROUP_NAME.</p>
     * 
     * <strong>example:</strong>
     * <p>DEFAULT_VPC_GROUP_NAME</p>
     */
    @NameInMap("AccessGroup")
    public String accessGroup;

    /**
     * <p>The ID of the access point.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-ie15yd****</p>
     */
    @NameInMap("AccessPointId")
    public String accessPointId;

    /**
     * <p>The name of the access point.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("AccessPointName")
    public String accessPointName;

    /**
     * <p>Specifies whether to enable the Resource Access Management (RAM) policy. Valid values:</p>
     * <ul>
     * <li>true: The RAM policy is enabled.</li>
     * <li>false (default): The RAM policy is disabled.</li>
     * </ul>
     * <blockquote>
     * <p> After the RAM policy is enabled for access points, no RAM user is allowed to use access points to mount and access data by default. To use access points to mount and access data as a RAM user, you must grant the related access permissions to the RAM user. If the RAM policy is disabled, access points can be anonymously mounted.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnabledRam")
    public Boolean enabledRam;

    /**
     * <p>The ID of the file system.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1ca404****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    public static ModifyAccessPointRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccessPointRequest self = new ModifyAccessPointRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAccessPointRequest setAccessGroup(String accessGroup) {
        this.accessGroup = accessGroup;
        return this;
    }
    public String getAccessGroup() {
        return this.accessGroup;
    }

    public ModifyAccessPointRequest setAccessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
        return this;
    }
    public String getAccessPointId() {
        return this.accessPointId;
    }

    public ModifyAccessPointRequest setAccessPointName(String accessPointName) {
        this.accessPointName = accessPointName;
        return this;
    }
    public String getAccessPointName() {
        return this.accessPointName;
    }

    public ModifyAccessPointRequest setEnabledRam(Boolean enabledRam) {
        this.enabledRam = enabledRam;
        return this;
    }
    public Boolean getEnabledRam() {
        return this.enabledRam;
    }

    public ModifyAccessPointRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

}
