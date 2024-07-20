// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class RemoveEntriesFromAclRequest extends TeaModel {
    /**
     * <p>The entries (IP addresses or CIDR blocks) that you want to delete from the ACL. You can delete a maximum of 20 entries at a time.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AclEntries")
    public java.util.List<RemoveEntriesFromAclRequestAclEntries> aclEntries;

    /**
     * <p>The ACL ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nacl-hp34s2h0xx1ht4nwo****</p>
     */
    @NameInMap("AclId")
    public String aclId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>593B0448-D13E-4C56-AC0D-FDF0FDE0E9A3</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong>(default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The region ID of the GA instance. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
         * <p>The IP address (192.168.XX.XX) or CIDR block (10.0.XX.XX/24) that you want to delete from the ACL. You can delete a maximum of 50 entries at a time.</p>
         * <blockquote>
         * <p> This parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX/24</p>
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
