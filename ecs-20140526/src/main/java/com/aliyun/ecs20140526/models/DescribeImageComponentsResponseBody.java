// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImageComponentsResponseBody extends TeaModel {
    // Details about the image components.
    @NameInMap("ImageComponent")
    public DescribeImageComponentsResponseBodyImageComponent imageComponent;

    // The maximum number of entries returned per page.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The query token returned in this call. For information about how to use this return value, see the "Description" section in this topic.
    @NameInMap("NextToken")
    public String nextToken;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of image components returned.
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeImageComponentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageComponentsResponseBody self = new DescribeImageComponentsResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeImageComponentsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeImageComponentsResponseBodyImageComponentImageComponentSetTagsTag extends TeaModel {
        // The tag key of the image component.
        @NameInMap("TagKey")
        public String tagKey;

        // The tag value of the image component.
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeImageComponentsResponseBodyImageComponentImageComponentSetTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageComponentsResponseBodyImageComponentImageComponentSetTagsTag self = new DescribeImageComponentsResponseBodyImageComponentImageComponentSetTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeImageComponentsResponseBodyImageComponentImageComponentSetTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeImageComponentsResponseBodyImageComponentImageComponentSetTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
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
        // The type of the image component.
        @NameInMap("ComponentType")
        public String componentType;

        // The content of the image component.
        @NameInMap("Content")
        public String content;

        // The time when the image component was created.
        @NameInMap("CreationTime")
        public String creationTime;

        // The description of the image component.
        @NameInMap("Description")
        public String description;

        // The ID of the image component.
        @NameInMap("ImageComponentId")
        public String imageComponentId;

        // The name of the image component.
        @NameInMap("Name")
        public String name;

        // The type of the image component. Valid values:
        // 
        // *   SELF: the custom component that you created.
        // *   ALIYUN: the system component provided by Alibaba Cloud.
        @NameInMap("Owner")
        public String owner;

        // The ID of the resource group.
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        // The operating system type supported by the image component.
        @NameInMap("SystemType")
        public String systemType;

        // The tags of the image component.
        @NameInMap("Tags")
        public DescribeImageComponentsResponseBodyImageComponentImageComponentSetTags tags;

        public static DescribeImageComponentsResponseBodyImageComponentImageComponentSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageComponentsResponseBodyImageComponentImageComponentSet self = new DescribeImageComponentsResponseBodyImageComponentImageComponentSet();
            return TeaModel.build(map, self);
        }

        public DescribeImageComponentsResponseBodyImageComponentImageComponentSet setComponentType(String componentType) {
            this.componentType = componentType;
            return this;
        }
        public String getComponentType() {
            return this.componentType;
        }

        public DescribeImageComponentsResponseBodyImageComponentImageComponentSet setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
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

        public DescribeImageComponentsResponseBodyImageComponentImageComponentSet setImageComponentId(String imageComponentId) {
            this.imageComponentId = imageComponentId;
            return this;
        }
        public String getImageComponentId() {
            return this.imageComponentId;
        }

        public DescribeImageComponentsResponseBodyImageComponentImageComponentSet setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeImageComponentsResponseBodyImageComponentImageComponentSet setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public DescribeImageComponentsResponseBodyImageComponentImageComponentSet setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeImageComponentsResponseBodyImageComponentImageComponentSet setSystemType(String systemType) {
            this.systemType = systemType;
            return this;
        }
        public String getSystemType() {
            return this.systemType;
        }

        public DescribeImageComponentsResponseBodyImageComponentImageComponentSet setTags(DescribeImageComponentsResponseBodyImageComponentImageComponentSetTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeImageComponentsResponseBodyImageComponentImageComponentSetTags getTags() {
            return this.tags;
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
