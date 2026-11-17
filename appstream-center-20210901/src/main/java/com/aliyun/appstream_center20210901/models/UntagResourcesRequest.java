// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    /**
     * <p>Specifies whether to remove all custom tags from the resources. <strong>This parameter takes effect only when TagKey.N is not specified</strong>. If TagKey.N is specified, this parameter is ignored. Valid values:</p>
     * <ul>
     * <li>true: Removes all custom tags from the resources, including Wuying system tags that start with <code>System/</code> and are bound by calling the <a href="~~TagResources~~">TagResources</a> operation.</li>
     * <li>false (default): Does not remove all tags. If TagKey.N is also not specified, the error code InvalidParameter.TagKeyListOrAll is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("All")
    public Boolean all;

    /**
     * <p>The region ID. This parameter is required. Set this parameter to the ID of the region where the app instance group resides, such as cn-hangzhou.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of resource IDs from which you want to remove tags. This parameter is required. Specify the app instance group IDs. A maximum of 50 IDs can be specified in a single request. Duplicate IDs are automatically deduplicated.</p>
     * <p><strong>All IDs must belong to existing app instance groups within the current Alibaba Cloud account.</strong> If any ID does not exist or does not belong to the current account, the entire request fails and the error code InvalidAppInstanceGroup.NotFound is returned. No tags are removed from any resources.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The resource type. This parameter is required. <strong>Currently, only app instance groups are supported</strong>. The value is not case-sensitive, but we recommend that you use uppercase letters:</p>
     * <ul>
     * <li>APPINSTANCEGROUP: Wuying app instance group.</li>
     * </ul>
     * <p>If you specify other values, the error code InvalidResourceType.Invalid is returned.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>APPINSTANCEGROUP</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The list of tag keys to be removed. A maximum of 20 tag keys can be specified in a single request. <strong>You must specify at least one of TagKey.N and All</strong>. If neither is specified, the error code InvalidParameter.TagKeyListOrAll is returned.</p>
     * <ul>
     * <li>If TagKey.N is specified, only the tags corresponding to these tag keys are removed, and the All parameter is ignored.</li>
     * <li>If a specified tag key does not exist on a resource, the tag key is skipped and no error is returned.</li>
     * <li>If TagKey.N is not specified, you must set All to true to remove all custom tags from the resources.</li>
     * </ul>
     * <p>Tag keys that start with <code>System/</code> are Wuying system tags. Only the following values are supported:</p>
     * <ul>
     * <li>System/Scheduler/GRAYSCALE: The grayscale tag for the app instance group.</li>
     * <li>System/Scheduler/STOP_NEW_USER_CONNECTION: Prevents new connections from users newly bound to the app instance group.</li>
     * </ul>
     * <p>If you specify other tag keys that start with <code>System/</code>, the error code InvalidTagPolicy.KeyInvalid or InvalidTag.SystemKeyNotAllow is returned.</p>
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
