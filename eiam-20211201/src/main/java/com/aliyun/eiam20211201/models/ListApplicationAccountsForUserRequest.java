// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationAccountsForUserRequest extends TeaModel {
    /**
     * <p>IDaaS的应用主键id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_11111</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>IDaaS EIAM的实例id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eiam-111ccc1111</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>用户Id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user_example</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static ListApplicationAccountsForUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationAccountsForUserRequest self = new ListApplicationAccountsForUserRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationAccountsForUserRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ListApplicationAccountsForUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListApplicationAccountsForUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
