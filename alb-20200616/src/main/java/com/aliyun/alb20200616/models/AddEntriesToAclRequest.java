// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class AddEntriesToAclRequest extends TeaModel {
    /**
     * <p>The list of access control entries to be added. You can add up to 20 access control entries in a single call.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AclEntries")
    public java.util.List<AddEntriesToAclRequestAclEntries> aclEntries;

    /**
     * <p>The ACL instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acl-hp34s2h0xx1ht4nwo****</p>
     */
    @NameInMap("AclId")
    public String aclId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate the parameter value from your client and make sure that the value is unique across different requests. The ClientToken parameter supports only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is unique.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The system prechecks the request without adding IP entries to the access control policy group. The system checks whether the required parameters are specified, the request format, and the service limits. If the request fails the precheck, the corresponding error is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): The system sends a normal request. If the request passes the precheck, the system returns an HTTP 2xx status code and performs the operation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

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

    public static class AddEntriesToAclRequestAclEntries extends TeaModel {
        /**
         * <p>The description of the access control entry. The description must be 2 to 256 characters in length, and can contain letters, digits, Chinese characters, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (_), and hyphens (-).</p>
         * <p>You can add up to 20 access control entries in a single call.</p>
         * 
         * <strong>example:</strong>
         * <p>test-entry</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The CIDR block of the access control entry.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.1.0/24</p>
         */
        @NameInMap("Entry")
        public String entry;

        public static AddEntriesToAclRequestAclEntries build(java.util.Map<String, ?> map) throws Exception {
            AddEntriesToAclRequestAclEntries self = new AddEntriesToAclRequestAclEntries();
            return TeaModel.build(map, self);
        }

        public AddEntriesToAclRequestAclEntries setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AddEntriesToAclRequestAclEntries setEntry(String entry) {
            this.entry = entry;
            return this;
        }
        public String getEntry() {
            return this.entry;
        }

    }

}
