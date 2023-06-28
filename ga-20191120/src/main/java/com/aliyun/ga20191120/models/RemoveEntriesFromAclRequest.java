// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class RemoveEntriesFromAclRequest extends TeaModel {
    @NameInMap("AclEntries")
    public java.util.List<RemoveEntriesFromAclRequestAclEntries> aclEntries;

    /**
     * <p>The IP address or CIDR block that you want to delete from the ACL.</p>
     * <br>
     * <p>You can delete at most 20 entries in each request.</p>
     * <br>
     * <p>>  This parameter is required.</p>
     */
    @NameInMap("AclId")
    public String aclId;

    /**
     * <p>Specifies whether to check the request without performing the operation. Valid values:</p>
     * <br>
     * <p>*   **true**: checks the request without performing the operation. The system checks the required parameters, request syntax, and limits. If the request fails the check, an error message is returned. If the request passes the check, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): sends the request. If the request passes the check, an HTTP 2xx status code is returned and the operation is performed.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the ACL.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static RemoveEntriesFromAclRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveEntriesFromAclRequest self = new RemoveEntriesFromAclRequest();
        return TeaModel.build(map, self);
    }

    public RemoveEntriesFromAclRequest setAclEntries(java.util.List<RemoveEntriesFromAclRequestAclEntries> aclEntries) {
        this.aclEntries = aclEntries;
        return this;
    }
    public java.util.List<RemoveEntriesFromAclRequestAclEntries> getAclEntries() {
        return this.aclEntries;
    }

    public RemoveEntriesFromAclRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
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

    public RemoveEntriesFromAclRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class RemoveEntriesFromAclRequestAclEntries extends TeaModel {
        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <br>
         * <p>You can use the client to generate the value, but you must ensure that it is unique among all requests. The client token can contain only ASCII characters.</p>
         * <br>
         * <p>>  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** may be different for each API request.</p>
         */
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
