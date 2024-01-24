// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteAccessRuleRequest extends TeaModel {
    /**
     * <p>The name of the permission group.</p>
     */
    @NameInMap("AccessGroupName")
    public String accessGroupName;

    /**
     * <p>The rule ID.</p>
     */
    @NameInMap("AccessRuleId")
    public String accessRuleId;

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

    public static DeleteAccessRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessRuleRequest self = new DeleteAccessRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAccessRuleRequest setAccessGroupName(String accessGroupName) {
        this.accessGroupName = accessGroupName;
        return this;
    }
    public String getAccessGroupName() {
        return this.accessGroupName;
    }

    public DeleteAccessRuleRequest setAccessRuleId(String accessRuleId) {
        this.accessRuleId = accessRuleId;
        return this;
    }
    public String getAccessRuleId() {
        return this.accessRuleId;
    }

    public DeleteAccessRuleRequest setFileSystemType(String fileSystemType) {
        this.fileSystemType = fileSystemType;
        return this;
    }
    public String getFileSystemType() {
        return this.fileSystemType;
    }

}
