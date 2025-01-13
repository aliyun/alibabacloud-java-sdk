// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImagePipelineExecutionsRequest extends TeaModel {
    /**
     * <p>The ID of the image creation task.</p>
     * 
     * <strong>example:</strong>
     * <p>exec-5fb8facb8ed7427c****</p>
     */
    @NameInMap("ExecutionId")
    public String executionId;

    /**
     * <p>The ID of the image template.</p>
     * 
     * <strong>example:</strong>
     * <p>ip-2ze5tsl5bp6nf2b3****</p>
     */
    @NameInMap("ImagePipelineId")
    public String imagePipelineId;

    /**
     * <p>The number of entries per page. Valid values: 1 to 500.</p>
     * <p>Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of <code>NextToken</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The status of the image creation task. You can specify multiple values. Separate the values with commas (,). Example: <code>BUILDING,DISTRIBUTING</code>. Valid values:</p>
     * <ul>
     * <li>PREPARING: Resources, such as the intermediate instance, are being created.</li>
     * <li>REPAIRING: The source image is being repaired.</li>
     * <li>BUILDING: The user-defined commands are being run and an image is being created.</li>
     * <li>TESTING: The user-defined test commands are being run.</li>
     * <li>DISTRIBUTING: The created image is being copied and shared.</li>
     * <li>RELEASING: The temporary resources generated during the image creation process are being released.</li>
     * <li>SUCCESS: The image creation task is completed.</li>
     * <li>PARTITION_SUCCESS: The image creation task is partially completed. The image is created, but exceptions may occur when the image was copied or shared or when temporary resources were released.</li>
     * <li>FAILED: The image creation task fails.</li>
     * <li>TEST_FAILED: The image is created, but the test fails.</li>
     * <li>CANCELLING: The image creation task is being canceled.</li>
     * <li>CANCELLED: The image creation task is canceled.</li>
     * </ul>
     * <blockquote>
     * <p> If you leave this parameter empty, all image creation tasks are queried regardless of task status.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>BUILDING</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags of the image creation task.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeImagePipelineExecutionsRequestTag> tag;

    public static DescribeImagePipelineExecutionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImagePipelineExecutionsRequest self = new DescribeImagePipelineExecutionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImagePipelineExecutionsRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

    public DescribeImagePipelineExecutionsRequest setImagePipelineId(String imagePipelineId) {
        this.imagePipelineId = imagePipelineId;
        return this;
    }
    public String getImagePipelineId() {
        return this.imagePipelineId;
    }

    public DescribeImagePipelineExecutionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeImagePipelineExecutionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeImagePipelineExecutionsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeImagePipelineExecutionsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeImagePipelineExecutionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeImagePipelineExecutionsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeImagePipelineExecutionsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeImagePipelineExecutionsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeImagePipelineExecutionsRequest setTag(java.util.List<DescribeImagePipelineExecutionsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeImagePipelineExecutionsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeImagePipelineExecutionsRequestTag extends TeaModel {
        /**
         * <p>The key of tag N of the image creation task. Valid values of N: 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the image creation task. Valid values of N: 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeImagePipelineExecutionsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelineExecutionsRequestTag self = new DescribeImagePipelineExecutionsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelineExecutionsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeImagePipelineExecutionsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
