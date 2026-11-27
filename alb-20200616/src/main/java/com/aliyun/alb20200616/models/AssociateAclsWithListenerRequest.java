// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class AssociateAclsWithListenerRequest extends TeaModel {
    /**
     * <p>The ACL instance IDs. You can specify up to three ACL instance IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AclIds")
    public java.util.List<String> aclIds;

    /**
     * <p>The access control type. Valid values:</p>
     * <ul>
     * <li><strong>White</strong>: specifies a whitelist. Only requests from the IP addresses or CIDR blocks in the Settings of the selected access control policy group are forwarded. Whitelists apply to scenarios in which you want to allow only specific IP addresses to access an application. Configuring a whitelist poses risks to your business. After a whitelist is configured, only the IP addresses in the whitelist can access the load balancing listener. If you enable a whitelist but do not add IP addresses to the access control policy group, the load balancing listener forwards all requests.</li>
     * <li><strong>Black</strong>: specifies a blacklist. Requests from the IP addresses or CIDR blocks in the Settings of the selected access control policy group are not forwarded. Blacklists apply to scenarios in which you want to block access from specific IP addresses. If you enable a blacklist but do not add IP addresses to the access control policy group, the load balancing listener forwards all requests.</li>
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
     * <p>You can use the client to generate the value, and you must make sure that the value is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not set this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is unique.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run and does not associate the ACLs with the listener. The system checks whether the required parameters are set, and validates the request format and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and sends the actual request. If the request passes the dry run, an HTTP 2xx status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The listener instance ID. Before you invoke this operation, confirm that the Application Load Balancer (ALB) instance to which the listener belongs is not associated with a security group. After an ALB instance is associated with a security group, you cannot attach an access control policy to the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lsn-bp1bpn0kn9*******</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

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

}
