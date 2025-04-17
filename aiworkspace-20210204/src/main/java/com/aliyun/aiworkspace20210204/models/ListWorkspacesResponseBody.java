// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListWorkspacesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8D7B2E70-F770-505B-A672-09F1D8F2EC1E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The type and quantity of resources that can be activated in a workspace. This list is returned when the Option is set to GetResourceLimits. Valid values:</p>
     * <ul>
     * <li>MaxCompute_share: pay-as-you-go MaxCompute</li>
     * <li>MaxCompute_isolate: subscription MaxCompute</li>
     * <li>DLC_share: pay-as-you-go DLC</li>
     * <li>PAI_Isolate: subscription PAI</li>
     * <li>PAI_share: pay-as-you-go PAI</li>
     * <li>DataWorks_isolate: subscription DataWorks</li>
     * <li>DataWorks_share: pay-as-you-go DataWorks</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{
     *    &quot;MaxCompute_share&quot;: 1,
     *    &quot;MaxCompute_isolate&quot;: 1,
     *    &quot;DLC_share&quot;: 1
     * }</p>
     */
    @NameInMap("ResourceLimits")
    public java.util.Map<String, ?> resourceLimits;

    /**
     * <p>The number of workspaces that meet the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The list of workspace details. This list is returned when Option is set to GetWorkspaces.</p>
     */
    @NameInMap("Workspaces")
    public java.util.List<ListWorkspacesResponseBodyWorkspaces> workspaces;

    public static ListWorkspacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspacesResponseBody self = new ListWorkspacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkspacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkspacesResponseBody setResourceLimits(java.util.Map<String, ?> resourceLimits) {
        this.resourceLimits = resourceLimits;
        return this;
    }
    public java.util.Map<String, ?> getResourceLimits() {
        return this.resourceLimits;
    }

    public ListWorkspacesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListWorkspacesResponseBody setWorkspaces(java.util.List<ListWorkspacesResponseBodyWorkspaces> workspaces) {
        this.workspaces = workspaces;
        return this;
    }
    public java.util.List<ListWorkspacesResponseBodyWorkspaces> getWorkspaces() {
        return this.workspaces;
    }

    public static class ListWorkspacesResponseBodyWorkspaces extends TeaModel {
        /**
         * <p>The names of the administrator accounts.</p>
         */
        @NameInMap("AdminNames")
        public java.util.List<String> adminNames;

        /**
         * <p>The user ID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>122424353535</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The description of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace description example</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The environment types of the workspace.</p>
         */
        @NameInMap("EnvTypes")
        public java.util.List<String> envTypes;

        /**
         * <p>the additional information. Only contains TenantId.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;TenantId&quot;: &quot;4286******98&quot;}</p>
         */
        @NameInMap("ExtraInfos")
        public java.util.Map<String, ?> extraInfos;

        /**
         * <p>The time when the workspace was created. The time (UTC+0) follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ss.SSSZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-21T17:12:35.232Z</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>The time when the workspace was modified. The time (UTC+0) follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ss.SSSZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-21T17:12:35.232Z</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <p>Indicates whether the workspace is the default workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The status of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>ENABLED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        /**
         * <p>The name of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-example</p>
         */
        @NameInMap("WorkspaceName")
        public String workspaceName;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmwp7rky****</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        public static ListWorkspacesResponseBodyWorkspaces build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspacesResponseBodyWorkspaces self = new ListWorkspacesResponseBodyWorkspaces();
            return TeaModel.build(map, self);
        }

        public ListWorkspacesResponseBodyWorkspaces setAdminNames(java.util.List<String> adminNames) {
            this.adminNames = adminNames;
            return this;
        }
        public java.util.List<String> getAdminNames() {
            return this.adminNames;
        }

        public ListWorkspacesResponseBodyWorkspaces setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListWorkspacesResponseBodyWorkspaces setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListWorkspacesResponseBodyWorkspaces setEnvTypes(java.util.List<String> envTypes) {
            this.envTypes = envTypes;
            return this;
        }
        public java.util.List<String> getEnvTypes() {
            return this.envTypes;
        }

        public ListWorkspacesResponseBodyWorkspaces setExtraInfos(java.util.Map<String, ?> extraInfos) {
            this.extraInfos = extraInfos;
            return this;
        }
        public java.util.Map<String, ?> getExtraInfos() {
            return this.extraInfos;
        }

        public ListWorkspacesResponseBodyWorkspaces setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListWorkspacesResponseBodyWorkspaces setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListWorkspacesResponseBodyWorkspaces setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListWorkspacesResponseBodyWorkspaces setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListWorkspacesResponseBodyWorkspaces setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListWorkspacesResponseBodyWorkspaces setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

        public ListWorkspacesResponseBodyWorkspaces setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

}
