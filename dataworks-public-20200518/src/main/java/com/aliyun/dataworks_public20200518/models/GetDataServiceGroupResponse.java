// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDataServiceGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Group")
    @Validation(required = true)
    public GetDataServiceGroupResponseGroup group;

    public static GetDataServiceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceGroupResponse self = new GetDataServiceGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetDataServiceGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataServiceGroupResponse setGroup(GetDataServiceGroupResponseGroup group) {
        this.group = group;
        return this;
    }
    public GetDataServiceGroupResponseGroup getGroup() {
        return this.group;
    }

    public static class GetDataServiceGroupResponseGroup extends TeaModel {
        @NameInMap("TenantId")
        @Validation(required = true)
        public Long tenantId;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        @NameInMap("ApiGatewayGroupId")
        @Validation(required = true)
        public String apiGatewayGroupId;

        @NameInMap("GroupName")
        @Validation(required = true)
        public String groupName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("CreatedTime")
        @Validation(required = true)
        public String createdTime;

        @NameInMap("ModifiedTime")
        @Validation(required = true)
        public String modifiedTime;

        @NameInMap("CreatorId")
        @Validation(required = true)
        public String creatorId;

        public static GetDataServiceGroupResponseGroup build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceGroupResponseGroup self = new GetDataServiceGroupResponseGroup();
            return TeaModel.build(map, self);
        }

        public GetDataServiceGroupResponseGroup setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public GetDataServiceGroupResponseGroup setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDataServiceGroupResponseGroup setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetDataServiceGroupResponseGroup setApiGatewayGroupId(String apiGatewayGroupId) {
            this.apiGatewayGroupId = apiGatewayGroupId;
            return this;
        }
        public String getApiGatewayGroupId() {
            return this.apiGatewayGroupId;
        }

        public GetDataServiceGroupResponseGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetDataServiceGroupResponseGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDataServiceGroupResponseGroup setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public GetDataServiceGroupResponseGroup setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetDataServiceGroupResponseGroup setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

    }

}
