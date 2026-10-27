// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListNodePoolComponentsRequest extends TeaModel {
    /**
     * <p>The image ID of the node pool. This parameter is required if nodepool_id is not specified. You must specify either this parameter or image_type.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun_3_x64_20G_container_optimized_alibase_20250629.vhd</p>
     */
    @NameInMap("image_id")
    public String imageId;

    /**
     * <p>The image type of the node pool. This parameter is required if nodepool_id is not specified. You must specify either this parameter or image_id.</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunLinux3</p>
     */
    @NameInMap("image_type")
    public String imageType;

    /**
     * <p>The instance types of the node pool. This parameter is required if nodepool_id is not specified.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;ecs.c6.xlarge&quot;]</p>
     */
    @NameInMap("instance_types")
    public java.util.List<String> instanceTypes;

    /**
     * <p>The maximum number of results per page. Default value: 200.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("max_results")
    public Integer maxResults;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>5c0a1c0f91c14c6****</p>
     */
    @NameInMap("next_token")
    public String nextToken;

    /**
     * <p>The node pool ID. If you specify a node pool ID, the system queries the components available for the node pool and ignores other parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>np1855b102ac434f5990d87b77a****</p>
     */
    @NameInMap("nodepool_id")
    public String nodepoolId;

    /**
     * <p>The node pool type. This parameter is required if nodepool_id is not specified.</p>
     * 
     * <strong>example:</strong>
     * <p>ess</p>
     */
    @NameInMap("nodepool_type")
    public String nodepoolType;

    public static ListNodePoolComponentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodePoolComponentsRequest self = new ListNodePoolComponentsRequest();
        return TeaModel.build(map, self);
    }

    public ListNodePoolComponentsRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ListNodePoolComponentsRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }
    public String getImageType() {
        return this.imageType;
    }

    public ListNodePoolComponentsRequest setInstanceTypes(java.util.List<String> instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public java.util.List<String> getInstanceTypes() {
        return this.instanceTypes;
    }

    public ListNodePoolComponentsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNodePoolComponentsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNodePoolComponentsRequest setNodepoolId(String nodepoolId) {
        this.nodepoolId = nodepoolId;
        return this;
    }
    public String getNodepoolId() {
        return this.nodepoolId;
    }

    public ListNodePoolComponentsRequest setNodepoolType(String nodepoolType) {
        this.nodepoolType = nodepoolType;
        return this;
    }
    public String getNodepoolType() {
        return this.nodepoolType;
    }

}
