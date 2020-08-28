// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateAccessRuleRequest extends TeaModel {
    @NameInMap("AccessGroupName")
    @Validation(required = true)
    public String accessGroupName;

    @NameInMap("SourceCidrIp")
    @Validation(required = true)
    public String sourceCidrIp;

    @NameInMap("RWAccessType")
    public String RWAccessType;

    @NameInMap("UserAccessType")
    public String userAccessType;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("FileSystemType")
    public String fileSystemType;

    public static CreateAccessRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessRuleRequest self = new CreateAccessRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateAccessRuleRequest setAccessGroupName(String accessGroupName) {
        this.accessGroupName = accessGroupName;
        return this;
    }
    public String getAccessGroupName() {
        return this.accessGroupName;
    }

    public CreateAccessRuleRequest setSourceCidrIp(String sourceCidrIp) {
        this.sourceCidrIp = sourceCidrIp;
        return this;
    }
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

    public CreateAccessRuleRequest setRWAccessType(String RWAccessType) {
        this.RWAccessType = RWAccessType;
        return this;
    }
    public String getRWAccessType() {
        return this.RWAccessType;
    }

    public CreateAccessRuleRequest setUserAccessType(String userAccessType) {
        this.userAccessType = userAccessType;
        return this;
    }
    public String getUserAccessType() {
        return this.userAccessType;
    }

    public CreateAccessRuleRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateAccessRuleRequest setFileSystemType(String fileSystemType) {
        this.fileSystemType = fileSystemType;
        return this;
    }
    public String getFileSystemType() {
        return this.fileSystemType;
    }

}
