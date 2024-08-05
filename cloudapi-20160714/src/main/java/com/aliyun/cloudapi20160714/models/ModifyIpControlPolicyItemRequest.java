// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyIpControlPolicyItemRequest extends TeaModel {
    /**
     * <p>The ID of the application that is restricted by the policy. You can configure the AppId parameter only when the value of the IpControlType parameter is ALLOW.</p>
     * <ul>
     * <li>You can add only one application ID at a time.</li>
     * <li>If this parameter is empty, no applications are restricted.</li>
     * <li>If this parameter is not empty, not only IP addresses but also applications are restricted.</li>
     * <li>If this parameter is not empty and no security authentication method is specified for the API, all API calls are restricted.</li>
     * <li>If the value of the IpControlType parameter is REFUSE and the AppId parameter is not empty, API Gateway automatically ignores the AppId parameter and restricts only the IP addresses.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The IP address or CIDR block that is defined in a policy. Separate multiple IP addresses or CIDR blocks with semicolons (;). You can add a maximum of 10 IP addresses or CIDR blocks.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>113.125.1.101;101.11.1.1</p>
     */
    @NameInMap("CidrIp")
    public String cidrIp;

    /**
     * <p>The ID of the ACL. The ID is unique.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7ea91319a34d48a09b5c9c871d9768b1</p>
     */
    @NameInMap("IpControlId")
    public String ipControlId;

    /**
     * <p>The ID of the policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>P151617000829241</p>
     */
    @NameInMap("PolicyItemId")
    public String policyItemId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ModifyIpControlPolicyItemRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpControlPolicyItemRequest self = new ModifyIpControlPolicyItemRequest();
        return TeaModel.build(map, self);
    }

    public ModifyIpControlPolicyItemRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyIpControlPolicyItemRequest setCidrIp(String cidrIp) {
        this.cidrIp = cidrIp;
        return this;
    }
    public String getCidrIp() {
        return this.cidrIp;
    }

    public ModifyIpControlPolicyItemRequest setIpControlId(String ipControlId) {
        this.ipControlId = ipControlId;
        return this;
    }
    public String getIpControlId() {
        return this.ipControlId;
    }

    public ModifyIpControlPolicyItemRequest setPolicyItemId(String policyItemId) {
        this.policyItemId = policyItemId;
        return this;
    }
    public String getPolicyItemId() {
        return this.policyItemId;
    }

    public ModifyIpControlPolicyItemRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
