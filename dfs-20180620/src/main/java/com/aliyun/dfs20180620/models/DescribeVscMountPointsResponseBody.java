// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class DescribeVscMountPointsResponseBody extends TeaModel {
    /**
     * <p>The mount point information.</p>
     */
    @NameInMap("MountPoints")
    public java.util.List<DescribeVscMountPointsResponseBodyMountPoints> mountPoints;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>55C5FFD6-BF99-41BD-9C66-FFF39189****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeVscMountPointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVscMountPointsResponseBody self = new DescribeVscMountPointsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVscMountPointsResponseBody setMountPoints(java.util.List<DescribeVscMountPointsResponseBodyMountPoints> mountPoints) {
        this.mountPoints = mountPoints;
        return this;
    }
    public java.util.List<DescribeVscMountPointsResponseBodyMountPoints> getMountPoints() {
        return this.mountPoints;
    }

    public DescribeVscMountPointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVscMountPointsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeVscMountPointsResponseBodyMountPointsInstancesVscs extends TeaModel {
        /**
         * <p>VSC ID</p>
         * 
         * <strong>example:</strong>
         * <p>vsc-asjodjoio****</p>
         */
        @NameInMap("VscId")
        public String vscId;

        @NameInMap("VscName")
        public String vscName;

        /**
         * <p>The mount status of the VSC. Valid values:</p>
         * <ul>
         * <li>NORMAL: The mount operation succeeded.</li>
         * <li>CREATING: The mount operation is in progress.</li>
         * <li>INVALID: The mount operation failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("VscStatus")
        public String vscStatus;

        /**
         * <p>The VSC type. Valid values:</p>
         * <ul>
         * <li>Primary (default): The reserved default VSC on the ECS instance.</li>
         * <li>Secondary: The reusable VSC on the ECS instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Primary</p>
         */
        @NameInMap("VscType")
        public String vscType;

        public static DescribeVscMountPointsResponseBodyMountPointsInstancesVscs build(java.util.Map<String, ?> map) throws Exception {
            DescribeVscMountPointsResponseBodyMountPointsInstancesVscs self = new DescribeVscMountPointsResponseBodyMountPointsInstancesVscs();
            return TeaModel.build(map, self);
        }

        public DescribeVscMountPointsResponseBodyMountPointsInstancesVscs setVscId(String vscId) {
            this.vscId = vscId;
            return this;
        }
        public String getVscId() {
            return this.vscId;
        }

        public DescribeVscMountPointsResponseBodyMountPointsInstancesVscs setVscName(String vscName) {
            this.vscName = vscName;
            return this;
        }
        public String getVscName() {
            return this.vscName;
        }

        public DescribeVscMountPointsResponseBodyMountPointsInstancesVscs setVscStatus(String vscStatus) {
            this.vscStatus = vscStatus;
            return this;
        }
        public String getVscStatus() {
            return this.vscStatus;
        }

        public DescribeVscMountPointsResponseBodyMountPointsInstancesVscs setVscType(String vscType) {
            this.vscType = vscType;
            return this;
        }
        public String getVscType() {
            return this.vscType;
        }

    }

    public static class DescribeVscMountPointsResponseBodyMountPointsInstances extends TeaModel {
        /**
         * <p>The instance ID of the ECS instance on which the HDFS file system is mounted.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1g6zv0ce8oghu7****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance status of the ECS instance on which the HDFS file system is mounted. Valid values:</p>
         * <ul>
         * <li>NORMAL: The mount operation succeeded.</li>
         * <li>CREATING: The mount operation is in progress.</li>
         * <li>INVALID: The mount operation failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The list of VSCs on which the HDFS file system is mounted.</p>
         */
        @NameInMap("Vscs")
        public java.util.List<DescribeVscMountPointsResponseBodyMountPointsInstancesVscs> vscs;

        public static DescribeVscMountPointsResponseBodyMountPointsInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeVscMountPointsResponseBodyMountPointsInstances self = new DescribeVscMountPointsResponseBodyMountPointsInstances();
            return TeaModel.build(map, self);
        }

        public DescribeVscMountPointsResponseBodyMountPointsInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeVscMountPointsResponseBodyMountPointsInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVscMountPointsResponseBodyMountPointsInstances setVscs(java.util.List<DescribeVscMountPointsResponseBodyMountPointsInstancesVscs> vscs) {
            this.vscs = vscs;
            return this;
        }
        public java.util.List<DescribeVscMountPointsResponseBodyMountPointsInstancesVscs> getVscs() {
            return this.vscs;
        }

    }

    public static class DescribeVscMountPointsResponseBodyMountPoints extends TeaModel {
        /**
         * <p>The description of the mount point.</p>
         * 
         * <strong>example:</strong>
         * <p>The HDFS file system mounted on the internal instance</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The number of ECS instances to which the HDFS file system is to be mounted.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InstanceTotalCount")
        public Integer instanceTotalCount;

        /**
         * <p>The ECS instances on which the HDFS file system is mounted.</p>
         */
        @NameInMap("Instances")
        public java.util.List<DescribeVscMountPointsResponseBodyMountPointsInstances> instances;

        /**
         * <p>The alias of the mount point.</p>
         * 
         * <strong>example:</strong>
         * <p>hdfs1</p>
         */
        @NameInMap("MountPointAlias")
        public String mountPointAlias;

        /**
         * <p>The mount point ID.</p>
         * 
         * <strong>example:</strong>
         * <p>f-037cb49e1d-c****.dfs.aliyuncs.com</p>
         */
        @NameInMap("MountPointId")
        public String mountPointId;

        public static DescribeVscMountPointsResponseBodyMountPoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeVscMountPointsResponseBodyMountPoints self = new DescribeVscMountPointsResponseBodyMountPoints();
            return TeaModel.build(map, self);
        }

        public DescribeVscMountPointsResponseBodyMountPoints setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVscMountPointsResponseBodyMountPoints setInstanceTotalCount(Integer instanceTotalCount) {
            this.instanceTotalCount = instanceTotalCount;
            return this;
        }
        public Integer getInstanceTotalCount() {
            return this.instanceTotalCount;
        }

        public DescribeVscMountPointsResponseBodyMountPoints setInstances(java.util.List<DescribeVscMountPointsResponseBodyMountPointsInstances> instances) {
            this.instances = instances;
            return this;
        }
        public java.util.List<DescribeVscMountPointsResponseBodyMountPointsInstances> getInstances() {
            return this.instances;
        }

        public DescribeVscMountPointsResponseBodyMountPoints setMountPointAlias(String mountPointAlias) {
            this.mountPointAlias = mountPointAlias;
            return this;
        }
        public String getMountPointAlias() {
            return this.mountPointAlias;
        }

        public DescribeVscMountPointsResponseBodyMountPoints setMountPointId(String mountPointId) {
            this.mountPointId = mountPointId;
            return this;
        }
        public String getMountPointId() {
            return this.mountPointId;
        }

    }

}
