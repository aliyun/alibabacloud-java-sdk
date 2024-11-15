// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImageComponentsResponseBody extends TeaModel {
    /**
     * <p>The information about the image components.</p>
     */
    @NameInMap("ImageComponent")
    public DescribeImageComponentsResponseBodyImageComponent imageComponent;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. For information about how to use the returned value, see the &quot;Usage notes&quot; section of this topic.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of image components returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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

    public static class DescribeImageComponentsResponseBodyImageComponentImageComponentSetParametersParameter extends TeaModel {
        /**
         * <p>The default value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the parameter.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>String</li>
         * <li>Number</li>
         * <li>Boolean</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeImageComponentsResponseBodyImageComponentImageComponentSetParametersParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageComponentsResponseBodyImageComponentImageComponentSetParametersParameter self = new DescribeImageComponentsResponseBodyImageComponentImageComponentSetParametersParameter();
            return TeaModel.build(map, self);
        }

        public DescribeImageComponentsResponseBodyImageComponentImageComponentSetParametersParameter setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeImageComponentsResponseBodyImageComponentImageComponentSetParametersParameter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeImageComponentsResponseBodyImageComponentImageComponentSetParametersParameter setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeImageComponentsResponseBodyImageComponentImageComponentSetParameters extends TeaModel {
        @NameInMap("Parameter")
        public java.util.List<DescribeImageComponentsResponseBodyImageComponentImageComponentSetParametersParameter> parameter;

        public static DescribeImageComponentsResponseBodyImageComponentImageComponentSetParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageComponentsResponseBodyImageComponentImageComponentSetParameters self = new DescribeImageComponentsResponseBodyImageComponentImageComponentSetParameters();
            return TeaModel.build(map, self);
        }

        public DescribeImageComponentsResponseBodyImageComponentImageComponentSetParameters setParameter(java.util.List<DescribeImageComponentsResponseBodyImageComponentImageComponentSetParametersParameter> parameter) {
            this.parameter = parameter;
            return this;
        }
        public java.util.List<DescribeImageComponentsResponseBodyImageComponentImageComponentSetParametersParameter> getParameter() {
            return this.parameter;
        }

    }

    public static class DescribeImageComponentsResponseBodyImageComponentImageComponentSetTagsTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
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
         * 
         * <strong>example:</strong>
         * <p>Build</p>
         */
        @NameInMap("ComponentType")
        public String componentType;

        /**
         * <p>The version number of the image component.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ComponentVersion")
        public String componentVersion;

        /**
         * <p>The content of the image component.</p>
         * 
         * <strong>example:</strong>
         * <p>RESTART</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The time when the image component was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-24T06:00:00Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the image component.</p>
         * 
         * <strong>example:</strong>
         * <p>This is description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the image component.</p>
         * 
         * <strong>example:</strong>
         * <p>ic-bp67acfmxazb4p****</p>
         */
        @NameInMap("ImageComponentId")
        public String imageComponentId;

        /**
         * <p>The name of the image component.</p>
         * 
         * <strong>example:</strong>
         * <p>testComponent</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the image component. Valid values:</p>
         * <ul>
         * <li>SELF: the custom component that you created.</li>
         * <li>ALIYUN: the system component provided by Alibaba Cloud.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SELF</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The parameters contained in the image component.</p>
         */
        @NameInMap("Parameters")
        public DescribeImageComponentsResponseBodyImageComponentImageComponentSetParameters parameters;

        /**
         * <p>The ID of the resource group to which the image component belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4p****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The type of the operating system supported by the image component.</p>
         * 
         * <strong>example:</strong>
         * <p>Linux</p>
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

        public DescribeImageComponentsResponseBodyImageComponentImageComponentSet setComponentVersion(String componentVersion) {
            this.componentVersion = componentVersion;
            return this;
        }
        public String getComponentVersion() {
            return this.componentVersion;
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

        public DescribeImageComponentsResponseBodyImageComponentImageComponentSet setParameters(DescribeImageComponentsResponseBodyImageComponentImageComponentSetParameters parameters) {
            this.parameters = parameters;
            return this;
        }
        public DescribeImageComponentsResponseBodyImageComponentImageComponentSetParameters getParameters() {
            return this.parameters;
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
