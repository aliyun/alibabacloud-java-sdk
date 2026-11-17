// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAgentInstanceMemoryResponseBody extends TeaModel {
    /**
     * <p>The memory configurations and statistics information of agent instances on the current page.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListAgentInstanceMemoryResponseBodyData> data;

    /**
     * <p>The current page number. Pages start from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page used for this query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The unique identifier of the request, which can be used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>01A1CEEB-CDFF-18F9-B2BF-9997600D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of instances that meet the filter conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>14</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAgentInstanceMemoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentInstanceMemoryResponseBody self = new ListAgentInstanceMemoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentInstanceMemoryResponseBody setData(java.util.List<ListAgentInstanceMemoryResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAgentInstanceMemoryResponseBodyData> getData() {
        return this.data;
    }

    public ListAgentInstanceMemoryResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAgentInstanceMemoryResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAgentInstanceMemoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAgentInstanceMemoryResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAgentInstanceMemoryResponseBodyDataUserGroups extends TeaModel {
        /**
         * <p>The user group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>group-aliy****</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The user group name.</p>
         * 
         * <strong>example:</strong>
         * <p>Office user group</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        public static ListAgentInstanceMemoryResponseBodyDataUserGroups build(java.util.Map<String, ?> map) throws Exception {
            ListAgentInstanceMemoryResponseBodyDataUserGroups self = new ListAgentInstanceMemoryResponseBodyDataUserGroups();
            return TeaModel.build(map, self);
        }

        public ListAgentInstanceMemoryResponseBodyDataUserGroups setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListAgentInstanceMemoryResponseBodyDataUserGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

    public static class ListAgentInstanceMemoryResponseBodyDataUserOrgs extends TeaModel {
        /**
         * <p>The organization ID.</p>
         * 
         * <strong>example:</strong>
         * <p>org-aliy****</p>
         */
        @NameInMap("OrgId")
        public String orgId;

        /**
         * <p>The organization name.</p>
         * 
         * <strong>example:</strong>
         * <p>Enterprise office</p>
         */
        @NameInMap("OrgName")
        public String orgName;

        public static ListAgentInstanceMemoryResponseBodyDataUserOrgs build(java.util.Map<String, ?> map) throws Exception {
            ListAgentInstanceMemoryResponseBodyDataUserOrgs self = new ListAgentInstanceMemoryResponseBodyDataUserOrgs();
            return TeaModel.build(map, self);
        }

        public ListAgentInstanceMemoryResponseBodyDataUserOrgs setOrgId(String orgId) {
            this.orgId = orgId;
            return this;
        }
        public String getOrgId() {
            return this.orgId;
        }

        public ListAgentInstanceMemoryResponseBodyDataUserOrgs setOrgName(String orgName) {
            this.orgName = orgName;
            return this;
        }
        public String getOrgName() {
            return this.orgName;
        }

    }

    public static class ListAgentInstanceMemoryResponseBodyData extends TeaModel {
        /**
         * <p>The Agent instance ID, which can be used to set the instance memory switch or clear the instance memory.</p>
         * 
         * <strong>example:</strong>
         * <p>agi-08vm****</p>
         */
        @NameInMap("AgentInstanceId")
        public String agentInstanceId;

        /**
         * <p>The lifecycle status of the agent instance.</p>
         * <ul>
         * <li><code>UNDEPLOYED</code>: Undeployed.</li>
         * <li><code>DEPLOYING</code>: Deploying.</li>
         * <li><code>DEPLOYED</code>: Deployed.</li>
         * <li><code>STARTING</code>: Starting.</li>
         * <li><code>RUNNING</code>: Running.</li>
         * <li><code>STOPPING</code>: Stopping.</li>
         * <li><code>STOPPED</code>: Stopped.</li>
         * <li><code>UNAVAILABLE</code>: Unavailable.</li>
         * <li><code>FAILED</code>: Failed.</li>
         * <li><code>UPGRADING</code>: Upgrading.</li>
         * <li><code>REBUILDING</code>: Resetting.</li>
         * <li><code>DELETING</code>: Deleting.</li>
         * <li><code>DELETED</code>: Deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("AgentInstanceStatus")
        public String agentInstanceStatus;

        /**
         * <p>The business platform to which the Agent belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ENTERPRISE_AGENTIC_COMPUTER</p>
         */
        @NameInMap("AgentPlatform")
        public String agentPlatform;

        /**
         * <p>The Agent provider.</p>
         * 
         * <strong>example:</strong>
         * <p>AgenticComputer</p>
         */
        @NameInMap("AgentProvider")
        public String agentProvider;

        /**
         * <p>The number of undeleted memory backups for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BackupCount")
        public Integer backupCount;

        /**
         * <p>The ID of the end user to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>user01</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The time of the last memory update. The time is returned in the YYYY-MM-DDThh:mm:ss format, which may include fractional seconds. The time value uses the default time zone of the server, and the string does not contain a time zone offset. This field is omitted if the last update time is unavailable.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-26T21:14:36.693</p>
         */
        @NameInMap("LastMemoryUpdatedAt")
        public String lastMemoryUpdatedAt;

        /**
         * <p>The time of the latest backup. The time is returned in the YYYY-MM-DDThh:mm:ss format, which may include fractional seconds. The time value uses the default time zone of the server, and the string does not contain a time zone offset. This field is omitted if the backup time is unavailable.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-26T20:58:00.536</p>
         */
        @NameInMap("LatestBackupAt")
        public String latestBackupAt;

        /**
         * <p>The number of memory entries for the instance. This field may be omitted if statistics are unavailable.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MemoryCount")
        public Long memoryCount;

        /**
         * <p>The memory switch configured for the instance, returned as a string. A value of <code>true</code> indicates that the switch is turned on. A value of <code>false</code> indicates that the switch is turned off.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MemoryEnabled")
        public String memoryEnabled;

        /**
         * <p>The ID of the region where the runtime is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource associated with the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-d8ut****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The runtime ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-d8ut****</p>
         */
        @NameInMap("RuntimeId")
        public String runtimeId;

        /**
         * <p>The runtime name. The associated resource name is returned in preference. If the resource name is unavailable, the instance name is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Office Assistant</p>
         */
        @NameInMap("RuntimeName")
        public String runtimeName;

        /**
         * <p>The list of user groups to which the end user belongs.</p>
         */
        @NameInMap("UserGroups")
        public java.util.List<ListAgentInstanceMemoryResponseBodyDataUserGroups> userGroups;

        /**
         * <p>The username of the end user to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>user01</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <p>The list of organizations to which the end user belongs.</p>
         */
        @NameInMap("UserOrgs")
        public java.util.List<ListAgentInstanceMemoryResponseBodyDataUserOrgs> userOrgs;

        /**
         * <p>The Wuying user ID of the end user.</p>
         * 
         * <strong>example:</strong>
         * <p>0c614d26****</p>
         */
        @NameInMap("WyId")
        public String wyId;

        public static ListAgentInstanceMemoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAgentInstanceMemoryResponseBodyData self = new ListAgentInstanceMemoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAgentInstanceMemoryResponseBodyData setAgentInstanceId(String agentInstanceId) {
            this.agentInstanceId = agentInstanceId;
            return this;
        }
        public String getAgentInstanceId() {
            return this.agentInstanceId;
        }

        public ListAgentInstanceMemoryResponseBodyData setAgentInstanceStatus(String agentInstanceStatus) {
            this.agentInstanceStatus = agentInstanceStatus;
            return this;
        }
        public String getAgentInstanceStatus() {
            return this.agentInstanceStatus;
        }

        public ListAgentInstanceMemoryResponseBodyData setAgentPlatform(String agentPlatform) {
            this.agentPlatform = agentPlatform;
            return this;
        }
        public String getAgentPlatform() {
            return this.agentPlatform;
        }

        public ListAgentInstanceMemoryResponseBodyData setAgentProvider(String agentProvider) {
            this.agentProvider = agentProvider;
            return this;
        }
        public String getAgentProvider() {
            return this.agentProvider;
        }

        public ListAgentInstanceMemoryResponseBodyData setBackupCount(Integer backupCount) {
            this.backupCount = backupCount;
            return this;
        }
        public Integer getBackupCount() {
            return this.backupCount;
        }

        public ListAgentInstanceMemoryResponseBodyData setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public ListAgentInstanceMemoryResponseBodyData setLastMemoryUpdatedAt(String lastMemoryUpdatedAt) {
            this.lastMemoryUpdatedAt = lastMemoryUpdatedAt;
            return this;
        }
        public String getLastMemoryUpdatedAt() {
            return this.lastMemoryUpdatedAt;
        }

        public ListAgentInstanceMemoryResponseBodyData setLatestBackupAt(String latestBackupAt) {
            this.latestBackupAt = latestBackupAt;
            return this;
        }
        public String getLatestBackupAt() {
            return this.latestBackupAt;
        }

        public ListAgentInstanceMemoryResponseBodyData setMemoryCount(Long memoryCount) {
            this.memoryCount = memoryCount;
            return this;
        }
        public Long getMemoryCount() {
            return this.memoryCount;
        }

        public ListAgentInstanceMemoryResponseBodyData setMemoryEnabled(String memoryEnabled) {
            this.memoryEnabled = memoryEnabled;
            return this;
        }
        public String getMemoryEnabled() {
            return this.memoryEnabled;
        }

        public ListAgentInstanceMemoryResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListAgentInstanceMemoryResponseBodyData setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListAgentInstanceMemoryResponseBodyData setRuntimeId(String runtimeId) {
            this.runtimeId = runtimeId;
            return this;
        }
        public String getRuntimeId() {
            return this.runtimeId;
        }

        public ListAgentInstanceMemoryResponseBodyData setRuntimeName(String runtimeName) {
            this.runtimeName = runtimeName;
            return this;
        }
        public String getRuntimeName() {
            return this.runtimeName;
        }

        public ListAgentInstanceMemoryResponseBodyData setUserGroups(java.util.List<ListAgentInstanceMemoryResponseBodyDataUserGroups> userGroups) {
            this.userGroups = userGroups;
            return this;
        }
        public java.util.List<ListAgentInstanceMemoryResponseBodyDataUserGroups> getUserGroups() {
            return this.userGroups;
        }

        public ListAgentInstanceMemoryResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public ListAgentInstanceMemoryResponseBodyData setUserOrgs(java.util.List<ListAgentInstanceMemoryResponseBodyDataUserOrgs> userOrgs) {
            this.userOrgs = userOrgs;
            return this;
        }
        public java.util.List<ListAgentInstanceMemoryResponseBodyDataUserOrgs> getUserOrgs() {
            return this.userOrgs;
        }

        public ListAgentInstanceMemoryResponseBodyData setWyId(String wyId) {
            this.wyId = wyId;
            return this;
        }
        public String getWyId() {
            return this.wyId;
        }

    }

}
