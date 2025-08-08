// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetWorkspaceResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetWorkspaceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>FE8EE2F1-4880-46BC-A704-5CF63EAF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspaceResponseBody self = new GetWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkspaceResponseBody setData(GetWorkspaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetWorkspaceResponseBodyData getData() {
        return this.data;
    }

    public GetWorkspaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkspaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetWorkspaceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>12345****</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>12345****</p>
         */
        @NameInMap("ServiceAccountId")
        public String serviceAccountId;

        /**
         * <strong>example:</strong>
         * <p>3322****</p>
         */
        @NameInMap("Tid")
        public Long tid;

        /**
         * <strong>example:</strong>
         * <p>vpc-xxxx</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <strong>example:</strong>
         * <p>863020290155****</p>
         */
        @NameInMap("WorkspaceId")
        public Long workspaceId;

        /**
         * <strong>example:</strong>
         * <p>workspace_xxx</p>
         */
        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static GetWorkspaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetWorkspaceResponseBodyData self = new GetWorkspaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetWorkspaceResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetWorkspaceResponseBodyData setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetWorkspaceResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetWorkspaceResponseBodyData setServiceAccountId(String serviceAccountId) {
            this.serviceAccountId = serviceAccountId;
            return this;
        }
        public String getServiceAccountId() {
            return this.serviceAccountId;
        }

        public GetWorkspaceResponseBodyData setTid(Long tid) {
            this.tid = tid;
            return this;
        }
        public Long getTid() {
            return this.tid;
        }

        public GetWorkspaceResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GetWorkspaceResponseBodyData setWorkspaceId(Long workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public Long getWorkspaceId() {
            return this.workspaceId;
        }

        public GetWorkspaceResponseBodyData setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

}
