// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ContainerdConfig extends TeaModel {
    /**
     * <p>Whether to ignore volumes defined in the image.</p>
     */
    @NameInMap("ignoreImageDefinedVolume")
    public Boolean ignoreImageDefinedVolume;

    /**
     * <p>A list of insecure registries that skip TLS certificate verification.</p>
     */
    @NameInMap("insecureRegistries")
    public java.util.List<String> insecureRegistries;

    /**
     * <p>Maximum core dump size in bytes.</p>
     */
    @NameInMap("limitCore")
    public Long limitCore;

    /**
     * <p>Maximum locked memory in bytes.</p>
     */
    @NameInMap("limitMemLock")
    public Long limitMemLock;

    /**
     * <p>Maximum number of open file handles.</p>
     */
    @NameInMap("limitNoFile")
    public Long limitNoFile;

    /**
     * <p>The maximum number of concurrent image layer downloads.</p>
     */
    @NameInMap("maxConcurrentDownloads")
    public Long maxConcurrentDownloads;

    /**
     * <p>A list of registry mirrors to accelerate image pulls.</p>
     */
    @NameInMap("registryMirrors")
    public java.util.List<String> registryMirrors;

    public static ContainerdConfig build(java.util.Map<String, ?> map) throws Exception {
        ContainerdConfig self = new ContainerdConfig();
        return TeaModel.build(map, self);
    }

    public ContainerdConfig setIgnoreImageDefinedVolume(Boolean ignoreImageDefinedVolume) {
        this.ignoreImageDefinedVolume = ignoreImageDefinedVolume;
        return this;
    }
    public Boolean getIgnoreImageDefinedVolume() {
        return this.ignoreImageDefinedVolume;
    }

    public ContainerdConfig setInsecureRegistries(java.util.List<String> insecureRegistries) {
        this.insecureRegistries = insecureRegistries;
        return this;
    }
    public java.util.List<String> getInsecureRegistries() {
        return this.insecureRegistries;
    }

    public ContainerdConfig setLimitCore(Long limitCore) {
        this.limitCore = limitCore;
        return this;
    }
    public Long getLimitCore() {
        return this.limitCore;
    }

    public ContainerdConfig setLimitMemLock(Long limitMemLock) {
        this.limitMemLock = limitMemLock;
        return this;
    }
    public Long getLimitMemLock() {
        return this.limitMemLock;
    }

    public ContainerdConfig setLimitNoFile(Long limitNoFile) {
        this.limitNoFile = limitNoFile;
        return this;
    }
    public Long getLimitNoFile() {
        return this.limitNoFile;
    }

    public ContainerdConfig setMaxConcurrentDownloads(Long maxConcurrentDownloads) {
        this.maxConcurrentDownloads = maxConcurrentDownloads;
        return this;
    }
    public Long getMaxConcurrentDownloads() {
        return this.maxConcurrentDownloads;
    }

    public ContainerdConfig setRegistryMirrors(java.util.List<String> registryMirrors) {
        this.registryMirrors = registryMirrors;
        return this;
    }
    public java.util.List<String> getRegistryMirrors() {
        return this.registryMirrors;
    }

}
