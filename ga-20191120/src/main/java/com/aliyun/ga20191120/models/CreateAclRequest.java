// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateAclRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("AclName")
    public String aclName;

    @NameInMap("AddressIPVersion")
    public String addressIPVersion;

    @NameInMap("AclEntries")
    public java.util.List<CreateAclRequestAclEntries> aclEntries;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    public static CreateAclRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAclRequest self = new CreateAclRequest();
        return TeaModel.build(map, self);
    }

    public CreateAclRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAclRequest setAclName(String aclName) {
        this.aclName = aclName;
        return this;
    }
    public String getAclName() {
        return this.aclName;
    }

    public CreateAclRequest setAddressIPVersion(String addressIPVersion) {
        this.addressIPVersion = addressIPVersion;
        return this;
    }
    public String getAddressIPVersion() {
        return this.addressIPVersion;
    }

    public CreateAclRequest setAclEntries(java.util.List<CreateAclRequestAclEntries> aclEntries) {
        this.aclEntries = aclEntries;
        return this;
    }
    public java.util.List<CreateAclRequestAclEntries> getAclEntries() {
        return this.aclEntries;
    }

    public CreateAclRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAclRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static class CreateAclRequestAclEntries extends TeaModel {
        @NameInMap("Entry")
        public String entry;

        @NameInMap("EntryDescription")
        public String entryDescription;

        public static CreateAclRequestAclEntries build(java.util.Map<String, ?> map) throws Exception {
            CreateAclRequestAclEntries self = new CreateAclRequestAclEntries();
            return TeaModel.build(map, self);
        }

        public CreateAclRequestAclEntries setEntry(String entry) {
            this.entry = entry;
            return this;
        }
        public String getEntry() {
            return this.entry;
        }

        public CreateAclRequestAclEntries setEntryDescription(String entryDescription) {
            this.entryDescription = entryDescription;
            return this;
        }
        public String getEntryDescription() {
            return this.entryDescription;
        }

    }

}
