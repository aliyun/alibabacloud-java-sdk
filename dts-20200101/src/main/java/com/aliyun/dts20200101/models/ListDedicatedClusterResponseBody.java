// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ListDedicatedClusterResponseBody extends TeaModel {
    /**
     * <p>The statuses of all clusters.</p>
     */
    @NameInMap("DedicatedClusterStatusList")
    public ListDedicatedClusterResponseBodyDedicatedClusterStatusList dedicatedClusterStatusList;

    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the request failed.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>The page number of the returned page. The value must be an integer that is greater than 0. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The total number of clusters that meet the query condition.</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static ListDedicatedClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDedicatedClusterResponseBody self = new ListDedicatedClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDedicatedClusterResponseBody setDedicatedClusterStatusList(ListDedicatedClusterResponseBodyDedicatedClusterStatusList dedicatedClusterStatusList) {
        this.dedicatedClusterStatusList = dedicatedClusterStatusList;
        return this;
    }
    public ListDedicatedClusterResponseBodyDedicatedClusterStatusList getDedicatedClusterStatusList() {
        return this.dedicatedClusterStatusList;
    }

    public ListDedicatedClusterResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListDedicatedClusterResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListDedicatedClusterResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDedicatedClusterResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDedicatedClusterResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public ListDedicatedClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDedicatedClusterResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public ListDedicatedClusterResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class ListDedicatedClusterResponseBodyDedicatedClusterStatusListDedicatedClusterStatus extends TeaModel {
        /**
         * <p>The CPU utilization, in percentage.</p>
         */
        @NameInMap("CpuUtilization")
        public Long cpuUtilization;

        /**
         * <p>The ID of the cluster.</p>
         */
        @NameInMap("DedicatedClusterId")
        public String dedicatedClusterId;

        /**
         * <p>The name of the cluster.</p>
         */
        @NameInMap("DedicatedClusterName")
        public String dedicatedClusterName;

        /**
         * <p>The disk usage.</p>
         */
        @NameInMap("DiskUtilization")
        public Long diskUtilization;

        /**
         * <p>The ID of the DTS instance.</p>
         */
        @NameInMap("DtsInstanceID")
        public String dtsInstanceID;

        /**
         * <p>The number of DTS units (DUs).</p>
         */
        @NameInMap("Du")
        public Long du;

        /**
         * <p>The DU usage, in percentage.</p>
         */
        @NameInMap("DuUtilization")
        public Long duUtilization;

        /**
         * <p>The time when the cluster was created.</p>
         */
        @NameInMap("GmtCreated")
        public Long gmtCreated;

        /**
         * <p>The memory usage.</p>
         */
        @NameInMap("MemUtilization")
        public Long memUtilization;

        /**
         * <p>The number of nodes in the cluster.</p>
         */
        @NameInMap("NodeCount")
        public Long nodeCount;

        /**
         * <p>The number of over-provisioned DUs.</p>
         */
        @NameInMap("OversoldDu")
        public Long oversoldDu;

        /**
         * <p>The ID of the region in which the DTS instance resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status of the cluster. Valid values:</p>
         * <br>
         * <p>*   **init**: The cluster is being initialized.</p>
         * <p>*   **schedule**: The cluster is pending scheduling.</p>
         * <p>*   **running**: The cluster is running.</p>
         * <p>*   **upgrade**: The cluster is being upgraded.</p>
         * <p>*   **downgrade**: The cluster is being downgraded.</p>
         * <p>*   **locked**: The cluster is locked.</p>
         * <p>*   **releasing**: The cluster is being released.</p>
         * <p>*   **released**: The cluster is released.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The total number of CPU cores.</p>
         */
        @NameInMap("TotalCpuCore")
        public Long totalCpuCore;

        /**
         * <p>The total disk capacity. Unit: GB.</p>
         */
        @NameInMap("TotalDiskGBSize")
        public Long totalDiskGBSize;

        /**
         * <p>The total memory capacity. Unit: GB.</p>
         */
        @NameInMap("TotalMemGBSize")
        public Long totalMemGBSize;

        /**
         * <p>The number of used CPU cores.</p>
         */
        @NameInMap("UsedCpuCore")
        public Long usedCpuCore;

        /**
         * <p>The used disk capacity. Unit: GB.</p>
         */
        @NameInMap("UsedDiskGBSize")
        public Long usedDiskGBSize;

        /**
         * <p>The number of used DUs.</p>
         */
        @NameInMap("UsedDu")
        public Long usedDu;

        /**
         * <p>The used memory capacity. Unit: GB.</p>
         */
        @NameInMap("UsedMemGBSize")
        public Long usedMemGBSize;

        public static ListDedicatedClusterResponseBodyDedicatedClusterStatusListDedicatedClusterStatus build(java.util.Map<String, ?> map) throws Exception {
            ListDedicatedClusterResponseBodyDedicatedClusterStatusListDedicatedClusterStatus self = new ListDedicatedClusterResponseBodyDedicatedClusterStatusListDedicatedClusterStatus();
            return TeaModel.build(map, self);
        }

        public ListDedicatedClusterResponseBodyDedicatedClusterStatusListDedicatedClusterStatus setCpuUtilization(Long cpuUtilization) {
            this.cpuUtilization = cpuUtilization;
            return this;
        }
        public Long getCpuUtilization() {
            return this.cpuUtilization;
        }

        public ListDedicatedClusterResponseBodyDedicatedClusterStatusListDedicatedClusterStatus setDedicatedClusterId(String dedicatedClusterId) {
            this.dedicatedClusterId = dedicatedClusterId;
            return this;
        }
        public String getDedicatedClusterId() {
            return this.dedicatedClusterId;
        }

        public ListDedicatedClusterResponseBodyDedicatedClusterStatusListDedicatedClusterStatus setDedicatedClusterName(String dedicatedClusterName) {
            this.dedicatedClusterName = dedicatedClusterName;
            return this;
        }
        public String getDedicatedClusterName() {
            return this.dedicatedClusterName;
        }

        public ListDedicatedClusterResponseBodyDedicatedClusterStatusListDedicatedClusterStatus setDiskUtilization(Long diskUtilization) {
            this.diskUtilization = diskUtilization;
            return this;
        }
        public Long getDiskUtilization() {
            return this.diskUtilization;
        }

        public ListDedicatedClusterResponseBodyDedicatedClusterStatusListDedicatedClusterStatus setDtsInstanceID(String dtsInstanceID) {
            this.dtsInstanceID = dtsInstanceID;
            return this;
        }
        public String getDtsInstanceID() {
            return this.dtsInstanceID;
        }

        public ListDedicatedClusterResponseBodyDedicatedClusterStatusListDedicatedClusterStatus setDu(Long du) {
            this.du = du;
            return this;
        }
        public Long getDu() {
            return this.du;
        }

        public ListDedicatedClusterResponseBodyDedicatedClusterStatusListDedicatedClusterStatus setDuUtilization(Long duUtilization) {
            this.duUtilization = duUtilization;
            return this;
        }
        public Long getDuUtilization() {
            return this.duUtilization;
        }

        public ListDedicatedClusterResponseBodyDedicatedClusterStatusListDedicatedClusterStatus setGmtCreated(Long gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public Long getGmtCreated() {
            return this.gmtCreated;
        }

        public ListDedicatedClusterResponseBodyDedicatedClusterStatusListDedicatedClusterStatus setMemUtilization(Long memUtilization) {
            this.memUtilization = memUtilization;
            return this;
        }
        public Long getMemUtilization() {
            return this.memUtilization;
        }

        public ListDedicatedClusterResponseBodyDedicatedClusterStatusListDedicatedClusterStatus setNodeCount(Long nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Long getNodeCount() {
            return this.nodeCount;
        }

        public ListDedicatedClusterResponseBodyDedicatedClusterStatusListDedicatedClusterStatus setOversoldDu(Long oversoldDu) {
            this.oversoldDu = oversoldDu;
            return this;
        }
        public Long getOversoldDu() {
            return this.oversoldDu;
        }

        public ListDedicatedClusterResponseBodyDedicatedClusterStatusListDedicatedClusterStatus setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListDedicatedClusterResponseBodyDedicatedClusterStatusListDedicatedClusterStatus setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListDedicatedClusterResponseBodyDedicatedClusterStatusListDedicatedClusterStatus setTotalCpuCore(Long totalCpuCore) {
            this.totalCpuCore = totalCpuCore;
            return this;
        }
        public Long getTotalCpuCore() {
            return this.totalCpuCore;
        }

        public ListDedicatedClusterResponseBodyDedicatedClusterStatusListDedicatedClusterStatus setTotalDiskGBSize(Long totalDiskGBSize) {
            this.totalDiskGBSize = totalDiskGBSize;
            return this;
        }
        public Long getTotalDiskGBSize() {
            return this.totalDiskGBSize;
        }

        public ListDedicatedClusterResponseBodyDedicatedClusterStatusListDedicatedClusterStatus setTotalMemGBSize(Long totalMemGBSize) {
            this.totalMemGBSize = totalMemGBSize;
            return this;
        }
        public Long getTotalMemGBSize() {
            return this.totalMemGBSize;
        }

        public ListDedicatedClusterResponseBodyDedicatedClusterStatusListDedicatedClusterStatus setUsedCpuCore(Long usedCpuCore) {
            this.usedCpuCore = usedCpuCore;
            return this;
        }
        public Long getUsedCpuCore() {
            return this.usedCpuCore;
        }

        public ListDedicatedClusterResponseBodyDedicatedClusterStatusListDedicatedClusterStatus setUsedDiskGBSize(Long usedDiskGBSize) {
            this.usedDiskGBSize = usedDiskGBSize;
            return this;
        }
        public Long getUsedDiskGBSize() {
            return this.usedDiskGBSize;
        }

        public ListDedicatedClusterResponseBodyDedicatedClusterStatusListDedicatedClusterStatus setUsedDu(Long usedDu) {
            this.usedDu = usedDu;
            return this;
        }
        public Long getUsedDu() {
            return this.usedDu;
        }

        public ListDedicatedClusterResponseBodyDedicatedClusterStatusListDedicatedClusterStatus setUsedMemGBSize(Long usedMemGBSize) {
            this.usedMemGBSize = usedMemGBSize;
            return this;
        }
        public Long getUsedMemGBSize() {
            return this.usedMemGBSize;
        }

    }

    public static class ListDedicatedClusterResponseBodyDedicatedClusterStatusList extends TeaModel {
        @NameInMap("DedicatedClusterStatus")
        public java.util.List<ListDedicatedClusterResponseBodyDedicatedClusterStatusListDedicatedClusterStatus> dedicatedClusterStatus;

        public static ListDedicatedClusterResponseBodyDedicatedClusterStatusList build(java.util.Map<String, ?> map) throws Exception {
            ListDedicatedClusterResponseBodyDedicatedClusterStatusList self = new ListDedicatedClusterResponseBodyDedicatedClusterStatusList();
            return TeaModel.build(map, self);
        }

        public ListDedicatedClusterResponseBodyDedicatedClusterStatusList setDedicatedClusterStatus(java.util.List<ListDedicatedClusterResponseBodyDedicatedClusterStatusListDedicatedClusterStatus> dedicatedClusterStatus) {
            this.dedicatedClusterStatus = dedicatedClusterStatus;
            return this;
        }
        public java.util.List<ListDedicatedClusterResponseBodyDedicatedClusterStatusListDedicatedClusterStatus> getDedicatedClusterStatus() {
            return this.dedicatedClusterStatus;
        }

    }

}
