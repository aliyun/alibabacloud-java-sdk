// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeMountTargetsResponseBody extends TeaModel {
    /**
     * <p>The information about mount targets.</p>
     */
    @NameInMap("MountTargets")
    public DescribeMountTargetsResponseBodyMountTargets mountTargets;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of mount targets.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeMountTargetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMountTargetsResponseBody self = new DescribeMountTargetsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMountTargetsResponseBody setMountTargets(DescribeMountTargetsResponseBodyMountTargets mountTargets) {
        this.mountTargets = mountTargets;
        return this;
    }
    public DescribeMountTargetsResponseBodyMountTargets getMountTargets() {
        return this.mountTargets;
    }

    public DescribeMountTargetsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMountTargetsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMountTargetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMountTargetsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeMountTargetsResponseBodyMountTargetsMountTargetClientMasterNodesClientMasterNode extends TeaModel {
        /**
         * <p>The default logon password of the ECS instance.</p>
         */
        @NameInMap("DefaultPasswd")
        public String defaultPasswd;

        /**
         * <p>The ID of the ECS instance on the client management node.</p>
         */
        @NameInMap("EcsId")
        public String ecsId;

        /**
         * <p>The IP address of the ECS instance on the client management node.</p>
         */
        @NameInMap("EcsIp")
        public String ecsIp;

        public static DescribeMountTargetsResponseBodyMountTargetsMountTargetClientMasterNodesClientMasterNode build(java.util.Map<String, ?> map) throws Exception {
            DescribeMountTargetsResponseBodyMountTargetsMountTargetClientMasterNodesClientMasterNode self = new DescribeMountTargetsResponseBodyMountTargetsMountTargetClientMasterNodesClientMasterNode();
            return TeaModel.build(map, self);
        }

        public DescribeMountTargetsResponseBodyMountTargetsMountTargetClientMasterNodesClientMasterNode setDefaultPasswd(String defaultPasswd) {
            this.defaultPasswd = defaultPasswd;
            return this;
        }
        public String getDefaultPasswd() {
            return this.defaultPasswd;
        }

        public DescribeMountTargetsResponseBodyMountTargetsMountTargetClientMasterNodesClientMasterNode setEcsId(String ecsId) {
            this.ecsId = ecsId;
            return this;
        }
        public String getEcsId() {
            return this.ecsId;
        }

        public DescribeMountTargetsResponseBodyMountTargetsMountTargetClientMasterNodesClientMasterNode setEcsIp(String ecsIp) {
            this.ecsIp = ecsIp;
            return this;
        }
        public String getEcsIp() {
            return this.ecsIp;
        }

    }

    public static class DescribeMountTargetsResponseBodyMountTargetsMountTargetClientMasterNodes extends TeaModel {
        @NameInMap("ClientMasterNode")
        public java.util.List<DescribeMountTargetsResponseBodyMountTargetsMountTargetClientMasterNodesClientMasterNode> clientMasterNode;

        public static DescribeMountTargetsResponseBodyMountTargetsMountTargetClientMasterNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeMountTargetsResponseBodyMountTargetsMountTargetClientMasterNodes self = new DescribeMountTargetsResponseBodyMountTargetsMountTargetClientMasterNodes();
            return TeaModel.build(map, self);
        }

        public DescribeMountTargetsResponseBodyMountTargetsMountTargetClientMasterNodes setClientMasterNode(java.util.List<DescribeMountTargetsResponseBodyMountTargetsMountTargetClientMasterNodesClientMasterNode> clientMasterNode) {
            this.clientMasterNode = clientMasterNode;
            return this;
        }
        public java.util.List<DescribeMountTargetsResponseBodyMountTargetsMountTargetClientMasterNodesClientMasterNode> getClientMasterNode() {
            return this.clientMasterNode;
        }

    }

    public static class DescribeMountTargetsResponseBodyMountTargetsMountTarget extends TeaModel {
        /**
         * <p>The name of the permission group that is attached to the mount target.</p>
         */
        @NameInMap("AccessGroup")
        public String accessGroup;

        /**
         * <p>The information about client management nodes.</p>
         */
        @NameInMap("ClientMasterNodes")
        public DescribeMountTargetsResponseBodyMountTargetsMountTargetClientMasterNodes clientMasterNodes;

        /**
         * <p>The dual-stack (IPv4 and IPv6) domain name of the mount target.</p>
         */
        @NameInMap("DualStackMountTargetDomain")
        public String dualStackMountTargetDomain;

        /**
         * <p>The type of the mount target.</p>
         * <br>
         * <p>*   IPv4: an IPv4 mount target</p>
         * <p>*   DualStack: a dual-stack mount target</p>
         */
        @NameInMap("IPVersion")
        public String IPVersion;

        /**
         * <p>The IPv4 domain name of the mount target.</p>
         */
        @NameInMap("MountTargetDomain")
        public String mountTargetDomain;

        /**
         * <p>The network type. Valid value: **Vpc**.</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The status of the mount target.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   Active: The mount target is available.</p>
         * <p>*   Inactive: The mount target is unavailable.</p>
         * <p>*   Pending: The mount target is being created or modified.</p>
         * <p>*   Deleting: The mount target is being deleted.</p>
         * <p>*   Hibernating: The mount target is being hibernated.</p>
         * <p>*   Hibernated: The mount target is hibernated.</p>
         * <br>
         * <p>> You can mount a file system only when the mount target of the file system is in the Active state.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the vSwitch.</p>
         */
        @NameInMap("VswId")
        public String vswId;

        public static DescribeMountTargetsResponseBodyMountTargetsMountTarget build(java.util.Map<String, ?> map) throws Exception {
            DescribeMountTargetsResponseBodyMountTargetsMountTarget self = new DescribeMountTargetsResponseBodyMountTargetsMountTarget();
            return TeaModel.build(map, self);
        }

        public DescribeMountTargetsResponseBodyMountTargetsMountTarget setAccessGroup(String accessGroup) {
            this.accessGroup = accessGroup;
            return this;
        }
        public String getAccessGroup() {
            return this.accessGroup;
        }

        public DescribeMountTargetsResponseBodyMountTargetsMountTarget setClientMasterNodes(DescribeMountTargetsResponseBodyMountTargetsMountTargetClientMasterNodes clientMasterNodes) {
            this.clientMasterNodes = clientMasterNodes;
            return this;
        }
        public DescribeMountTargetsResponseBodyMountTargetsMountTargetClientMasterNodes getClientMasterNodes() {
            return this.clientMasterNodes;
        }

        public DescribeMountTargetsResponseBodyMountTargetsMountTarget setDualStackMountTargetDomain(String dualStackMountTargetDomain) {
            this.dualStackMountTargetDomain = dualStackMountTargetDomain;
            return this;
        }
        public String getDualStackMountTargetDomain() {
            return this.dualStackMountTargetDomain;
        }

        public DescribeMountTargetsResponseBodyMountTargetsMountTarget setIPVersion(String IPVersion) {
            this.IPVersion = IPVersion;
            return this;
        }
        public String getIPVersion() {
            return this.IPVersion;
        }

        public DescribeMountTargetsResponseBodyMountTargetsMountTarget setMountTargetDomain(String mountTargetDomain) {
            this.mountTargetDomain = mountTargetDomain;
            return this;
        }
        public String getMountTargetDomain() {
            return this.mountTargetDomain;
        }

        public DescribeMountTargetsResponseBodyMountTargetsMountTarget setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeMountTargetsResponseBodyMountTargetsMountTarget setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeMountTargetsResponseBodyMountTargetsMountTarget setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeMountTargetsResponseBodyMountTargetsMountTarget setVswId(String vswId) {
            this.vswId = vswId;
            return this;
        }
        public String getVswId() {
            return this.vswId;
        }

    }

    public static class DescribeMountTargetsResponseBodyMountTargets extends TeaModel {
        @NameInMap("MountTarget")
        public java.util.List<DescribeMountTargetsResponseBodyMountTargetsMountTarget> mountTarget;

        public static DescribeMountTargetsResponseBodyMountTargets build(java.util.Map<String, ?> map) throws Exception {
            DescribeMountTargetsResponseBodyMountTargets self = new DescribeMountTargetsResponseBodyMountTargets();
            return TeaModel.build(map, self);
        }

        public DescribeMountTargetsResponseBodyMountTargets setMountTarget(java.util.List<DescribeMountTargetsResponseBodyMountTargetsMountTarget> mountTarget) {
            this.mountTarget = mountTarget;
            return this;
        }
        public java.util.List<DescribeMountTargetsResponseBodyMountTargetsMountTarget> getMountTarget() {
            return this.mountTarget;
        }

    }

}
