// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateVpcEndpointRequest extends TeaModel {
    /**
     * <p>The returned result details.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("serviceId")
    public String serviceId;

    @NameInMap("zoneId")
    public String zoneId;

    /**
     * <p>The ID of the user endpoint service associated with the endpoint.</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static CreateVpcEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcEndpointRequest self = new CreateVpcEndpointRequest();
        return TeaModel.build(map, self);
    }

    public CreateVpcEndpointRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateVpcEndpointRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public CreateVpcEndpointRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreateVpcEndpointRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
