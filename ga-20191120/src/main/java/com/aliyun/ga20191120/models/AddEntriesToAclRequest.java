// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class AddEntriesToAclRequest extends TeaModel {
    /**
     * <p>The IP addresses or CIDR blocks that you want to add to the ACL. You can add at most 20 entries in each request.</p>
     */
    @NameInMap("AclEntries")
    public java.util.List<AddEntriesToAclRequestAclEntries> aclEntries;

    /**
     * <p>The ACL ID.</p>
     */
    @NameInMap("AclId")
    public String aclId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run, without performing the actual request. Valid values:</p>
     * <br>
     * <p>*   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false**(default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The region ID of the GA instance. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static AddEntriesToAclRequest build(java.util.Map<String, ?> map) throws Exception {
        AddEntriesToAclRequest self = new AddEntriesToAclRequest();
        return TeaModel.build(map, self);
    }

    public AddEntriesToAclRequest setAclEntries(java.util.List<AddEntriesToAclRequestAclEntries> aclEntries) {
        this.aclEntries = aclEntries;
        return this;
    }
    public java.util.List<AddEntriesToAclRequestAclEntries> getAclEntries() {
        return this.aclEntries;
    }

    public AddEntriesToAclRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public AddEntriesToAclRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddEntriesToAclRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public AddEntriesToAclRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class AddEntriesToAclRequestAclEntries extends TeaModel {
        /**
         * <p>The IP address (192.168.XX.XX) or CIDR block (10.0.XX.XX/24) that you want to add to the ACL. You can add at most 20 entries in each request.</p>
         * <br>
         * <p>> This parameter is required.</p>
         */
        @NameInMap("Entry")
        public String entry;

        /**
         * <p>The description of the entry.</p>
         * <br>
         * <p>You can add the descriptions of up to 20 entries in each request.</p>
         * <br>
         * <p>The description must be 1 to 256 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (\_).</p>
         */
        @NameInMap("EntryDescription")
        public String entryDescription;

        public static AddEntriesToAclRequestAclEntries build(java.util.Map<String, ?> map) throws Exception {
            AddEntriesToAclRequestAclEntries self = new AddEntriesToAclRequestAclEntries();
            return TeaModel.build(map, self);
        }

        public AddEntriesToAclRequestAclEntries setEntry(String entry) {
            this.entry = entry;
            return this;
        }
        public String getEntry() {
            return this.entry;
        }

        public AddEntriesToAclRequestAclEntries setEntryDescription(String entryDescription) {
            this.entryDescription = entryDescription;
            return this;
        }
        public String getEntryDescription() {
            return this.entryDescription;
        }

    }

}
