// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DeleteAccessAssignmentRequest extends TeaModel {
    @NameInMap("AccessConfigurationId")
    public String accessConfigurationId;

    @NameInMap("DeprovisionStrategy")
    public String deprovisionStrategy;

    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("PrincipalId")
    public String principalId;

    @NameInMap("PrincipalType")
    public String principalType;

    @NameInMap("TargetId")
    public String targetId;

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
