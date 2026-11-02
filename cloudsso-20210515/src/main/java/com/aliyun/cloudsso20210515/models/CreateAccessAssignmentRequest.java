// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class CreateAccessAssignmentRequest extends TeaModel {
    /**
     * <p>The access configuration ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ac-00jhtfl8thteu6uj****</p>
     */
    @NameInMap("AccessConfigurationId")
    public String accessConfigurationId;

    /**
     * <p>The directory ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d-00fc2p61****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The Alibaba Cloud account ID of the authorization target.</p>
     * 
     * <strong>example:</strong>
     * <p>114240524784****</p>
     */
    @NameInMap("OriginTargetId")
    public String originTargetId;

    /**
     * <p>The CloudSSO identity ID. Details:</p>
     * <ul>
     * <li>If PrincipalType is set to User, PrincipalId is the CloudSSO user ID.</li>
     * <li>If PrincipalType is set to Group, PrincipalId is the CloudSSO group ID.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>u-00q8wbq42wiltcrk****</p>
     */
    @NameInMap("PrincipalId")
    public String principalId;

    /**
     * <p>The CloudSSO identity type. Valid values:</p>
     * <ul>
     * <li>User: user</li>
     * <li>Group: group</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>User</p>
     */
    @NameInMap("PrincipalType")
    public String principalType;

    /**
     * <p>The ID of the deployment target.</p>
     * 
     * <strong>example:</strong>
     * <p>114240524784****</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    /**
     * <p>The target type of the task. Valid value: RD-Account, which indicates that the task target is an account in a resource directory.</p>
     * 
     * <strong>example:</strong>
     * <p>RD-Account</p>
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

    public CreateAccessAssignmentRequest setOriginTargetId(String originTargetId) {
        this.originTargetId = originTargetId;
        return this;
    }
    public String getOriginTargetId() {
        return this.originTargetId;
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
