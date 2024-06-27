// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeClusterUsedUtilizationResponseBody extends TeaModel {
    /**
     * <p>The error code returned by the backend service. The number is incremented.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The CPU utilization of the cluster. Unit: percentage.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("CpuTotal")
    public Float cpuTotal;

    /**
     * <p>The ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>dtscluster_h3fl1cs217sx952</p>
     */
    @NameInMap("DedicatedClusterId")
    public String dedicatedClusterId;

    /**
     * <p>The total disk size of the cluster. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("DiskTotal")
    public Float diskTotal;

    /**
     * <p>The disk usage of the cluster. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>96</p>
     */
    @NameInMap("DiskUsed")
    public Float diskUsed;

    /**
     * <p>The total number of DTS units (DUs).</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("DuTotal")
    public Integer duTotal;

    /**
     * <p>The usage of DUs.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DuUsed")
    public Integer duUsed;

    /**
     * <p>The dynamic part in the error message. This parameter is used to replace %s in the ErrMessage parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Type</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>The Value of Input Parameter %s is not valid.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The total amount of memory. A value of 0 is temporarily returned.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MemoryTotal")
    public Float memoryTotal;

    /**
     * <p>The memory usage. A value of 0 is temporarily returned.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MemoryUsed")
    public Float memoryUsed;

    /**
     * <p>The memory usage.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("MemoryUsedPercentage")
    public Float memoryUsedPercentage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>621BB4F8-3016-4FAA-8D5A-5D3163CC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The number of tasks that are in progress.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TaskRunning")
    public Integer taskRunning;

    public static DescribeClusterUsedUtilizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterUsedUtilizationResponseBody self = new DescribeClusterUsedUtilizationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterUsedUtilizationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeClusterUsedUtilizationResponseBody setCpuTotal(Float cpuTotal) {
        this.cpuTotal = cpuTotal;
        return this;
    }
    public Float getCpuTotal() {
        return this.cpuTotal;
    }

    public DescribeClusterUsedUtilizationResponseBody setDedicatedClusterId(String dedicatedClusterId) {
        this.dedicatedClusterId = dedicatedClusterId;
        return this;
    }
    public String getDedicatedClusterId() {
        return this.dedicatedClusterId;
    }

    public DescribeClusterUsedUtilizationResponseBody setDiskTotal(Float diskTotal) {
        this.diskTotal = diskTotal;
        return this;
    }
    public Float getDiskTotal() {
        return this.diskTotal;
    }

    public DescribeClusterUsedUtilizationResponseBody setDiskUsed(Float diskUsed) {
        this.diskUsed = diskUsed;
        return this;
    }
    public Float getDiskUsed() {
        return this.diskUsed;
    }

    public DescribeClusterUsedUtilizationResponseBody setDuTotal(Integer duTotal) {
        this.duTotal = duTotal;
        return this;
    }
    public Integer getDuTotal() {
        return this.duTotal;
    }

    public DescribeClusterUsedUtilizationResponseBody setDuUsed(Integer duUsed) {
        this.duUsed = duUsed;
        return this;
    }
    public Integer getDuUsed() {
        return this.duUsed;
    }

    public DescribeClusterUsedUtilizationResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeClusterUsedUtilizationResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeClusterUsedUtilizationResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeClusterUsedUtilizationResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeClusterUsedUtilizationResponseBody setMemoryTotal(Float memoryTotal) {
        this.memoryTotal = memoryTotal;
        return this;
    }
    public Float getMemoryTotal() {
        return this.memoryTotal;
    }

    public DescribeClusterUsedUtilizationResponseBody setMemoryUsed(Float memoryUsed) {
        this.memoryUsed = memoryUsed;
        return this;
    }
    public Float getMemoryUsed() {
        return this.memoryUsed;
    }

    public DescribeClusterUsedUtilizationResponseBody setMemoryUsedPercentage(Float memoryUsedPercentage) {
        this.memoryUsedPercentage = memoryUsedPercentage;
        return this;
    }
    public Float getMemoryUsedPercentage() {
        return this.memoryUsedPercentage;
    }

    public DescribeClusterUsedUtilizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClusterUsedUtilizationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeClusterUsedUtilizationResponseBody setTaskRunning(Integer taskRunning) {
        this.taskRunning = taskRunning;
        return this;
    }
    public Integer getTaskRunning() {
        return this.taskRunning;
    }

}
