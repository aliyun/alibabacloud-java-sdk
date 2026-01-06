// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class GetProtocolMountTargetResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>M18xMA==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("ProtocolMountTarget")
    public GetProtocolMountTargetResponseBodyProtocolMountTarget protocolMountTarget;

    /**
     * <strong>example:</strong>
     * <p>6299428C-3861-435D-AE54-9B330A00****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetProtocolMountTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProtocolMountTargetResponseBody self = new GetProtocolMountTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProtocolMountTargetResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetProtocolMountTargetResponseBody setProtocolMountTarget(GetProtocolMountTargetResponseBodyProtocolMountTarget protocolMountTarget) {
        this.protocolMountTarget = protocolMountTarget;
        return this;
    }
    public GetProtocolMountTargetResponseBodyProtocolMountTarget getProtocolMountTarget() {
        return this.protocolMountTarget;
    }

    public GetProtocolMountTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetProtocolMountTargetResponseBodyProtocolMountTarget extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>DEFAULT_VPC_GROUP_NAME</p>
         */
        @NameInMap("AccessGroupName")
        public String accessGroupName;

        /**
         * <strong>example:</strong>
         * <p>2025-12-22 17:49:25</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>exp-19abf5beab8d****</p>
         */
        @NameInMap("ExportId")
        public String exportId;

        /**
         * <p>Fileset ID。</p>
         * 
         * <strong>example:</strong>
         * <p>fset-299b4ca04de8****</p>
         */
        @NameInMap("FsetId")
        public String fsetId;

        /**
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>cpfs-0229cb80bcc0****-x******.cn-*****.cpfs.aliyuncs.com</p>
         */
        @NameInMap("ProtocolMountTargetDomain")
        public String protocolMountTargetDomain;

        /**
         * <strong>example:</strong>
         * <p>NFS</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>vsw-8vb2qjnxs6hiobzve****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <strong>example:</strong>
         * <p>vpc-bp1h5mxoqfuo3xurf****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static GetProtocolMountTargetResponseBodyProtocolMountTarget build(java.util.Map<String, ?> map) throws Exception {
            GetProtocolMountTargetResponseBodyProtocolMountTarget self = new GetProtocolMountTargetResponseBodyProtocolMountTarget();
            return TeaModel.build(map, self);
        }

        public GetProtocolMountTargetResponseBodyProtocolMountTarget setAccessGroupName(String accessGroupName) {
            this.accessGroupName = accessGroupName;
            return this;
        }
        public String getAccessGroupName() {
            return this.accessGroupName;
        }

        public GetProtocolMountTargetResponseBodyProtocolMountTarget setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetProtocolMountTargetResponseBodyProtocolMountTarget setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetProtocolMountTargetResponseBodyProtocolMountTarget setExportId(String exportId) {
            this.exportId = exportId;
            return this;
        }
        public String getExportId() {
            return this.exportId;
        }

        public GetProtocolMountTargetResponseBodyProtocolMountTarget setFsetId(String fsetId) {
            this.fsetId = fsetId;
            return this;
        }
        public String getFsetId() {
            return this.fsetId;
        }

        public GetProtocolMountTargetResponseBodyProtocolMountTarget setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetProtocolMountTargetResponseBodyProtocolMountTarget setProtocolMountTargetDomain(String protocolMountTargetDomain) {
            this.protocolMountTargetDomain = protocolMountTargetDomain;
            return this;
        }
        public String getProtocolMountTargetDomain() {
            return this.protocolMountTargetDomain;
        }

        public GetProtocolMountTargetResponseBodyProtocolMountTarget setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public GetProtocolMountTargetResponseBodyProtocolMountTarget setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetProtocolMountTargetResponseBodyProtocolMountTarget setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetProtocolMountTargetResponseBodyProtocolMountTarget setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public GetProtocolMountTargetResponseBodyProtocolMountTarget setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
