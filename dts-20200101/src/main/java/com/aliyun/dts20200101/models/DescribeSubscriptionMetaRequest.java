// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSubscriptionMetaRequest extends TeaModel {
    /**
     * <p>The instance ID of the distributed change tracking task.</p>
     * <blockquote>
     * <p>This parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dtsbr4m9luv2******</p>
     */
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    /**
     * <p>The region in which the change tracking instance resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The consumer group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>z38m91gg2******</p>
     */
    @NameInMap("Sid")
    public String sid;

    /**
     * <p>The IDs of all change tracking subtasks in the distributed change tracking task. Separate multiple IDs with commas (,).</p>
     * <blockquote>
     * <p>You must specify at least one of this parameter and <strong>Topics</strong>. We recommend that you specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;zsls58agp6f****&quot;]</p>
     */
    @NameInMap("SubMigrationJobIds")
    public java.util.Map<String, ?> subMigrationJobIds;

    /**
     * <p>All topics of the distributed change tracking task. Separate multiple topics with commas (,).</p>
     * <blockquote>
     * <p>You must specify at least one of this parameter and <strong>SubMigrationJobIds</strong>. We recommend that you specify <strong>SubMigrationJobIds</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;rm_bp15jj3qi1p8f****&quot;]</p>
     */
    @NameInMap("Topics")
    public java.util.Map<String, ?> topics;

    public static DescribeSubscriptionMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubscriptionMetaRequest self = new DescribeSubscriptionMetaRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSubscriptionMetaRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    public DescribeSubscriptionMetaRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSubscriptionMetaRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeSubscriptionMetaRequest setSid(String sid) {
        this.sid = sid;
        return this;
    }
    public String getSid() {
        return this.sid;
    }

    public DescribeSubscriptionMetaRequest setSubMigrationJobIds(java.util.Map<String, ?> subMigrationJobIds) {
        this.subMigrationJobIds = subMigrationJobIds;
        return this;
    }
    public java.util.Map<String, ?> getSubMigrationJobIds() {
        return this.subMigrationJobIds;
    }

    public DescribeSubscriptionMetaRequest setTopics(java.util.Map<String, ?> topics) {
        this.topics = topics;
        return this;
    }
    public java.util.Map<String, ?> getTopics() {
        return this.topics;
    }

}
