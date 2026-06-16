// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableCloudAccountRoleRequest extends TeaModel {
    /**
     * <p>A client token to ensure the idempotence of the request. Generate a unique value from your client for this parameter. The token can contain only ASCII characters and must be no more than 64 characters in length. For more information, see <a href="https://www.alibabacloud.com/help/zh/ecs/developer-reference/how-to-ensure-idempotence">How to ensure idempotence</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-example</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The Alibaba Cloud account ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca_01kmegjc11qa1txxxxx</p>
     */
    @NameInMap("CloudAccountId")
    public String cloudAccountId;

    /**
     * <p>The cloud role ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>carole_01kmek49aqxxxx</p>
     */
    @NameInMap("CloudAccountRoleId")
    public String cloudAccountRoleId;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DisableCloudAccountRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableCloudAccountRoleRequest self = new DisableCloudAccountRoleRequest();
        return TeaModel.build(map, self);
    }

    public DisableCloudAccountRoleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DisableCloudAccountRoleRequest setCloudAccountId(String cloudAccountId) {
        this.cloudAccountId = cloudAccountId;
        return this;
    }
    public String getCloudAccountId() {
        return this.cloudAccountId;
    }

    public DisableCloudAccountRoleRequest setCloudAccountRoleId(String cloudAccountRoleId) {
        this.cloudAccountRoleId = cloudAccountRoleId;
        return this;
    }
    public String getCloudAccountRoleId() {
        return this.cloudAccountRoleId;
    }

    public DisableCloudAccountRoleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
