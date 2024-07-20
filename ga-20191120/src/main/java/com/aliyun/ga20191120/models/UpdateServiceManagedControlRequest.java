// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateServiceManagedControlRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the value of <strong>RequestId</strong> as the value of <strong>ClientToken</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The region ID of the GA instance. Set the value to cn-hangzhou.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource whose control mode you want to change.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp149u6o36qt1as9b****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The type of the resource whose control mode you want to change.</p>
     * <p>Set the value to <strong>Accelerator</strong>, which specifies a standard GA instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Accelerator</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The control mode of the resource.</p>
     * <p>Set the value to <strong>false</strong>, which changes the control mode of the resource from managed mode to unmanaged mode.</p>
     * <blockquote>
     * <p> You can change the control mode only from managed mode to unmanaged mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ServiceManaged")
    public Boolean serviceManaged;

    public static UpdateServiceManagedControlRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceManagedControlRequest self = new UpdateServiceManagedControlRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceManagedControlRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateServiceManagedControlRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateServiceManagedControlRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public UpdateServiceManagedControlRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UpdateServiceManagedControlRequest setServiceManaged(Boolean serviceManaged) {
        this.serviceManaged = serviceManaged;
        return this;
    }
    public Boolean getServiceManaged() {
        return this.serviceManaged;
    }

}
