// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribePrefixListsResponseBody extends TeaModel {
    /**
     * <p>The query token returned in this call. If the return value is empty, no more data is returned.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Details about the prefix lists.</p>
     */
    @NameInMap("PrefixLists")
    public DescribePrefixListsResponseBodyPrefixLists prefixLists;

    /**
     * <p>The ID of the request.</p>
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

    public static class DescribePrefixListsResponseBodyPrefixListsPrefixList extends TeaModel {
        /**
         * <p>The IP address family of the prefix list. Valid values:</p>
         * <br>
         * <p>*   IPv4</p>
         * <p>*   IPv6</p>
         */
        @NameInMap("AddressFamily")
        public String addressFamily;

        /**
         * <p>The number of associated resources.</p>
         */
        @NameInMap("AssociationCount")
        public Integer associationCount;

        /**
         * <p>The time when the prefix list was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the prefix list.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The maximum number of entries that the prefix list can contain.</p>
         */
        @NameInMap("MaxEntries")
        public Integer maxEntries;

        /**
         * <p>The ID of the prefix list.</p>
         */
        @NameInMap("PrefixListId")
        public String prefixListId;

        /**
         * <p>The name of the prefix list.</p>
         */
        @NameInMap("PrefixListName")
        public String prefixListName;

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
