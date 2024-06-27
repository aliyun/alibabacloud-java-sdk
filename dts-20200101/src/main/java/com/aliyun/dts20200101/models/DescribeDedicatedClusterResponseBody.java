// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDedicatedClusterResponseBody extends TeaModel {
    /**
     * <p>The CPU utilization. Unit: percentage.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("CpuUtilization")
    public Long cpuUtilization;

    /**
     * <p>The ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>dtsCluster****</p>
     */
    @NameInMap("DedicatedClusterId")
    public String dedicatedClusterId;

    /**
     * <p>The name of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>daily_test</p>
     */
    @NameInMap("DedicatedClusterName")
    public String dedicatedClusterName;

    /**
     * <p>The disk usage.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("DiskUtilization")
    public Long diskUtilization;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>dtsb8r****</p>
     */
    @NameInMap("DtsInstanceID")
    public String dtsInstanceID;

    /**
     * <p>The number of DTS units (DUs).</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Du")
    public Long du;

    /**
     * <p>The DU usage. Unit: percentage.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("DuUtilization")
    public Long duUtilization;

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
     * <p>The time when the cluster was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1642476144000</p>
     */
    @NameInMap("GmtCreated")
    public Long gmtCreated;

    /**
     * <p>The time when the cluster stopped.</p>
     * 
     * <strong>example:</strong>
     * <p>1645200000000</p>
     */
    @NameInMap("GmtFinished")
    public Long gmtFinished;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>The memory usage.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MemUtilization")
    public Long memUtilization;

    /**
     * <p>The number of nodes in the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("NodeCount")
    public Long nodeCount;

    /**
     * <p>The number of DUs that exceeds the upper limit.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("OversoldDu")
    public Long oversoldDu;

    /**
     * <p>The ID of the region in which the instance resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>621BB4F8-3016-4FAA-8D5A-5D3163CC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the cluster. Valid values:</p>
     * <ul>
     * <li><strong>init</strong>: The cluster is being initialized.</li>
     * <li><strong>schedule</strong>: The cluster is pending scheduling.</li>
     * <li><strong>running</strong>: The cluster is running.</li>
     * <li><strong>upgrade</strong>: The cluster is being upgraded.</li>
     * <li><strong>downgrade</strong>: The cluster is being downgraded.</li>
     * <li><strong>locked</strong>: The cluster is locked.</li>
     * <li><strong>releasing</strong>: The cluster is being released.</li>
     * <li><strong>released</strong>: The cluster is released.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>inti</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The total number of CPU cores.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCpuCore")
    public Long totalCpuCore;

    /**
     * <p>The total disk size. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("TotalDiskGBSize")
    public Long totalDiskGBSize;

    /**
     * <p>The total amount of memory. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>256</p>
     */
    @NameInMap("TotalMemGBSize")
    public Long totalMemGBSize;

    /**
     * <p>The number of used CPU cores.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("UsedCpuCore")
    public Long usedCpuCore;

    /**
     * <p>The used disk size. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("UsedDiskGBSize")
    public Long usedDiskGBSize;

    /**
     * <p>The number of used DUs.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("UsedDu")
    public Long usedDu;

    /**
     * <p>The amount of used memory. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>128</p>
     */
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
