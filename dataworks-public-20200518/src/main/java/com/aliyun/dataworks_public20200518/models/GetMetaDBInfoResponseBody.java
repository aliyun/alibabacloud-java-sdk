// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaDBInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetMetaDBInfoResponseBodyData data;

    public static GetMetaDBInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaDBInfoResponseBody self = new GetMetaDBInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaDBInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaDBInfoResponseBody setData(GetMetaDBInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMetaDBInfoResponseBodyData getData() {
        return this.data;
    }

    public static class GetMetaDBInfoResponseBodyData extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("AppGuid")
        public String appGuid;

        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("EnvType")
        public Integer envType;

        @NameInMap("ProjectNameCn")
        public String projectNameCn;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("ClusterBizId")
        public String clusterBizId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Location")
        public String location;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        public static GetMetaDBInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaDBInfoResponseBodyData self = new GetMetaDBInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMetaDBInfoResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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

        public GetMetaDBInfoResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetMetaDBInfoResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetMetaDBInfoResponseBodyData setAppGuid(String appGuid) {
            this.appGuid = appGuid;
            return this;
        }
        public String getAppGuid() {
            return this.appGuid;
        }

        public GetMetaDBInfoResponseBodyData setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public GetMetaDBInfoResponseBodyData setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetMetaDBInfoResponseBodyData setEnvType(Integer envType) {
            this.envType = envType;
            return this;
        }
        public Integer getEnvType() {
            return this.envType;
        }

        public GetMetaDBInfoResponseBodyData setProjectNameCn(String projectNameCn) {
            this.projectNameCn = projectNameCn;
            return this;
        }
        public String getProjectNameCn() {
            return this.projectNameCn;
        }

        public GetMetaDBInfoResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetMetaDBInfoResponseBodyData setClusterBizId(String clusterBizId) {
            this.clusterBizId = clusterBizId;
            return this;
        }
        public String getClusterBizId() {
            return this.clusterBizId;
        }

        public GetMetaDBInfoResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMetaDBInfoResponseBodyData setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetMetaDBInfoResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public GetMetaDBInfoResponseBodyData setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

    }

}
