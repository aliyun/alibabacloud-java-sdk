// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImageComponentsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ImageComponent")
    public DescribeImageComponentsResponseBodyImageComponent imageComponent;

    @NameInMap("MaxResults")
    public Integer maxResults;

    public static DescribeImageComponentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageComponentsResponseBody self = new DescribeImageComponentsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageComponentsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeImageComponentsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeImageComponentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageComponentsResponseBody setImageComponent(DescribeImageComponentsResponseBodyImageComponent imageComponent) {
        this.imageComponent = imageComponent;
        return this;
    }
    public DescribeImageComponentsResponseBodyImageComponent getImageComponent() {
        return this.imageComponent;
    }

    public DescribeImageComponentsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public static class DescribeImageComponentsResponseBodyImageComponentImageComponentSetTagsTag extends TeaModel {
        @NameInMap("TagValue")
        public String tagValue;

        @NameInMap("TagKey")
        public String tagKey;

        public static DescribeImageComponentsResponseBodyImageComponentImageComponentSetTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageComponentsResponseBodyImageComponentImageComponentSetTagsTag self = new DescribeImageComponentsResponseBodyImageComponentImageComponentSetTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeImageComponentsResponseBodyImageComponentImageComponentSetTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public DescribeImageComponentsResponseBodyImageComponentImageComponentSetTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

    }

    public static class DescribeImageComponentsResponseBodyImageComponentImageComponentSetTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeImageComponentsResponseBodyImageComponentImageComponentSetTagsTag> tag;

        public static DescribeImageComponentsResponseBodyImageComponentImageComponentSetTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageComponentsResponseBodyImageComponentImageComponentSetTags self = new DescribeImageComponentsResponseBodyImageComponentImageComponentSetTags();
            return TeaModel.build(map, self);
        }

        public DescribeImageComponentsResponseBodyImageComponentImageComponentSetTags setTag(java.util.List<DescribeImageComponentsResponseBodyImageComponentImageComponentSetTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeImageComponentsResponseBodyImageComponentImageComponentSetTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeImageComponentsResponseBodyImageComponentImageComponentSet extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("SystemType")
        public String systemType;

        @NameInMap("ImageComponentId")
        public String imageComponentId;

        @NameInMap("ComponentType")
        public String componentType;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Tags")
        public DescribeImageComponentsResponseBodyImageComponentImageComponentSetTags tags;

        @NameInMap("Name")
        public String name;

        @NameInMap("Content")
        public String content;

        public static DescribeImageComponentsResponseBodyImageComponentImageComponentSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageComponentsResponseBodyImageComponentImageComponentSet self = new DescribeImageComponentsResponseBodyImageComponentImageComponentSet();
            return TeaModel.build(map, self);
        }

        public DescribeImageComponentsResponseBodyImageComponentImageComponentSet setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeImageComponentsResponseBodyImageComponentImageComponentSet setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeImageComponentsResponseBodyImageComponentImageComponentSet setSystemType(String systemType) {
            this.systemType = systemType;
            return this;
        }
        public String getSystemType() {
            return this.systemType;
        }

        public DescribeImageComponentsResponseBodyImageComponentImageComponentSet setImageComponentId(String imageComponentId) {
            this.imageComponentId = imageComponentId;
            return this;
        }
        public String getImageComponentId() {
            return this.imageComponentId;
        }

        public DescribeImageComponentsResponseBodyImageComponentImageComponentSet setComponentType(String componentType) {
            this.componentType = componentType;
            return this;
        }
        public String getComponentType() {
            return this.componentType;
        }

        public DescribeImageComponentsResponseBodyImageComponentImageComponentSet setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeImageComponentsResponseBodyImageComponentImageComponentSet setTags(DescribeImageComponentsResponseBodyImageComponentImageComponentSetTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeImageComponentsResponseBodyImageComponentImageComponentSetTags getTags() {
            return this.tags;
        }

        public DescribeImageComponentsResponseBodyImageComponentImageComponentSet setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeImageComponentsResponseBodyImageComponentImageComponentSet setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class DescribeImageComponentsResponseBodyImageComponent extends TeaModel {
        @NameInMap("ImageComponentSet")
        public java.util.List<DescribeImageComponentsResponseBodyImageComponentImageComponentSet> imageComponentSet;

        public static DescribeImageComponentsResponseBodyImageComponent build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageComponentsResponseBodyImageComponent self = new DescribeImageComponentsResponseBodyImageComponent();
            return TeaModel.build(map, self);
        }

        public DescribeImageComponentsResponseBodyImageComponent setImageComponentSet(java.util.List<DescribeImageComponentsResponseBodyImageComponentImageComponentSet> imageComponentSet) {
            this.imageComponentSet = imageComponentSet;
            return this;
        }
        public java.util.List<DescribeImageComponentsResponseBodyImageComponentImageComponentSet> getImageComponentSet() {
            return this.imageComponentSet;
        }

    }

}
