// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyAccessPointRequest extends TeaModel {
    /**
     * <p>The name of the permission group.</p>
     * <p>This parameter is required when the target file system is a General-purpose NAS file system.</p>
     * <p>Default permission group: DEFAULT_VPC_GROUP_NAME (the default permission group for VPCs).</p>
     * <blockquote>
     * <p>Not supported by Agentic file systems.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>DEFAULT_VPC_GROUP_NAME</p>
     */
    @NameInMap("AccessGroup")
    public String accessGroup;

    /**
     * <p>The access point ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-ie15yd****</p>
     */
    @NameInMap("AccessPointId")
    public String accessPointId;

    /**
     * <p>The access point name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("AccessPointName")
    public String accessPointName;

    /**
     * <p>Specifies whether to enable the RAM policy. Valid values:</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false: Disabled. This is the default value.</li>
     * </ul>
     * <blockquote>
     * <p>After you enable the RAM policy for the access point, all Resource Access Management (RAM) users are denied from using the access point to mount and access data by default. You must grant authorization to the accounts to enable the corresponding access permissions, and mount the file system through the access point. If this feature is disabled, the access point allows anonymous mounting.</p>
     * </blockquote>
     * <blockquote>
     * <p>Not supported by Agentic file systems.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnabledRam")
    public Boolean enabledRam;

    /**
     * <p>The file system ID.</p>
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
