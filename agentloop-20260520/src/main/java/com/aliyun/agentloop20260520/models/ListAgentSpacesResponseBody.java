// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListAgentSpacesResponseBody extends TeaModel {
    /**
     * <p>The AgentSpaces information.</p>
     */
    @NameInMap("agentSpaces")
    public java.util.List<ListAgentSpacesResponseBodyAgentSpaces> agentSpaces;

    /**
     * <p>The maximum number of results returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. This parameter is empty if no more pages are available.</p>
     * 
     * <strong>example:</strong>
     * <p>b5754ef15c784abc8696d82790d2985c</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4E4AC775-2358-5B52-B6FB-171459D7B14B</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>13</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListAgentSpacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentSpacesResponseBody self = new ListAgentSpacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentSpacesResponseBody setAgentSpaces(java.util.List<ListAgentSpacesResponseBodyAgentSpaces> agentSpaces) {
        this.agentSpaces = agentSpaces;
        return this;
    }
    public java.util.List<ListAgentSpacesResponseBodyAgentSpaces> getAgentSpaces() {
        return this.agentSpaces;
    }

    public ListAgentSpacesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAgentSpacesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAgentSpacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAgentSpacesResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListAgentSpacesResponseBodyAgentSpacesMseNamespace extends TeaModel {
        /**
         * <p>The MSE namespace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>phoenixcloud-raw-logs</p>
         */
        @NameInMap("namespaceId")
        public String namespaceId;

        /**
         * <p>The MSE namespace name.</p>
         * 
         * <strong>example:</strong>
         * <p>terraform-alicloud-modules</p>
         */
        @NameInMap("namespaceName")
        public String namespaceName;

        public static ListAgentSpacesResponseBodyAgentSpacesMseNamespace build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSpacesResponseBodyAgentSpacesMseNamespace self = new ListAgentSpacesResponseBodyAgentSpacesMseNamespace();
            return TeaModel.build(map, self);
        }

        public ListAgentSpacesResponseBodyAgentSpacesMseNamespace setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public ListAgentSpacesResponseBodyAgentSpacesMseNamespace setNamespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public String getNamespaceName() {
            return this.namespaceName;
        }

    }

    public static class ListAgentSpacesResponseBodyAgentSpaces extends TeaModel {
        /**
         * <p>The AgentSpace name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-agent-space</p>
         */
        @NameInMap("agentSpace")
        public String agentSpace;

        /**
         * <p>The CMS workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>test-cms-workspace</p>
         */
        @NameInMap("cmsWorkspace")
        public String cmsWorkspace;

        /**
         * <p>The creation time.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2023-08-23T04:06:06Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The MSE namespace.</p>
         */
        @NameInMap("mseNamespace")
        public ListAgentSpacesResponseBodyAgentSpacesMseNamespace mseNamespace;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The Simple Log Service project name.</p>
         * 
         * <strong>example:</strong>
         * <p>default-cms-1152309027070167-cn-beijing</p>
         */
        @NameInMap("slsProject")
        public String slsProject;

        /**
         * <p>The update time.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-02-11T08:40:23Z</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        public static ListAgentSpacesResponseBodyAgentSpaces build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSpacesResponseBodyAgentSpaces self = new ListAgentSpacesResponseBodyAgentSpaces();
            return TeaModel.build(map, self);
        }

        public ListAgentSpacesResponseBodyAgentSpaces setAgentSpace(String agentSpace) {
            this.agentSpace = agentSpace;
            return this;
        }
        public String getAgentSpace() {
            return this.agentSpace;
        }

        public ListAgentSpacesResponseBodyAgentSpaces setCmsWorkspace(String cmsWorkspace) {
            this.cmsWorkspace = cmsWorkspace;
            return this;
        }
        public String getCmsWorkspace() {
            return this.cmsWorkspace;
        }

        public ListAgentSpacesResponseBodyAgentSpaces setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAgentSpacesResponseBodyAgentSpaces setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAgentSpacesResponseBodyAgentSpaces setMseNamespace(ListAgentSpacesResponseBodyAgentSpacesMseNamespace mseNamespace) {
            this.mseNamespace = mseNamespace;
            return this;
        }
        public ListAgentSpacesResponseBodyAgentSpacesMseNamespace getMseNamespace() {
            return this.mseNamespace;
        }

        public ListAgentSpacesResponseBodyAgentSpaces setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListAgentSpacesResponseBodyAgentSpaces setSlsProject(String slsProject) {
            this.slsProject = slsProject;
            return this;
        }
        public String getSlsProject() {
            return this.slsProject;
        }

        public ListAgentSpacesResponseBodyAgentSpaces setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
