// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaDBInfoResponseBody extends TeaModel {
    /**
     * <p>The time when the compute engine instance was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("Data")
    public GetMetaDBInfoResponseBodyData data;

    /**
     * <p>test table</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetMetaDBInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaDBInfoResponseBody self = new GetMetaDBInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaDBInfoResponseBody setData(GetMetaDBInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMetaDBInfoResponseBodyData getData() {
        return this.data;
    }

    public GetMetaDBInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMetaDBInfoResponseBodyData extends TeaModel {
        /**
         * <p>The display name of the workspace.</p>
         */
        @NameInMap("AppGuid")
        public String appGuid;

        /**
         * <p>The time when the compute engine instance was modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("ClusterBizId")
        public String clusterBizId;

        /**
         * <p>The name of the workspace.</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The name of the workspace owner.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the tenant.</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The ID of the EMR cluster. This parameter is returned only for an EMR compute engine instance.</p>
         */
        @NameInMap("EnvType")
        public Integer envType;

        @NameInMap("Location")
        public String location;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("Name")
        public String name;

        /**
         * <p>The endpoint of the service.</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>Test items</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <p>The ID of the Alibaba Cloud account used by the workspace owner.</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The type of the environment. Valid values: 0 and 1. The value 0 indicates the development environment. The value 1 indicates the production environment.</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The name of the metadatabase.</p>
         */
        @NameInMap("ProjectNameCn")
        public String projectNameCn;

        @NameInMap("TenantId")
        public Long tenantId;

        /**
         * <p>The ID of the workspace.</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetMetaDBInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaDBInfoResponseBodyData self = new GetMetaDBInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMetaDBInfoResponseBodyData setAppGuid(String appGuid) {
            this.appGuid = appGuid;
            return this;
        }
        public String getAppGuid() {
            return this.appGuid;
        }

        public GetMetaDBInfoResponseBodyData setClusterBizId(String clusterBizId) {
            this.clusterBizId = clusterBizId;
            return this;
        }
        public String getClusterBizId() {
            return this.clusterBizId;
        }

        public GetMetaDBInfoResponseBodyData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetMetaDBInfoResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetMetaDBInfoResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetMetaDBInfoResponseBodyData setEnvType(Integer envType) {
            this.envType = envType;
            return this;
        }
        public Integer getEnvType() {
            return this.envType;
        }

        public GetMetaDBInfoResponseBodyData setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetMetaDBInfoResponseBodyData setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetMetaDBInfoResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMetaDBInfoResponseBodyData setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetMetaDBInfoResponseBodyData setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public GetMetaDBInfoResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetMetaDBInfoResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetMetaDBInfoResponseBodyData setProjectNameCn(String projectNameCn) {
            this.projectNameCn = projectNameCn;
            return this;
        }
        public String getProjectNameCn() {
            return this.projectNameCn;
        }

        public GetMetaDBInfoResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public GetMetaDBInfoResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
