// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeProtocolMountTargetResponseBody extends TeaModel {
    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>aBcdeg==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The export directories of the protocol service.</p>
     */
    @NameInMap("ProtocolMountTargets")
    public java.util.List<DescribeProtocolMountTargetResponseBodyProtocolMountTargets> protocolMountTargets;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeProtocolMountTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProtocolMountTargetResponseBody self = new DescribeProtocolMountTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProtocolMountTargetResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeProtocolMountTargetResponseBody setProtocolMountTargets(java.util.List<DescribeProtocolMountTargetResponseBodyProtocolMountTargets> protocolMountTargets) {
        this.protocolMountTargets = protocolMountTargets;
        return this;
    }
    public java.util.List<DescribeProtocolMountTargetResponseBodyProtocolMountTargets> getProtocolMountTargets() {
        return this.protocolMountTargets;
    }

    public DescribeProtocolMountTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeProtocolMountTargetResponseBodyProtocolMountTargets extends TeaModel {
        /**
         * <p>The permission group that is associated with the export directory of the protocol service.</p>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT_VPC_GROUP_NAME</p>
         */
        @NameInMap("AccessGroupName")
        public String accessGroupName;

        /**
         * <p>The time when the export directory of the protocol service was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-12-12T07:28:38Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the export directory for the protocol service.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the export directory for the protocol service.</p>
         * 
         * <strong>example:</strong>
         * <p>exp-19abf5beab8d****</p>
         */
        @NameInMap("ExportId")
        public String exportId;

        /**
         * <p>The fileset ID of the export directory for the protocol service.</p>
         * 
         * <strong>example:</strong>
         * <p>fset-1902718ea0ae****</p>
         */
        @NameInMap("FsetId")
        public String fsetId;

        /**
         * <p>The export directory of the protocol service.</p>
         * 
         * <strong>example:</strong>
         * <p>/path/</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The domain name of the export directory for the protocol service.</p>
         * 
         * <strong>example:</strong>
         * <p>cpfs-123****.cn-hangzhou.cpfs.aliyuncs.com</p>
         */
        @NameInMap("ProtocolMountTargetDomain")
        public String protocolMountTargetDomain;

        /**
         * <p>The ID of the protocol service.</p>
         * 
         * <strong>example:</strong>
         * <p>ptc-123****</p>
         */
        @NameInMap("ProtocolServiceId")
        public String protocolServiceId;

        /**
         * <p>The protocol type supported by the protocol service.</p>
         * 
         * <strong>example:</strong>
         * <p>NFS</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The status of the mount target.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The vSwitch ID of the export directory for the protocol service.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2vc3c2lybvdllxyq4****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>A list of IDs for the zone-redundant vSwitches.</p>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>The VPC ID of the export directory for the protocol service.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2vct297b8157bth9z****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeProtocolMountTargetResponseBodyProtocolMountTargets build(java.util.Map<String, ?> map) throws Exception {
            DescribeProtocolMountTargetResponseBodyProtocolMountTargets self = new DescribeProtocolMountTargetResponseBodyProtocolMountTargets();
            return TeaModel.build(map, self);
        }

        public DescribeProtocolMountTargetResponseBodyProtocolMountTargets setAccessGroupName(String accessGroupName) {
            this.accessGroupName = accessGroupName;
            return this;
        }
        public String getAccessGroupName() {
            return this.accessGroupName;
        }

        public DescribeProtocolMountTargetResponseBodyProtocolMountTargets setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeProtocolMountTargetResponseBodyProtocolMountTargets setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeProtocolMountTargetResponseBodyProtocolMountTargets setExportId(String exportId) {
            this.exportId = exportId;
            return this;
        }
        public String getExportId() {
            return this.exportId;
        }

        public DescribeProtocolMountTargetResponseBodyProtocolMountTargets setFsetId(String fsetId) {
            this.fsetId = fsetId;
            return this;
        }
        public String getFsetId() {
            return this.fsetId;
        }

        public DescribeProtocolMountTargetResponseBodyProtocolMountTargets setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeProtocolMountTargetResponseBodyProtocolMountTargets setProtocolMountTargetDomain(String protocolMountTargetDomain) {
            this.protocolMountTargetDomain = protocolMountTargetDomain;
            return this;
        }
        public String getProtocolMountTargetDomain() {
            return this.protocolMountTargetDomain;
        }

        public DescribeProtocolMountTargetResponseBodyProtocolMountTargets setProtocolServiceId(String protocolServiceId) {
            this.protocolServiceId = protocolServiceId;
            return this;
        }
        public String getProtocolServiceId() {
            return this.protocolServiceId;
        }

        public DescribeProtocolMountTargetResponseBodyProtocolMountTargets setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public DescribeProtocolMountTargetResponseBodyProtocolMountTargets setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeProtocolMountTargetResponseBodyProtocolMountTargets setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeProtocolMountTargetResponseBodyProtocolMountTargets setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public DescribeProtocolMountTargetResponseBodyProtocolMountTargets setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
