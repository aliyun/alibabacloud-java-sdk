// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HiMarketPortalDeployConfig extends TeaModel {
    /**
     * <p>Additional information about the deployment status, such as error details.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The target deployment platform. For example, set this to <code>SAE</code> to deploy on Serverless App Engine.</p>
     */
    @NameInMap("platform")
    public String platform;

    /**
     * <p>Configuration settings for deploying to Serverless App Engine (SAE). This object is required when the <code>platform</code> is <code>SAE</code>.</p>
     */
    @NameInMap("saeConfig")
    public HiMarketPortalDeployConfigSaeConfig saeConfig;

    /**
     * <p>The current status of the deployment. Possible values include <code>succeeded</code>, <code>failed</code>, and <code>in_progress</code>.</p>
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
         * <p>The ID of the application in Serverless App Engine.</p>
         */
        @NameInMap("appId")
        public String appId;

        /**
         * <p>The ID of the namespace that logically isolates the application.</p>
         */
        @NameInMap("namespaceId")
        public String namespaceId;

        /**
         * <p>The name of the OIDC role that grants permissions to the application.</p>
         */
        @NameInMap("oidcRoleName")
        public String oidcRoleName;

        /**
         * <p>The ID of the region in which to deploy the application.</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The desired number of application replicas.</p>
         */
        @NameInMap("replicas")
        public String replicas;

        /**
         * <p>The ID of the security group to apply to the application instances. A security group acts as a virtual firewall.</p>
         */
        @NameInMap("securityGroupId")
        public String securityGroupId;

        /**
         * <p>The ID of the vSwitch within the specified VPC. Serverless App Engine launches application instances in the vSwitch\&quot;s zone.</p>
         */
        @NameInMap("vSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the VPC to connect the application to.</p>
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
