// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class CreateIpControlRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("IpControlName")
    public String ipControlName;

    @NameInMap("IpControlPolicys")
    public java.util.List<CreateIpControlRequestIpControlPolicys> ipControlPolicys;

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
        @NameInMap("AppId")
        public String appId;

        @NameInMap("IP")
        public String IP;

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

        public CreateIpControlRequestIpControlPolicys setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

    }

}
