// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListNodePoolComponentsShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>aliyun_3_x64_20G_container_optimized_alibase_20250629.vhd</p>
     */
    @NameInMap("image_id")
    public String imageId;

    /**
     * <strong>example:</strong>
     * <p>AliyunLinux3</p>
     */
    @NameInMap("image_type")
    public String imageType;

    /**
     * <strong>example:</strong>
     * <p>[&quot;ecs.c6.xlarge&quot;]</p>
     */
    @NameInMap("instance_types")
    public String instanceTypesShrink;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("max_results")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>5c0a1c0f91c14c6****</p>
     */
    @NameInMap("next_token")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>np1855b102ac434f5990d87b77a****</p>
     */
    @NameInMap("nodepool_id")
    public String nodepoolId;

    /**
     * <strong>example:</strong>
     * <p>ess</p>
     */
    @NameInMap("nodepool_type")
    public String nodepoolType;

    public static ListNodePoolComponentsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodePoolComponentsShrinkRequest self = new ListNodePoolComponentsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListNodePoolComponentsShrinkRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ListNodePoolComponentsShrinkRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }
    public String getImageType() {
        return this.imageType;
    }

    public ListNodePoolComponentsShrinkRequest setInstanceTypesShrink(String instanceTypesShrink) {
        this.instanceTypesShrink = instanceTypesShrink;
        return this;
    }
    public String getInstanceTypesShrink() {
        return this.instanceTypesShrink;
    }

    public ListNodePoolComponentsShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNodePoolComponentsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNodePoolComponentsShrinkRequest setNodepoolId(String nodepoolId) {
        this.nodepoolId = nodepoolId;
        return this;
    }
    public String getNodepoolId() {
        return this.nodepoolId;
    }

    public ListNodePoolComponentsShrinkRequest setNodepoolType(String nodepoolType) {
        this.nodepoolType = nodepoolType;
        return this;
    }
    public String getNodepoolType() {
        return this.nodepoolType;
    }

}
