// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HiMarketPortalDeployConfig extends TeaModel {
    /**
     * <p>The deployment status message.</p>
     * 
     * <strong>example:</strong>
     * <p>message</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The deployment platform type.</p>
     * 
     * <strong>example:</strong>
     * <p>SAE</p>
     */
    @NameInMap("platform")
    public String platform;

    /**
     * <p>The SAE (Serverless App Engine) deployment configuration.</p>
     */
    @NameInMap("saeConfig")
    public HiMarketPortalDeployConfigSaeConfig saeConfig;

    /**
     * <p>The deployment status.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
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
        /**
         * <p>The SAE application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>app-xxx</p>
         */
        @NameInMap("appId")
        public String appId;

        /**
         * <p>The SAE namespace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou:default</p>
         */
        @NameInMap("namespaceId")
        public String namespaceId;

        /**
         * <p>The OIDC role name used for SAE to access other cloud resources.</p>
         * 
         * <strong>example:</strong>
         * <p>apig-portal-oidc-role</p>
         */
        @NameInMap("oidcRoleName")
        public String oidcRoleName;

        /**
         * <p>The region ID of SAE.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The number of instance replicas.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("replicas")
        public String replicas;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-xxx</p>
         */
        @NameInMap("securityGroupId")
        public String securityGroupId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-xxx</p>
         */
        @NameInMap("vSwitchId")
        public String vSwitchId;

        /**
         * <p>VPC ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-xxx</p>
         */
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
