// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetAgentSpecLatestResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public GetAgentSpecLatestResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-47A8-90AB-CDEF12345678</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetAgentSpecLatestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentSpecLatestResponseBody self = new GetAgentSpecLatestResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentSpecLatestResponseBody setData(GetAgentSpecLatestResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAgentSpecLatestResponseBodyData getData() {
        return this.data;
    }

    public GetAgentSpecLatestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAgentSpecLatestResponseBodyDataMcpServers extends TeaModel {
        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>agentspec-example</p>
         */
        @NameInMap("name")
        public String name;

        public static GetAgentSpecLatestResponseBodyDataMcpServers build(java.util.Map<String, ?> map) throws Exception {
            GetAgentSpecLatestResponseBodyDataMcpServers self = new GetAgentSpecLatestResponseBodyDataMcpServers();
            return TeaModel.build(map, self);
        }

        public GetAgentSpecLatestResponseBodyDataMcpServers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetAgentSpecLatestResponseBodyDataSkills extends TeaModel {
        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>agentspec-example</p>
         */
        @NameInMap("name")
        public String name;

        public static GetAgentSpecLatestResponseBodyDataSkills build(java.util.Map<String, ?> map) throws Exception {
            GetAgentSpecLatestResponseBodyDataSkills self = new GetAgentSpecLatestResponseBodyDataSkills();
            return TeaModel.build(map, self);
        }

        public GetAgentSpecLatestResponseBodyDataSkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetAgentSpecLatestResponseBodyData extends TeaModel {
        /**
         * <p>The business tags.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample property value</p>
         */
        @NameInMap("bizTags")
        public String bizTags;

        /**
         * <p>The content.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample content</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>A sample description that explains the purpose of the resource</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The download count.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("downloadCount")
        public Long downloadCount;

        /**
         * <p>Indicates whether the AgentSpec is enabled.</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The list of MCP server references.</p>
         */
        @NameInMap("mcpServers")
        public java.util.List<GetAgentSpecLatestResponseBodyDataMcpServers> mcpServers;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>agentspec-example</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The resource file mapping.</p>
         */
        @NameInMap("resource")
        public java.util.Map<String, DataResourceValue> resource;

        /**
         * <p>The visibility scope.</p>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        @NameInMap("scope")
        public String scope;

        /**
         * <p>The list of skill references.</p>
         */
        @NameInMap("skills")
        public java.util.List<GetAgentSpecLatestResponseBodyDataSkills> skills;

        /**
         * <p>The update time. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1787671022000</p>
         */
        @NameInMap("updateTime")
        public Long updateTime;

        public static GetAgentSpecLatestResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgentSpecLatestResponseBodyData self = new GetAgentSpecLatestResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgentSpecLatestResponseBodyData setBizTags(String bizTags) {
            this.bizTags = bizTags;
            return this;
        }
        public String getBizTags() {
            return this.bizTags;
        }

        public GetAgentSpecLatestResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetAgentSpecLatestResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAgentSpecLatestResponseBodyData setDownloadCount(Long downloadCount) {
            this.downloadCount = downloadCount;
            return this;
        }
        public Long getDownloadCount() {
            return this.downloadCount;
        }

        public GetAgentSpecLatestResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetAgentSpecLatestResponseBodyData setMcpServers(java.util.List<GetAgentSpecLatestResponseBodyDataMcpServers> mcpServers) {
            this.mcpServers = mcpServers;
            return this;
        }
        public java.util.List<GetAgentSpecLatestResponseBodyDataMcpServers> getMcpServers() {
            return this.mcpServers;
        }

        public GetAgentSpecLatestResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAgentSpecLatestResponseBodyData setResource(java.util.Map<String, DataResourceValue> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.Map<String, DataResourceValue> getResource() {
            return this.resource;
        }

        public GetAgentSpecLatestResponseBodyData setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public GetAgentSpecLatestResponseBodyData setSkills(java.util.List<GetAgentSpecLatestResponseBodyDataSkills> skills) {
            this.skills = skills;
            return this;
        }
        public java.util.List<GetAgentSpecLatestResponseBodyDataSkills> getSkills() {
            return this.skills;
        }

        public GetAgentSpecLatestResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
