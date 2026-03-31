// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GrafanaWorkspace extends TeaModel {
    /**
     * <p>Indicates whether the workspace is commercialized.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("commercial")
    public Boolean commercial;

    /**
     * <p>The deployment mode of Grafana. You can ignore this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>asi</p>
     */
    @NameInMap("deployType")
    public String deployType;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>Grafana for Production</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The time when the workspace expires.</p>
     * 
     * <strong>example:</strong>
     * <p>1652803200000</p>
     */
    @NameInMap("endTime")
    public Float endTime;

    /**
     * <p>The time when the workspace was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1642079398000</p>
     */
    @NameInMap("gmtCreate")
    public Float gmtCreate;

    /**
     * <p>The version number of Grafana.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>8.2.x</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>10.0.x</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>9.0.x</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>9.0.x</p>
     */
    @NameInMap("grafanaVersion")
    public String grafanaVersion;

    /**
     * <p>The domain name of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>my-grafana.grafana.aliyuncs.com:443</p>
     */
    @NameInMap("grafanaWorkspaceDomain")
    public String grafanaWorkspaceDomain;

    /**
     * <p>status of workspace domain</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("grafanaWorkspaceDomainStatus")
    public String grafanaWorkspaceDomainStatus;

    /**
     * <p>The version.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>standard：Standard Edition</p>
     * </li>
     * <li><p>personal_deition：Developer Edition</p>
     * </li>
     * <li><p>experts_edition：Expert Edition</p>
     * </li>
     * <li><p>advanced_edition：Advanced Edition</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>personal_edition、experts_edition、advanced_edition、standard</p>
     */
    @NameInMap("grafanaWorkspaceEdition")
    public String grafanaWorkspaceEdition;

    /**
     * <p>The ID of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>grafana-cn-4xl3g******</p>
     */
    @NameInMap("grafanaWorkspaceId")
    public String grafanaWorkspaceId;

    /**
     * <p>The public IP address and port number.</p>
     * 
     * <strong>example:</strong>
     * <p>47.110.71.***:443</p>
     */
    @NameInMap("grafanaWorkspaceIp")
    public String grafanaWorkspaceIp;

    /**
     * <p>The workspace name.</p>
     * 
     * <strong>example:</strong>
     * <p>Grafana for Production</p>
     */
    @NameInMap("grafanaWorkspaceName")
    public String grafanaWorkspaceName;

    /**
     * <p>The maximum number of accounts.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxAccount")
    public String maxAccount;

    /**
     * <p>The ID of the purchase order.</p>
     * 
     * <strong>example:</strong>
     * <p>grafana-cn-4xl3g******</p>
     */
    @NameInMap("ntmId")
    public String ntmId;

    /**
     * <p>The personalized domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>my-grafana.grafana.aliyuncs.com:443</p>
     */
    @NameInMap("personalDomain")
    public String personalDomain;

    /**
     * <p>The prefix of the personalized domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>my-grafana</p>
     */
    @NameInMap("personalDomainPrefix")
    public String personalDomainPrefix;

    /**
     * <p>The private domain name of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>my-grafana.grafana.aliyuncs.com:80</p>
     */
    @NameInMap("privateDomain")
    public String privateDomain;

    /**
     * <p>The private IP address and port number.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.1.1</p>
     */
    @NameInMap("privateIp")
    public String privateIp;

    /**
     * <p>The protocol type.</p>
     * 
     * <strong>example:</strong>
     * <p>http、https</p>
     */
    @NameInMap("protocol")
    public String protocol;

    /**
     * <p>The region ID of the disk.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2f4vzrfs6cla</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Indicates whether the migration guide for the shared edition is provided.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("shareSynced")
    public Boolean shareSynced;

    /**
     * <p>The outbound IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>47.110.71.***</p>
     */
    @NameInMap("snatIp")
    public String snatIp;

    /**
     * <p>The status of the workspace.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>StartFailed：The workspace failed to be started</p>
     * </li>
     * <li><p>Stop：The workspace is stopped</p>
     * </li>
     * <li><p>Starting：The workspace is being started</p>
     * </li>
     * <li><p>DeleteFailed：The workspace failed to be deleted</p>
     * </li>
     * <li><p>Running：The workspace is running</p>
     * </li>
     * <li><p>DeleteSucceed：The workspace is deleted</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Starting、Running、Stop、DeleteSucceed</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("tags")
    public java.util.List<GrafanaWorkspaceTags> tags;

    /**
     * <p>The versions that are available for upgrades.</p>
     */
    @NameInMap("upgradeVersion")
    public java.util.List<String> upgradeVersion;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1412143830******</p>
     */
    @NameInMap("userId")
    public String userId;

    public static GrafanaWorkspace build(java.util.Map<String, ?> map) throws Exception {
        GrafanaWorkspace self = new GrafanaWorkspace();
        return TeaModel.build(map, self);
    }

    public GrafanaWorkspace setCommercial(Boolean commercial) {
        this.commercial = commercial;
        return this;
    }
    public Boolean getCommercial() {
        return this.commercial;
    }

    public GrafanaWorkspace setDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }
    public String getDeployType() {
        return this.deployType;
    }

    public GrafanaWorkspace setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GrafanaWorkspace setEndTime(Float endTime) {
        this.endTime = endTime;
        return this;
    }
    public Float getEndTime() {
        return this.endTime;
    }

    public GrafanaWorkspace setGmtCreate(Float gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Float getGmtCreate() {
        return this.gmtCreate;
    }

    public GrafanaWorkspace setGrafanaVersion(String grafanaVersion) {
        this.grafanaVersion = grafanaVersion;
        return this;
    }
    public String getGrafanaVersion() {
        return this.grafanaVersion;
    }

    public GrafanaWorkspace setGrafanaWorkspaceDomain(String grafanaWorkspaceDomain) {
        this.grafanaWorkspaceDomain = grafanaWorkspaceDomain;
        return this;
    }
    public String getGrafanaWorkspaceDomain() {
        return this.grafanaWorkspaceDomain;
    }

    public GrafanaWorkspace setGrafanaWorkspaceDomainStatus(String grafanaWorkspaceDomainStatus) {
        this.grafanaWorkspaceDomainStatus = grafanaWorkspaceDomainStatus;
        return this;
    }
    public String getGrafanaWorkspaceDomainStatus() {
        return this.grafanaWorkspaceDomainStatus;
    }

    public GrafanaWorkspace setGrafanaWorkspaceEdition(String grafanaWorkspaceEdition) {
        this.grafanaWorkspaceEdition = grafanaWorkspaceEdition;
        return this;
    }
    public String getGrafanaWorkspaceEdition() {
        return this.grafanaWorkspaceEdition;
    }

    public GrafanaWorkspace setGrafanaWorkspaceId(String grafanaWorkspaceId) {
        this.grafanaWorkspaceId = grafanaWorkspaceId;
        return this;
    }
    public String getGrafanaWorkspaceId() {
        return this.grafanaWorkspaceId;
    }

    public GrafanaWorkspace setGrafanaWorkspaceIp(String grafanaWorkspaceIp) {
        this.grafanaWorkspaceIp = grafanaWorkspaceIp;
        return this;
    }
    public String getGrafanaWorkspaceIp() {
        return this.grafanaWorkspaceIp;
    }

    public GrafanaWorkspace setGrafanaWorkspaceName(String grafanaWorkspaceName) {
        this.grafanaWorkspaceName = grafanaWorkspaceName;
        return this;
    }
    public String getGrafanaWorkspaceName() {
        return this.grafanaWorkspaceName;
    }

    public GrafanaWorkspace setMaxAccount(String maxAccount) {
        this.maxAccount = maxAccount;
        return this;
    }
    public String getMaxAccount() {
        return this.maxAccount;
    }

    public GrafanaWorkspace setNtmId(String ntmId) {
        this.ntmId = ntmId;
        return this;
    }
    public String getNtmId() {
        return this.ntmId;
    }

    public GrafanaWorkspace setPersonalDomain(String personalDomain) {
        this.personalDomain = personalDomain;
        return this;
    }
    public String getPersonalDomain() {
        return this.personalDomain;
    }

    public GrafanaWorkspace setPersonalDomainPrefix(String personalDomainPrefix) {
        this.personalDomainPrefix = personalDomainPrefix;
        return this;
    }
    public String getPersonalDomainPrefix() {
        return this.personalDomainPrefix;
    }

    public GrafanaWorkspace setPrivateDomain(String privateDomain) {
        this.privateDomain = privateDomain;
        return this;
    }
    public String getPrivateDomain() {
        return this.privateDomain;
    }

    public GrafanaWorkspace setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }
    public String getPrivateIp() {
        return this.privateIp;
    }

    public GrafanaWorkspace setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public GrafanaWorkspace setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GrafanaWorkspace setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GrafanaWorkspace setShareSynced(Boolean shareSynced) {
        this.shareSynced = shareSynced;
        return this;
    }
    public Boolean getShareSynced() {
        return this.shareSynced;
    }

    public GrafanaWorkspace setSnatIp(String snatIp) {
        this.snatIp = snatIp;
        return this;
    }
    public String getSnatIp() {
        return this.snatIp;
    }

    public GrafanaWorkspace setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GrafanaWorkspace setTags(java.util.List<GrafanaWorkspaceTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GrafanaWorkspaceTags> getTags() {
        return this.tags;
    }

    public GrafanaWorkspace setUpgradeVersion(java.util.List<String> upgradeVersion) {
        this.upgradeVersion = upgradeVersion;
        return this;
    }
    public java.util.List<String> getUpgradeVersion() {
        return this.upgradeVersion;
    }

    public GrafanaWorkspace setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class GrafanaWorkspaceTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("value")
        public String value;

        public static GrafanaWorkspaceTags build(java.util.Map<String, ?> map) throws Exception {
            GrafanaWorkspaceTags self = new GrafanaWorkspaceTags();
            return TeaModel.build(map, self);
        }

        public GrafanaWorkspaceTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GrafanaWorkspaceTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
