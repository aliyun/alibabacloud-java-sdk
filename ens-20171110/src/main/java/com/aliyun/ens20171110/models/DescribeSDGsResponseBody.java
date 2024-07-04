// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSDGsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3703C4AC-9396-458C-8F25-1D701334D309</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the SDGs.</p>
     */
    @NameInMap("SDGs")
    public java.util.List<DescribeSDGsResponseBodySDGs> SDGs;

    public static DescribeSDGsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSDGsResponseBody self = new DescribeSDGsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSDGsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSDGsResponseBody setSDGs(java.util.List<DescribeSDGsResponseBodySDGs> SDGs) {
        this.SDGs = SDGs;
        return this;
    }
    public java.util.List<DescribeSDGsResponseBodySDGs> getSDGs() {
        return this.SDGs;
    }

    public static class DescribeSDGsResponseBodySDGsAvaliableRegionIds extends TeaModel {
        /**
         * <p>The time when the SDG was created on the node.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-27 15:13:26</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-26</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>mock-clone_snapshot_id</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <p>The status of the SDG on the node. Valid values:</p>
         * <ul>
         * <li><strong>sdg_making</strong></li>
         * <li><strong>sdg_saving</strong></li>
         * <li><strong>sdg_copying</strong></li>
         * <li><strong>failed</strong></li>
         * <li><strong>success</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeSDGsResponseBodySDGsAvaliableRegionIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeSDGsResponseBodySDGsAvaliableRegionIds self = new DescribeSDGsResponseBodySDGsAvaliableRegionIds();
            return TeaModel.build(map, self);
        }

        public DescribeSDGsResponseBodySDGsAvaliableRegionIds setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeSDGsResponseBodySDGsAvaliableRegionIds setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSDGsResponseBodySDGsAvaliableRegionIds setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public DescribeSDGsResponseBodySDGsAvaliableRegionIds setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeSDGsResponseBodySDGsDeployedInstanceIds extends TeaModel {
        /**
         * <p>The time when the SDG was deployed on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-27 16:48:43</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The deployment type of the SDG. Valid values:</p>
         * <ul>
         * <li>common: common deployment.</li>
         * <li>overlay: read/write splitting deployment.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>overlay</p>
         */
        @NameInMap("DeploymentType")
        public String deploymentType;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>aic-5x20dyeos****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The deployment status. Valid values:</p>
         * <ul>
         * <li><strong>sdg_deploying</strong></li>
         * <li><strong>failed</strong></li>
         * <li><strong>success</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sdg_deploying</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeSDGsResponseBodySDGsDeployedInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeSDGsResponseBodySDGsDeployedInstanceIds self = new DescribeSDGsResponseBodySDGsDeployedInstanceIds();
            return TeaModel.build(map, self);
        }

        public DescribeSDGsResponseBodySDGsDeployedInstanceIds setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeSDGsResponseBodySDGsDeployedInstanceIds setDeploymentType(String deploymentType) {
            this.deploymentType = deploymentType;
            return this;
        }
        public String getDeploymentType() {
            return this.deploymentType;
        }

        public DescribeSDGsResponseBodySDGsDeployedInstanceIds setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSDGsResponseBodySDGsDeployedInstanceIds setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeSDGsResponseBodySDGs extends TeaModel {
        /**
         * <p>The IDs of available edge nodes.</p>
         */
        @NameInMap("AvaliableRegionIds")
        public java.util.List<DescribeSDGsResponseBodySDGsAvaliableRegionIds> avaliableRegionIds;

        /**
         * <p>The ID of the instance on which the SDG is created.</p>
         * 
         * <strong>example:</strong>
         * <p>aic-5x20dyeos****</p>
         */
        @NameInMap("CreationInstanceId")
        public String creationInstanceId;

        /**
         * <p>The ID of the node on which the SDG is created.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-26</p>
         */
        @NameInMap("CreationRegionId")
        public String creationRegionId;

        /**
         * <p>The time when the SDG was first created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-27 15:07:21</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The deployment information.</p>
         */
        @NameInMap("DeployedInstanceIds")
        public java.util.List<DescribeSDGsResponseBodySDGsDeployedInstanceIds> deployedInstanceIds;

        /**
         * <p>The description of the SDG.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the source SDG from which you want to create an SDG. The value of this parameter is the value of the <strong>FromSDGId</strong> parameter that you need to specify when you call the <a href="https://help.aliyun.com/document_detail/608128.html">CreateSDG</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>sdg-xxxxx</p>
         */
        @NameInMap("ParentSDGId")
        public String parentSDGId;

        /**
         * <p>The ID of the SDG.</p>
         * 
         * <strong>example:</strong>
         * <p>sdg-30e1fdba7196bc****</p>
         */
        @NameInMap("SDGId")
        public String SDGId;

        /**
         * <p>The size of the SDG. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The status of the SDG creation. Valid values:</p>
         * <ul>
         * <li><strong>sdg_making</strong></li>
         * <li><strong>sdg_saving</strong></li>
         * <li><strong>failed</strong></li>
         * <li><strong>success</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the SDG was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-27 16:04:39</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeSDGsResponseBodySDGs build(java.util.Map<String, ?> map) throws Exception {
            DescribeSDGsResponseBodySDGs self = new DescribeSDGsResponseBodySDGs();
            return TeaModel.build(map, self);
        }

        public DescribeSDGsResponseBodySDGs setAvaliableRegionIds(java.util.List<DescribeSDGsResponseBodySDGsAvaliableRegionIds> avaliableRegionIds) {
            this.avaliableRegionIds = avaliableRegionIds;
            return this;
        }
        public java.util.List<DescribeSDGsResponseBodySDGsAvaliableRegionIds> getAvaliableRegionIds() {
            return this.avaliableRegionIds;
        }

        public DescribeSDGsResponseBodySDGs setCreationInstanceId(String creationInstanceId) {
            this.creationInstanceId = creationInstanceId;
            return this;
        }
        public String getCreationInstanceId() {
            return this.creationInstanceId;
        }

        public DescribeSDGsResponseBodySDGs setCreationRegionId(String creationRegionId) {
            this.creationRegionId = creationRegionId;
            return this;
        }
        public String getCreationRegionId() {
            return this.creationRegionId;
        }

        public DescribeSDGsResponseBodySDGs setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeSDGsResponseBodySDGs setDeployedInstanceIds(java.util.List<DescribeSDGsResponseBodySDGsDeployedInstanceIds> deployedInstanceIds) {
            this.deployedInstanceIds = deployedInstanceIds;
            return this;
        }
        public java.util.List<DescribeSDGsResponseBodySDGsDeployedInstanceIds> getDeployedInstanceIds() {
            return this.deployedInstanceIds;
        }

        public DescribeSDGsResponseBodySDGs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSDGsResponseBodySDGs setParentSDGId(String parentSDGId) {
            this.parentSDGId = parentSDGId;
            return this;
        }
        public String getParentSDGId() {
            return this.parentSDGId;
        }

        public DescribeSDGsResponseBodySDGs setSDGId(String SDGId) {
            this.SDGId = SDGId;
            return this;
        }
        public String getSDGId() {
            return this.SDGId;
        }

        public DescribeSDGsResponseBodySDGs setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeSDGsResponseBodySDGs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSDGsResponseBodySDGs setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
