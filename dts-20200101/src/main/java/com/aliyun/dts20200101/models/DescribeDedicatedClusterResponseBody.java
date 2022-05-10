// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDedicatedClusterResponseBody extends TeaModel {
    @NameInMap("CpuUtilization")
    public Long cpuUtilization;

    @NameInMap("DedicatedClusterId")
    public String dedicatedClusterId;

    @NameInMap("DedicatedClusterName")
    public String dedicatedClusterName;

    @NameInMap("DiskUtilization")
    public Long diskUtilization;

    @NameInMap("DtsInstanceID")
    public String dtsInstanceID;

    @NameInMap("Du")
    public Long du;

    @NameInMap("DuUtilization")
    public Long duUtilization;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("GmtCreated")
    public Long gmtCreated;

    @NameInMap("GmtFinished")
    public Long gmtFinished;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("MemUtilization")
    public Long memUtilization;

    @NameInMap("NodeCount")
    public Long nodeCount;

    @NameInMap("OversoldDu")
    public Long oversoldDu;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("State")
    public String state;

    @NameInMap("Success")
    public String success;

    @NameInMap("TotalCpuCore")
    public Long totalCpuCore;

    @NameInMap("TotalDiskGBSize")
    public Long totalDiskGBSize;

    @NameInMap("TotalMemGBSize")
    public Long totalMemGBSize;

    @NameInMap("UsedCpuCore")
    public Long usedCpuCore;

    @NameInMap("UsedDiskGBSize")
    public Long usedDiskGBSize;

    @NameInMap("UsedDu")
    public Long usedDu;

    @NameInMap("UsedMemGBSize")
    public Long usedMemGBSize;

    public static DescribeDedicatedClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedClusterResponseBody self = new DescribeDedicatedClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedClusterResponseBody setCpuUtilization(Long cpuUtilization) {
        this.cpuUtilization = cpuUtilization;
        return this;
    }
    public Long getCpuUtilization() {
        return this.cpuUtilization;
    }

    public DescribeDedicatedClusterResponseBody setDedicatedClusterId(String dedicatedClusterId) {
        this.dedicatedClusterId = dedicatedClusterId;
        return this;
    }
    public String getDedicatedClusterId() {
        return this.dedicatedClusterId;
    }

    public DescribeDedicatedClusterResponseBody setDedicatedClusterName(String dedicatedClusterName) {
        this.dedicatedClusterName = dedicatedClusterName;
        return this;
    }
    public String getDedicatedClusterName() {
        return this.dedicatedClusterName;
    }

    public DescribeDedicatedClusterResponseBody setDiskUtilization(Long diskUtilization) {
        this.diskUtilization = diskUtilization;
        return this;
    }
    public Long getDiskUtilization() {
        return this.diskUtilization;
    }

    public DescribeDedicatedClusterResponseBody setDtsInstanceID(String dtsInstanceID) {
        this.dtsInstanceID = dtsInstanceID;
        return this;
    }
    public String getDtsInstanceID() {
        return this.dtsInstanceID;
    }

    public DescribeDedicatedClusterResponseBody setDu(Long du) {
        this.du = du;
        return this;
    }
    public Long getDu() {
        return this.du;
    }

    public DescribeDedicatedClusterResponseBody setDuUtilization(Long duUtilization) {
        this.duUtilization = duUtilization;
        return this;
    }
    public Long getDuUtilization() {
        return this.duUtilization;
    }

    public DescribeDedicatedClusterResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeDedicatedClusterResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeDedicatedClusterResponseBody setGmtCreated(Long gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public Long getGmtCreated() {
        return this.gmtCreated;
    }

    public DescribeDedicatedClusterResponseBody setGmtFinished(Long gmtFinished) {
        this.gmtFinished = gmtFinished;
        return this;
    }
    public Long getGmtFinished() {
        return this.gmtFinished;
    }

    public DescribeDedicatedClusterResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeDedicatedClusterResponseBody setMemUtilization(Long memUtilization) {
        this.memUtilization = memUtilization;
        return this;
    }
    public Long getMemUtilization() {
        return this.memUtilization;
    }

    public DescribeDedicatedClusterResponseBody setNodeCount(Long nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }
    public Long getNodeCount() {
        return this.nodeCount;
    }

    public DescribeDedicatedClusterResponseBody setOversoldDu(Long oversoldDu) {
        this.oversoldDu = oversoldDu;
        return this;
    }
    public Long getOversoldDu() {
        return this.oversoldDu;
    }

    public DescribeDedicatedClusterResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDedicatedClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDedicatedClusterResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribeDedicatedClusterResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeDedicatedClusterResponseBody setTotalCpuCore(Long totalCpuCore) {
        this.totalCpuCore = totalCpuCore;
        return this;
    }
    public Long getTotalCpuCore() {
        return this.totalCpuCore;
    }

    public DescribeDedicatedClusterResponseBody setTotalDiskGBSize(Long totalDiskGBSize) {
        this.totalDiskGBSize = totalDiskGBSize;
        return this;
    }
    public Long getTotalDiskGBSize() {
        return this.totalDiskGBSize;
    }

    public DescribeDedicatedClusterResponseBody setTotalMemGBSize(Long totalMemGBSize) {
        this.totalMemGBSize = totalMemGBSize;
        return this;
    }
    public Long getTotalMemGBSize() {
        return this.totalMemGBSize;
    }

    public DescribeDedicatedClusterResponseBody setUsedCpuCore(Long usedCpuCore) {
        this.usedCpuCore = usedCpuCore;
        return this;
    }
    public Long getUsedCpuCore() {
        return this.usedCpuCore;
    }

    public DescribeDedicatedClusterResponseBody setUsedDiskGBSize(Long usedDiskGBSize) {
        this.usedDiskGBSize = usedDiskGBSize;
        return this;
    }
    public Long getUsedDiskGBSize() {
        return this.usedDiskGBSize;
    }

    public DescribeDedicatedClusterResponseBody setUsedDu(Long usedDu) {
        this.usedDu = usedDu;
        return this;
    }
    public Long getUsedDu() {
        return this.usedDu;
    }

    public DescribeDedicatedClusterResponseBody setUsedMemGBSize(Long usedMemGBSize) {
        this.usedMemGBSize = usedMemGBSize;
        return this;
    }
    public Long getUsedMemGBSize() {
        return this.usedMemGBSize;
    }

}
