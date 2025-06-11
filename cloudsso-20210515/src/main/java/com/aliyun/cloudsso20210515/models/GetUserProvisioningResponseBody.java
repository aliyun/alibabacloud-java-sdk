// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetUserProvisioningResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F6F90F3D-4502-5877-B80B-97476F6AE2CC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the RAM user provisioning.</p>
     */
    @NameInMap("UserProvisioning")
    public GetUserProvisioningResponseBodyUserProvisioning userProvisioning;

    public static GetUserProvisioningResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserProvisioningResponseBody self = new GetUserProvisioningResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserProvisioningResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserProvisioningResponseBody setUserProvisioning(GetUserProvisioningResponseBodyUserProvisioning userProvisioning) {
        this.userProvisioning = userProvisioning;
        return this;
    }
    public GetUserProvisioningResponseBodyUserProvisioning getUserProvisioning() {
        return this.userProvisioning;
    }

    public static class GetUserProvisioningResponseBodyUserProvisioning extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-28T03:55:42Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The deletion policy. The policy is used to manage synchronized users when you delete the RAM user provisioning. Valid values:</p>
         * <ul>
         * <li>Delete: When you delete the RAM user provisioning, the system deletes the synchronized users.</li>
         * <li>Keep: When you delete the RAM user provisioning, the system retains the synchronized users.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Delete</p>
         */
        @NameInMap("DeletionStrategy")
        public String deletionStrategy;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a user provisioning.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>d-003qew84****</p>
         */
        @NameInMap("DirectoryId")
        public String directoryId;

        /**
         * <p>The conflict handling policy. The policy is used when a RAM user has the same username as the CloudSSO user who is synchronized to RAM. Valid values:</p>
         * <ul>
         * <li>KeepBoth: When a CloudSSO user is synchronized to RAM, if a RAM user who has the same username as the CloudSSO user exists, the system creates a RAM user whose username is the username of the CloudSSO user plus the suffix <code>_sso</code>.</li>
         * <li>TakeOver: When a CloudSSO user is synchronized to RAM, if a RAM user who has the same username as the CloudSSO user exists, the system replaces the RAM user with the CloudSSO user.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>KeepBoth</p>
         */
        @NameInMap("DuplicationStrategy")
        public String duplicationStrategy;

        /**
         * <p>The ID of the Alibaba Cloud account to which the resource directory belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1639738******</p>
         */
        @NameInMap("OwnerPk")
        public String ownerPk;

        /**
         * <p>The identity ID of the RAM user provisioning. Valid values:</p>
         * <ul>
         * <li>If <code>Group</code> is returned for the <code>PrincipalType</code> parameter, the value of this parameter is the ID of a CloudSSO user group (g-\<em>\</em>\<em>\</em>\<em>\</em>\<em>\</em>).</li>
         * <li>If <code>User</code> is returned for the <code>PrincipalType</code> parameter, the value of this parameter is the ID of a CloudSSO user (u-\<em>\</em>\<em>\</em>\<em>\</em>\<em>\</em>).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>g-02ha881d*****</p>
         */
        @NameInMap("PrincipalId")
        public String principalId;

        /**
         * <p>The identity name of the RAM user provisioning. Valid values:</p>
         * <ul>
         * <li>If <code>Group</code> is returned for the <code>PrincipalType</code> parameter, the value of this parameter is the name of a CloudSSO user group.</li>
         * <li>If <code>User</code> is returned for the <code>PrincipalType</code> parameter, the value of this parameter is the name of a CloudSSO user.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>testGroupName</p>
         */
        @NameInMap("PrincipalName")
        public String principalName;

        /**
         * <p>The identity type of the RAM user provisioning. Valid values:</p>
         * <ul>
         * <li>User: indicates that the identity of the RAM user provisioning is a CloudSSO user.</li>
         * <li>Group: indicates that the identity of the RAM user provisioning is a CloudSSO user group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Group</p>
         */
        @NameInMap("PrincipalType")
        public String principalType;

        /**
         * <p>The status of the RAM user provisioning. Valid values:</p>
         * <ul>
         * <li>Enabled</li>
         * <li>Disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the object for which you create the RAM user provisioning. The value is fixed as the ID of the member in the resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>1743382******</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        /**
         * <p>The name of the object for which you create the RAM user provisioning. The value is fixed as the name of the member in the resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>testRdMember</p>
         */
        @NameInMap("TargetName")
        public String targetName;

        /**
         * <p>The path of the resource directory in which you create the RAM user provisioning for the member.</p>
         */
        @NameInMap("TargetPath")
        public String targetPath;

        /**
         * <p>The object for which you create the RAM user provisioning. The value is fixed as <code>RD-Account</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>RD-Account</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-28T03:55:42Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The ID of the RAM user provisioning.</p>
         * 
         * <strong>example:</strong>
         * <p>up-002axzhapcbz6e63****</p>
         */
        @NameInMap("UserProvisioningId")
        public String userProvisioningId;

        public static GetUserProvisioningResponseBodyUserProvisioning build(java.util.Map<String, ?> map) throws Exception {
            GetUserProvisioningResponseBodyUserProvisioning self = new GetUserProvisioningResponseBodyUserProvisioning();
            return TeaModel.build(map, self);
        }

        public GetUserProvisioningResponseBodyUserProvisioning setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetUserProvisioningResponseBodyUserProvisioning setDeletionStrategy(String deletionStrategy) {
            this.deletionStrategy = deletionStrategy;
            return this;
        }
        public String getDeletionStrategy() {
            return this.deletionStrategy;
        }

        public GetUserProvisioningResponseBodyUserProvisioning setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetUserProvisioningResponseBodyUserProvisioning setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public GetUserProvisioningResponseBodyUserProvisioning setDuplicationStrategy(String duplicationStrategy) {
            this.duplicationStrategy = duplicationStrategy;
            return this;
        }
        public String getDuplicationStrategy() {
            return this.duplicationStrategy;
        }

        public GetUserProvisioningResponseBodyUserProvisioning setOwnerPk(String ownerPk) {
            this.ownerPk = ownerPk;
            return this;
        }
        public String getOwnerPk() {
            return this.ownerPk;
        }

        public GetUserProvisioningResponseBodyUserProvisioning setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public GetUserProvisioningResponseBodyUserProvisioning setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public GetUserProvisioningResponseBodyUserProvisioning setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

        public GetUserProvisioningResponseBodyUserProvisioning setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetUserProvisioningResponseBodyUserProvisioning setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public GetUserProvisioningResponseBodyUserProvisioning setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public GetUserProvisioningResponseBodyUserProvisioning setTargetPath(String targetPath) {
            this.targetPath = targetPath;
            return this;
        }
        public String getTargetPath() {
            return this.targetPath;
        }

        public GetUserProvisioningResponseBodyUserProvisioning setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public GetUserProvisioningResponseBodyUserProvisioning setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetUserProvisioningResponseBodyUserProvisioning setUserProvisioningId(String userProvisioningId) {
            this.userProvisioningId = userProvisioningId;
            return this;
        }
        public String getUserProvisioningId() {
            return this.userProvisioningId;
        }

    }

}
