// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertApplicationRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("BuildPackId")
    public Integer buildPackId;

    @NameInMap("Description")
    public String description;

    @NameInMap("ApplicationName")
    public String applicationName;

    @NameInMap("ReservedPortStr")
    public String reservedPortStr;

    @NameInMap("EcuInfo")
    public String ecuInfo;

    @NameInMap("Cpu")
    public Integer cpu;

    @NameInMap("Mem")
    public Integer mem;

    @NameInMap("HealthCheckURL")
    public String healthCheckURL;

    @NameInMap("LogicalRegionId")
    public String logicalRegionId;

    @NameInMap("Jdk")
    public String jdk;

    @NameInMap("WebContainer")
    public String webContainer;

    @NameInMap("PackageType")
    public String packageType;

    @NameInMap("ComponentIds")
    public String componentIds;

    @NameInMap("Hooks")
    public String hooks;

    @NameInMap("JvmOptions")
    public String jvmOptions;

    @NameInMap("MinHeapSize")
    public Integer minHeapSize;

    @NameInMap("MaxPermSize")
    public Integer maxPermSize;

    @NameInMap("MaxHeapSize")
    public Integer maxHeapSize;

    @NameInMap("EnableUrlCheck")
    public Boolean enableUrlCheck;

    @NameInMap("EnablePortCheck")
    public Boolean enablePortCheck;

    @NameInMap("HealthCheckUrl")
    public String healthCheckUrl;

    public static InsertApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertApplicationRequest self = new InsertApplicationRequest();
        return TeaModel.build(map, self);
    }

    public InsertApplicationRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public InsertApplicationRequest setBuildPackId(Integer buildPackId) {
        this.buildPackId = buildPackId;
        return this;
    }
    public Integer getBuildPackId() {
        return this.buildPackId;
    }

    public InsertApplicationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public InsertApplicationRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public InsertApplicationRequest setReservedPortStr(String reservedPortStr) {
        this.reservedPortStr = reservedPortStr;
        return this;
    }
    public String getReservedPortStr() {
        return this.reservedPortStr;
    }

    public InsertApplicationRequest setEcuInfo(String ecuInfo) {
        this.ecuInfo = ecuInfo;
        return this;
    }
    public String getEcuInfo() {
        return this.ecuInfo;
    }

    public InsertApplicationRequest setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public InsertApplicationRequest setMem(Integer mem) {
        this.mem = mem;
        return this;
    }
    public Integer getMem() {
        return this.mem;
    }

    public InsertApplicationRequest setHealthCheckURL(String healthCheckURL) {
        this.healthCheckURL = healthCheckURL;
        return this;
    }
    public String getHealthCheckURL() {
        return this.healthCheckURL;
    }

    public InsertApplicationRequest setLogicalRegionId(String logicalRegionId) {
        this.logicalRegionId = logicalRegionId;
        return this;
    }
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

    public InsertApplicationRequest setJdk(String jdk) {
        this.jdk = jdk;
        return this;
    }
    public String getJdk() {
        return this.jdk;
    }

    public InsertApplicationRequest setWebContainer(String webContainer) {
        this.webContainer = webContainer;
        return this;
    }
    public String getWebContainer() {
        return this.webContainer;
    }

    public InsertApplicationRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public InsertApplicationRequest setComponentIds(String componentIds) {
        this.componentIds = componentIds;
        return this;
    }
    public String getComponentIds() {
        return this.componentIds;
    }

    public InsertApplicationRequest setHooks(String hooks) {
        this.hooks = hooks;
        return this;
    }
    public String getHooks() {
        return this.hooks;
    }

    public InsertApplicationRequest setJvmOptions(String jvmOptions) {
        this.jvmOptions = jvmOptions;
        return this;
    }
    public String getJvmOptions() {
        return this.jvmOptions;
    }

    public InsertApplicationRequest setMinHeapSize(Integer minHeapSize) {
        this.minHeapSize = minHeapSize;
        return this;
    }
    public Integer getMinHeapSize() {
        return this.minHeapSize;
    }

    public InsertApplicationRequest setMaxPermSize(Integer maxPermSize) {
        this.maxPermSize = maxPermSize;
        return this;
    }
    public Integer getMaxPermSize() {
        return this.maxPermSize;
    }

    public InsertApplicationRequest setMaxHeapSize(Integer maxHeapSize) {
        this.maxHeapSize = maxHeapSize;
        return this;
    }
    public Integer getMaxHeapSize() {
        return this.maxHeapSize;
    }

    public InsertApplicationRequest setEnableUrlCheck(Boolean enableUrlCheck) {
        this.enableUrlCheck = enableUrlCheck;
        return this;
    }
    public Boolean getEnableUrlCheck() {
        return this.enableUrlCheck;
    }

    public InsertApplicationRequest setEnablePortCheck(Boolean enablePortCheck) {
        this.enablePortCheck = enablePortCheck;
        return this;
    }
    public Boolean getEnablePortCheck() {
        return this.enablePortCheck;
    }

    public InsertApplicationRequest setHealthCheckUrl(String healthCheckUrl) {
        this.healthCheckUrl = healthCheckUrl;
        return this;
    }
    public String getHealthCheckUrl() {
        return this.healthCheckUrl;
    }

}
