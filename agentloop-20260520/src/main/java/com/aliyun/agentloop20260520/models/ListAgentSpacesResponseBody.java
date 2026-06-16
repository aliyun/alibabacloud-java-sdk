// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListAgentSpacesResponseBody extends TeaModel {
    @NameInMap("agentSpaces")
    public java.util.List<ListAgentSpacesResponseBodyAgentSpaces> agentSpaces;

    @NameInMap("maxResults")
    public Integer maxResults;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("requestId")
    public String requestId;

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
        @NameInMap("namespaceId")
        public String namespaceId;

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
        @NameInMap("agentSpace")
        public String agentSpace;

        @NameInMap("cmsWorkspace")
        public String cmsWorkspace;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         */
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("description")
        public String description;

        @NameInMap("mseNamespace")
        public ListAgentSpacesResponseBodyAgentSpacesMseNamespace mseNamespace;

        @NameInMap("regionId")
        public String regionId;

        @NameInMap("slsProject")
        public String slsProject;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
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
