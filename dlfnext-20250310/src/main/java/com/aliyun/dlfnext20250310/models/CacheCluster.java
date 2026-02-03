// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class CacheCluster extends TeaModel {
    @NameInMap("clusterId")
    public String clusterId;

    @NameInMap("clusterName")
    public String clusterName;

    @NameInMap("createdAt")
    public Long createdAt;

    @NameInMap("createdBy")
    public String createdBy;

    @NameInMap("deployInstanceVersion")
    public String deployInstanceVersion;

    @NameInMap("deployOptionsVersion")
    public Long deployOptionsVersion;

    @NameInMap("instanceVersion")
    public String instanceVersion;

    @NameInMap("options")
    public java.util.Map<String, String> options;

    @NameInMap("optionsVersion")
    public Long optionsVersion;

    @NameInMap("status")
    public String status;

    @NameInMap("updatedAt")
    public Long updatedAt;

    @NameInMap("updatedBy")
    public String updatedBy;

    @NameInMap("vSwitches")
    public java.util.List<CacheClusterVSwitches> vSwitches;

    @NameInMap("vpcId")
    public String vpcId;

    public static CacheCluster build(java.util.Map<String, ?> map) throws Exception {
        CacheCluster self = new CacheCluster();
        return TeaModel.build(map, self);
    }

    public CacheCluster setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CacheCluster setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public CacheCluster setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public CacheCluster setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public CacheCluster setDeployInstanceVersion(String deployInstanceVersion) {
        this.deployInstanceVersion = deployInstanceVersion;
        return this;
    }
    public String getDeployInstanceVersion() {
        return this.deployInstanceVersion;
    }

    public CacheCluster setDeployOptionsVersion(Long deployOptionsVersion) {
        this.deployOptionsVersion = deployOptionsVersion;
        return this;
    }
    public Long getDeployOptionsVersion() {
        return this.deployOptionsVersion;
    }

    public CacheCluster setInstanceVersion(String instanceVersion) {
        this.instanceVersion = instanceVersion;
        return this;
    }
    public String getInstanceVersion() {
        return this.instanceVersion;
    }

    public CacheCluster setOptions(java.util.Map<String, String> options) {
        this.options = options;
        return this;
    }
    public java.util.Map<String, String> getOptions() {
        return this.options;
    }

    public CacheCluster setOptionsVersion(Long optionsVersion) {
        this.optionsVersion = optionsVersion;
        return this;
    }
    public Long getOptionsVersion() {
        return this.optionsVersion;
    }

    public CacheCluster setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CacheCluster setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public CacheCluster setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public CacheCluster setVSwitches(java.util.List<CacheClusterVSwitches> vSwitches) {
        this.vSwitches = vSwitches;
        return this;
    }
    public java.util.List<CacheClusterVSwitches> getVSwitches() {
        return this.vSwitches;
    }

    public CacheCluster setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class CacheClusterVSwitches extends TeaModel {
        @NameInMap("vSwitchId")
        public String vSwitchId;

        @NameInMap("zone")
        public String zone;

        public static CacheClusterVSwitches build(java.util.Map<String, ?> map) throws Exception {
            CacheClusterVSwitches self = new CacheClusterVSwitches();
            return TeaModel.build(map, self);
        }

        public CacheClusterVSwitches setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CacheClusterVSwitches setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

}
