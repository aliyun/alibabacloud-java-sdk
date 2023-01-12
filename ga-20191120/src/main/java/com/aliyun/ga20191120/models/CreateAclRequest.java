// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateAclRequest extends TeaModel {
    @NameInMap("AclEntries")
    public java.util.List<CreateAclRequestAclEntries> aclEntries;

    /**
     * <p>The name of the ACL. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter.</p>
     */
    @NameInMap("AclName")
    public String aclName;

    /**
     * <p>The IP version of the ACL. Valid values:</p>
     * <br>
     * <p>*   **IPv4**</p>
     * <p>*   **IPv6**</p>
     */
    @NameInMap("AddressIPVersion")
    public String addressIPVersion;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** may be different for each API request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to only precheck the request. Default value: false. Valid values:</p>
     * <br>
     * <p>*   **true**: prechecks the request without performing the operation. The system checks the required parameters, request syntax, and limits. If the request fails the precheck, an error message is returned. If the request passes the precheck, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false**: sends the request. If the request passes the precheck, a 2xx HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the region where the Global Accelerator (GA) instance is deployed. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static CreateAclRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAclRequest self = new CreateAclRequest();
        return TeaModel.build(map, self);
    }

    public CreateAclRequest setAclEntries(java.util.List<CreateAclRequestAclEntries> aclEntries) {
        this.aclEntries = aclEntries;
        return this;
    }
    public java.util.List<CreateAclRequestAclEntries> getAclEntries() {
        return this.aclEntries;
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

    public CreateAclRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAclRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static class CreateAclRequestAclEntries extends TeaModel {
        /**
         * <p>The IP address or CIDR block that you want to add to the ACL.</p>
         * <br>
         * <p>You can add up to 20 entries in each request.</p>
         */
        @NameInMap("Entry")
        public String entry;

        /**
         * <p>The description of the entry that you want to add to the ACL.</p>
         * <br>
         * <p>You can add the descriptions of up to 20 entries in each request.</p>
         * <br>
         * <p>The description must be 1 to 256 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (\_).</p>
         */
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
