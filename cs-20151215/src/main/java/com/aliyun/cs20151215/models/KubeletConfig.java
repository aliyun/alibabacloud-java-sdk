// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class KubeletConfig extends TeaModel {
    @NameInMap("allowedUnsafeSysctls")
    public java.util.List<String> allowedUnsafeSysctls;

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

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("serializeImagePulls")
    public Boolean serializeImagePulls;

    @NameInMap("systemReserved")
    public java.util.Map<String, ?> systemReserved;

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

}
