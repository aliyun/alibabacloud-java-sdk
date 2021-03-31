// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImagePipelineExecutionsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("MaxResults")
    @Validation(required = true)
    public Integer maxResults;

    @NameInMap("ImagePipelineExecution")
    @Validation(required = true)
    public DescribeImagePipelineExecutionsResponseImagePipelineExecution imagePipelineExecution;

    public static DescribeImagePipelineExecutionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImagePipelineExecutionsResponse self = new DescribeImagePipelineExecutionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImagePipelineExecutionsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImagePipelineExecutionsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeImagePipelineExecutionsResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeImagePipelineExecutionsResponse setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeImagePipelineExecutionsResponse setImagePipelineExecution(DescribeImagePipelineExecutionsResponseImagePipelineExecution imagePipelineExecution) {
        this.imagePipelineExecution = imagePipelineExecution;
        return this;
    }
    public DescribeImagePipelineExecutionsResponseImagePipelineExecution getImagePipelineExecution() {
        return this.imagePipelineExecution;
    }

    public static class DescribeImagePipelineExecutionsResponseImagePipelineExecutionImagePipelineExecutionSetTagsTag extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        public static DescribeImagePipelineExecutionsResponseImagePipelineExecutionImagePipelineExecutionSetTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelineExecutionsResponseImagePipelineExecutionImagePipelineExecutionSetTagsTag self = new DescribeImagePipelineExecutionsResponseImagePipelineExecutionImagePipelineExecutionSetTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelineExecutionsResponseImagePipelineExecutionImagePipelineExecutionSetTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeImagePipelineExecutionsResponseImagePipelineExecutionImagePipelineExecutionSetTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeImagePipelineExecutionsResponseImagePipelineExecutionImagePipelineExecutionSetTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeImagePipelineExecutionsResponseImagePipelineExecutionImagePipelineExecutionSetTagsTag> tag;

        public static DescribeImagePipelineExecutionsResponseImagePipelineExecutionImagePipelineExecutionSetTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelineExecutionsResponseImagePipelineExecutionImagePipelineExecutionSetTags self = new DescribeImagePipelineExecutionsResponseImagePipelineExecutionImagePipelineExecutionSetTags();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelineExecutionsResponseImagePipelineExecutionImagePipelineExecutionSetTags setTag(java.util.List<DescribeImagePipelineExecutionsResponseImagePipelineExecutionImagePipelineExecutionSetTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeImagePipelineExecutionsResponseImagePipelineExecutionImagePipelineExecutionSetTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeImagePipelineExecutionsResponseImagePipelineExecutionImagePipelineExecutionSet extends TeaModel {
        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ModifiedTime")
        @Validation(required = true)
        public String modifiedTime;

        @NameInMap("ImageId")
        @Validation(required = true)
        public String imageId;

        @NameInMap("ImagePipelineId")
        @Validation(required = true)
        public String imagePipelineId;

        @NameInMap("ExecutionId")
        @Validation(required = true)
        public String executionId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("Tags")
        @Validation(required = true)
        public DescribeImagePipelineExecutionsResponseImagePipelineExecutionImagePipelineExecutionSetTags tags;

        public static DescribeImagePipelineExecutionsResponseImagePipelineExecutionImagePipelineExecutionSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelineExecutionsResponseImagePipelineExecutionImagePipelineExecutionSet self = new DescribeImagePipelineExecutionsResponseImagePipelineExecutionImagePipelineExecutionSet();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelineExecutionsResponseImagePipelineExecutionImagePipelineExecutionSet setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeImagePipelineExecutionsResponseImagePipelineExecutionImagePipelineExecutionSet setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeImagePipelineExecutionsResponseImagePipelineExecutionImagePipelineExecutionSet setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeImagePipelineExecutionsResponseImagePipelineExecutionImagePipelineExecutionSet setImagePipelineId(String imagePipelineId) {
            this.imagePipelineId = imagePipelineId;
            return this;
        }
        public String getImagePipelineId() {
            return this.imagePipelineId;
        }

        public DescribeImagePipelineExecutionsResponseImagePipelineExecutionImagePipelineExecutionSet setExecutionId(String executionId) {
            this.executionId = executionId;
            return this;
        }
        public String getExecutionId() {
            return this.executionId;
        }

        public DescribeImagePipelineExecutionsResponseImagePipelineExecutionImagePipelineExecutionSet setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeImagePipelineExecutionsResponseImagePipelineExecutionImagePipelineExecutionSet setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeImagePipelineExecutionsResponseImagePipelineExecutionImagePipelineExecutionSet setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeImagePipelineExecutionsResponseImagePipelineExecutionImagePipelineExecutionSet setTags(DescribeImagePipelineExecutionsResponseImagePipelineExecutionImagePipelineExecutionSetTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeImagePipelineExecutionsResponseImagePipelineExecutionImagePipelineExecutionSetTags getTags() {
            return this.tags;
        }

    }

    public static class DescribeImagePipelineExecutionsResponseImagePipelineExecution extends TeaModel {
        @NameInMap("ImagePipelineExecutionSet")
        @Validation(required = true)
        public java.util.List<DescribeImagePipelineExecutionsResponseImagePipelineExecutionImagePipelineExecutionSet> imagePipelineExecutionSet;

        public static DescribeImagePipelineExecutionsResponseImagePipelineExecution build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelineExecutionsResponseImagePipelineExecution self = new DescribeImagePipelineExecutionsResponseImagePipelineExecution();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelineExecutionsResponseImagePipelineExecution setImagePipelineExecutionSet(java.util.List<DescribeImagePipelineExecutionsResponseImagePipelineExecutionImagePipelineExecutionSet> imagePipelineExecutionSet) {
            this.imagePipelineExecutionSet = imagePipelineExecutionSet;
            return this;
        }
        public java.util.List<DescribeImagePipelineExecutionsResponseImagePipelineExecutionImagePipelineExecutionSet> getImagePipelineExecutionSet() {
            return this.imagePipelineExecutionSet;
        }

    }

}
