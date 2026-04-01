// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeMountTargetsResponseBody extends TeaModel {
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
        @NameInMap("DefaultPasswd")
        public String defaultPasswd;

        @NameInMap("EcsId")
        public String ecsId;

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

    public static class DescribeMountTargetsResponseBodyMountTargetsMountTargetTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeMountTargetsResponseBodyMountTargetsMountTargetTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeMountTargetsResponseBodyMountTargetsMountTargetTagsTag self = new DescribeMountTargetsResponseBodyMountTargetsMountTargetTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeMountTargetsResponseBodyMountTargetsMountTargetTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeMountTargetsResponseBodyMountTargetsMountTargetTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeMountTargetsResponseBodyMountTargetsMountTargetTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeMountTargetsResponseBodyMountTargetsMountTargetTagsTag> tag;

        public static DescribeMountTargetsResponseBodyMountTargetsMountTargetTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeMountTargetsResponseBodyMountTargetsMountTargetTags self = new DescribeMountTargetsResponseBodyMountTargetsMountTargetTags();
            return TeaModel.build(map, self);
        }

        public DescribeMountTargetsResponseBodyMountTargetsMountTargetTags setTag(java.util.List<DescribeMountTargetsResponseBodyMountTargetsMountTargetTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeMountTargetsResponseBodyMountTargetsMountTargetTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeMountTargetsResponseBodyMountTargetsMountTarget extends TeaModel {
        @NameInMap("AccessGroup")
        public String accessGroup;

        @NameInMap("ClientMasterNodes")
        public DescribeMountTargetsResponseBodyMountTargetsMountTargetClientMasterNodes clientMasterNodes;

        @NameInMap("DualStackMountTargetDomain")
        public String dualStackMountTargetDomain;

        @NameInMap("IPVersion")
        public String IPVersion;

        @NameInMap("MountTargetDomain")
        public String mountTargetDomain;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public DescribeMountTargetsResponseBodyMountTargetsMountTargetTags tags;

        @NameInMap("VpcId")
        public String vpcId;

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

        public DescribeMountTargetsResponseBodyMountTargetsMountTarget setTags(DescribeMountTargetsResponseBodyMountTargetsMountTargetTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeMountTargetsResponseBodyMountTargetsMountTargetTags getTags() {
            return this.tags;
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
