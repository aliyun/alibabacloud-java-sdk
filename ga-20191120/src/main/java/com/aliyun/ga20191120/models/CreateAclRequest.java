// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateAclRequest extends TeaModel {
    /**
     * <p>The entries of IP addresses or CIDR blocks to add to the ACL.</p>
     * <p>You can add a maximum of 50 entries at a time.</p>
     */
    @NameInMap("AclEntries")
    public java.util.List<CreateAclRequestAclEntries> aclEntries;

    /**
     * <p>The ACL name.</p>
     * <p>The name must be 1 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
     * 
     * <strong>example:</strong>
     * <p>test-acl</p>
     */
    @NameInMap("AclName")
    public String aclName;

    /**
     * <p>The IP version of the ACL. Valid values:</p>
     * <ul>
     * <li><strong>IPv4</strong></li>
     * <li><strong>IPv6</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("AddressIPVersion")
    public String addressIPVersion;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to only precheck the request. Default value: false. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: prechecks the request without performing the operation. The system checks the required parameters, request syntax, and limits. If the request fails the precheck, an error message is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong>: sends the request. If the request passes the precheck, a 2xx HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the region where the Global Accelerator (GA) instance is deployed. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmwj7wvng3jbi</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags of the ACL.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateAclRequestTag> tag;

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

    public CreateAclRequest setTag(java.util.List<CreateAclRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateAclRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateAclRequestAclEntries extends TeaModel {
        /**
         * <p>The IP addresses (192.168.XX.XX) or CIDR blocks (10.0.XX.XX/24) that you want to add to the ACL.</p>
         * <p>You can add a maximum of 50 entries at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX/24</p>
         */
        @NameInMap("Entry")
        public String entry;

        /**
         * <p>The description of the entry that you want to add to the ACL.</p>
         * <p>You can add a maximum of 50 entries at a time.</p>
         * <p>The description must be 1 to 256 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).</p>
         * 
         * <strong>example:</strong>
         * <p>test-entry</p>
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

    public static class CreateAclRequestTag extends TeaModel {
        /**
         * <p>The tag key of the ACL. The tag key cannot be an empty string.</p>
         * <p>The tag key can be up to 64 characters in length and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
         * <p>You can specify up to 20 tag keys.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the ACL. The tag value cannot be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
         * <p>You can specify up to 20 tag values.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-value</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateAclRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateAclRequestTag self = new CreateAclRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateAclRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAclRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
