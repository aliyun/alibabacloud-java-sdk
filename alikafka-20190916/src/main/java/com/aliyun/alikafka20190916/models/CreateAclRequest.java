// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreateAclRequest extends TeaModel {
    /**
     * <p>The type of operation allowed by the ACL. Valid values:</p>
     * <br>
     * <p>*   **Write**: data writes.</p>
     * <p>*   **Read**: data reads.</p>
     * <p>*   **Describe**: reads of transaction IDs.****</p>
     * <p>*   **IdempotentWrite**: idempotent data writes to clusters.</p>
     */
    @NameInMap("AclOperationType")
    public String aclOperationType;

    /**
     * <p>The name or ID of the resource.</p>
     * <br>
     * <p>*   The value can be the name of a topic, consumer group, or cluster, or the ID of a transaction.</p>
     * <p>*   You can use an asterisk (\*) to represent the names or IDs of all relevant resources.</p>
     */
    @NameInMap("AclResourceName")
    public String aclResourceName;

    /**
     * <p>The mode that is used to match resources. Valid values:</p>
     * <br>
     * <p>*   **LITERAL**: exact match</p>
     * <p>*   **PREFIXED**: prefix match</p>
     */
    @NameInMap("AclResourcePatternType")
    public String aclResourcePatternType;

    /**
     * <p>The resource type. Valid values:</p>
     * <br>
     * <p>*   **Topic**: specifies topics.</p>
     * <p>*   **Group**: specifies consumer groups.</p>
     * <p>*   **Cluster**: specifies instances.</p>
     * <p>*   **TransactionalId**: specifies transactions.</p>
     */
    @NameInMap("AclResourceType")
    public String aclResourceType;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The username.</p>
     * <br>
     * <p>You can use an asterisk (\*) to represent all usernames.</p>
     */
    @NameInMap("Username")
    public String username;

    public static CreateAclRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAclRequest self = new CreateAclRequest();
        return TeaModel.build(map, self);
    }

    public CreateAclRequest setAclOperationType(String aclOperationType) {
        this.aclOperationType = aclOperationType;
        return this;
    }
    public String getAclOperationType() {
        return this.aclOperationType;
    }

    public CreateAclRequest setAclResourceName(String aclResourceName) {
        this.aclResourceName = aclResourceName;
        return this;
    }
    public String getAclResourceName() {
        return this.aclResourceName;
    }

    public CreateAclRequest setAclResourcePatternType(String aclResourcePatternType) {
        this.aclResourcePatternType = aclResourcePatternType;
        return this;
    }
    public String getAclResourcePatternType() {
        return this.aclResourcePatternType;
    }

    public CreateAclRequest setAclResourceType(String aclResourceType) {
        this.aclResourceType = aclResourceType;
        return this;
    }
    public String getAclResourceType() {
        return this.aclResourceType;
    }

    public CreateAclRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateAclRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAclRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
