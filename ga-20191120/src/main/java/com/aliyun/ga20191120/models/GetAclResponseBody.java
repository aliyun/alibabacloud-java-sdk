// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetAclResponseBody extends TeaModel {
    /**
     * <p>The network ACL entry.</p>
     */
    @NameInMap("AclEntries")
    public java.util.List<GetAclResponseBodyAclEntries> aclEntries;

    /**
     * <p>The IP version of the network ACL. Valid values:</p>
     * <br>
     * <p>*   **IPv4**</p>
     * <p>*   **IPv6**</p>
     */
    @NameInMap("AclId")
    public String aclId;

    @NameInMap("AclName")
    public String aclName;

    /**
     * <p>The list of network ACL entries that are returned. A maximum of 20 network ACL entries can be returned.</p>
     */
    @NameInMap("AclStatus")
    public String aclStatus;

    /**
     * <p>The state of the network ACL. Valid values:</p>
     * <br>
     * <p>*   **init**: The network ACL is being initialized.</p>
     * <p>*   **active**: The network ACL is available.</p>
     * <p>*   **configuring**: The network ACL is being configured.</p>
     * <p>*   **updating**: The network ACL is being updated.</p>
     * <p>*   **deleting**: The network ACL is being deleted.</p>
     */
    @NameInMap("AddressIPVersion")
    public String addressIPVersion;

    /**
     * <p>The ID of the listener.</p>
     */
    @NameInMap("RelatedListeners")
    public java.util.List<GetAclResponseBodyRelatedListeners> relatedListeners;

    /**
     * <p>The ID of the network ACL.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

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
         * <p>The description of the network ACL entry.</p>
         */
        @NameInMap("Entry")
        public String entry;

        /**
         * <p>The listeners that are associated with the network ACL.</p>
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
         * <p>The name of the network ACL.</p>
         */
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        /**
         * <p>The ID of the GA instance.</p>
         */
        @NameInMap("AclType")
        public String aclType;

        /**
         * <p>The type of the network ACL.</p>
         * <br>
         * <p>*   **White**: a whitelist. Only requests from the IP addresses or CIDR blocks in the ACL are forwarded. Whitelists apply to scenarios in which you want to allow only specified IP addresses to access an application. Your service may be adversely affected if the whitelist is not properly configured. After you configure a whitelist for a listener, only requests from the IP addresses that are added to the whitelist are forwarded by the listener. If the whitelist is enabled but no IP addresses are added to the network ACL, the listener does not forward requests.</p>
         * <p>*   **Black**: a blacklist. All requests from the IP addresses or CIDR blocks in the ACL are blocked. Blacklists apply to scenarios in which you want to deny access from specific IP addresses to an application. If the blacklist is enabled but no IP addresses are added to the network ACL, the listener forwards all requests.</p>
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
        @NameInMap("Key")
        public String key;

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
