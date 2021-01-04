// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteAccessRuleRequest extends TeaModel {
    @NameInMap("AccessGroupName")
    public String accessGroupName;

    @NameInMap("AccessRuleId")
    public String accessRuleId;

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
