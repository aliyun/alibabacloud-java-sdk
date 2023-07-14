// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GrafanaWorkspace extends TeaModel {
    @NameInMap("commercial")
    public Boolean commercial;

    @NameInMap("deployType")
    public String deployType;

    @NameInMap("description")
    public String description;

    @NameInMap("endTime")
    public Float endTime;

    @NameInMap("gmtCreate")
    public Float gmtCreate;

    @NameInMap("grafanaVersion")
    public String grafanaVersion;

    @NameInMap("grafanaWorkspaceDomain")
    public String grafanaWorkspaceDomain;

    @NameInMap("grafanaWorkspaceEdition")
    public String grafanaWorkspaceEdition;

    @NameInMap("grafanaWorkspaceId")
    public String grafanaWorkspaceId;

    @NameInMap("grafanaWorkspaceIp")
    public String grafanaWorkspaceIp;

    @NameInMap("grafanaWorkspaceName")
    public String grafanaWorkspaceName;

    @NameInMap("maxAccount")
    public String maxAccount;

    @NameInMap("ntmId")
    public String ntmId;

    @NameInMap("personalDomain")
    public String personalDomain;

    @NameInMap("personalDomainPrefix")
    public String personalDomainPrefix;

    @NameInMap("protocol")
    public String protocol;

    @NameInMap("regionId")
    public String regionId;

    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    @NameInMap("shareSynced")
    public Boolean shareSynced;

    @NameInMap("snatIp")
    public String snatIp;

    @NameInMap("status")
    public String status;

    @NameInMap("tags")
    public java.util.List<GrafanaWorkspaceTags> tags;

    @NameInMap("upgradeVersion")
    public java.util.List<String> upgradeVersion;

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
        @NameInMap("key")
        public String key;

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
