// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImagePipelineExecutionsResponseBody extends TeaModel {
    /**
     * <p>The details of the image creation task.</p>
     */
    @NameInMap("ImagePipelineExecution")
    public DescribeImagePipelineExecutionsResponseBodyImagePipelineExecution imagePipelineExecution;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists. For information about how to use the returned value, see the "Usage notes" section in this topic.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned image components.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeImagePipelineExecutionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImagePipelineExecutionsResponseBody self = new DescribeImagePipelineExecutionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImagePipelineExecutionsResponseBody setImagePipelineExecution(DescribeImagePipelineExecutionsResponseBodyImagePipelineExecution imagePipelineExecution) {
        this.imagePipelineExecution = imagePipelineExecution;
        return this;
    }
    public DescribeImagePipelineExecutionsResponseBodyImagePipelineExecution getImagePipelineExecution() {
        return this.imagePipelineExecution;
    }

    public DescribeImagePipelineExecutionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeImagePipelineExecutionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeImagePipelineExecutionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImagePipelineExecutionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeImagePipelineExecutionsResponseBodyImagePipelineExecutionImagePipelineExecutionSetTagsTag extends TeaModel {
        /**
         * <p>> This parameter is unavailable.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>> This parameter is unavailable.</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeImagePipelineExecutionsResponseBodyImagePipelineExecutionImagePipelineExecutionSetTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelineExecutionsResponseBodyImagePipelineExecutionImagePipelineExecutionSetTagsTag self = new DescribeImagePipelineExecutionsResponseBodyImagePipelineExecutionImagePipelineExecutionSetTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelineExecutionsResponseBodyImagePipelineExecutionImagePipelineExecutionSetTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeImagePipelineExecutionsResponseBodyImagePipelineExecutionImagePipelineExecutionSetTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeImagePipelineExecutionsResponseBodyImagePipelineExecutionImagePipelineExecutionSetTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeImagePipelineExecutionsResponseBodyImagePipelineExecutionImagePipelineExecutionSetTagsTag> tag;

        public static DescribeImagePipelineExecutionsResponseBodyImagePipelineExecutionImagePipelineExecutionSetTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelineExecutionsResponseBodyImagePipelineExecutionImagePipelineExecutionSetTags self = new DescribeImagePipelineExecutionsResponseBodyImagePipelineExecutionImagePipelineExecutionSetTags();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelineExecutionsResponseBodyImagePipelineExecutionImagePipelineExecutionSetTags setTag(java.util.List<DescribeImagePipelineExecutionsResponseBodyImagePipelineExecutionImagePipelineExecutionSetTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeImagePipelineExecutionsResponseBodyImagePipelineExecutionImagePipelineExecutionSetTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeImagePipelineExecutionsResponseBodyImagePipelineExecutionImagePipelineExecutionSet extends TeaModel {
        /**
         * <p>The time when the image creation task was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the image creation task.</p>
         */
        @NameInMap("ExecutionId")
        public String executionId;

        /**
         * <p>The ID of the image.</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The ID of the image template.</p>
         */
        @NameInMap("ImagePipelineId")
        public String imagePipelineId;

        /**
         * <p>The data that is returned.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The last modification time of the image creation task.</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The status of the image creation task. Valid values:</p>
         * <br>
         * <p>*   BUILDING</p>
         * <p>*   DISTRIBUTING</p>
         * <p>*   RELEASING</p>
         * <p>*   SUCCESS</p>
         * <p>*   FAILED</p>
         * <p>*   CANCELLING</p>
         * <p>*   CANCELED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>> This parameter is unavailable.</p>
         */
        @NameInMap("Tags")
        public DescribeImagePipelineExecutionsResponseBodyImagePipelineExecutionImagePipelineExecutionSetTags tags;

        public static DescribeImagePipelineExecutionsResponseBodyImagePipelineExecutionImagePipelineExecutionSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelineExecutionsResponseBodyImagePipelineExecutionImagePipelineExecutionSet self = new DescribeImagePipelineExecutionsResponseBodyImagePipelineExecutionImagePipelineExecutionSet();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelineExecutionsResponseBodyImagePipelineExecutionImagePipelineExecutionSet setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeImagePipelineExecutionsResponseBodyImagePipelineExecutionImagePipelineExecutionSet setExecutionId(String executionId) {
            this.executionId = executionId;
            return this;
        }
        public String getExecutionId() {
            return this.executionId;
        }

        public DescribeImagePipelineExecutionsResponseBodyImagePipelineExecutionImagePipelineExecutionSet setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeImagePipelineExecutionsResponseBodyImagePipelineExecutionImagePipelineExecutionSet setImagePipelineId(String imagePipelineId) {
            this.imagePipelineId = imagePipelineId;
            return this;
        }
        public String getImagePipelineId() {
            return this.imagePipelineId;
        }

        public DescribeImagePipelineExecutionsResponseBodyImagePipelineExecutionImagePipelineExecutionSet setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeImagePipelineExecutionsResponseBodyImagePipelineExecutionImagePipelineExecutionSet setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeImagePipelineExecutionsResponseBodyImagePipelineExecutionImagePipelineExecutionSet setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeImagePipelineExecutionsResponseBodyImagePipelineExecutionImagePipelineExecutionSet setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeImagePipelineExecutionsResponseBodyImagePipelineExecutionImagePipelineExecutionSet setTags(DescribeImagePipelineExecutionsResponseBodyImagePipelineExecutionImagePipelineExecutionSetTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeImagePipelineExecutionsResponseBodyImagePipelineExecutionImagePipelineExecutionSetTags getTags() {
            return this.tags;
        }

    }

    public static class DescribeImagePipelineExecutionsResponseBodyImagePipelineExecution extends TeaModel {
        @NameInMap("ImagePipelineExecutionSet")
        public java.util.List<DescribeImagePipelineExecutionsResponseBodyImagePipelineExecutionImagePipelineExecutionSet> imagePipelineExecutionSet;

        public static DescribeImagePipelineExecutionsResponseBodyImagePipelineExecution build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelineExecutionsResponseBodyImagePipelineExecution self = new DescribeImagePipelineExecutionsResponseBodyImagePipelineExecution();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelineExecutionsResponseBodyImagePipelineExecution setImagePipelineExecutionSet(java.util.List<DescribeImagePipelineExecutionsResponseBodyImagePipelineExecutionImagePipelineExecutionSet> imagePipelineExecutionSet) {
            this.imagePipelineExecutionSet = imagePipelineExecutionSet;
            return this;
        }
        public java.util.List<DescribeImagePipelineExecutionsResponseBodyImagePipelineExecutionImagePipelineExecutionSet> getImagePipelineExecutionSet() {
            return this.imagePipelineExecutionSet;
        }

    }

}
