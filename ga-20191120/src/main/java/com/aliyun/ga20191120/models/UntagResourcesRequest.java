// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    /**
     * <p>Specifies whether to remove all tags of the specified resource. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false** (default): no</p>
     */
    @NameInMap("All")
    public Boolean all;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** for each API request may be different.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the region where the GA instance is deployed. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource whose tags you want to remove.</p>
     * <br>
     * <p>*   If **ResourceType** is set to **accelerator**, set the value of ResourceId to the ID of a standard GA instance.</p>
     * <p>*   If **ResourceType** is set to **basicaccelerator**, set the value of ResourceId to the ID of a basic GA instance.</p>
     * <p>*   If **ResourceType** is set to **bandwidthpackage**, set the value of ResourceId to the ID of a bandwidth plan.</p>
     * <p>*   If **ResourceType** is set to **acl**, set the value of ResourceId to the ID of an ACL.</p>
     * <p>*   If **ResourceType** is set to **endpointgroup**, set the value of ResourceId to the ID of an EndpointGroup.</p>
     * <br>
     * <p>You can enter up to 50 resource IDs.</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The type of the resource whose tags you want to remove. Valid values:</p>
     * <br>
     * <p>*   **accelerator**: a standard GA instance.</p>
     * <p>*   **basicaccelerator**: a basic GA instance.</p>
     * <p>*   **bandwidthpackage**: a bandwidth plan.</p>
     * <p>*   **acl**: an access control list (ACL).</p>
     * <p>*   **endpointgroup**: an endpoint group (EndpointGroup).</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The key of the tag to be removed.</p>
     * <br>
     * <p>The system removes all tags with this tag key.</p>
     * <br>
     * <p>You can specify up to 20 tag keys.</p>
     * <br>
     * <p>>  If the **All** parameter is set to **true**, this parameter does not take effect.</p>
     */
    @NameInMap("TagKey")
    public java.util.List<String> tagKey;

    public static UntagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesRequest self = new UntagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public UntagResourcesRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public UntagResourcesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UntagResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UntagResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public UntagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UntagResourcesRequest setTagKey(java.util.List<String> tagKey) {
        this.tagKey = tagKey;
        return this;
    }
    public java.util.List<String> getTagKey() {
        return this.tagKey;
    }

}
