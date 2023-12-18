// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSDGDeploymentStatusResponseBody extends TeaModel {
    @NameInMap("DeploymentStatus")
    public java.util.List<DescribeSDGDeploymentStatusResponseBodyDeploymentStatus> deploymentStatus;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeSDGDeploymentStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSDGDeploymentStatusResponseBody self = new DescribeSDGDeploymentStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSDGDeploymentStatusResponseBody setDeploymentStatus(java.util.List<DescribeSDGDeploymentStatusResponseBodyDeploymentStatus> deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
        return this;
    }
    public java.util.List<DescribeSDGDeploymentStatusResponseBodyDeploymentStatus> getDeploymentStatus() {
        return this.deploymentStatus;
    }

    public DescribeSDGDeploymentStatusResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSDGDeploymentStatusResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeSDGDeploymentStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSDGDeploymentStatusResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSDGDeploymentStatusResponseBodyDeploymentStatus extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MountType")
        public String mountType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeSDGDeploymentStatusResponseBodyDeploymentStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeSDGDeploymentStatusResponseBodyDeploymentStatus self = new DescribeSDGDeploymentStatusResponseBodyDeploymentStatus();
            return TeaModel.build(map, self);
        }

        public DescribeSDGDeploymentStatusResponseBodyDeploymentStatus setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSDGDeploymentStatusResponseBodyDeploymentStatus setMountType(String mountType) {
            this.mountType = mountType;
            return this;
        }
        public String getMountType() {
            return this.mountType;
        }

        public DescribeSDGDeploymentStatusResponseBodyDeploymentStatus setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSDGDeploymentStatusResponseBodyDeploymentStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSDGDeploymentStatusResponseBodyDeploymentStatus setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
