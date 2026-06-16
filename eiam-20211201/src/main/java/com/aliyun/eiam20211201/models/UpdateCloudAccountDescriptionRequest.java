// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateCloudAccountDescriptionRequest extends TeaModel {
    /**
     * <p>A client token to ensure the idempotence of the request. Generate a unique value for this parameter from your client for each request. The ClientToken can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://www.alibabacloud.com/help/zh/ecs/developer-reference/how-to-ensure-idempotence">How to ensure idempotence</a>.</p>
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
     * <p>The description of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_account_description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateCloudAccountDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudAccountDescriptionRequest self = new UpdateCloudAccountDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCloudAccountDescriptionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateCloudAccountDescriptionRequest setCloudAccountId(String cloudAccountId) {
        this.cloudAccountId = cloudAccountId;
        return this;
    }
    public String getCloudAccountId() {
        return this.cloudAccountId;
    }

    public UpdateCloudAccountDescriptionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateCloudAccountDescriptionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
