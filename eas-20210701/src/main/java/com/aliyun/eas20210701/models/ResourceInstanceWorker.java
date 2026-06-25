// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ResourceInstanceWorker extends TeaModel {
    /**
     * <p>The CPU core limit.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CpuLimit")
    public Integer cpuLimit;

    /**
     * <p>The number of CPU cores requested.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CpuRequest")
    public Integer cpuRequest;

    /**
     * <p>The GPU limit.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("GpuLimit")
    public Integer gpuLimit;

    /**
     * <p>The number of GPUs requested.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("GpuRequest")
    public Integer gpuRequest;

    /**
     * <p>The memory limit.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("MemoryLimit")
    public Long memoryLimit;

    /**
     * <p>The requested memory.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("MemoryRquest")
    public Integer memoryRquest;

    /**
     * <p>The name of the service instance.</p>
     * 
     * <strong>example:</strong>
     * <p>test-india-5bbbfdbc98-****</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Indicates whether the instance is ready.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Ready")
    public Boolean ready;

    /**
     * <p>The number of times the instance has been restarted.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("RestartCount")
    public Long restartCount;

    /**
     * <p>The name of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>test-in****</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The start time of the instance, in UTC (ISO 8601 format).</p>
     * 
     * <strong>example:</strong>
     * <p>2021-05-09T09:56:19Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
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

    public ResourceInstanceWorker setMemoryLimit(Long memoryLimit) {
        this.memoryLimit = memoryLimit;
        return this;
    }
    public Long getMemoryLimit() {
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

    public ResourceInstanceWorker setRestartCount(Long restartCount) {
        this.restartCount = restartCount;
        return this;
    }
    public Long getRestartCount() {
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
