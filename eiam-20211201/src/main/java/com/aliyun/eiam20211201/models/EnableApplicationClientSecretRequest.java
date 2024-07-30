// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableApplicationClientSecretRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The client key ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sci_k52x2ru63rlkflina5utgkxxxx</p>
     */
    @NameInMap("SecretId")
    public String secretId;

    public static EnableApplicationClientSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableApplicationClientSecretRequest self = new EnableApplicationClientSecretRequest();
        return TeaModel.build(map, self);
    }

    public EnableApplicationClientSecretRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public EnableApplicationClientSecretRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public EnableApplicationClientSecretRequest setSecretId(String secretId) {
        this.secretId = secretId;
        return this;
    }
    public String getSecretId() {
        return this.secretId;
    }

}
