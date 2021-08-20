// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDataServiceGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Group")
    public GetDataServiceGroupResponseBodyGroup group;

    public static GetDataServiceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceGroupResponseBody self = new GetDataServiceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataServiceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataServiceGroupResponseBody setGroup(GetDataServiceGroupResponseBodyGroup group) {
        this.group = group;
        return this;
    }
    public GetDataServiceGroupResponseBodyGroup getGroup() {
        return this.group;
    }

    public static class GetDataServiceGroupResponseBodyGroup extends TeaModel {
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("ApiGatewayGroupId")
        public String apiGatewayGroupId;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("TenantId")
        public Long tenantId;

        public static GetDataServiceGroupResponseBodyGroup build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceGroupResponseBodyGroup self = new GetDataServiceGroupResponseBodyGroup();
            return TeaModel.build(map, self);
        }

        public GetDataServiceGroupResponseBodyGroup setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetDataServiceGroupResponseBodyGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDataServiceGroupResponseBodyGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetDataServiceGroupResponseBodyGroup setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetDataServiceGroupResponseBodyGroup setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDataServiceGroupResponseBodyGroup setApiGatewayGroupId(String apiGatewayGroupId) {
            this.apiGatewayGroupId = apiGatewayGroupId;
            return this;
        }
        public String getApiGatewayGroupId() {
            return this.apiGatewayGroupId;
        }

        public GetDataServiceGroupResponseBodyGroup setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetDataServiceGroupResponseBodyGroup setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public GetDataServiceGroupResponseBodyGroup setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

}
