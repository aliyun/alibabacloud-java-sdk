// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class UpdateServiceUsageRequest extends TeaModel {
    /**
     * <p>A client token to ensure the idempotence of the request. Generate a unique value from your client for this parameter. <strong>ClientToken</strong> supports only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAYChudnQUoBH+mGWFpb6oP0=</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The service ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>service-39f4f251e94843xxxxxx</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The user information.</p>
     */
    @NameInMap("UserInformation")
    public java.util.Map<String, String> userInformation;

    public static UpdateServiceUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceUsageRequest self = new UpdateServiceUsageRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceUsageRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateServiceUsageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateServiceUsageRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public UpdateServiceUsageRequest setUserInformation(java.util.Map<String, String> userInformation) {
        this.userInformation = userInformation;
        return this;
    }
    public java.util.Map<String, String> getUserInformation() {
        return this.userInformation;
    }

}
