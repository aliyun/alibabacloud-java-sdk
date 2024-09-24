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
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3BAB90FD-B4A0-48DA-9F09-2B963510****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of mount targets.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>12****</p>
         */
        @NameInMap("DefaultPasswd")
        public String defaultPasswd;

        /**
         * <p>The ID of the ECS instance on the client management node.</p>
         * 
         * <strong>example:</strong>
         * <p>i-hp3i3odi5ory1buo****</p>
         */
        @NameInMap("EcsId")
        public String ecsId;

        /**
         * <p>The IP address of the ECS instance on the client management node.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.0</p>
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
         * 
         * <strong>example:</strong>
         * <p>DEFAULT_VPC_GROUP_NAME</p>
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
         * 
         * <strong>example:</strong>
         * <p>174494b666-x****.dualstack.cn-hangzhou.nas.aliyuncs.com</p>
         */
        @NameInMap("DualStackMountTargetDomain")
        public String dualStackMountTargetDomain;

        /**
         * <p>The type of the mount target.</p>
         * <ul>
         * <li>IPv4: an IPv4 mount target</li>
         * <li>DualStack: a dual-stack mount target</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("IPVersion")
        public String IPVersion;

        /**
         * <p>The IPv4 domain name of the mount target.</p>
         * 
         * <strong>example:</strong>
         * <p>1ca404a666-w****.cn-hangzhou.nas.aliyuncs.com</p>
         */
        @NameInMap("MountTargetDomain")
        public String mountTargetDomain;

        /**
         * <p>The network type. Valid value: <strong>Vpc</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Vpc</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The status of the mount target.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Active: The mount target is available.</li>
         * <li>Inactive: The mount target is unavailable.</li>
         * <li>Pending: The mount target is being created or modified.</li>
         * <li>Deleting: The mount target is being deleted.</li>
         * <li>Hibernating: The mount target is being hibernated.</li>
         * <li>Hibernated: The mount target is hibernated.</li>
         * </ul>
         * <blockquote>
         * <p>You can mount a file system only when the mount target of the file system is in the Active state.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zesj9afh3y518k9o****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2zevmwkwyztjuoffg****</p>
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
