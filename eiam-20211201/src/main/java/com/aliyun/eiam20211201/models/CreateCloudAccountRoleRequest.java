// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateCloudAccountRoleRequest extends TeaModel {
    /**
     * <p>A client token used to ensure the idempotence of the request. Generate a unique value for this parameter from your client. The token can contain only ASCII characters and must be no more than 64 characters in length. For more information, see <a href="https://www.alibabacloud.com/help/zh/ecs/developer-reference/how-to-ensure-idempotence">How to ensure idempotence</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-example</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the Alibaba Cloud account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca_01kmegjc11qa1txxxxx</p>
     */
    @NameInMap("CloudAccountId")
    public String cloudAccountId;

    /**
     * <p>The name of the cloud role.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>role-test</p>
     */
    @NameInMap("CloudAccountRoleName")
    public String cloudAccountRoleName;

    /**
     * <p>The type of the cloud role. The format of this parameter depends on the type of the Alibaba Cloud account. The supported value is:</p>
     * <ul>
     * <li>role: applies to Alibaba Cloud accounts.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>role</p>
     */
    @NameInMap("CloudAccountRoleType")
    public String cloudAccountRoleType;

    /**
     * <p>The description of the cloud role.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_account_role_description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static CreateCloudAccountRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudAccountRoleRequest self = new CreateCloudAccountRoleRequest();
        return TeaModel.build(map, self);
    }

    public CreateCloudAccountRoleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCloudAccountRoleRequest setCloudAccountId(String cloudAccountId) {
        this.cloudAccountId = cloudAccountId;
        return this;
    }
    public String getCloudAccountId() {
        return this.cloudAccountId;
    }

    public CreateCloudAccountRoleRequest setCloudAccountRoleName(String cloudAccountRoleName) {
        this.cloudAccountRoleName = cloudAccountRoleName;
        return this;
    }
    public String getCloudAccountRoleName() {
        return this.cloudAccountRoleName;
    }

    public CreateCloudAccountRoleRequest setCloudAccountRoleType(String cloudAccountRoleType) {
        this.cloudAccountRoleType = cloudAccountRoleType;
        return this;
    }
    public String getCloudAccountRoleType() {
        return this.cloudAccountRoleType;
    }

    public CreateCloudAccountRoleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCloudAccountRoleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
