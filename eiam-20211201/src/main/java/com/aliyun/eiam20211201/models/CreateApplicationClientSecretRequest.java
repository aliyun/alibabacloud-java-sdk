// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateApplicationClientSecretRequest extends TeaModel {
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
     * <p>The expiration time in UNIX timestamp format, in milliseconds. If this parameter is left empty, the client secret is permanently valid. The minimum validity period that you can set is 1 day, and the maximum validity period is 3 years.</p>
     * 
     * <strong>example:</strong>
     * <p>1735530123762</p>
     */
    @NameInMap("ExpirationTime")
    public Long expirationTime;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static CreateApplicationClientSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationClientSecretRequest self = new CreateApplicationClientSecretRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationClientSecretRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreateApplicationClientSecretRequest setExpirationTime(Long expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }
    public Long getExpirationTime() {
        return this.expirationTime;
    }

    public CreateApplicationClientSecretRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
