// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class RemoveApplicationAccountFromUserRequest extends TeaModel {
    /**
     * <p>The application account ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>act_example</p>
     */
    @NameInMap("ApplicationAccountId")
    public String applicationAccountId;

    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_11111</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eiam-111ccc1111</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The user ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user_example</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static RemoveApplicationAccountFromUserRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveApplicationAccountFromUserRequest self = new RemoveApplicationAccountFromUserRequest();
        return TeaModel.build(map, self);
    }

    public RemoveApplicationAccountFromUserRequest setApplicationAccountId(String applicationAccountId) {
        this.applicationAccountId = applicationAccountId;
        return this;
    }
    public String getApplicationAccountId() {
        return this.applicationAccountId;
    }

    public RemoveApplicationAccountFromUserRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public RemoveApplicationAccountFromUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RemoveApplicationAccountFromUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
