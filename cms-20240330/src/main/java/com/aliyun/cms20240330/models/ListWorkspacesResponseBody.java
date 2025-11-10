// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListWorkspacesResponseBody extends TeaModel {
    /**
     * <p>Page size
     * Default value:
     *     50
     * Maximum value:
     *     50</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>Pagination Token</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxxxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>264C3E89-XXXX-XXXX-XXXX-CE9C2196C7DC</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Total count</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("total")
    public Integer total;

    /**
     * <p>List of workspaces</p>
     */
    @NameInMap("workspaces")
    public java.util.List<ListWorkspacesResponseBodyWorkspaces> workspaces;

    public static ListWorkspacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspacesResponseBody self = new ListWorkspacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkspacesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListWorkspacesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWorkspacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkspacesResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
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
         * <p>Creation time</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-11T08:21:58Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>Workspace description</p>
         * 
         * <strong>example:</strong>
         * <p>workspace test</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Workspace display name</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-test</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>Last modified time</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-11T08:21:58Z</p>
         */
        @NameInMap("lastModifyTime")
        public String lastModifyTime;

        /**
         * <p>Region ID</p>
         * 
         * <strong>example:</strong>
         * <p>cn-heyuan</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>Log Service project name</p>
         * 
         * <strong>example:</strong>
         * <p>sls-project-test-001</p>
         */
        @NameInMap("slsProject")
        public String slsProject;

        /**
         * <p>Workspace name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-test-001</p>
         */
        @NameInMap("workspaceName")
        public String workspaceName;

        public static ListWorkspacesResponseBodyWorkspaces build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspacesResponseBodyWorkspaces self = new ListWorkspacesResponseBodyWorkspaces();
            return TeaModel.build(map, self);
        }

        public ListWorkspacesResponseBodyWorkspaces setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListWorkspacesResponseBodyWorkspaces setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListWorkspacesResponseBodyWorkspaces setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListWorkspacesResponseBodyWorkspaces setLastModifyTime(String lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }
        public String getLastModifyTime() {
            return this.lastModifyTime;
        }

        public ListWorkspacesResponseBodyWorkspaces setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListWorkspacesResponseBodyWorkspaces setSlsProject(String slsProject) {
            this.slsProject = slsProject;
            return this;
        }
        public String getSlsProject() {
            return this.slsProject;
        }

        public ListWorkspacesResponseBodyWorkspaces setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

}
