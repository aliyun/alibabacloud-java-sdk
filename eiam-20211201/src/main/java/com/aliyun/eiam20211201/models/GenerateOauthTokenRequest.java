// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GenerateOauthTokenRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com">https://example.com</a></p>
     */
    @NameInMap("Audience")
    public String audience;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ScopeValues")
    public java.util.List<String> scopeValues;

    public static GenerateOauthTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateOauthTokenRequest self = new GenerateOauthTokenRequest();
        return TeaModel.build(map, self);
    }

    public GenerateOauthTokenRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public GenerateOauthTokenRequest setAudience(String audience) {
        this.audience = audience;
        return this;
    }
    public String getAudience() {
        return this.audience;
    }

    public GenerateOauthTokenRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GenerateOauthTokenRequest setScopeValues(java.util.List<String> scopeValues) {
        this.scopeValues = scopeValues;
        return this;
    }
    public java.util.List<String> getScopeValues() {
        return this.scopeValues;
    }

}
