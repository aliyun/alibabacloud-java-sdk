// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ResourceInstanceWorker extends TeaModel {
    /**
     * <p>The maximum number of CPU cores.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CpuLimit")
    public Integer cpuLimit;

    /**
     * <p>The number of CPU cores that you applied for.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CpuRequest")
    public Integer cpuRequest;

    /**
     * <p>The maximum number of GPUs.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("GpuLimit")
    public Integer gpuLimit;

    /**
     * <p>The number of GPUs that you applied for.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("GpuRequest")
    public Integer gpuRequest;

    /**
     * <p>The maximum memory size.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("MemoryLimit")
    public Long memoryLimit;

    /**
     * <p>The memory size that you applied for.</p>
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
     * <p>Indicates whether the instance worker is ready.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Ready")
    public Boolean ready;

    /**
     * <p>The number of times the instance worker restarted.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("RestartCount")
    public Long restartCount;

    /**
     * <p>The service name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-in****</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The time when the instance worker started.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-05-09T09:56:19Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The instance state.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>Terminating</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>Succeeded</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>Unknown</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>Failed</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>Running</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>Pending</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
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
