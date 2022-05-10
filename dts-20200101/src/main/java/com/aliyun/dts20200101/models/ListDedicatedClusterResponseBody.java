// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ListDedicatedClusterResponseBody extends TeaModel {
    @NameInMap("DedicatedClusterStatusList")
    public ListDedicatedClusterResponseBodyDedicatedClusterStatusList dedicatedClusterStatusList;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

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

        @NameInMap("GmtCreated")
        public Long gmtCreated;

        @NameInMap("MemUtilization")
        public Long memUtilization;

        @NameInMap("NodeCount")
        public Long nodeCount;

        @NameInMap("OversoldDu")
        public Long oversoldDu;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("State")
        public String state;

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
