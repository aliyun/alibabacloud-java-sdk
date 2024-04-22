// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetAclResponseBody extends TeaModel {
    /**
     * <p>The entries of the ACL.</p>
     */
    @NameInMap("AclEntries")
    public java.util.List<GetAclResponseBodyAclEntries> aclEntries;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("AclId")
    public String aclId;

    /**
     * <p>The ID of the GA instance.</p>
     */
    @NameInMap("AclName")
    public String aclName;

    /**
     * <p>The IP version of the network ACL. Valid values:</p>
     * <br>
     * <p>*   **IPv4**</p>
     * <p>*   **IPv6**</p>
     */
    @NameInMap("AclStatus")
    public String aclStatus;

    /**
     * <p>The ID of the network ACL.</p>
     */
    @NameInMap("AddressIPVersion")
    public String addressIPVersion;

    /**
     * <p>The listeners that are associated with the ACL.</p>
     */
    @NameInMap("RelatedListeners")
    public java.util.List<GetAclResponseBodyRelatedListeners> relatedListeners;

    /**
     * <p>The ID of the network ACL.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The name of the network ACL.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags of the ACL.</p>
     */
    @NameInMap("Tags")
    public java.util.List<GetAclResponseBodyTags> tags;

    public static GetAclResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAclResponseBody self = new GetAclResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAclResponseBody setAclEntries(java.util.List<GetAclResponseBodyAclEntries> aclEntries) {
        this.aclEntries = aclEntries;
        return this;
    }
    public java.util.List<GetAclResponseBodyAclEntries> getAclEntries() {
        return this.aclEntries;
    }

    public GetAclResponseBody setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public GetAclResponseBody setAclName(String aclName) {
        this.aclName = aclName;
        return this;
    }
    public String getAclName() {
        return this.aclName;
    }

    public GetAclResponseBody setAclStatus(String aclStatus) {
        this.aclStatus = aclStatus;
        return this;
    }
    public String getAclStatus() {
        return this.aclStatus;
    }

    public GetAclResponseBody setAddressIPVersion(String addressIPVersion) {
        this.addressIPVersion = addressIPVersion;
        return this;
    }
    public String getAddressIPVersion() {
        return this.addressIPVersion;
    }

    public GetAclResponseBody setRelatedListeners(java.util.List<GetAclResponseBodyRelatedListeners> relatedListeners) {
        this.relatedListeners = relatedListeners;
        return this;
    }
    public java.util.List<GetAclResponseBodyRelatedListeners> getRelatedListeners() {
        return this.relatedListeners;
    }

    public GetAclResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAclResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetAclResponseBody setTags(java.util.List<GetAclResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetAclResponseBodyTags> getTags() {
        return this.tags;
    }

    public static class GetAclResponseBodyAclEntries extends TeaModel {
        /**
         * <p>An IP address entry (192.168.XX.XX) or a CIDR block entry (10.0.XX.XX/24).</p>
         */
        @NameInMap("Entry")
        public String entry;

        /**
         * <p>The description of the ACL entry.</p>
         */
        @NameInMap("EntryDescription")
        public String entryDescription;

        public static GetAclResponseBodyAclEntries build(java.util.Map<String, ?> map) throws Exception {
            GetAclResponseBodyAclEntries self = new GetAclResponseBodyAclEntries();
            return TeaModel.build(map, self);
        }

        public GetAclResponseBodyAclEntries setEntry(String entry) {
            this.entry = entry;
            return this;
        }
        public String getEntry() {
            return this.entry;
        }

        public GetAclResponseBodyAclEntries setEntryDescription(String entryDescription) {
            this.entryDescription = entryDescription;
            return this;
        }
        public String getEntryDescription() {
            return this.entryDescription;
        }

    }

    public static class GetAclResponseBodyRelatedListeners extends TeaModel {
        /**
         * <p>The ID of the GA instance.</p>
         */
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        /**
         * <p>The type of the ACL. Valid values:</p>
         * <br>
         * <p>*   **white**: a whitelist. Only requests from the IP addresses or CIDR blocks in the ACL are forwarded. Whitelists are suitable for scenarios in which you want to allow only specific IP addresses to access an application. Risks may arise if an IP address whitelist is improperly configured. After you configure a whitelist for a listener, only requests from the IP addresses that are added to the whitelist are distributed by the listener. If a whitelist is enabled but no IP address is added to the whitelist, the listener forwards all requests.</p>
         * <p>*   **black**: a blacklist. All requests from the IP addresses or CIDR blocks in the ACL are blocked. Blacklists are suitable for scenarios in which you want to deny access from specific IP addresses to an application. If a blacklist is enabled but no IP address is added to the blacklist, the listener forwards all requests.</p>
         */
        @NameInMap("AclType")
        public String aclType;

        /**
         * <p>The ID of the listener.</p>
         */
        @NameInMap("ListenerId")
        public String listenerId;

        public static GetAclResponseBodyRelatedListeners build(java.util.Map<String, ?> map) throws Exception {
            GetAclResponseBodyRelatedListeners self = new GetAclResponseBodyRelatedListeners();
            return TeaModel.build(map, self);
        }

        public GetAclResponseBodyRelatedListeners setAcceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        public GetAclResponseBodyRelatedListeners setAclType(String aclType) {
            this.aclType = aclType;
            return this;
        }
        public String getAclType() {
            return this.aclType;
        }

        public GetAclResponseBodyRelatedListeners setListenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }
        public String getListenerId() {
            return this.listenerId;
        }

    }

    public static class GetAclResponseBodyTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetAclResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetAclResponseBodyTags self = new GetAclResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetAclResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetAclResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
