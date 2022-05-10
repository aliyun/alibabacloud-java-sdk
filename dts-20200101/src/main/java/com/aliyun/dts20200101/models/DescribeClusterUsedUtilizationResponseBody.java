// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeClusterUsedUtilizationResponseBody extends TeaModel {
    // 后端错误码 数字递增
    @NameInMap("Code")
    public String code;

    @NameInMap("CpuTotal")
    public Float cpuTotal;

    @NameInMap("DedicatedClusterId")
    public String dedicatedClusterId;

    @NameInMap("DiskTotal")
    public Float diskTotal;

    @NameInMap("DiskUsed")
    public Float diskUsed;

    @NameInMap("DuTotal")
    public Integer duTotal;

    @NameInMap("DuUsed")
    public Integer duUsed;

    // 动态错误信息，会替换错误码里的 "%s"
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    // 错误短码 ps：InternalError
    @NameInMap("ErrCode")
    public String errCode;

    // 错误信息（返回给用户）
    @NameInMap("ErrMessage")
    public String errMessage;

    // 异常对应的http code
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("MemoryTotal")
    public Float memoryTotal;

    @NameInMap("MemoryUsed")
    public Float memoryUsed;

    @NameInMap("MemoryUsedPercentage")
    public Float memoryUsedPercentage;

    @NameInMap("RequestId")
    public String requestId;

    // 调用结果
    @NameInMap("Success")
    public Boolean success;

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
