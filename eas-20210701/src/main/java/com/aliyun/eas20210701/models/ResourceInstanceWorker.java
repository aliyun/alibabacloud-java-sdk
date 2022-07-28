// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ResourceInstanceWorker extends TeaModel {
    @NameInMap("CpuLimit")
    public Integer cpuLimit;

    @NameInMap("CpuRequest")
    public Integer cpuRequest;

    @NameInMap("GpuLimit")
    public Integer gpuLimit;

    @NameInMap("GpuRequest")
    public Integer gpuRequest;

    @NameInMap("MemoryLimit")
    public Integer memoryLimit;

    @NameInMap("MemoryRquest")
    public Integer memoryRquest;

    @NameInMap("Name")
    public String name;

    @NameInMap("Ready")
    public Boolean ready;

    @NameInMap("RestartCount")
    public Integer restartCount;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Status")
    public String status;

    public static ResourceInstanceWorker build(java.util.Map<String, ?> map) throws Exception {
        ResourceInstanceWorker self = new ResourceInstanceWorker();
        return TeaModel.build(map, self);
    }

    public ResourceInstanceWorker setCpuLimit(Integer cpuLimit) {
        this.cpuLimit = cpuLimit;
        return this;
    }
    public Integer getCpuLimit() {
        return this.cpuLimit;
    }

    public ResourceInstanceWorker setCpuRequest(Integer cpuRequest) {
        this.cpuRequest = cpuRequest;
        return this;
    }
    public Integer getCpuRequest() {
        return this.cpuRequest;
    }

    public ResourceInstanceWorker setGpuLimit(Integer gpuLimit) {
        this.gpuLimit = gpuLimit;
        return this;
    }
    public Integer getGpuLimit() {
        return this.gpuLimit;
    }

    public ResourceInstanceWorker setGpuRequest(Integer gpuRequest) {
        this.gpuRequest = gpuRequest;
        return this;
    }
    public Integer getGpuRequest() {
        return this.gpuRequest;
    }

    public ResourceInstanceWorker setMemoryLimit(Integer memoryLimit) {
        this.memoryLimit = memoryLimit;
        return this;
    }
    public Integer getMemoryLimit() {
        return this.memoryLimit;
    }

    public ResourceInstanceWorker setMemoryRquest(Integer memoryRquest) {
        this.memoryRquest = memoryRquest;
        return this;
    }
    public Integer getMemoryRquest() {
        return this.memoryRquest;
    }

    public ResourceInstanceWorker setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ResourceInstanceWorker setReady(Boolean ready) {
        this.ready = ready;
        return this;
    }
    public Boolean getReady() {
        return this.ready;
    }

    public ResourceInstanceWorker setRestartCount(Integer restartCount) {
        this.restartCount = restartCount;
        return this;
    }
    public Integer getRestartCount() {
        return this.restartCount;
    }

    public ResourceInstanceWorker setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public ResourceInstanceWorker setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ResourceInstanceWorker setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
