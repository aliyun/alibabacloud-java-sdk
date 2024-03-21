// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyAccessPointRequest extends TeaModel {
    @NameInMap("AccessGroup")
    public String accessGroup;

    @NameInMap("AccessPointId")
    public String accessPointId;

    @NameInMap("AccessPointName")
    public String accessPointName;

    @NameInMap("EnabledRam")
    public Boolean enabledRam;

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
