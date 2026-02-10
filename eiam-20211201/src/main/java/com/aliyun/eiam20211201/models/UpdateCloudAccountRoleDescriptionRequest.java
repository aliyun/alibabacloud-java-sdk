// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateCloudAccountRoleDescriptionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-example</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca_01kmegjc11qa1txxxxx</p>
     */
    @NameInMap("CloudAccountId")
    public String cloudAccountId;

    /**
     * <p>云账号角色ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>carole_01kmek49aqxxxx</p>
     */
    @NameInMap("CloudAccountRoleId")
    public String cloudAccountRoleId;

    /**
     * <p>描述</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_account_role_description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateCloudAccountRoleDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudAccountRoleDescriptionRequest self = new UpdateCloudAccountRoleDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCloudAccountRoleDescriptionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateCloudAccountRoleDescriptionRequest setCloudAccountId(String cloudAccountId) {
        this.cloudAccountId = cloudAccountId;
        return this;
    }
    public String getCloudAccountId() {
        return this.cloudAccountId;
    }

    public UpdateCloudAccountRoleDescriptionRequest setCloudAccountRoleId(String cloudAccountRoleId) {
        this.cloudAccountRoleId = cloudAccountRoleId;
        return this;
    }
    public String getCloudAccountRoleId() {
        return this.cloudAccountRoleId;
    }

    public UpdateCloudAccountRoleDescriptionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateCloudAccountRoleDescriptionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
