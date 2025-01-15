// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class KubeletConfig extends TeaModel {
    @NameInMap("allowedUnsafeSysctls")
    public java.util.List<String> allowedUnsafeSysctls;

    @NameInMap("clusterDNS")
    public java.util.List<String> clusterDNS;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("containerLogMaxFiles")
    public Long containerLogMaxFiles;

    /**
     * <strong>example:</strong>
     * <p>10Mi</p>
     */
    @NameInMap("containerLogMaxSize")
    public String containerLogMaxSize;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("containerLogMaxWorkers")
    public Integer containerLogMaxWorkers;

    /**
     * <strong>example:</strong>
     * <p>10s</p>
     */
    @NameInMap("containerLogMonitorInterval")
    public String containerLogMonitorInterval;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("cpuCFSQuota")
    public Boolean cpuCFSQuota;

    /**
     * <strong>example:</strong>
     * <p>100ms</p>
     */
    @NameInMap("cpuCFSQuotaPeriod")
    public String cpuCFSQuotaPeriod;

    /**
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("cpuManagerPolicy")
    public String cpuManagerPolicy;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("eventBurst")
    public Long eventBurst;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("eventRecordQPS")
    public Long eventRecordQPS;

    @NameInMap("evictionHard")
    public java.util.Map<String, ?> evictionHard;

    @NameInMap("evictionSoft")
    public java.util.Map<String, ?> evictionSoft;

    @NameInMap("evictionSoftGracePeriod")
    public java.util.Map<String, ?> evictionSoftGracePeriod;

    @NameInMap("featureGates")
    public java.util.Map<String, ?> featureGates;

    /**
     * <strong>example:</strong>
     * <p>85</p>
     */
    @NameInMap("imageGCHighThresholdPercent")
    public Integer imageGCHighThresholdPercent;

    /**
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("imageGCLowThresholdPercent")
    public Integer imageGCLowThresholdPercent;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("kubeAPIBurst")
    public Long kubeAPIBurst;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("kubeAPIQPS")
    public Long kubeAPIQPS;

    @NameInMap("kubeReserved")
    public java.util.Map<String, ?> kubeReserved;

    /**
     * <strong>example:</strong>
     * <p>110</p>
     */
    @NameInMap("maxPods")
    public Long maxPods;

    /**
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("memoryManagerPolicy")
    public String memoryManagerPolicy;

    /**
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("podPidsLimit")
    public Long podPidsLimit;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("readOnlyPort")
    public Long readOnlyPort;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("registryBurst")
    public Long registryBurst;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("registryPullQPS")
    public Long registryPullQPS;

    @NameInMap("reservedMemory")
    public java.util.List<KubeletConfigReservedMemory> reservedMemory;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("serializeImagePulls")
    public Boolean serializeImagePulls;

    @NameInMap("systemReserved")
    public java.util.Map<String, ?> systemReserved;

    /**
     * <strong>example:</strong>
     * <p>restricted</p>
     */
    @NameInMap("topologyManagerPolicy")
    public String topologyManagerPolicy;

    @NameInMap("tracing")
    public KubeletConfigTracing tracing;

    public static KubeletConfig build(java.util.Map<String, ?> map) throws Exception {
        KubeletConfig self = new KubeletConfig();
        return TeaModel.build(map, self);
    }

    public KubeletConfig setAllowedUnsafeSysctls(java.util.List<String> allowedUnsafeSysctls) {
        this.allowedUnsafeSysctls = allowedUnsafeSysctls;
        return this;
    }
    public java.util.List<String> getAllowedUnsafeSysctls() {
        return this.allowedUnsafeSysctls;
    }

    public KubeletConfig setClusterDNS(java.util.List<String> clusterDNS) {
        this.clusterDNS = clusterDNS;
        return this;
    }
    public java.util.List<String> getClusterDNS() {
        return this.clusterDNS;
    }

    public KubeletConfig setContainerLogMaxFiles(Long containerLogMaxFiles) {
        this.containerLogMaxFiles = containerLogMaxFiles;
        return this;
    }
    public Long getContainerLogMaxFiles() {
        return this.containerLogMaxFiles;
    }

    public KubeletConfig setContainerLogMaxSize(String containerLogMaxSize) {
        this.containerLogMaxSize = containerLogMaxSize;
        return this;
    }
    public String getContainerLogMaxSize() {
        return this.containerLogMaxSize;
    }

    public KubeletConfig setContainerLogMaxWorkers(Integer containerLogMaxWorkers) {
        this.containerLogMaxWorkers = containerLogMaxWorkers;
        return this;
    }
    public Integer getContainerLogMaxWorkers() {
        return this.containerLogMaxWorkers;
    }

    public KubeletConfig setContainerLogMonitorInterval(String containerLogMonitorInterval) {
        this.containerLogMonitorInterval = containerLogMonitorInterval;
        return this;
    }
    public String getContainerLogMonitorInterval() {
        return this.containerLogMonitorInterval;
    }

    public KubeletConfig setCpuCFSQuota(Boolean cpuCFSQuota) {
        this.cpuCFSQuota = cpuCFSQuota;
        return this;
    }
    public Boolean getCpuCFSQuota() {
        return this.cpuCFSQuota;
    }

    public KubeletConfig setCpuCFSQuotaPeriod(String cpuCFSQuotaPeriod) {
        this.cpuCFSQuotaPeriod = cpuCFSQuotaPeriod;
        return this;
    }
    public String getCpuCFSQuotaPeriod() {
        return this.cpuCFSQuotaPeriod;
    }

    public KubeletConfig setCpuManagerPolicy(String cpuManagerPolicy) {
        this.cpuManagerPolicy = cpuManagerPolicy;
        return this;
    }
    public String getCpuManagerPolicy() {
        return this.cpuManagerPolicy;
    }

    public KubeletConfig setEventBurst(Long eventBurst) {
        this.eventBurst = eventBurst;
        return this;
    }
    public Long getEventBurst() {
        return this.eventBurst;
    }

    public KubeletConfig setEventRecordQPS(Long eventRecordQPS) {
        this.eventRecordQPS = eventRecordQPS;
        return this;
    }
    public Long getEventRecordQPS() {
        return this.eventRecordQPS;
    }

    public KubeletConfig setEvictionHard(java.util.Map<String, ?> evictionHard) {
        this.evictionHard = evictionHard;
        return this;
    }
    public java.util.Map<String, ?> getEvictionHard() {
        return this.evictionHard;
    }

    public KubeletConfig setEvictionSoft(java.util.Map<String, ?> evictionSoft) {
        this.evictionSoft = evictionSoft;
        return this;
    }
    public java.util.Map<String, ?> getEvictionSoft() {
        return this.evictionSoft;
    }

    public KubeletConfig setEvictionSoftGracePeriod(java.util.Map<String, ?> evictionSoftGracePeriod) {
        this.evictionSoftGracePeriod = evictionSoftGracePeriod;
        return this;
    }
    public java.util.Map<String, ?> getEvictionSoftGracePeriod() {
        return this.evictionSoftGracePeriod;
    }

    public KubeletConfig setFeatureGates(java.util.Map<String, ?> featureGates) {
        this.featureGates = featureGates;
        return this;
    }
    public java.util.Map<String, ?> getFeatureGates() {
        return this.featureGates;
    }

    public KubeletConfig setImageGCHighThresholdPercent(Integer imageGCHighThresholdPercent) {
        this.imageGCHighThresholdPercent = imageGCHighThresholdPercent;
        return this;
    }
    public Integer getImageGCHighThresholdPercent() {
        return this.imageGCHighThresholdPercent;
    }

    public KubeletConfig setImageGCLowThresholdPercent(Integer imageGCLowThresholdPercent) {
        this.imageGCLowThresholdPercent = imageGCLowThresholdPercent;
        return this;
    }
    public Integer getImageGCLowThresholdPercent() {
        return this.imageGCLowThresholdPercent;
    }

    public KubeletConfig setKubeAPIBurst(Long kubeAPIBurst) {
        this.kubeAPIBurst = kubeAPIBurst;
        return this;
    }
    public Long getKubeAPIBurst() {
        return this.kubeAPIBurst;
    }

    public KubeletConfig setKubeAPIQPS(Long kubeAPIQPS) {
        this.kubeAPIQPS = kubeAPIQPS;
        return this;
    }
    public Long getKubeAPIQPS() {
        return this.kubeAPIQPS;
    }

    public KubeletConfig setKubeReserved(java.util.Map<String, ?> kubeReserved) {
        this.kubeReserved = kubeReserved;
        return this;
    }
    public java.util.Map<String, ?> getKubeReserved() {
        return this.kubeReserved;
    }

    public KubeletConfig setMaxPods(Long maxPods) {
        this.maxPods = maxPods;
        return this;
    }
    public Long getMaxPods() {
        return this.maxPods;
    }

    public KubeletConfig setMemoryManagerPolicy(String memoryManagerPolicy) {
        this.memoryManagerPolicy = memoryManagerPolicy;
        return this;
    }
    public String getMemoryManagerPolicy() {
        return this.memoryManagerPolicy;
    }

    public KubeletConfig setPodPidsLimit(Long podPidsLimit) {
        this.podPidsLimit = podPidsLimit;
        return this;
    }
    public Long getPodPidsLimit() {
        return this.podPidsLimit;
    }

    public KubeletConfig setReadOnlyPort(Long readOnlyPort) {
        this.readOnlyPort = readOnlyPort;
        return this;
    }
    public Long getReadOnlyPort() {
        return this.readOnlyPort;
    }

    public KubeletConfig setRegistryBurst(Long registryBurst) {
        this.registryBurst = registryBurst;
        return this;
    }
    public Long getRegistryBurst() {
        return this.registryBurst;
    }

    public KubeletConfig setRegistryPullQPS(Long registryPullQPS) {
        this.registryPullQPS = registryPullQPS;
        return this;
    }
    public Long getRegistryPullQPS() {
        return this.registryPullQPS;
    }

    public KubeletConfig setReservedMemory(java.util.List<KubeletConfigReservedMemory> reservedMemory) {
        this.reservedMemory = reservedMemory;
        return this;
    }
    public java.util.List<KubeletConfigReservedMemory> getReservedMemory() {
        return this.reservedMemory;
    }

    public KubeletConfig setSerializeImagePulls(Boolean serializeImagePulls) {
        this.serializeImagePulls = serializeImagePulls;
        return this;
    }
    public Boolean getSerializeImagePulls() {
        return this.serializeImagePulls;
    }

    public KubeletConfig setSystemReserved(java.util.Map<String, ?> systemReserved) {
        this.systemReserved = systemReserved;
        return this;
    }
    public java.util.Map<String, ?> getSystemReserved() {
        return this.systemReserved;
    }

    public KubeletConfig setTopologyManagerPolicy(String topologyManagerPolicy) {
        this.topologyManagerPolicy = topologyManagerPolicy;
        return this;
    }
    public String getTopologyManagerPolicy() {
        return this.topologyManagerPolicy;
    }

    public KubeletConfig setTracing(KubeletConfigTracing tracing) {
        this.tracing = tracing;
        return this;
    }
    public KubeletConfigTracing getTracing() {
        return this.tracing;
    }

    public static class KubeletConfigReservedMemory extends TeaModel {
        @NameInMap("limits")
        public java.util.Map<String, ?> limits;

        @NameInMap("numaNode")
        public Integer numaNode;

        public static KubeletConfigReservedMemory build(java.util.Map<String, ?> map) throws Exception {
            KubeletConfigReservedMemory self = new KubeletConfigReservedMemory();
            return TeaModel.build(map, self);
        }

        public KubeletConfigReservedMemory setLimits(java.util.Map<String, ?> limits) {
            this.limits = limits;
            return this;
        }
        public java.util.Map<String, ?> getLimits() {
            return this.limits;
        }

        public KubeletConfigReservedMemory setNumaNode(Integer numaNode) {
            this.numaNode = numaNode;
            return this;
        }
        public Integer getNumaNode() {
            return this.numaNode;
        }

    }

    public static class KubeletConfigTracing extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>localhost:4317</p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        @NameInMap("samplingRatePerMillion")
        public Integer samplingRatePerMillion;

        public static KubeletConfigTracing build(java.util.Map<String, ?> map) throws Exception {
            KubeletConfigTracing self = new KubeletConfigTracing();
            return TeaModel.build(map, self);
        }

        public KubeletConfigTracing setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public KubeletConfigTracing setSamplingRatePerMillion(Integer samplingRatePerMillion) {
            this.samplingRatePerMillion = samplingRatePerMillion;
            return this;
        }
        public Integer getSamplingRatePerMillion() {
            return this.samplingRatePerMillion;
        }

    }

}
