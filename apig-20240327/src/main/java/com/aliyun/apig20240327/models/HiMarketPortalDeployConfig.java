// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HiMarketPortalDeployConfig extends TeaModel {
    @NameInMap("message")
    public String message;

    @NameInMap("platform")
    public String platform;

    @NameInMap("saeConfig")
    public HiMarketPortalDeployConfigSaeConfig saeConfig;

    @NameInMap("status")
    public String status;

    public static HiMarketPortalDeployConfig build(java.util.Map<String, ?> map) throws Exception {
        HiMarketPortalDeployConfig self = new HiMarketPortalDeployConfig();
        return TeaModel.build(map, self);
    }

    public HiMarketPortalDeployConfig setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HiMarketPortalDeployConfig setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public HiMarketPortalDeployConfig setSaeConfig(HiMarketPortalDeployConfigSaeConfig saeConfig) {
        this.saeConfig = saeConfig;
        return this;
    }
    public HiMarketPortalDeployConfigSaeConfig getSaeConfig() {
        return this.saeConfig;
    }

    public HiMarketPortalDeployConfig setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class HiMarketPortalDeployConfigSaeConfig extends TeaModel {
        @NameInMap("appId")
        public String appId;

        @NameInMap("namespaceId")
        public String namespaceId;

        @NameInMap("oidcRoleName")
        public String oidcRoleName;

        @NameInMap("regionId")
        public String regionId;

        @NameInMap("replicas")
        public String replicas;

        @NameInMap("securityGroupId")
        public String securityGroupId;

        @NameInMap("vSwitchId")
        public String vSwitchId;

        @NameInMap("vpcId")
        public String vpcId;

        public static HiMarketPortalDeployConfigSaeConfig build(java.util.Map<String, ?> map) throws Exception {
            HiMarketPortalDeployConfigSaeConfig self = new HiMarketPortalDeployConfigSaeConfig();
            return TeaModel.build(map, self);
        }

        public HiMarketPortalDeployConfigSaeConfig setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public HiMarketPortalDeployConfigSaeConfig setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public HiMarketPortalDeployConfigSaeConfig setOidcRoleName(String oidcRoleName) {
            this.oidcRoleName = oidcRoleName;
            return this;
        }
        public String getOidcRoleName() {
            return this.oidcRoleName;
        }

        public HiMarketPortalDeployConfigSaeConfig setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public HiMarketPortalDeployConfigSaeConfig setReplicas(String replicas) {
            this.replicas = replicas;
            return this;
        }
        public String getReplicas() {
            return this.replicas;
        }

        public HiMarketPortalDeployConfigSaeConfig setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public HiMarketPortalDeployConfigSaeConfig setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public HiMarketPortalDeployConfigSaeConfig setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
