// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImageComponentsResponse extends TeaModel {
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

    @NameInMap("ImageComponent")
    @Validation(required = true)
    public DescribeImageComponentsResponseImageComponent imageComponent;

    public static DescribeImageComponentsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageComponentsResponse self = new DescribeImageComponentsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageComponentsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageComponentsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeImageComponentsResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeImageComponentsResponse setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeImageComponentsResponse setImageComponent(DescribeImageComponentsResponseImageComponent imageComponent) {
        this.imageComponent = imageComponent;
        return this;
    }
    public DescribeImageComponentsResponseImageComponent getImageComponent() {
        return this.imageComponent;
    }

    public static class DescribeImageComponentsResponseImageComponentImageComponentSetTagsTag extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        public static DescribeImageComponentsResponseImageComponentImageComponentSetTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageComponentsResponseImageComponentImageComponentSetTagsTag self = new DescribeImageComponentsResponseImageComponentImageComponentSetTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeImageComponentsResponseImageComponentImageComponentSetTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeImageComponentsResponseImageComponentImageComponentSetTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeImageComponentsResponseImageComponentImageComponentSetTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeImageComponentsResponseImageComponentImageComponentSetTagsTag> tag;

        public static DescribeImageComponentsResponseImageComponentImageComponentSetTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageComponentsResponseImageComponentImageComponentSetTags self = new DescribeImageComponentsResponseImageComponentImageComponentSetTags();
            return TeaModel.build(map, self);
        }

        public DescribeImageComponentsResponseImageComponentImageComponentSetTags setTag(java.util.List<DescribeImageComponentsResponseImageComponentImageComponentSetTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeImageComponentsResponseImageComponentImageComponentSetTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeImageComponentsResponseImageComponentImageComponentSet extends TeaModel {
        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ImageComponentId")
        @Validation(required = true)
        public String imageComponentId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("SystemType")
        @Validation(required = true)
        public String systemType;

        @NameInMap("ComponentType")
        @Validation(required = true)
        public String componentType;

        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("Tags")
        @Validation(required = true)
        public DescribeImageComponentsResponseImageComponentImageComponentSetTags tags;

        public static DescribeImageComponentsResponseImageComponentImageComponentSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageComponentsResponseImageComponentImageComponentSet self = new DescribeImageComponentsResponseImageComponentImageComponentSet();
            return TeaModel.build(map, self);
        }

        public DescribeImageComponentsResponseImageComponentImageComponentSet setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeImageComponentsResponseImageComponentImageComponentSet setImageComponentId(String imageComponentId) {
            this.imageComponentId = imageComponentId;
            return this;
        }
        public String getImageComponentId() {
            return this.imageComponentId;
        }

        public DescribeImageComponentsResponseImageComponentImageComponentSet setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeImageComponentsResponseImageComponentImageComponentSet setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeImageComponentsResponseImageComponentImageComponentSet setSystemType(String systemType) {
            this.systemType = systemType;
            return this;
        }
        public String getSystemType() {
            return this.systemType;
        }

        public DescribeImageComponentsResponseImageComponentImageComponentSet setComponentType(String componentType) {
            this.componentType = componentType;
            return this;
        }
        public String getComponentType() {
            return this.componentType;
        }

        public DescribeImageComponentsResponseImageComponentImageComponentSet setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeImageComponentsResponseImageComponentImageComponentSet setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeImageComponentsResponseImageComponentImageComponentSet setTags(DescribeImageComponentsResponseImageComponentImageComponentSetTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeImageComponentsResponseImageComponentImageComponentSetTags getTags() {
            return this.tags;
        }

    }

    public static class DescribeImageComponentsResponseImageComponent extends TeaModel {
        @NameInMap("ImageComponentSet")
        @Validation(required = true)
        public java.util.List<DescribeImageComponentsResponseImageComponentImageComponentSet> imageComponentSet;

        public static DescribeImageComponentsResponseImageComponent build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageComponentsResponseImageComponent self = new DescribeImageComponentsResponseImageComponent();
            return TeaModel.build(map, self);
        }

        public DescribeImageComponentsResponseImageComponent setImageComponentSet(java.util.List<DescribeImageComponentsResponseImageComponentImageComponentSet> imageComponentSet) {
            this.imageComponentSet = imageComponentSet;
            return this;
        }
        public java.util.List<DescribeImageComponentsResponseImageComponentImageComponentSet> getImageComponentSet() {
            return this.imageComponentSet;
        }

    }

}
