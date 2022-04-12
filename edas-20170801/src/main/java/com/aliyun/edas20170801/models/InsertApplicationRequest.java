// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertApplicationRequest extends TeaModel {
    @NameInMap("ApplicationName")
    public String applicationName;

    @NameInMap("BuildPackId")
    public Integer buildPackId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ComponentIds")
    public String componentIds;

    @NameInMap("Cpu")
    public Integer cpu;

    @NameInMap("Description")
    public String description;

    @NameInMap("EcuInfo")
    public String ecuInfo;

    @NameInMap("EnablePortCheck")
    public Boolean enablePortCheck;

    @NameInMap("EnableUrlCheck")
    public Boolean enableUrlCheck;

    @NameInMap("HealthCheckURL")
    public String healthCheckURL;

    @NameInMap("HealthCheckUrl")
    public String healthCheckUrl;

    @NameInMap("Hooks")
    public String hooks;

    @NameInMap("Jdk")
    public String jdk;

    @NameInMap("JvmOptions")
    public String jvmOptions;

    @NameInMap("LogicalRegionId")
    public String logicalRegionId;

    @NameInMap("MaxHeapSize")
    public Integer maxHeapSize;

    @NameInMap("MaxPermSize")
    public Integer maxPermSize;

    @NameInMap("Mem")
    public Integer mem;

    @NameInMap("MinHeapSize")
    public Integer minHeapSize;

    @NameInMap("PackageType")
    public String packageType;

    @NameInMap("ReservedPortStr")
    public String reservedPortStr;

    @NameInMap("WebContainer")
    public String webContainer;

    public static InsertApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertApplicationRequest self = new InsertApplicationRequest();
        return TeaModel.build(map, self);
    }

    public InsertApplicationRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public InsertApplicationRequest setBuildPackId(Integer buildPackId) {
        this.buildPackId = buildPackId;
        return this;
    }
    public Integer getBuildPackId() {
        return this.buildPackId;
    }

    public InsertApplicationRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public InsertApplicationRequest setComponentIds(String componentIds) {
        this.componentIds = componentIds;
        return this;
    }
    public String getComponentIds() {
        return this.componentIds;
    }

    public InsertApplicationRequest setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public InsertApplicationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public InsertApplicationRequest setEcuInfo(String ecuInfo) {
        this.ecuInfo = ecuInfo;
        return this;
    }
    public String getEcuInfo() {
        return this.ecuInfo;
    }

    public InsertApplicationRequest setEnablePortCheck(Boolean enablePortCheck) {
        this.enablePortCheck = enablePortCheck;
        return this;
    }
    public Boolean getEnablePortCheck() {
        return this.enablePortCheck;
    }

    public InsertApplicationRequest setEnableUrlCheck(Boolean enableUrlCheck) {
        this.enableUrlCheck = enableUrlCheck;
        return this;
    }
    public Boolean getEnableUrlCheck() {
        return this.enableUrlCheck;
    }

    public InsertApplicationRequest setHealthCheckURL(String healthCheckURL) {
        this.healthCheckURL = healthCheckURL;
        return this;
    }
    public String getHealthCheckURL() {
        return this.healthCheckURL;
    }

    public InsertApplicationRequest setHealthCheckUrl(String healthCheckUrl) {
        this.healthCheckUrl = healthCheckUrl;
        return this;
    }
    public String getHealthCheckUrl() {
        return this.healthCheckUrl;
    }

    public InsertApplicationRequest setHooks(String hooks) {
        this.hooks = hooks;
        return this;
    }
    public String getHooks() {
        return this.hooks;
    }

    public InsertApplicationRequest setJdk(String jdk) {
        this.jdk = jdk;
        return this;
    }
    public String getJdk() {
        return this.jdk;
    }

    public InsertApplicationRequest setJvmOptions(String jvmOptions) {
        this.jvmOptions = jvmOptions;
        return this;
    }
    public String getJvmOptions() {
        return this.jvmOptions;
    }

    public InsertApplicationRequest setLogicalRegionId(String logicalRegionId) {
        this.logicalRegionId = logicalRegionId;
        return this;
    }
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

    public InsertApplicationRequest setMaxHeapSize(Integer maxHeapSize) {
        this.maxHeapSize = maxHeapSize;
        return this;
    }
    public Integer getMaxHeapSize() {
        return this.maxHeapSize;
    }

    public InsertApplicationRequest setMaxPermSize(Integer maxPermSize) {
        this.maxPermSize = maxPermSize;
        return this;
    }
    public Integer getMaxPermSize() {
        return this.maxPermSize;
    }

    public InsertApplicationRequest setMem(Integer mem) {
        this.mem = mem;
        return this;
    }
    public Integer getMem() {
        return this.mem;
    }

    public InsertApplicationRequest setMinHeapSize(Integer minHeapSize) {
        this.minHeapSize = minHeapSize;
        return this;
    }
    public Integer getMinHeapSize() {
        return this.minHeapSize;
    }

    public InsertApplicationRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public InsertApplicationRequest setReservedPortStr(String reservedPortStr) {
        this.reservedPortStr = reservedPortStr;
        return this;
    }
    public String getReservedPortStr() {
        return this.reservedPortStr;
    }

    public InsertApplicationRequest setWebContainer(String webContainer) {
        this.webContainer = webContainer;
        return this;
    }
    public String getWebContainer() {
        return this.webContainer;
    }

}
