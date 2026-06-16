// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class GetAgentSpaceResponseBody extends TeaModel {
    @NameInMap("agentSpace")
    public String agentSpace;

    @NameInMap("cmsWorkspace")
    public String cmsWorkspace;

    @NameInMap("cmsWorkspaceBindType")
    public String cmsWorkspaceBindType;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
     */
    @NameInMap("createTime")
    public String createTime;

    @NameInMap("description")
    public String description;

    @NameInMap("mseNamespace")
    public GetAgentSpaceResponseBodyMseNamespace mseNamespace;

    @NameInMap("regionId")
    public String regionId;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("slsProject")
    public String slsProject;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
     */
    @NameInMap("updateTime")
    public String updateTime;

    public static GetAgentSpaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentSpaceResponseBody self = new GetAgentSpaceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentSpaceResponseBody setAgentSpace(String agentSpace) {
        this.agentSpace = agentSpace;
        return this;
    }
    public String getAgentSpace() {
        return this.agentSpace;
    }

    public GetAgentSpaceResponseBody setCmsWorkspace(String cmsWorkspace) {
        this.cmsWorkspace = cmsWorkspace;
        return this;
    }
    public String getCmsWorkspace() {
        return this.cmsWorkspace;
    }

    public GetAgentSpaceResponseBody setCmsWorkspaceBindType(String cmsWorkspaceBindType) {
        this.cmsWorkspaceBindType = cmsWorkspaceBindType;
        return this;
    }
    public String getCmsWorkspaceBindType() {
        return this.cmsWorkspaceBindType;
    }

    public GetAgentSpaceResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetAgentSpaceResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetAgentSpaceResponseBody setMseNamespace(GetAgentSpaceResponseBodyMseNamespace mseNamespace) {
        this.mseNamespace = mseNamespace;
        return this;
    }
    public GetAgentSpaceResponseBodyMseNamespace getMseNamespace() {
        return this.mseNamespace;
    }

    public GetAgentSpaceResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetAgentSpaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgentSpaceResponseBody setSlsProject(String slsProject) {
        this.slsProject = slsProject;
        return this;
    }
    public String getSlsProject() {
        return this.slsProject;
    }

    public GetAgentSpaceResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static class GetAgentSpaceResponseBodyMseNamespace extends TeaModel {
        @NameInMap("namespaceId")
        public String namespaceId;

        @NameInMap("namespaceName")
        public String namespaceName;

        public static GetAgentSpaceResponseBodyMseNamespace build(java.util.Map<String, ?> map) throws Exception {
            GetAgentSpaceResponseBodyMseNamespace self = new GetAgentSpaceResponseBodyMseNamespace();
            return TeaModel.build(map, self);
        }

        public GetAgentSpaceResponseBodyMseNamespace setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public GetAgentSpaceResponseBodyMseNamespace setNamespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public String getNamespaceName() {
            return this.namespaceName;
        }

    }

}
