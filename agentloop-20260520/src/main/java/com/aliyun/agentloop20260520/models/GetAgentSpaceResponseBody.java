// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class GetAgentSpaceResponseBody extends TeaModel {
    /**
     * <p>The name of the AgentSpace.</p>
     * 
     * <strong>example:</strong>
     * <p>test-agent-space</p>
     */
    @NameInMap("agentSpace")
    public String agentSpace;

    /**
     * <p>The CloudMonitor workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>test-cms-workspace</p>
     */
    @NameInMap("cmsWorkspace")
    public String cmsWorkspace;

    /**
     * <p>The binding type of the CloudMonitor 2.0 workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>AutoCreated</p>
     */
    @NameInMap("cmsWorkspaceBindType")
    public String cmsWorkspaceBindType;

    /**
     * <p>The time when the AgentSpace was created.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
     * 
     * <strong>example:</strong>
     * <p>2026-05-05T12:39:36Z</p>
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
     * <p>The Microservices Engine (MSE) namespace.</p>
     */
    @NameInMap("mseNamespace")
    public GetAgentSpaceResponseBodyMseNamespace mseNamespace;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D0173835-9E0F-508F-8BFA-9F556E59C302</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The name of the Simple Log Service project.</p>
     * 
     * <strong>example:</strong>
     * <p>default-cms-1837787111545040-cn-beijing</p>
     */
    @NameInMap("slsProject")
    public String slsProject;

    /**
     * <p>The time when the AgentSpace was last updated.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-10-20T02:28:14Z</p>
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
        /**
         * <p>The ID of the MSE namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>emr-dataware</p>
         */
        @NameInMap("namespaceId")
        public String namespaceId;

        /**
         * <p>The name of the MSE namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>terraform-alicloud-modules</p>
         */
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
