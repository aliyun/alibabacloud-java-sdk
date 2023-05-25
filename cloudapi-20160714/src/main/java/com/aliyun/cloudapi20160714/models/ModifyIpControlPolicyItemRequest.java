// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyIpControlPolicyItemRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>*   This operation is intended for API providers.</p>
     * <p>*   The modification immediately takes effect on all the APIs that are bound to the policy.</p>
     * <p>*   This operation causes a full modification of the content of a policy.</p>
     */
    @NameInMap("CidrIp")
    public String cidrIp;

    /**
     * <p>The ID of the application that is restricted by the policy. You can configure the AppId parameter only when the value of the IpControlType parameter is ALLOW.</p>
     * <br>
     * <p>*   You can add only one application ID at a time.</p>
     * <p>*   If this parameter is empty, no applications are restricted.</p>
     * <p>*   If this parameter is not empty, not only IP addresses but also applications are restricted.</p>
     * <p>*   If this parameter is not empty and no security authentication method is specified for the API, all API calls are restricted.</p>
     * <p>*   If the value of the IpControlType parameter is REFUSE and the AppId parameter is not empty, API Gateway automatically ignores the AppId parameter and restricts only the IP addresses.</p>
     */
    @NameInMap("IpControlId")
    public String ipControlId;

    /**
     * <p>The IP address or CIDR block that is defined in a policy. Separate multiple IP addresses or CIDR blocks with semicolons (;). You can add a maximum of 10 IP addresses or CIDR blocks.</p>
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
