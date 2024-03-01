// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePrefixListsResponseBody extends TeaModel {
    @NameInMap("PrefixList")
    public java.util.List<DescribePrefixListsResponseBodyPrefixList> prefixList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePrefixListsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePrefixListsResponseBody self = new DescribePrefixListsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePrefixListsResponseBody setPrefixList(java.util.List<DescribePrefixListsResponseBodyPrefixList> prefixList) {
        this.prefixList = prefixList;
        return this;
    }
    public java.util.List<DescribePrefixListsResponseBodyPrefixList> getPrefixList() {
        return this.prefixList;
    }

    public DescribePrefixListsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePrefixListsResponseBodyPrefixList extends TeaModel {
        @NameInMap("AddressFamily")
        public String addressFamily;

        @NameInMap("AssociationCount")
        public Integer associationCount;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("MaxEntries")
        public Integer maxEntries;

        @NameInMap("PrefixListId")
        public String prefixListId;

        @NameInMap("PrefixListName")
        public String prefixListName;

        public static DescribePrefixListsResponseBodyPrefixList build(java.util.Map<String, ?> map) throws Exception {
            DescribePrefixListsResponseBodyPrefixList self = new DescribePrefixListsResponseBodyPrefixList();
            return TeaModel.build(map, self);
        }

        public DescribePrefixListsResponseBodyPrefixList setAddressFamily(String addressFamily) {
            this.addressFamily = addressFamily;
            return this;
        }
        public String getAddressFamily() {
            return this.addressFamily;
        }

        public DescribePrefixListsResponseBodyPrefixList setAssociationCount(Integer associationCount) {
            this.associationCount = associationCount;
            return this;
        }
        public Integer getAssociationCount() {
            return this.associationCount;
        }

        public DescribePrefixListsResponseBodyPrefixList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribePrefixListsResponseBodyPrefixList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePrefixListsResponseBodyPrefixList setMaxEntries(Integer maxEntries) {
            this.maxEntries = maxEntries;
            return this;
        }
        public Integer getMaxEntries() {
            return this.maxEntries;
        }

        public DescribePrefixListsResponseBodyPrefixList setPrefixListId(String prefixListId) {
            this.prefixListId = prefixListId;
            return this;
        }
        public String getPrefixListId() {
            return this.prefixListId;
        }

        public DescribePrefixListsResponseBodyPrefixList setPrefixListName(String prefixListName) {
            this.prefixListName = prefixListName;
            return this;
        }
        public String getPrefixListName() {
            return this.prefixListName;
        }

    }

}
