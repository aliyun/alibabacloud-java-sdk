// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeInstanceSDGStatusResponseBody extends TeaModel {
    @NameInMap("DeploymentStatus")
    public java.util.List<DescribeInstanceSDGStatusResponseBodyDeploymentStatus> deploymentStatus;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <strong>example:</strong>
     * <p>C0003E8B-B930-4F59-ADC0-0E209A9012A8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeInstanceSDGStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSDGStatusResponseBody self = new DescribeInstanceSDGStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSDGStatusResponseBody setDeploymentStatus(java.util.List<DescribeInstanceSDGStatusResponseBodyDeploymentStatus> deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
        return this;
    }
    public java.util.List<DescribeInstanceSDGStatusResponseBodyDeploymentStatus> getDeploymentStatus() {
        return this.deploymentStatus;
    }

    public DescribeInstanceSDGStatusResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstanceSDGStatusResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeInstanceSDGStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceSDGStatusResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeInstanceSDGStatusResponseBodyDeploymentStatus extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cn-guangzhou-26</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <strong>example:</strong>
         * <p>aic-xxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>shared</p>
         */
        @NameInMap("MountType")
        public String mountType;

        /**
         * <strong>example:</strong>
         * <p>attach</p>
         */
        @NameInMap("Phase")
        public String phase;

        /**
         * <strong>example:</strong>
         * <p>sdg-xxxxxxx</p>
         */
        @NameInMap("SDGId")
        public String SDGId;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>2023-02-17T02:44:31Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeInstanceSDGStatusResponseBodyDeploymentStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSDGStatusResponseBodyDeploymentStatus self = new DescribeInstanceSDGStatusResponseBodyDeploymentStatus();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSDGStatusResponseBodyDeploymentStatus setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeInstanceSDGStatusResponseBodyDeploymentStatus setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceSDGStatusResponseBodyDeploymentStatus setMountType(String mountType) {
            this.mountType = mountType;
            return this;
        }
        public String getMountType() {
            return this.mountType;
        }

        public DescribeInstanceSDGStatusResponseBodyDeploymentStatus setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public DescribeInstanceSDGStatusResponseBodyDeploymentStatus setSDGId(String SDGId) {
            this.SDGId = SDGId;
            return this;
        }
        public String getSDGId() {
            return this.SDGId;
        }

        public DescribeInstanceSDGStatusResponseBodyDeploymentStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInstanceSDGStatusResponseBodyDeploymentStatus setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
