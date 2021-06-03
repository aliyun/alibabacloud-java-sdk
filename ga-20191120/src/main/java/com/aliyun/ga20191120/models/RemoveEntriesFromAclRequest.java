// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class RemoveEntriesFromAclRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("AclId")
    public String aclId;

    @NameInMap("AclEntries")
    public java.util.List<RemoveEntriesFromAclRequestAclEntries> aclEntries;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    public static RemoveEntriesFromAclRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveEntriesFromAclRequest self = new RemoveEntriesFromAclRequest();
        return TeaModel.build(map, self);
    }

    public RemoveEntriesFromAclRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RemoveEntriesFromAclRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public RemoveEntriesFromAclRequest setAclEntries(java.util.List<RemoveEntriesFromAclRequestAclEntries> aclEntries) {
        this.aclEntries = aclEntries;
        return this;
    }
    public java.util.List<RemoveEntriesFromAclRequestAclEntries> getAclEntries() {
        return this.aclEntries;
    }

    public RemoveEntriesFromAclRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RemoveEntriesFromAclRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static class RemoveEntriesFromAclRequestAclEntries extends TeaModel {
        @NameInMap("Entry")
        public String entry;

        public static RemoveEntriesFromAclRequestAclEntries build(java.util.Map<String, ?> map) throws Exception {
            RemoveEntriesFromAclRequestAclEntries self = new RemoveEntriesFromAclRequestAclEntries();
            return TeaModel.build(map, self);
        }

        public RemoveEntriesFromAclRequestAclEntries setEntry(String entry) {
            this.entry = entry;
            return this;
        }
        public String getEntry() {
            return this.entry;
        }

    }

}
