// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateApplicationTokenExpirationTimeRequest extends TeaModel {
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
     * <p>The application token ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>token_sfrwerxxxxxxxxxxxxxx</p>
     */
    @NameInMap("ApplicationTokenId")
    public String applicationTokenId;

    /**
     * <p>The expiration time.</p>
     * <p>This parameter is required.</p>
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

    public static UpdateApplicationTokenExpirationTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationTokenExpirationTimeRequest self = new UpdateApplicationTokenExpirationTimeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationTokenExpirationTimeRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpdateApplicationTokenExpirationTimeRequest setApplicationTokenId(String applicationTokenId) {
        this.applicationTokenId = applicationTokenId;
        return this;
    }
    public String getApplicationTokenId() {
        return this.applicationTokenId;
    }

    public UpdateApplicationTokenExpirationTimeRequest setExpirationTime(Long expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }
    public Long getExpirationTime() {
        return this.expirationTime;
    }

    public UpdateApplicationTokenExpirationTimeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
