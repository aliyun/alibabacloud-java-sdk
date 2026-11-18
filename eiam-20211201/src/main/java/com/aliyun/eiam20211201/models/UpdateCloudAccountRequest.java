// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateCloudAccountRequest extends TeaModel {
    /**
     * <p>Ensures the idempotence of the request. Generate a parameter value on your client to ensure that the value is unique across different requests. ClientToken supports only ASCII characters and can be up to 64 characters in length. For more information, see References: <a href="https://www.alibabacloud.com/help/zh/ecs/developer-reference/how-to-ensure-idempotence">How to ensure idempotence</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-example</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The cloud account ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca_01kmegjc11qa1txxxxx</p>
     */
    @NameInMap("CloudAccountId")
    public String cloudAccountId;

    /**
     * <p>The cloud account name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_account_xxx</p>
     */
    @NameInMap("CloudAccountName")
    public String cloudAccountName;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateCloudAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudAccountRequest self = new UpdateCloudAccountRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCloudAccountRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateCloudAccountRequest setCloudAccountId(String cloudAccountId) {
        this.cloudAccountId = cloudAccountId;
        return this;
    }
    public String getCloudAccountId() {
        return this.cloudAccountId;
    }

    public UpdateCloudAccountRequest setCloudAccountName(String cloudAccountName) {
        this.cloudAccountName = cloudAccountName;
        return this;
    }
    public String getCloudAccountName() {
        return this.cloudAccountName;
    }

    public UpdateCloudAccountRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
