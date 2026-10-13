// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    /**
     * <p>Specifies whether to unbind all tags from the file system.</p>
     * <p>This parameter takes effect only when TagKey.N is empty.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: Unbinds all tags from the file system. If the file system has no tags, no operation is performed and a success response is returned.</li>
     * <li>false (default): Does not perform the operation and directly returns a success response.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("All")
    public Boolean all;

    /**
     * <p>The list of resource IDs.</p>
     * <p>The ID of the resource. Valid values of N: 1 to 50.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>03e08484f0</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The resource type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>filesystem: file system.</li>
     * <li>accesspoint: access point.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>filesystem</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The list of tag keys of the resource. You can specify up to 20 tag keys.</p>
     * 
     * <strong>example:</strong>
     * <p>nastest</p>
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
