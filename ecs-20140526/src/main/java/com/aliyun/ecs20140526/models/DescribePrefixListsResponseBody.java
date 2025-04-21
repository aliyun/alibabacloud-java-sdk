// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribePrefixListsResponseBody extends TeaModel {
    /**
     * <p>The query token that is returned in this call. If the return value is empty, no more data is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Details about the prefix lists.</p>
     */
    @NameInMap("PrefixLists")
    public DescribePrefixListsResponseBodyPrefixLists prefixLists;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>38793DB8-A4B2-4AEC-BFD3-111234E9188D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePrefixListsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePrefixListsResponseBody self = new DescribePrefixListsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePrefixListsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribePrefixListsResponseBody setPrefixLists(DescribePrefixListsResponseBodyPrefixLists prefixLists) {
        this.prefixLists = prefixLists;
        return this;
    }
    public DescribePrefixListsResponseBodyPrefixLists getPrefixLists() {
        return this.prefixLists;
    }

    public DescribePrefixListsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePrefixListsResponseBodyPrefixListsPrefixListTagsTag extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static DescribePrefixListsResponseBodyPrefixListsPrefixListTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribePrefixListsResponseBodyPrefixListsPrefixListTagsTag self = new DescribePrefixListsResponseBodyPrefixListsPrefixListTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribePrefixListsResponseBodyPrefixListsPrefixListTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribePrefixListsResponseBodyPrefixListsPrefixListTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribePrefixListsResponseBodyPrefixListsPrefixListTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribePrefixListsResponseBodyPrefixListsPrefixListTagsTag> tag;

        public static DescribePrefixListsResponseBodyPrefixListsPrefixListTags build(java.util.Map<String, ?> map) throws Exception {
            DescribePrefixListsResponseBodyPrefixListsPrefixListTags self = new DescribePrefixListsResponseBodyPrefixListsPrefixListTags();
            return TeaModel.build(map, self);
        }

        public DescribePrefixListsResponseBodyPrefixListsPrefixListTags setTag(java.util.List<DescribePrefixListsResponseBodyPrefixListsPrefixListTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribePrefixListsResponseBodyPrefixListsPrefixListTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribePrefixListsResponseBodyPrefixListsPrefixList extends TeaModel {
        /**
         * <p>The IP address family of the prefix list. Valid values:</p>
         * <ul>
         * <li>IPv4</li>
         * <li>IPv6</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("AddressFamily")
        public String addressFamily;

        /**
         * <p>The number of associated resources.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AssociationCount")
        public Integer associationCount;

        /**
         * <p>The time when the prefix list was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-02-20T07:11Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the prefix list.</p>
         * 
         * <strong>example:</strong>
         * <p>This is description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The maximum number of entries that the prefix list can contain.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MaxEntries")
        public Integer maxEntries;

        /**
         * <p>The ID of the prefix list.</p>
         * 
         * <strong>example:</strong>
         * <p>pl-x1j1k5ykzqlixdcy****</p>
         */
        @NameInMap("PrefixListId")
        public String prefixListId;

        /**
         * <p>The name of the prefix list.</p>
         * 
         * <strong>example:</strong>
         * <p>PrefixListNameSample</p>
         */
        @NameInMap("PrefixListName")
        public String prefixListName;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Tags")
        public DescribePrefixListsResponseBodyPrefixListsPrefixListTags tags;

        public static DescribePrefixListsResponseBodyPrefixListsPrefixList build(java.util.Map<String, ?> map) throws Exception {
            DescribePrefixListsResponseBodyPrefixListsPrefixList self = new DescribePrefixListsResponseBodyPrefixListsPrefixList();
            return TeaModel.build(map, self);
        }

        public DescribePrefixListsResponseBodyPrefixListsPrefixList setAddressFamily(String addressFamily) {
            this.addressFamily = addressFamily;
            return this;
        }
        public String getAddressFamily() {
            return this.addressFamily;
        }

        public DescribePrefixListsResponseBodyPrefixListsPrefixList setAssociationCount(Integer associationCount) {
            this.associationCount = associationCount;
            return this;
        }
        public Integer getAssociationCount() {
            return this.associationCount;
        }

        public DescribePrefixListsResponseBodyPrefixListsPrefixList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribePrefixListsResponseBodyPrefixListsPrefixList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePrefixListsResponseBodyPrefixListsPrefixList setMaxEntries(Integer maxEntries) {
            this.maxEntries = maxEntries;
            return this;
        }
        public Integer getMaxEntries() {
            return this.maxEntries;
        }

        public DescribePrefixListsResponseBodyPrefixListsPrefixList setPrefixListId(String prefixListId) {
            this.prefixListId = prefixListId;
            return this;
        }
        public String getPrefixListId() {
            return this.prefixListId;
        }

        public DescribePrefixListsResponseBodyPrefixListsPrefixList setPrefixListName(String prefixListName) {
            this.prefixListName = prefixListName;
            return this;
        }
        public String getPrefixListName() {
            return this.prefixListName;
        }

        public DescribePrefixListsResponseBodyPrefixListsPrefixList setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribePrefixListsResponseBodyPrefixListsPrefixList setTags(DescribePrefixListsResponseBodyPrefixListsPrefixListTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribePrefixListsResponseBodyPrefixListsPrefixListTags getTags() {
            return this.tags;
        }

    }

    public static class DescribePrefixListsResponseBodyPrefixLists extends TeaModel {
        @NameInMap("PrefixList")
        public java.util.List<DescribePrefixListsResponseBodyPrefixListsPrefixList> prefixList;

        public static DescribePrefixListsResponseBodyPrefixLists build(java.util.Map<String, ?> map) throws Exception {
            DescribePrefixListsResponseBodyPrefixLists self = new DescribePrefixListsResponseBodyPrefixLists();
            return TeaModel.build(map, self);
        }

        public DescribePrefixListsResponseBodyPrefixLists setPrefixList(java.util.List<DescribePrefixListsResponseBodyPrefixListsPrefixList> prefixList) {
            this.prefixList = prefixList;
            return this;
        }
        public java.util.List<DescribePrefixListsResponseBodyPrefixListsPrefixList> getPrefixList() {
            return this.prefixList;
        }

    }

}
