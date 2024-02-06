// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSDGDeploymentStatusResponseBody extends TeaModel {
    /**
     * <p>The deployment information of the SDG.</p>
     */
    @NameInMap("DeploymentStatus")
    public java.util.List<DescribeSDGDeploymentStatusResponseBodyDeploymentStatus> deploymentStatus;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of queried deployment records.</p>
     */
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
        /**
         * <p>The ID of the instance</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The deployment type.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   overlay</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    read/write splitting</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         * <br>
         * <p>*   common</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    common deployment</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         */
        @NameInMap("MountType")
        public String mountType;

        /**
         * <p>The ID of the node.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The deployment status of the SDG.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   sdg_deploying</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   success</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   failed</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the status was last updated.</p>
         */
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
