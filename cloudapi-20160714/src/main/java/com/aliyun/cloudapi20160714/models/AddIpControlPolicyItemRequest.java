// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class AddIpControlPolicyItemRequest extends TeaModel {
    /**
     * <p>The ID of the policy. The ID is unique.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("CidrIp")
    public String cidrIp;

    /**
     * <p>The IP addresses or CIDR blocks involved in the policy. Separate multiple IP addresses or CIDR blocks with semicolons (;). You can specify a maximum of 10 IP addresses or CIDR blocks.</p>
     */
    @NameInMap("IpControlId")
    public String ipControlId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static AddIpControlPolicyItemRequest build(java.util.Map<String, ?> map) throws Exception {
        AddIpControlPolicyItemRequest self = new AddIpControlPolicyItemRequest();
        return TeaModel.build(map, self);
    }

    public AddIpControlPolicyItemRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AddIpControlPolicyItemRequest setCidrIp(String cidrIp) {
        this.cidrIp = cidrIp;
        return this;
    }
    public String getCidrIp() {
        return this.cidrIp;
    }

    public AddIpControlPolicyItemRequest setIpControlId(String ipControlId) {
        this.ipControlId = ipControlId;
        return this;
    }
    public String getIpControlId() {
        return this.ipControlId;
    }

    public AddIpControlPolicyItemRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
