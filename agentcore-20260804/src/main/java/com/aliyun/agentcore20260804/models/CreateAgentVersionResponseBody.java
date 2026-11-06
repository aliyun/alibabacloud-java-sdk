// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateAgentVersionResponseBody extends TeaModel {
    /**
     * <p>业务状态码，请求成功时为 SUCCESS，失败时为错误码。</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>已保存的智能体固定版本详情；重复提交命中已有版本时返回该已有版本。</p>
     */
    @NameInMap("data")
    public CreateAgentVersionResponseBodyData data;

    /**
     * <p>HTTP 状态码。</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>响应消息，请求成功时为 success，失败时为错误信息。</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>请求 ID，用于定位和排查请求。</p>
     * 
     * <strong>example:</strong>
     * <p>5E8F3C2A-1B4D-4F6E-9A7C-0D2B8E6F4A1C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>请求是否成功。</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CreateAgentVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentVersionResponseBody self = new CreateAgentVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAgentVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateAgentVersionResponseBody setData(CreateAgentVersionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateAgentVersionResponseBodyData getData() {
        return this.data;
    }

    public CreateAgentVersionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateAgentVersionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAgentVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAgentVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateAgentVersionResponseBodyData extends TeaModel {
        /**
         * <p>版本所属的托管智能体或自定义智能体 ID。</p>
         * 
         * <strong>example:</strong>
         * <p>agent-0123456789abcdef0123456789abcdef</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>系统按 Agent 递增生成的版本号，例如 v1、v2。查询、删除版本及服务端点引用版本时使用。</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("agentVersion")
        public String agentVersion;

        /**
         * <p>仅表示版本模板与制品归档是否完整，不代表部署或运行状态。READY 为完整，INVALID 为归档缺失或不一致。</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        @NameInMap("artifactStatus")
        public String artifactStatus;

        /**
         * <p>托管智能体与 GetManagedAgent 的 data 结构一致，自定义智能体与 GetCustomAgent 的 data 结构一致，脱敏规则相同。</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;agentId&quot;:&quot;agent-0123456789abcdef0123456789abcdef&quot;,&quot;workspaceId&quot;:&quot;ws-0123456789abcdef01234&quot;,&quot;name&quot;:&quot;customer-service&quot;,&quot;description&quot;:&quot;客服智能体&quot;,&quot;status&quot;:&quot;Running&quot;,&quot;latestSpecVersion&quot;:2,&quot;instruction&quot;:&quot;你是一名客服助手。&quot;}</p>
         */
        @NameInMap("configuration")
        public java.util.Map<String, ?> configuration;

        /**
         * <p>版本保存的时间，采用 ISO 8601 UTC 格式。</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-12T01:02:03Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>保存该版本的调用者阿里云账号 UID；RAM 用户调用时为其所属阿里云主账号 UID。</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123456</p>
         */
        @NameInMap("createdBy")
        public String createdBy;

        /**
         * <p>保存版本时填写的版本描述，最多 1024 个字符；保存时未填写则为空。</p>
         * 
         * <strong>example:</strong>
         * <p>生产环境稳定版本</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>保存版本时 Agent 已生效的发布流水号，即当时的 effectiveSpecVersion。版本保存后该值不再变化。</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("targetSpecVersion")
        public Long targetSpecVersion;

        /**
         * <p>保存版本时用户指定的展示名称。早期保存且未记录名称的版本返回 agentVersion。</p>
         * 
         * <strong>example:</strong>
         * <p>生产稳定版 V1.0</p>
         */
        @NameInMap("versionName")
        public String versionName;

        /**
         * <p>版本所属智能体所在的 AgentCore 工作空间 ID。</p>
         * 
         * <strong>example:</strong>
         * <p>ws-0123456789abcdef01234</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static CreateAgentVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentVersionResponseBodyData self = new CreateAgentVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAgentVersionResponseBodyData setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public CreateAgentVersionResponseBodyData setAgentVersion(String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }
        public String getAgentVersion() {
            return this.agentVersion;
        }

        public CreateAgentVersionResponseBodyData setArtifactStatus(String artifactStatus) {
            this.artifactStatus = artifactStatus;
            return this;
        }
        public String getArtifactStatus() {
            return this.artifactStatus;
        }

        public CreateAgentVersionResponseBodyData setConfiguration(java.util.Map<String, ?> configuration) {
            this.configuration = configuration;
            return this;
        }
        public java.util.Map<String, ?> getConfiguration() {
            return this.configuration;
        }

        public CreateAgentVersionResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateAgentVersionResponseBodyData setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public CreateAgentVersionResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateAgentVersionResponseBodyData setTargetSpecVersion(Long targetSpecVersion) {
            this.targetSpecVersion = targetSpecVersion;
            return this;
        }
        public Long getTargetSpecVersion() {
            return this.targetSpecVersion;
        }

        public CreateAgentVersionResponseBodyData setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

        public CreateAgentVersionResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
