// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribePrefixListAttributesResponseBody extends TeaModel {
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
     * <p>Details about the entries in the prefix list.</p>
     */
    @NameInMap("Entries")
    public DescribePrefixListAttributesResponseBodyEntries entries;

    /**
     * <p>The maximum number of entries in the prefix list.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>38793DB8-A4B2-4AEC-BFD3-111234E9188D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePrefixListAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePrefixListAttributesResponseBody self = new DescribePrefixListAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePrefixListAttributesResponseBody setAddressFamily(String addressFamily) {
        this.addressFamily = addressFamily;
        return this;
    }
    public String getAddressFamily() {
        return this.addressFamily;
    }

    public DescribePrefixListAttributesResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribePrefixListAttributesResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribePrefixListAttributesResponseBody setEntries(DescribePrefixListAttributesResponseBodyEntries entries) {
        this.entries = entries;
        return this;
    }
    public DescribePrefixListAttributesResponseBodyEntries getEntries() {
        return this.entries;
    }

    public DescribePrefixListAttributesResponseBody setMaxEntries(Integer maxEntries) {
        this.maxEntries = maxEntries;
        return this;
    }
    public Integer getMaxEntries() {
        return this.maxEntries;
    }

    public DescribePrefixListAttributesResponseBody setPrefixListId(String prefixListId) {
        this.prefixListId = prefixListId;
        return this;
    }
    public String getPrefixListId() {
        return this.prefixListId;
    }

    public DescribePrefixListAttributesResponseBody setPrefixListName(String prefixListName) {
        this.prefixListName = prefixListName;
        return this;
    }
    public String getPrefixListName() {
        return this.prefixListName;
    }

    public DescribePrefixListAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePrefixListAttributesResponseBodyEntriesEntry extends TeaModel {
        /**
         * <p>The CIDR block in entry N.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.0/24</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <p>The description in entry N.</p>
         * 
         * <strong>example:</strong>
         * <p>Description Sample 01</p>
         */
        @NameInMap("Description")
        public String description;

        public static DescribePrefixListAttributesResponseBodyEntriesEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribePrefixListAttributesResponseBodyEntriesEntry self = new DescribePrefixListAttributesResponseBodyEntriesEntry();
            return TeaModel.build(map, self);
        }

        public DescribePrefixListAttributesResponseBodyEntriesEntry setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public DescribePrefixListAttributesResponseBodyEntriesEntry setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class DescribePrefixListAttributesResponseBodyEntries extends TeaModel {
        @NameInMap("Entry")
        public java.util.List<DescribePrefixListAttributesResponseBodyEntriesEntry> entry;

        public static DescribePrefixListAttributesResponseBodyEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribePrefixListAttributesResponseBodyEntries self = new DescribePrefixListAttributesResponseBodyEntries();
            return TeaModel.build(map, self);
        }

        public DescribePrefixListAttributesResponseBodyEntries setEntry(java.util.List<DescribePrefixListAttributesResponseBodyEntriesEntry> entry) {
            this.entry = entry;
            return this;
        }
        public java.util.List<DescribePrefixListAttributesResponseBodyEntriesEntry> getEntry() {
            return this.entry;
        }

    }

}
