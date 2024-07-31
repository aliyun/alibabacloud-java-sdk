// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDataServiceGroupResponseBody extends TeaModel {
    /**
     * <p>The details of the business process.</p>
     */
    @NameInMap("Group")
    public GetDataServiceGroupResponseBodyGroup group;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-EF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDataServiceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceGroupResponseBody self = new GetDataServiceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataServiceGroupResponseBody setGroup(GetDataServiceGroupResponseBodyGroup group) {
        this.group = group;
        return this;
    }
    public GetDataServiceGroupResponseBodyGroup getGroup() {
        return this.group;
    }

    public GetDataServiceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDataServiceGroupResponseBodyGroup extends TeaModel {
        /**
         * <p>The ID of the API group that is associated with the business process in the API Gateway console.</p>
         * 
         * <strong>example:</strong>
         * <p>100abc</p>
         */
        @NameInMap("ApiGatewayGroupId")
        public String apiGatewayGroupId;

        /**
         * <p>The time when the business process was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-09-24T18:37:51+0800</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The user identifier (UID) of the creator of the business process. The value of this parameter may be empty for creators of some existing business processes.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>The description of the business process.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The business process ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ds_123abc</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the business process.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The time when the business process was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-09-24T18:37:51+0800</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10002</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10003</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        public static GetDataServiceGroupResponseBodyGroup build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceGroupResponseBodyGroup self = new GetDataServiceGroupResponseBodyGroup();
            return TeaModel.build(map, self);
        }

        public GetDataServiceGroupResponseBodyGroup setApiGatewayGroupId(String apiGatewayGroupId) {
            this.apiGatewayGroupId = apiGatewayGroupId;
            return this;
        }
        public String getApiGatewayGroupId() {
            return this.apiGatewayGroupId;
        }

        public GetDataServiceGroupResponseBodyGroup setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public GetDataServiceGroupResponseBodyGroup setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetDataServiceGroupResponseBodyGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDataServiceGroupResponseBodyGroup setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetDataServiceGroupResponseBodyGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetDataServiceGroupResponseBodyGroup setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetDataServiceGroupResponseBodyGroup setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
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
