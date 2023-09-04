// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DeleteAccessAssignmentRequest extends TeaModel {
    /**
     * <p>The ID of the access configuration.</p>
     */
    @NameInMap("AccessConfigurationId")
    public String accessConfigurationId;

    /**
     * <p>Specifies whether to de-provision the access configuration when you remove the access permissions from the CloudSSO identity. The access configuration is used to assign the access permissions, and the identity is the only one that uses the access configuration and is associated with the account. Valid values:</p>
     * <br>
     * <p>*   DeprovisionForLastAccessAssignmentOnAccount: de-provisions the access configuration.</p>
     * <p>*   None: does not de-provision the access configuration. This is the default value.</p>
     */
    @NameInMap("DeprovisionStrategy")
    public String deprovisionStrategy;

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
     * <p>The type of the task object. The value is fixed as RD-Account, which indicates the accounts in the resource directory.</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    public static DeleteAccessAssignmentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessAssignmentRequest self = new DeleteAccessAssignmentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAccessAssignmentRequest setAccessConfigurationId(String accessConfigurationId) {
        this.accessConfigurationId = accessConfigurationId;
        return this;
    }
    public String getAccessConfigurationId() {
        return this.accessConfigurationId;
    }

    public DeleteAccessAssignmentRequest setDeprovisionStrategy(String deprovisionStrategy) {
        this.deprovisionStrategy = deprovisionStrategy;
        return this;
    }
    public String getDeprovisionStrategy() {
        return this.deprovisionStrategy;
    }

    public DeleteAccessAssignmentRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public DeleteAccessAssignmentRequest setPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }
    public String getPrincipalId() {
        return this.principalId;
    }

    public DeleteAccessAssignmentRequest setPrincipalType(String principalType) {
        this.principalType = principalType;
        return this;
    }
    public String getPrincipalType() {
        return this.principalType;
    }

    public DeleteAccessAssignmentRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public DeleteAccessAssignmentRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
