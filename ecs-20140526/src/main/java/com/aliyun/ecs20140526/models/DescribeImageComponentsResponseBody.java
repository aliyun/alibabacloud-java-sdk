// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImageComponentsResponseBody extends TeaModel {
    /**
     * <p>Details about the image components.</p>
     */
    @NameInMap("ImageComponent")
    public DescribeImageComponentsResponseBodyImageComponent imageComponent;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. For information about how to use the returned value, see the "Usage notes" section of this topic.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of image components returned.</p>
     */
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
        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag.</p>
         */
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
        /**
         * <p>The type of the image component.</p>
         */
        @NameInMap("ComponentType")
        public String componentType;

        /**
         * <p>The content of the image component.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The time when the image component was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the image component.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the image component.</p>
         */
        @NameInMap("ImageComponentId")
        public String imageComponentId;

        /**
         * <p>The name of the image component.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the image component. Valid values:</p>
         * <br>
         * <p>*   SELF: the custom component that you created.</p>
         * <p>*   ALIYUN: the system component provided by Alibaba Cloud.</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The ID of the resource group to which the image component belongs.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The type of the operating system supported by the image component.</p>
         */
        @NameInMap("SystemType")
        public String systemType;

        /**
         * <p>The tags of the image component.</p>
         */
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
