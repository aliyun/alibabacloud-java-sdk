// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeMountTargetsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("MountTargets")
    public DescribeMountTargetsResponseBodyMountTargets mountTargets;

    public static DescribeMountTargetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMountTargetsResponseBody self = new DescribeMountTargetsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMountTargetsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMountTargetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMountTargetsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMountTargetsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeMountTargetsResponseBody setMountTargets(DescribeMountTargetsResponseBodyMountTargets mountTargets) {
        this.mountTargets = mountTargets;
        return this;
    }
    public DescribeMountTargetsResponseBodyMountTargets getMountTargets() {
        return this.mountTargets;
    }

    public static class DescribeMountTargetsResponseBodyMountTargetsMountTargetClientMasterNodesClientMasterNode extends TeaModel {
        @NameInMap("EcsIp")
        public String ecsIp;

        @NameInMap("EcsId")
        public String ecsId;

        @NameInMap("DefaultPasswd")
        public String defaultPasswd;

        public static DescribeMountTargetsResponseBodyMountTargetsMountTargetClientMasterNodesClientMasterNode build(java.util.Map<String, ?> map) throws Exception {
            DescribeMountTargetsResponseBodyMountTargetsMountTargetClientMasterNodesClientMasterNode self = new DescribeMountTargetsResponseBodyMountTargetsMountTargetClientMasterNodesClientMasterNode();
            return TeaModel.build(map, self);
        }

        public DescribeMountTargetsResponseBodyMountTargetsMountTargetClientMasterNodesClientMasterNode setEcsIp(String ecsIp) {
            this.ecsIp = ecsIp;
            return this;
        }
        public String getEcsIp() {
            return this.ecsIp;
        }

        public DescribeMountTargetsResponseBodyMountTargetsMountTargetClientMasterNodesClientMasterNode setEcsId(String ecsId) {
            this.ecsId = ecsId;
            return this;
        }
        public String getEcsId() {
            return this.ecsId;
        }

        public DescribeMountTargetsResponseBodyMountTargetsMountTargetClientMasterNodesClientMasterNode setDefaultPasswd(String defaultPasswd) {
            this.defaultPasswd = defaultPasswd;
            return this;
        }
        public String getDefaultPasswd() {
            return this.defaultPasswd;
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
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("Status")
        public String status;

        @NameInMap("MountTargetDomain")
        public String mountTargetDomain;

        @NameInMap("AccessGroup")
        public String accessGroup;

        @NameInMap("DualStackMountTargetDomain")
        public String dualStackMountTargetDomain;

        @NameInMap("VswId")
        public String vswId;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("ClientMasterNodes")
        public DescribeMountTargetsResponseBodyMountTargetsMountTargetClientMasterNodes clientMasterNodes;

        public static DescribeMountTargetsResponseBodyMountTargetsMountTarget build(java.util.Map<String, ?> map) throws Exception {
            DescribeMountTargetsResponseBodyMountTargetsMountTarget self = new DescribeMountTargetsResponseBodyMountTargetsMountTarget();
            return TeaModel.build(map, self);
        }

        public DescribeMountTargetsResponseBodyMountTargetsMountTarget setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeMountTargetsResponseBodyMountTargetsMountTarget setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeMountTargetsResponseBodyMountTargetsMountTarget setMountTargetDomain(String mountTargetDomain) {
            this.mountTargetDomain = mountTargetDomain;
            return this;
        }
        public String getMountTargetDomain() {
            return this.mountTargetDomain;
        }

        public DescribeMountTargetsResponseBodyMountTargetsMountTarget setAccessGroup(String accessGroup) {
            this.accessGroup = accessGroup;
            return this;
        }
        public String getAccessGroup() {
            return this.accessGroup;
        }

        public DescribeMountTargetsResponseBodyMountTargetsMountTarget setDualStackMountTargetDomain(String dualStackMountTargetDomain) {
            this.dualStackMountTargetDomain = dualStackMountTargetDomain;
            return this;
        }
        public String getDualStackMountTargetDomain() {
            return this.dualStackMountTargetDomain;
        }

        public DescribeMountTargetsResponseBodyMountTargetsMountTarget setVswId(String vswId) {
            this.vswId = vswId;
            return this;
        }
        public String getVswId() {
            return this.vswId;
        }

        public DescribeMountTargetsResponseBodyMountTargetsMountTarget setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeMountTargetsResponseBodyMountTargetsMountTarget setClientMasterNodes(DescribeMountTargetsResponseBodyMountTargetsMountTargetClientMasterNodes clientMasterNodes) {
            this.clientMasterNodes = clientMasterNodes;
            return this;
        }
        public DescribeMountTargetsResponseBodyMountTargetsMountTargetClientMasterNodes getClientMasterNodes() {
            return this.clientMasterNodes;
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
