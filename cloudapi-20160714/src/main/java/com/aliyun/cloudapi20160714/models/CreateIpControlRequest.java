// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateIpControlRequest extends TeaModel {
    /**
     * <p>The description. The description can be up to 200 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the ACL. The name must be 4 to 50 characters in length, and can contain letters, digits, and underscores (\_). The name cannot start with an underscore (\_).``</p>
     */
    @NameInMap("IpControlName")
    public String ipControlName;

    /**
     * <p>The information about the policies. The information is an array of ipcontrolpolicys data.</p>
     */
    @NameInMap("IpControlPolicys")
    public java.util.List<CreateIpControlRequestIpControlPolicys> ipControlPolicys;

    /**
     * <p>The type of the ACL. Valid values:</p>
     * <br>
     * <p>*   **ALLOW**: an IP address whitelist</p>
     * <p>*   **REFUSE**: an IP address blacklist</p>
     */
    @NameInMap("IpControlType")
    public String ipControlType;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static CreateIpControlRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIpControlRequest self = new CreateIpControlRequest();
        return TeaModel.build(map, self);
    }

    public CreateIpControlRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateIpControlRequest setIpControlName(String ipControlName) {
        this.ipControlName = ipControlName;
        return this;
    }
    public String getIpControlName() {
        return this.ipControlName;
    }

    public CreateIpControlRequest setIpControlPolicys(java.util.List<CreateIpControlRequestIpControlPolicys> ipControlPolicys) {
        this.ipControlPolicys = ipControlPolicys;
        return this;
    }
    public java.util.List<CreateIpControlRequestIpControlPolicys> getIpControlPolicys() {
        return this.ipControlPolicys;
    }

    public CreateIpControlRequest setIpControlType(String ipControlType) {
        this.ipControlType = ipControlType;
        return this;
    }
    public String getIpControlType() {
        return this.ipControlType;
    }

    public CreateIpControlRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static class CreateIpControlRequestIpControlPolicys extends TeaModel {
        /**
         * <p>The ID of the application that is restricted by the policy. You can configure the AppId parameter only when the value of the IpControlType parameter is ALLOW.</p>
         * <br>
         * <p>*   You can add only one application ID at a time.</p>
         * <p>*   If this parameter is empty, no applications are restricted.</p>
         * <p>*   If this parameter is not empty, not only IP addresses but also applications are restricted.</p>
         * <p>*   If this parameter is not empty and no security authentication method is specified for the API, all API calls are restricted.</p>
         * <p>*   If the value of the IpControlType parameter is REFUSE and the AppId parameter is not empty, API Gateway automatically ignores the AppId parameter and restricts only the IP addresses.</p>
         * <p>*   Valid values of N in IpControlPolicys.N: `[1,100]`.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The IP address or CIDR block involved in a policy.</p>
         * <br>
         * <p>*   If you want to specify a policy when you create an ACL, this parameter is required.</p>
         * <p>*   The IP address or CIDR block that is defined in each policy. Separate multiple IP addresses or CIDR blocks with semicolons (;). You can add a maximum of 10 IP addresses or CIDR blocks.</p>
         * <p>*   Valid values of N in IpControlPolicys.N: `[1,100]`.</p>
         */
        @NameInMap("CidrIp")
        public String cidrIp;

        public static CreateIpControlRequestIpControlPolicys build(java.util.Map<String, ?> map) throws Exception {
            CreateIpControlRequestIpControlPolicys self = new CreateIpControlRequestIpControlPolicys();
            return TeaModel.build(map, self);
        }

        public CreateIpControlRequestIpControlPolicys setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateIpControlRequestIpControlPolicys setCidrIp(String cidrIp) {
            this.cidrIp = cidrIp;
            return this;
        }
        public String getCidrIp() {
            return this.cidrIp;
        }

    }

}
