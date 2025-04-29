// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribePortRangeListsResponseBody extends TeaModel {
    /**
     * <p>A pagination token. If the return value is empty, no more data is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Details of the port lists.</p>
     */
    @NameInMap("PortRangeLists")
    public java.util.List<DescribePortRangeListsResponseBodyPortRangeLists> portRangeLists;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6040AD98-11C3-5F78-9346-FCA8E9D8960F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePortRangeListsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePortRangeListsResponseBody self = new DescribePortRangeListsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePortRangeListsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribePortRangeListsResponseBody setPortRangeLists(java.util.List<DescribePortRangeListsResponseBodyPortRangeLists> portRangeLists) {
        this.portRangeLists = portRangeLists;
        return this;
    }
    public java.util.List<DescribePortRangeListsResponseBodyPortRangeLists> getPortRangeLists() {
        return this.portRangeLists;
    }

    public DescribePortRangeListsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePortRangeListsResponseBodyPortRangeListsTags extends TeaModel {
        /**
         * <p>The key of tag N.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of tag N.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribePortRangeListsResponseBodyPortRangeListsTags build(java.util.Map<String, ?> map) throws Exception {
            DescribePortRangeListsResponseBodyPortRangeListsTags self = new DescribePortRangeListsResponseBodyPortRangeListsTags();
            return TeaModel.build(map, self);
        }

        public DescribePortRangeListsResponseBodyPortRangeListsTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribePortRangeListsResponseBodyPortRangeListsTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribePortRangeListsResponseBodyPortRangeLists extends TeaModel {
        /**
         * <p>The number of associated resources.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AssociationCount")
        public Integer associationCount;

        /**
         * <p>The time when the port list was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-04T07:11Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the port list.</p>
         * 
         * <strong>example:</strong>
         * <p>This is description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The maximum number of entries in the port list.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MaxEntries")
        public Integer maxEntries;

        /**
         * <p>The ID of the port list.</p>
         * 
         * <strong>example:</strong>
         * <p>prl-2ze9743****</p>
         */
        @NameInMap("PortRangeListId")
        public String portRangeListId;

        /**
         * <p>The name of the port list.</p>
         * 
         * <strong>example:</strong>
         * <p>PortRangeListNameSample</p>
         */
        @NameInMap("PortRangeListName")
        public String portRangeListName;

        /**
         * <p>The ID of the resource group to which to assign the port list.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-2zeg82g****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The tags of the port list.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribePortRangeListsResponseBodyPortRangeListsTags> tags;

        public static DescribePortRangeListsResponseBodyPortRangeLists build(java.util.Map<String, ?> map) throws Exception {
            DescribePortRangeListsResponseBodyPortRangeLists self = new DescribePortRangeListsResponseBodyPortRangeLists();
            return TeaModel.build(map, self);
        }

        public DescribePortRangeListsResponseBodyPortRangeLists setAssociationCount(Integer associationCount) {
            this.associationCount = associationCount;
            return this;
        }
        public Integer getAssociationCount() {
            return this.associationCount;
        }

        public DescribePortRangeListsResponseBodyPortRangeLists setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribePortRangeListsResponseBodyPortRangeLists setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePortRangeListsResponseBodyPortRangeLists setMaxEntries(Integer maxEntries) {
            this.maxEntries = maxEntries;
            return this;
        }
        public Integer getMaxEntries() {
            return this.maxEntries;
        }

        public DescribePortRangeListsResponseBodyPortRangeLists setPortRangeListId(String portRangeListId) {
            this.portRangeListId = portRangeListId;
            return this;
        }
        public String getPortRangeListId() {
            return this.portRangeListId;
        }

        public DescribePortRangeListsResponseBodyPortRangeLists setPortRangeListName(String portRangeListName) {
            this.portRangeListName = portRangeListName;
            return this;
        }
        public String getPortRangeListName() {
            return this.portRangeListName;
        }

        public DescribePortRangeListsResponseBodyPortRangeLists setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribePortRangeListsResponseBodyPortRangeLists setTags(java.util.List<DescribePortRangeListsResponseBodyPortRangeListsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribePortRangeListsResponseBodyPortRangeListsTags> getTags() {
            return this.tags;
        }

    }

}
