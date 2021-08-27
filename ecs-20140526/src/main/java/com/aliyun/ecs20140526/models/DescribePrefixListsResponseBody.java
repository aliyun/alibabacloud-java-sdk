// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribePrefixListsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PrefixLists")
    public DescribePrefixListsResponseBodyPrefixLists prefixLists;

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

    public DescribePrefixListsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePrefixListsResponseBody setPrefixLists(DescribePrefixListsResponseBodyPrefixLists prefixLists) {
        this.prefixLists = prefixLists;
        return this;
    }
    public DescribePrefixListsResponseBodyPrefixLists getPrefixLists() {
        return this.prefixLists;
    }

    public static class DescribePrefixListsResponseBodyPrefixListsPrefixList extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("AssociationCount")
        public Integer associationCount;

        @NameInMap("MaxEntries")
        public Integer maxEntries;

        @NameInMap("Description")
        public String description;

        @NameInMap("AddressFamily")
        public String addressFamily;

        @NameInMap("PrefixListName")
        public String prefixListName;

        @NameInMap("PrefixListId")
        public String prefixListId;

        public static DescribePrefixListsResponseBodyPrefixListsPrefixList build(java.util.Map<String, ?> map) throws Exception {
            DescribePrefixListsResponseBodyPrefixListsPrefixList self = new DescribePrefixListsResponseBodyPrefixListsPrefixList();
            return TeaModel.build(map, self);
        }

        public DescribePrefixListsResponseBodyPrefixListsPrefixList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribePrefixListsResponseBodyPrefixListsPrefixList setAssociationCount(Integer associationCount) {
            this.associationCount = associationCount;
            return this;
        }
        public Integer getAssociationCount() {
            return this.associationCount;
        }

        public DescribePrefixListsResponseBodyPrefixListsPrefixList setMaxEntries(Integer maxEntries) {
            this.maxEntries = maxEntries;
            return this;
        }
        public Integer getMaxEntries() {
            return this.maxEntries;
        }

        public DescribePrefixListsResponseBodyPrefixListsPrefixList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePrefixListsResponseBodyPrefixListsPrefixList setAddressFamily(String addressFamily) {
            this.addressFamily = addressFamily;
            return this;
        }
        public String getAddressFamily() {
            return this.addressFamily;
        }

        public DescribePrefixListsResponseBodyPrefixListsPrefixList setPrefixListName(String prefixListName) {
            this.prefixListName = prefixListName;
            return this;
        }
        public String getPrefixListName() {
            return this.prefixListName;
        }

        public DescribePrefixListsResponseBodyPrefixListsPrefixList setPrefixListId(String prefixListId) {
            this.prefixListId = prefixListId;
            return this;
        }
        public String getPrefixListId() {
            return this.prefixListId;
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
