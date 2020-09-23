// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaDBInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public GetMetaDBInfoResponseData data;

    public static GetMetaDBInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaDBInfoResponse self = new GetMetaDBInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetMetaDBInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaDBInfoResponse setData(GetMetaDBInfoResponseData data) {
        this.data = data;
        return this;
    }
    public GetMetaDBInfoResponseData getData() {
        return this.data;
    }

    public static class GetMetaDBInfoResponseData extends TeaModel {
        @NameInMap("AppGuid")
        @Validation(required = true)
        public String appGuid;

        @NameInMap("TenantId")
        @Validation(required = true)
        public Long tenantId;

        @NameInMap("Endpoint")
        @Validation(required = true)
        public String endpoint;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("EnvType")
        @Validation(required = true)
        public Integer envType;

        @NameInMap("ProjectName")
        @Validation(required = true)
        public String projectName;

        @NameInMap("ProjectNameCn")
        @Validation(required = true)
        public String projectNameCn;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("ModifyTime")
        @Validation(required = true)
        public Long modifyTime;

        @NameInMap("OwnerId")
        @Validation(required = true)
        public String ownerId;

        @NameInMap("OwnerName")
        @Validation(required = true)
        public String ownerName;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Comment")
        @Validation(required = true)
        public String comment;

        @NameInMap("Location")
        @Validation(required = true)
        public String location;

        @NameInMap("ClusterBizId")
        @Validation(required = true)
        public String clusterBizId;

        public static GetMetaDBInfoResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaDBInfoResponseData self = new GetMetaDBInfoResponseData();
            return TeaModel.build(map, self);
        }

        public GetMetaDBInfoResponseData setAppGuid(String appGuid) {
            this.appGuid = appGuid;
            return this;
        }
        public String getAppGuid() {
            return this.appGuid;
        }

        public GetMetaDBInfoResponseData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public GetMetaDBInfoResponseData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetMetaDBInfoResponseData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetMetaDBInfoResponseData setEnvType(Integer envType) {
            this.envType = envType;
            return this;
        }
        public Integer getEnvType() {
            return this.envType;
        }

        public GetMetaDBInfoResponseData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetMetaDBInfoResponseData setProjectNameCn(String projectNameCn) {
            this.projectNameCn = projectNameCn;
            return this;
        }
        public String getProjectNameCn() {
            return this.projectNameCn;
        }

        public GetMetaDBInfoResponseData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetMetaDBInfoResponseData setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetMetaDBInfoResponseData setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetMetaDBInfoResponseData setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public GetMetaDBInfoResponseData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMetaDBInfoResponseData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetMetaDBInfoResponseData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetMetaDBInfoResponseData setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetMetaDBInfoResponseData setClusterBizId(String clusterBizId) {
            this.clusterBizId = clusterBizId;
            return this;
        }
        public String getClusterBizId() {
            return this.clusterBizId;
        }

    }

}
