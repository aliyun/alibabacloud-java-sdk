// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DetachNasFileSystemRequest extends TeaModel {
    /**
     * <p>The time when the file system was created. The value must be a UNIX timestamp. Unit: seconds.</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The name of the RAM role that is created within the source Alibaba Cloud account and assigned to the current Alibaba Cloud account to authorize the current Alibaba Cloud account to back up and restore data across Alibaba Cloud accounts.</p>
     */
    @NameInMap("CrossAccountRoleName")
    public String crossAccountRoleName;

    /**
     * <p>Specifies whether data is backed up and restored within the same Alibaba Cloud account or across Alibaba Cloud accounts. Valid values:</p>
     * <br>
     * <p>*   SELF_ACCOUNT: Data is backed up and restored within the same Alibaba Cloud account.</p>
     * <p>*   CROSS_ACCOUNT: Data is backed up and restored across Alibaba Cloud accounts.</p>
     */
    @NameInMap("CrossAccountType")
    public String crossAccountType;

    /**
     * <p>The ID of the source Alibaba Cloud account that authorizes the current Alibaba Cloud account to back up and restore data across Alibaba Cloud accounts.</p>
     */
    @NameInMap("CrossAccountUserId")
    public Long crossAccountUserId;

    /**
     * <p>The ID of the file system.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    public static DetachNasFileSystemRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachNasFileSystemRequest self = new DetachNasFileSystemRequest();
        return TeaModel.build(map, self);
    }

    public DetachNasFileSystemRequest setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DetachNasFileSystemRequest setCrossAccountRoleName(String crossAccountRoleName) {
        this.crossAccountRoleName = crossAccountRoleName;
        return this;
    }
    public String getCrossAccountRoleName() {
        return this.crossAccountRoleName;
    }

    public DetachNasFileSystemRequest setCrossAccountType(String crossAccountType) {
        this.crossAccountType = crossAccountType;
        return this;
    }
    public String getCrossAccountType() {
        return this.crossAccountType;
    }

    public DetachNasFileSystemRequest setCrossAccountUserId(Long crossAccountUserId) {
        this.crossAccountUserId = crossAccountUserId;
        return this;
    }
    public Long getCrossAccountUserId() {
        return this.crossAccountUserId;
    }

    public DetachNasFileSystemRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

}
