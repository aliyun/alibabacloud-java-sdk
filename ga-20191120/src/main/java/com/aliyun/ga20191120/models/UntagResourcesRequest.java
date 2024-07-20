// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    /**
     * <p>Specifies whether to remove all tags of the specified resource. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong> (default): no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("All")
    public Boolean all;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the region where the GA instance is deployed. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of the resources whose tags you want to remove.</p>
     * <ul>
     * <li>If you set <strong>ResourceType</strong> to <strong>accelerator</strong>, set the value of ResourceId to the ID of a standard GA instance.</li>
     * <li>If you set <strong>ResourceType</strong> to <strong>basicaccelerator</strong>, set the value of ResourceId to the ID of a basic GA instance.</li>
     * <li>If you set <strong>ResourceType</strong> to <strong>bandwidthpackage</strong>, set the value of ResourceId to the ID of a bandwidth plan.</li>
     * <li>If you set <strong>ResourceType</strong> to <strong>acl</strong>, set the value of ResourceId to the ID of an ACL.</li>
     * <li>If you set <strong>ResourceType</strong> to <strong>endpointgroup</strong>, set the value of ResourceId to the ID of an endpoint group.</li>
     * </ul>
     * <p>You can specify up to 50 GA resource IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The type of the resource whose tags you want to remove. Valid values:</p>
     * <ul>
     * <li><strong>accelerator</strong>: a standard GA instance</li>
     * <li><strong>basicaccelerator</strong>: a basic GA instance</li>
     * <li><strong>bandwidthpackage</strong>: a bandwidth plan</li>
     * <li><strong>acl</strong>: an access control list (ACL).</li>
     * <li><strong>endpointgroup</strong>: an endpoint group</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>accelerator</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The key of the tag to be removed.</p>
     * <p>The system removes all tags with this tag key.</p>
     * <p>You can specify up to 20 tag keys.</p>
     * <blockquote>
     * <p> If the <strong>All</strong> parameter is set to <strong>true</strong>, this parameter does not take effect.</p>
     * </blockquote>
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
