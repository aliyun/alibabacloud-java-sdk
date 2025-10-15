// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateApplicationTokenRequest extends TeaModel {
    /**
     * <p>IDaaS的应用资源ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>应用token类型</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bearer_token</p>
     */
    @NameInMap("ApplicationTokenType")
    public String applicationTokenType;

    /**
     * <p>不填，默认1年后到期</p>
     * 
     * <strong>example:</strong>
     * <p>1735530123762</p>
     */
    @NameInMap("ExpirationTime")
    public Long expirationTime;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static CreateApplicationTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationTokenRequest self = new CreateApplicationTokenRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationTokenRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreateApplicationTokenRequest setApplicationTokenType(String applicationTokenType) {
        this.applicationTokenType = applicationTokenType;
        return this;
    }
    public String getApplicationTokenType() {
        return this.applicationTokenType;
    }

    public CreateApplicationTokenRequest setExpirationTime(Long expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }
    public Long getExpirationTime() {
        return this.expirationTime;
    }

    public CreateApplicationTokenRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
