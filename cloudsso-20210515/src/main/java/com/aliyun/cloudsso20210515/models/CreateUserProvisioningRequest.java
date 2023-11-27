// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class CreateUserProvisioningRequest extends TeaModel {
    @NameInMap("DeletionStrategy")
    public String deletionStrategy;

    @NameInMap("Description")
    public String description;

    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("DuplicationStrategy")
    public String duplicationStrategy;

    @NameInMap("PrincipalId")
    public String principalId;

    @NameInMap("PrincipalType")
    public String principalType;

    @NameInMap("TargetId")
    public String targetId;

    @NameInMap("TargetType")
    public String targetType;

    public static CreateUserProvisioningRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserProvisioningRequest self = new CreateUserProvisioningRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserProvisioningRequest setDeletionStrategy(String deletionStrategy) {
        this.deletionStrategy = deletionStrategy;
        return this;
    }
    public String getDeletionStrategy() {
        return this.deletionStrategy;
    }

    public CreateUserProvisioningRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateUserProvisioningRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreateUserProvisioningRequest setDuplicationStrategy(String duplicationStrategy) {
        this.duplicationStrategy = duplicationStrategy;
        return this;
    }
    public String getDuplicationStrategy() {
        return this.duplicationStrategy;
    }

    public CreateUserProvisioningRequest setPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }
    public String getPrincipalId() {
        return this.principalId;
    }

    public CreateUserProvisioningRequest setPrincipalType(String principalType) {
        this.principalType = principalType;
        return this;
    }
    public String getPrincipalType() {
        return this.principalType;
    }

    public CreateUserProvisioningRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public CreateUserProvisioningRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
