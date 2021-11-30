// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetChainResponseBody extends TeaModel {
    @NameInMap("ChainConfig")
    public GetChainResponseBodyChainConfig chainConfig;

    @NameInMap("ChainId")
    public String chainId;

    @NameInMap("Code")
    public String code;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("ModifiedTime")
    public Long modifiedTime;

    @NameInMap("Name")
    public String name;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScopeId")
    public String scopeId;

    @NameInMap("ScopeType")
    public String scopeType;

    public static GetChainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetChainResponseBody self = new GetChainResponseBody();
        return TeaModel.build(map, self);
    }

    public GetChainResponseBody setChainConfig(GetChainResponseBodyChainConfig chainConfig) {
        this.chainConfig = chainConfig;
        return this;
    }
    public GetChainResponseBodyChainConfig getChainConfig() {
        return this.chainConfig;
    }

    public GetChainResponseBody setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public GetChainResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetChainResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public GetChainResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetChainResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetChainResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public GetChainResponseBody setModifiedTime(Long modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public Long getModifiedTime() {
        return this.modifiedTime;
    }

    public GetChainResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetChainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetChainResponseBody setScopeId(String scopeId) {
        this.scopeId = scopeId;
        return this;
    }
    public String getScopeId() {
        return this.scopeId;
    }

    public GetChainResponseBody setScopeType(String scopeType) {
        this.scopeType = scopeType;
        return this;
    }
    public String getScopeType() {
        return this.scopeType;
    }

    public static class GetChainResponseBodyChainConfigNodesNodeConfigDenyPolicy extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("IssueCount")
        public String issueCount;

        @NameInMap("IssueLevel")
        public String issueLevel;

        @NameInMap("Logic")
        public String logic;

        public static GetChainResponseBodyChainConfigNodesNodeConfigDenyPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetChainResponseBodyChainConfigNodesNodeConfigDenyPolicy self = new GetChainResponseBodyChainConfigNodesNodeConfigDenyPolicy();
            return TeaModel.build(map, self);
        }

        public GetChainResponseBodyChainConfigNodesNodeConfigDenyPolicy setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetChainResponseBodyChainConfigNodesNodeConfigDenyPolicy setIssueCount(String issueCount) {
            this.issueCount = issueCount;
            return this;
        }
        public String getIssueCount() {
            return this.issueCount;
        }

        public GetChainResponseBodyChainConfigNodesNodeConfigDenyPolicy setIssueLevel(String issueLevel) {
            this.issueLevel = issueLevel;
            return this;
        }
        public String getIssueLevel() {
            return this.issueLevel;
        }

        public GetChainResponseBodyChainConfigNodesNodeConfigDenyPolicy setLogic(String logic) {
            this.logic = logic;
            return this;
        }
        public String getLogic() {
            return this.logic;
        }

    }

    public static class GetChainResponseBodyChainConfigNodesNodeConfig extends TeaModel {
        @NameInMap("DenyPolicy")
        public GetChainResponseBodyChainConfigNodesNodeConfigDenyPolicy denyPolicy;

        @NameInMap("Retry")
        public Integer retry;

        @NameInMap("ScanEngine")
        public String scanEngine;

        @NameInMap("Timeout")
        public Long timeout;

        public static GetChainResponseBodyChainConfigNodesNodeConfig build(java.util.Map<String, ?> map) throws Exception {
            GetChainResponseBodyChainConfigNodesNodeConfig self = new GetChainResponseBodyChainConfigNodesNodeConfig();
            return TeaModel.build(map, self);
        }

        public GetChainResponseBodyChainConfigNodesNodeConfig setDenyPolicy(GetChainResponseBodyChainConfigNodesNodeConfigDenyPolicy denyPolicy) {
            this.denyPolicy = denyPolicy;
            return this;
        }
        public GetChainResponseBodyChainConfigNodesNodeConfigDenyPolicy getDenyPolicy() {
            return this.denyPolicy;
        }

        public GetChainResponseBodyChainConfigNodesNodeConfig setRetry(Integer retry) {
            this.retry = retry;
            return this;
        }
        public Integer getRetry() {
            return this.retry;
        }

        public GetChainResponseBodyChainConfigNodesNodeConfig setScanEngine(String scanEngine) {
            this.scanEngine = scanEngine;
            return this;
        }
        public String getScanEngine() {
            return this.scanEngine;
        }

        public GetChainResponseBodyChainConfigNodesNodeConfig setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

    }

    public static class GetChainResponseBodyChainConfigNodes extends TeaModel {
        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("NodeConfig")
        public GetChainResponseBodyChainConfigNodesNodeConfig nodeConfig;

        @NameInMap("NodeName")
        public String nodeName;

        public static GetChainResponseBodyChainConfigNodes build(java.util.Map<String, ?> map) throws Exception {
            GetChainResponseBodyChainConfigNodes self = new GetChainResponseBodyChainConfigNodes();
            return TeaModel.build(map, self);
        }

        public GetChainResponseBodyChainConfigNodes setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetChainResponseBodyChainConfigNodes setNodeConfig(GetChainResponseBodyChainConfigNodesNodeConfig nodeConfig) {
            this.nodeConfig = nodeConfig;
            return this;
        }
        public GetChainResponseBodyChainConfigNodesNodeConfig getNodeConfig() {
            return this.nodeConfig;
        }

        public GetChainResponseBodyChainConfigNodes setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

    }

    public static class GetChainResponseBodyChainConfigRoutersFrom extends TeaModel {
        @NameInMap("NodeName")
        public String nodeName;

        public static GetChainResponseBodyChainConfigRoutersFrom build(java.util.Map<String, ?> map) throws Exception {
            GetChainResponseBodyChainConfigRoutersFrom self = new GetChainResponseBodyChainConfigRoutersFrom();
            return TeaModel.build(map, self);
        }

        public GetChainResponseBodyChainConfigRoutersFrom setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

    }

    public static class GetChainResponseBodyChainConfigRoutersTo extends TeaModel {
        @NameInMap("NodeName")
        public String nodeName;

        public static GetChainResponseBodyChainConfigRoutersTo build(java.util.Map<String, ?> map) throws Exception {
            GetChainResponseBodyChainConfigRoutersTo self = new GetChainResponseBodyChainConfigRoutersTo();
            return TeaModel.build(map, self);
        }

        public GetChainResponseBodyChainConfigRoutersTo setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

    }

    public static class GetChainResponseBodyChainConfigRouters extends TeaModel {
        @NameInMap("From")
        public GetChainResponseBodyChainConfigRoutersFrom from;

        @NameInMap("To")
        public GetChainResponseBodyChainConfigRoutersTo to;

        public static GetChainResponseBodyChainConfigRouters build(java.util.Map<String, ?> map) throws Exception {
            GetChainResponseBodyChainConfigRouters self = new GetChainResponseBodyChainConfigRouters();
            return TeaModel.build(map, self);
        }

        public GetChainResponseBodyChainConfigRouters setFrom(GetChainResponseBodyChainConfigRoutersFrom from) {
            this.from = from;
            return this;
        }
        public GetChainResponseBodyChainConfigRoutersFrom getFrom() {
            return this.from;
        }

        public GetChainResponseBodyChainConfigRouters setTo(GetChainResponseBodyChainConfigRoutersTo to) {
            this.to = to;
            return this;
        }
        public GetChainResponseBodyChainConfigRoutersTo getTo() {
            return this.to;
        }

    }

    public static class GetChainResponseBodyChainConfig extends TeaModel {
        @NameInMap("ChainConfigId")
        public String chainConfigId;

        @NameInMap("IsActive")
        public Boolean isActive;

        @NameInMap("Nodes")
        public java.util.List<GetChainResponseBodyChainConfigNodes> nodes;

        @NameInMap("Routers")
        public java.util.List<GetChainResponseBodyChainConfigRouters> routers;

        @NameInMap("Version")
        public String version;

        public static GetChainResponseBodyChainConfig build(java.util.Map<String, ?> map) throws Exception {
            GetChainResponseBodyChainConfig self = new GetChainResponseBodyChainConfig();
            return TeaModel.build(map, self);
        }

        public GetChainResponseBodyChainConfig setChainConfigId(String chainConfigId) {
            this.chainConfigId = chainConfigId;
            return this;
        }
        public String getChainConfigId() {
            return this.chainConfigId;
        }

        public GetChainResponseBodyChainConfig setIsActive(Boolean isActive) {
            this.isActive = isActive;
            return this;
        }
        public Boolean getIsActive() {
            return this.isActive;
        }

        public GetChainResponseBodyChainConfig setNodes(java.util.List<GetChainResponseBodyChainConfigNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<GetChainResponseBodyChainConfigNodes> getNodes() {
            return this.nodes;
        }

        public GetChainResponseBodyChainConfig setRouters(java.util.List<GetChainResponseBodyChainConfigRouters> routers) {
            this.routers = routers;
            return this;
        }
        public java.util.List<GetChainResponseBodyChainConfigRouters> getRouters() {
            return this.routers;
        }

        public GetChainResponseBodyChainConfig setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
