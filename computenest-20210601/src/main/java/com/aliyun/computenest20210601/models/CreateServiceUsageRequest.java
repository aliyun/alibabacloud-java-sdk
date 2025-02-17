// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class CreateServiceUsageRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotency of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <strong>token</strong> can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The service ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>service-d6fc5f949a9246xxxxxx</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The application information.</p>
     */
    @NameInMap("UserInformation")
    public java.util.Map<String, String> userInformation;

    public static CreateServiceUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceUsageRequest self = new CreateServiceUsageRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceUsageRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateServiceUsageRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public CreateServiceUsageRequest setUserInformation(java.util.Map<String, String> userInformation) {
        this.userInformation = userInformation;
        return this;
    }
    public java.util.Map<String, String> getUserInformation() {
        return this.userInformation;
    }

}
