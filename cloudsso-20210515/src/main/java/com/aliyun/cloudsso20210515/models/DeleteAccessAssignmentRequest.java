// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DeleteAccessAssignmentRequest extends TeaModel {
    /**
     * <p>The access configuration ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ac-00jhtfl8thteu6uj****</p>
     */
    @NameInMap("AccessConfigurationId")
    public String accessConfigurationId;

    /**
     * <p>Specifies whether to remove the access configuration deployment when you remove the last authorization that uses the access configuration on an account in a resource directory. Valid values:</p>
     * <ul>
     * <li>DeprovisionForLastAccessAssignmentOnAccount: Removes the access configuration deployment.</li>
     * <li>None: Does not remove the access configuration deployment. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("DeprovisionStrategy")
    public String deprovisionStrategy;

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
     * <p>The CloudSSO identity ID. The value varies based on the principal type:</p>
     * <ul>
     * <li>If <code>PrincipalType</code> is <code>User</code>, <code>PrincipalId</code> is the CloudSSO user ID.</li>
     * <li>If <code>PrincipalType</code> is <code>Group</code>, <code>PrincipalId</code> is the CloudSSO group ID.</li>
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
     * <p>The target ID of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>114240524784****</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    /**
     * <p>The target type of the task. Valid values:</p>
     * <ul>
     * <li>RD-Account: The task target is an account in a resource directory.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RD-Account</p>
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

    public DeleteAccessAssignmentRequest setOriginTargetId(String originTargetId) {
        this.originTargetId = originTargetId;
        return this;
    }
    public String getOriginTargetId() {
        return this.originTargetId;
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
