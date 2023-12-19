// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class AttachNasFileSystemRequest extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CrossAccountRoleName")
    public String crossAccountRoleName;

    @NameInMap("CrossAccountType")
    public String crossAccountType;

    @NameInMap("CrossAccountUserId")
    public Long crossAccountUserId;

    @NameInMap("FileSystemId")
    public String fileSystemId;

    public static AttachNasFileSystemRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachNasFileSystemRequest self = new AttachNasFileSystemRequest();
        return TeaModel.build(map, self);
    }

    public AttachNasFileSystemRequest setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public AttachNasFileSystemRequest setCrossAccountRoleName(String crossAccountRoleName) {
        this.crossAccountRoleName = crossAccountRoleName;
        return this;
    }
    public String getCrossAccountRoleName() {
        return this.crossAccountRoleName;
    }

    public AttachNasFileSystemRequest setCrossAccountType(String crossAccountType) {
        this.crossAccountType = crossAccountType;
        return this;
    }
    public String getCrossAccountType() {
        return this.crossAccountType;
    }

    public AttachNasFileSystemRequest setCrossAccountUserId(Long crossAccountUserId) {
        this.crossAccountUserId = crossAccountUserId;
        return this;
    }
    public Long getCrossAccountUserId() {
        return this.crossAccountUserId;
    }

    public AttachNasFileSystemRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

}
