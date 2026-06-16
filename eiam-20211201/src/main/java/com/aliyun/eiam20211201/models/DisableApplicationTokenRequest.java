// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableApplicationTokenRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The ID of the application token.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>token_sfrwerxxxxxxxxxxxxxx</p>
     */
    @NameInMap("ApplicationTokenId")
    public String applicationTokenId;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DisableApplicationTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableApplicationTokenRequest self = new DisableApplicationTokenRequest();
        return TeaModel.build(map, self);
    }

    public DisableApplicationTokenRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DisableApplicationTokenRequest setApplicationTokenId(String applicationTokenId) {
        this.applicationTokenId = applicationTokenId;
        return this;
    }
    public String getApplicationTokenId() {
        return this.applicationTokenId;
    }

    public DisableApplicationTokenRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
