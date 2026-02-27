// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class KubeletConfig extends TeaModel {
    /**
     * <p>The whitelisted unsafe sysctls.</p>
     */
    @NameInMap("allowedUnsafeSysctls")
    public java.util.List<String> allowedUnsafeSysctls;

    /**
     * <p>The list of IP addresses of the DNS servers.</p>
     */
    @NameInMap("clusterDNS")
    public java.util.List<String> clusterDNS;

    /**
     * <p>The maximum number of log files that can be stored in each container.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("containerLogMaxFiles")
    public Long containerLogMaxFiles;

    /**
     * <p>The maximum size that a log file can reach before it is rotated.</p>
     * 
     * <strong>example:</strong>
     * <p>10Mi</p>
     */
    @NameInMap("containerLogMaxSize")
    public String containerLogMaxSize;

    /**
     * <p>The maximum number of concurrent programs that rotate logs</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("containerLogMaxWorkers")
    public Integer containerLogMaxWorkers;

    /**
     * <p>The duration at which the container logs are monitored for rotating logs.</p>
     * 
     * <strong>example:</strong>
     * <p>10s</p>
     */
    @NameInMap("containerLogMonitorInterval")
    public String containerLogMonitorInterval;

    /**
     * <p>Specifies whether to use Completely Fair Scheduler (CFS) quota to enforce pod CPU limits.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("cpuCFSQuota")
    public Boolean cpuCFSQuota;

    /**
     * <p>The duration for the CPU CFS quota.</p>
     * 
     * <strong>example:</strong>
     * <p>100ms</p>
     */
    @NameInMap("cpuCFSQuotaPeriod")
    public String cpuCFSQuotaPeriod;

    /**
     * <p>The CPU management policy used by kubelet.</p>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("cpuManagerPolicy")
    public String cpuManagerPolicy;

    /**
     * <p>The maximum number of burst peaks for the event records.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("eventBurst")
    public Long eventBurst;

    /**
     * <p>Specifies the maximum number of events that can be generated per second.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("eventRecordQPS")
    public Long eventRecordQPS;

    /**
     * <p>A set of eviction thresholds that will trigger a pod eviction if met.</p>
     */
    @NameInMap("evictionHard")
    public java.util.Map<String, ?> evictionHard;

    /**
     * <p>A set of eviction thresholds that will trigger a pod eviction if met over a corresponding grace period.</p>
     */
    @NameInMap("evictionSoft")
    public java.util.Map<String, ?> evictionSoft;

    /**
     * <p>A set of grace periods for eviction thresholds.</p>
     */
    @NameInMap("evictionSoftGracePeriod")
    public java.util.Map<String, ?> evictionSoftGracePeriod;

    /**
     * <p>A feature gate that is used to enable an experimental feature.</p>
     */
    @NameInMap("featureGates")
    public java.util.Map<String, ?> featureGates;

    /**
     * <p>The percentage of disk usage after which image garbage collection always runs.</p>
     * 
     * <strong>example:</strong>
     * <p>85</p>
     */
    @NameInMap("imageGCHighThresholdPercent")
    public Integer imageGCHighThresholdPercent;

    /**
     * <p>The percentage of disk usage before which image garbage collection never runs.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("imageGCLowThresholdPercent")
    public Integer imageGCLowThresholdPercent;

    /**
     * <p>The maximum number of burst requests sent to the API server per second.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("kubeAPIBurst")
    public Long kubeAPIBurst;

    /**
     * <p>The QPS when kubelet communicates with the Kubernetes API server.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("kubeAPIQPS")
    public Long kubeAPIQPS;

    /**
     * <p>A set of configurations that specify resources reserved for the Kubernetes system.</p>
     */
    @NameInMap("kubeReserved")
    public java.util.Map<String, ?> kubeReserved;

    /**
     * <p>The maximum number of running pods.</p>
     * 
     * <strong>example:</strong>
     * <p>110</p>
     */
    @NameInMap("maxPods")
    public Long maxPods;

    /**
     * <p>The name of the policy to be used by the memory manager.</p>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("memoryManagerPolicy")
    public String memoryManagerPolicy;

    /**
     * <p>The maximum number of processes per pod.</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("podPidsLimit")
    public Long podPidsLimit;

    /**
     * <p>The read-only port.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("readOnlyPort")
    public Long readOnlyPort;

    /**
     * <p>The maximum number of images that can be pulled from bursty image pulls.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("registryBurst")
    public Long registryBurst;

    /**
     * <p>The maximum queries per second (QPS) of the image repository.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("registryPullQPS")
    public Long registryPullQPS;

    /**
     * <p>A list of configurations that specify memory reservations for non-uniform memory access (NUMA) nodes.</p>
     */
    @NameInMap("reservedMemory")
    public java.util.List<KubeletConfigReservedMemory> reservedMemory;

    /**
     * <p>Specifies whether to pull one image at a time.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("serializeImagePulls")
    public Boolean serializeImagePulls;

    @NameInMap("serverTLSBootstrap")
    public Boolean serverTLSBootstrap;

    /**
     * <p>A set of configurations that specify reserved resources for the system.</p>
     */
    @NameInMap("systemReserved")
    public java.util.Map<String, ?> systemReserved;

    /**
     * <p>The name of the Topology Manager policy that you want to use.</p>
     * 
     * <strong>example:</strong>
     * <p>restricted</p>
     */
    @NameInMap("topologyManagerPolicy")
    public String topologyManagerPolicy;

    /**
     * <p>The versioned configuration information for the Managed Service for OpenTelemetry client.</p>
     */
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

    public KubeletConfig setServerTLSBootstrap(Boolean serverTLSBootstrap) {
        this.serverTLSBootstrap = serverTLSBootstrap;
        return this;
    }
    public Boolean getServerTLSBootstrap() {
        return this.serverTLSBootstrap;
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
        /**
         * <p>The memory limit.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;memory&quot;: &quot;1Gi&quot;}</p>
         */
        @NameInMap("limits")
        public java.util.Map<String, ?> limits;

        /**
         * <p>The NUMA node identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
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
         * <p>The endpoint of the collector.</p>
         * 
         * <strong>example:</strong>
         * <p>localhost:4317</p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>The number of samples to be collected per million spans.</p>
         * 
         * <strong>example:</strong>
         * <p>200000</p>
         */
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
