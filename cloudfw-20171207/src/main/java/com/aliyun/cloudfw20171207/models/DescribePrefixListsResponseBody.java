// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePrefixListsResponseBody extends TeaModel {
    /**
     * <p>Details about the prefix lists.</p>
     */
    @NameInMap("PrefixList")
    public java.util.List<DescribePrefixListsResponseBodyPrefixList> prefixList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>67FD76C2-C493-5815-8107-643FD7AB77C7</p>
     */
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
         * <p>2</p>
         */
        @NameInMap("AssociationCount")
        public Integer associationCount;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-16T08:31:06Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP_14900-14911</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The maximum number of entries in the prefix list.</p>
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
         * <p>pl-uf64nco3ujjqchx6aaji</p>
         */
        @NameInMap("PrefixListId")
        public String prefixListId;

        /**
         * <p>The name of the prefix list.</p>
         * 
         * <strong>example:</strong>
         * <p>participant-name</p>
         */
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
