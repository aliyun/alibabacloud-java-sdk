// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class DeleteAclRequest extends TeaModel {
    /**
     * <p>The operation allowed by the access control list (ACL). Valid values:</p>
     * <br>
     * <p>*   **Write**: data writes</p>
     * <p>*   **Read**: data reads</p>
     * <p>*   **Describe**: reads of transactional IDs</p>
     * <p>*   **IdempotentWrite**: idempotent data writes to clusters</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AclOperationType")
    public String aclOperationType;

    /**
     * <p>The operations allowed by the ACL. Separate multiple operations with commas (,).</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   **Write**: data writes</p>
     * <p>*   **Read**: data reads</p>
     * <p>*   **Describe**: reads of **transactional IDs**</p>
     * <p>*   **IdempotentWrite**: idempotent data writes to **clusters**</p>
     * <br>
     * <p>>  This parameter is available only for ApsaraMQ for Kafka V3 serverless instances.</p>
     */
    @NameInMap("AclOperationTypes")
    public String aclOperationTypes;

    /**
     * <p>The authorization method. Valid values:</p>
     * <br>
     * <p>*   Deny</p>
     * <p>*   ALLOW</p>
     * <br>
     * <p>>  This parameter is available only for ApsaraMQ for Kafka V3 serverless instances.</p>
     */
    @NameInMap("AclPermissionType")
    public String aclPermissionType;

    /**
     * <p>The name of the resource.</p>
     * <br>
     * <p>*   The value can be the name of a topic or consumer group.</p>
     * <p>*   You can use an asterisk (\\*) to indicate the names of all topics or consumer groups.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AclResourceName")
    public String aclResourceName;

    /**
     * <p>The mode that is used to match resources. Valid values:</p>
     * <br>
     * <p>*   **LITERAL:** full match</p>
     * <p>*   **PREFIXED**: prefix match</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AclResourcePatternType")
    public String aclResourcePatternType;

    /**
     * <p>The resource type. Valid values:</p>
     * <br>
     * <p>*   **Topic**: topic</p>
     * <p>*   **Group**: consumer group</p>
     * <p>*   **Cluster**: cluster</p>
     * <p>*   **TransactionalId**: transactional ID</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AclResourceType")
    public String aclResourceType;

    /**
     * <p>The IP address of the source.</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the region.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the user.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Username")
    public String username;

    public static DeleteAclRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAclRequest self = new DeleteAclRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAclRequest setAclOperationType(String aclOperationType) {
        this.aclOperationType = aclOperationType;
        return this;
    }
    public String getAclOperationType() {
        return this.aclOperationType;
    }

    public DeleteAclRequest setAclOperationTypes(String aclOperationTypes) {
        this.aclOperationTypes = aclOperationTypes;
        return this;
    }
    public String getAclOperationTypes() {
        return this.aclOperationTypes;
    }

    public DeleteAclRequest setAclPermissionType(String aclPermissionType) {
        this.aclPermissionType = aclPermissionType;
        return this;
    }
    public String getAclPermissionType() {
        return this.aclPermissionType;
    }

    public DeleteAclRequest setAclResourceName(String aclResourceName) {
        this.aclResourceName = aclResourceName;
        return this;
    }
    public String getAclResourceName() {
        return this.aclResourceName;
    }

    public DeleteAclRequest setAclResourcePatternType(String aclResourcePatternType) {
        this.aclResourcePatternType = aclResourcePatternType;
        return this;
    }
    public String getAclResourcePatternType() {
        return this.aclResourcePatternType;
    }

    public DeleteAclRequest setAclResourceType(String aclResourceType) {
        this.aclResourceType = aclResourceType;
        return this;
    }
    public String getAclResourceType() {
        return this.aclResourceType;
    }

    public DeleteAclRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public DeleteAclRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteAclRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteAclRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
