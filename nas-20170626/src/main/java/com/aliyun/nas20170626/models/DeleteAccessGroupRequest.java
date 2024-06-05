// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteAccessGroupRequest extends TeaModel {
    /**
     * <p>The name of the permission group to be deleted.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AccessGroupName")
    public String accessGroupName;

    /**
     * <p>The type of the file system.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   standard (default): General-purpose NAS file system</p>
     * <p>*   extreme: Extreme NAS file system</p>
     */
    @NameInMap("FileSystemType")
    public String fileSystemType;

    public static DeleteAccessGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessGroupRequest self = new DeleteAccessGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAccessGroupRequest setAccessGroupName(String accessGroupName) {
        this.accessGroupName = accessGroupName;
        return this;
    }
    public String getAccessGroupName() {
        return this.accessGroupName;
    }

    public DeleteAccessGroupRequest setFileSystemType(String fileSystemType) {
        this.fileSystemType = fileSystemType;
        return this;
    }
    public String getFileSystemType() {
        return this.fileSystemType;
    }

}
