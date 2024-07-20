// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class AssociateAclsWithListenerRequest extends TeaModel {
    /**
     * <p>The ID of the ACL. You can associate up to two ACL IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AclIds")
    public java.util.List<String> aclIds;

    /**
     * <p>The type of the ACL. Valid values:</p>
     * <ul>
     * <li><strong>white</strong>: Only requests from the IP addresses or CIDR blocks in the ACL are forwarded. Whitelists are suitable for scenarios in which you want to allow access from specific IP addresses to an application. If a whitelist is improperly configured, risks may arise. After a whitelist is configured for a listener, only requests from the IP addresses that are added to the whitelist are distributed by the listener. If a whitelist is enabled but no IP address is added to the whitelist, the listener forwards all requests.</li>
     * <li><strong>black</strong>: All requests from the IP addresses or CIDR blocks in the ACL are rejected. Blacklists are suitable for scenarios in which you want to deny access from specific IP addresses to an application. If the blacklist is enabled but no IP addresses are added to the ACL, the listener forwards all requests.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>White</p>
     */
    @NameInMap("AclType")
    public String aclType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4****</p>
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
     * <p>The listener ID.</p>
     * <p>Only intelligent routing listeners support ACLs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lsr-bp1bpn0kn908w4nbw****</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The region ID of the Global Accelerator (GA) instance. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static AssociateAclsWithListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateAclsWithListenerRequest self = new AssociateAclsWithListenerRequest();
        return TeaModel.build(map, self);
    }

    public AssociateAclsWithListenerRequest setAclIds(java.util.List<String> aclIds) {
        this.aclIds = aclIds;
        return this;
    }
    public java.util.List<String> getAclIds() {
        return this.aclIds;
    }

    public AssociateAclsWithListenerRequest setAclType(String aclType) {
        this.aclType = aclType;
        return this;
    }
    public String getAclType() {
        return this.aclType;
    }

    public AssociateAclsWithListenerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AssociateAclsWithListenerRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public AssociateAclsWithListenerRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public AssociateAclsWithListenerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
