// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class CreateAccessAssignmentRequest extends TeaModel {
    /**
     * <p>The ID of the access configuration.</p>
     */
    @NameInMap("AccessConfigurationId")
    public String accessConfigurationId;

    /**
     * <p>The ID of the directory.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The ID of the CloudSSO identity.</p>
     * <br>
     * <p>*   If you set `PrincipalType` to `User`, set `PrincipalId` to the ID of the CloudSSO user.</p>
     * <p>*   If you set `PrincipalType` to `Group`, set `PrincipalId` to the ID of the CloudSSO group.</p>
     */
    @NameInMap("PrincipalId")
    public String principalId;

    /**
     * <p>The type of the CloudSSO identity. Valid values:</p>
     * <br>
     * <p>*   User</p>
     * <p>*   Group</p>
     */
    @NameInMap("PrincipalType")
    public String principalType;

    /**
     * <p>The ID of the task object.</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    /**
     * <p>The type of the task object. Set the value to RD-Account, which indicates an account in your resource directory.</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    public static CreateAccessAssignmentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessAssignmentRequest self = new CreateAccessAssignmentRequest();
        return TeaModel.build(map, self);
    }

    public CreateAccessAssignmentRequest setAccessConfigurationId(String accessConfigurationId) {
        this.accessConfigurationId = accessConfigurationId;
        return this;
    }
    public String getAccessConfigurationId() {
        return this.accessConfigurationId;
    }

    public CreateAccessAssignmentRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreateAccessAssignmentRequest setPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }
    public String getPrincipalId() {
        return this.principalId;
    }

    public CreateAccessAssignmentRequest setPrincipalType(String principalType) {
        this.principalType = principalType;
        return this;
    }
    public String getPrincipalType() {
        return this.principalType;
    }

    public CreateAccessAssignmentRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public CreateAccessAssignmentRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
