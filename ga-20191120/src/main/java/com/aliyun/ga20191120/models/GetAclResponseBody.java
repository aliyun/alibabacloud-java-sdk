// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetAclResponseBody extends TeaModel {
    @NameInMap("AclEntries")
    public java.util.List<GetAclResponseBodyAclEntries> aclEntries;

    @NameInMap("AclId")
    public String aclId;

    @NameInMap("AclName")
    public String aclName;

    @NameInMap("AclStatus")
    public String aclStatus;

    @NameInMap("AddressIPVersion")
    public String addressIPVersion;

    @NameInMap("RelatedListeners")
    public java.util.List<GetAclResponseBodyRelatedListeners> relatedListeners;

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
        @NameInMap("Entry")
        public String entry;

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
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        @NameInMap("AclType")
        public String aclType;

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
