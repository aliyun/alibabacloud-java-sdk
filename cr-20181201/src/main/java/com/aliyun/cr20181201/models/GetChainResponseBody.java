// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetChainResponseBody extends TeaModel {
    @NameInMap("ChainConfig")
    public GetChainResponseBodyChainConfig chainConfig;

    /**
     * <strong>example:</strong>
     * <p>chi-0ops0gsmw5x2****</p>
     */
    @NameInMap("ChainId")
    public String chainId;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>1638255427000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>cri-4cdrlqmhn4gm****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <strong>example:</strong>
     * <p>1638259914000</p>
     */
    @NameInMap("ModifiedTime")
    public Long modifiedTime;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>C87993B5-7D61-5CAC-8D64-1AC732DD69FF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScopeExclude")
    public java.util.List<String> scopeExclude;

    /**
     * <strong>example:</strong>
     * <p>crr-nyrh2oko32xb****</p>
     */
    @NameInMap("ScopeId")
    public String scopeId;

    /**
     * <strong>example:</strong>
     * <p>REPOSITORY</p>
     */
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

    public GetChainResponseBody setScopeExclude(java.util.List<String> scopeExclude) {
        this.scopeExclude = scopeExclude;
        return this;
    }
    public java.util.List<String> getScopeExclude() {
        return this.scopeExclude;
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
        /**
         * <strong>example:</strong>
         * <p>BLOCK</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <strong>example:</strong>
         * <p>identification,hc_image_exploit</p>
         */
        @NameInMap("BaselineList")
        public String baselineList;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("IssueCount")
        public String issueCount;

        /**
         * <strong>example:</strong>
         * <p>HIGH</p>
         */
        @NameInMap("IssueLevel")
        public String issueLevel;

        /**
         * <strong>example:</strong>
         * <p>CVE-2020-8286,CVE-2020-8285</p>
         */
        @NameInMap("IssueList")
        public String issueList;

        /**
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("Logic")
        public String logic;

        /**
         * <strong>example:</strong>
         * <p>mutate_cockhorse,abnormal_program</p>
         */
        @NameInMap("MaliciousList")
        public String maliciousList;

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

        public GetChainResponseBodyChainConfigNodesNodeConfigDenyPolicy setBaselineList(String baselineList) {
            this.baselineList = baselineList;
            return this;
        }
        public String getBaselineList() {
            return this.baselineList;
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

        public GetChainResponseBodyChainConfigNodesNodeConfigDenyPolicy setIssueList(String issueList) {
            this.issueList = issueList;
            return this;
        }
        public String getIssueList() {
            return this.issueList;
        }

        public GetChainResponseBodyChainConfigNodesNodeConfigDenyPolicy setLogic(String logic) {
            this.logic = logic;
            return this;
        }
        public String getLogic() {
            return this.logic;
        }

        public GetChainResponseBodyChainConfigNodesNodeConfigDenyPolicy setMaliciousList(String maliciousList) {
            this.maliciousList = maliciousList;
            return this;
        }
        public String getMaliciousList() {
            return this.maliciousList;
        }

    }

    public static class GetChainResponseBodyChainConfigNodesNodeConfig extends TeaModel {
        @NameInMap("DenyPolicy")
        public GetChainResponseBodyChainConfigNodesNodeConfigDenyPolicy denyPolicy;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Retry")
        public Integer retry;

        /**
         * <strong>example:</strong>
         * <p>ACR_SCAN_SERVICE</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("NodeConfig")
        public GetChainResponseBodyChainConfigNodesNodeConfig nodeConfig;

        /**
         * <strong>example:</strong>
         * <p>VULNERABILITY_SCANNING</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>DOCKER_IMAGE_BUILD</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>DOCKER_IMAGE_PUSH</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>cci-lz3ycgo69ukt****</p>
         */
        @NameInMap("ChainConfigId")
        public String chainConfigId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsActive")
        public Boolean isActive;

        @NameInMap("Nodes")
        public java.util.List<GetChainResponseBodyChainConfigNodes> nodes;

        @NameInMap("Routers")
        public java.util.List<GetChainResponseBodyChainConfigRouters> routers;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
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
