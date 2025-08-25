// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateApplicationClientSecretExpirationTimeRequest extends TeaModel {
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
     * <p>client secret的有效期时间，Unix时间戳格式，单位为毫秒</p>
     * <p>This parameter is required.</p>
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

    /**
     * <p>OIDC 场景下用于客户端身份验证的客户端密钥</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sct_11111</p>
     */
    @NameInMap("SecretId")
    public String secretId;

    public static UpdateApplicationClientSecretExpirationTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationClientSecretExpirationTimeRequest self = new UpdateApplicationClientSecretExpirationTimeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationClientSecretExpirationTimeRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpdateApplicationClientSecretExpirationTimeRequest setExpirationTime(Long expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }
    public Long getExpirationTime() {
        return this.expirationTime;
    }

    public UpdateApplicationClientSecretExpirationTimeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateApplicationClientSecretExpirationTimeRequest setSecretId(String secretId) {
        this.secretId = secretId;
        return this;
    }
    public String getSecretId() {
        return this.secretId;
    }

}
