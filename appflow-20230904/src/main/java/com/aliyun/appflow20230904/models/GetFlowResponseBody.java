// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class GetFlowResponseBody extends TeaModel {
    /**
     * <p>The flow object.</p>
     */
    @NameInMap("Flow")
    public GetFlowResponseBodyFlow flow;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B6E1E38D-011F-5368-ADD8-4DC278254AA3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFlowResponseBody self = new GetFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFlowResponseBody setFlow(GetFlowResponseBodyFlow flow) {
        this.flow = flow;
        return this;
    }
    public GetFlowResponseBodyFlow getFlow() {
        return this.flow;
    }

    public GetFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetFlowResponseBodyFlowFlowNodes extends TeaModel {
        /**
         * <p>The authentication credentials of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;authconfigId\&quot;:\&quot;uac-xxxxxxxxx\&quot;}</p>
         */
        @NameInMap("AuthMetadata")
        public String authMetadata;

        /**
         * <p>The connector ID.</p>
         * 
         * <strong>example:</strong>
         * <p>connector-xxx24b139c62</p>
         */
        @NameInMap("ConnectorId")
        public String connectorId;

        /**
         * <p>The connector version.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ConnectorVersion")
        public String connectorVersion;

        /**
         * <p>The flow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>flow-856cb84b309747e48b43</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        /**
         * <p>The flow version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FlowVersion")
        public String flowVersion;

        /**
         * <p>The metadata of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("InputSchema")
        public String inputSchema;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fn-xxxxxxxx</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The node key.</p>
         * 
         * <strong>example:</strong>
         * <p>Node1</p>
         */
        @NameInMap("NodeKey")
        public String nodeKey;

        /**
         * <p>The node name.</p>
         * 
         * <strong>example:</strong>
         * <p>NotifyMessage_1</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The node type.</p>
         * 
         * <strong>example:</strong>
         * <p>Trigger</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The ID of the previous node.</p>
         * 
         * <strong>example:</strong>
         * <p>fn-xxxxx,fn-yyyyyy</p>
         */
        @NameInMap("PrevNodeId")
        public String prevNodeId;

        /**
         * <p>The ID of the trigger or action.</p>
         * 
         * <strong>example:</strong>
         * <p>trigger-xxxxxxxxxx</p>
         */
        @NameInMap("RefId")
        public String refId;

        /**
         * <p>The trigger or action version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RefVersion")
        public String refVersion;

        /**
         * <p>The webhook URL.</p>
         * 
         * <strong>example:</strong>
         * <p>https://{uid}.computenest.aliyun.com/webhook/xxxxxxxx</p>
         */
        @NameInMap("WebhookUrl")
        public String webhookUrl;

        public static GetFlowResponseBodyFlowFlowNodes build(java.util.Map<String, ?> map) throws Exception {
            GetFlowResponseBodyFlowFlowNodes self = new GetFlowResponseBodyFlowFlowNodes();
            return TeaModel.build(map, self);
        }

        public GetFlowResponseBodyFlowFlowNodes setAuthMetadata(String authMetadata) {
            this.authMetadata = authMetadata;
            return this;
        }
        public String getAuthMetadata() {
            return this.authMetadata;
        }

        public GetFlowResponseBodyFlowFlowNodes setConnectorId(String connectorId) {
            this.connectorId = connectorId;
            return this;
        }
        public String getConnectorId() {
            return this.connectorId;
        }

        public GetFlowResponseBodyFlowFlowNodes setConnectorVersion(String connectorVersion) {
            this.connectorVersion = connectorVersion;
            return this;
        }
        public String getConnectorVersion() {
            return this.connectorVersion;
        }

        public GetFlowResponseBodyFlowFlowNodes setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public GetFlowResponseBodyFlowFlowNodes setFlowVersion(String flowVersion) {
            this.flowVersion = flowVersion;
            return this;
        }
        public String getFlowVersion() {
            return this.flowVersion;
        }

        public GetFlowResponseBodyFlowFlowNodes setInputSchema(String inputSchema) {
            this.inputSchema = inputSchema;
            return this;
        }
        public String getInputSchema() {
            return this.inputSchema;
        }

        public GetFlowResponseBodyFlowFlowNodes setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetFlowResponseBodyFlowFlowNodes setNodeKey(String nodeKey) {
            this.nodeKey = nodeKey;
            return this;
        }
        public String getNodeKey() {
            return this.nodeKey;
        }

        public GetFlowResponseBodyFlowFlowNodes setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetFlowResponseBodyFlowFlowNodes setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public GetFlowResponseBodyFlowFlowNodes setPrevNodeId(String prevNodeId) {
            this.prevNodeId = prevNodeId;
            return this;
        }
        public String getPrevNodeId() {
            return this.prevNodeId;
        }

        public GetFlowResponseBodyFlowFlowNodes setRefId(String refId) {
            this.refId = refId;
            return this;
        }
        public String getRefId() {
            return this.refId;
        }

        public GetFlowResponseBodyFlowFlowNodes setRefVersion(String refVersion) {
            this.refVersion = refVersion;
            return this;
        }
        public String getRefVersion() {
            return this.refVersion;
        }

        public GetFlowResponseBodyFlowFlowNodes setWebhookUrl(String webhookUrl) {
            this.webhookUrl = webhookUrl;
            return this;
        }
        public String getWebhookUrl() {
            return this.webhookUrl;
        }

    }

    public static class GetFlowResponseBodyFlowTags extends TeaModel {
        /**
         * <p>The tag key. The value can be up to 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Environment</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>pre</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetFlowResponseBodyFlowTags build(java.util.Map<String, ?> map) throws Exception {
            GetFlowResponseBodyFlowTags self = new GetFlowResponseBodyFlowTags();
            return TeaModel.build(map, self);
        }

        public GetFlowResponseBodyFlowTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetFlowResponseBodyFlowTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetFlowResponseBodyFlow extends TeaModel {
        /**
         * <p>Indicates whether the flow is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public String enabled;

        /**
         * <p>The flow description.</p>
         * 
         * <strong>example:</strong>
         * <p>以AI卡片形式发送至钉钉群聊，如果想要支持私聊，请使用同时支持群聊&amp;私聊的模版</p>
         */
        @NameInMap("FlowDesc")
        public String flowDesc;

        /**
         * <p>The flow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>flow-xxxxxxxx</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        /**
         * <p>The flow name.</p>
         * 
         * <strong>example:</strong>
         * <p>微信连接流1</p>
         */
        @NameInMap("FlowName")
        public String flowName;

        /**
         * <p>The list of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>连接流节点信息</p>
         */
        @NameInMap("FlowNodes")
        public java.util.List<GetFlowResponseBodyFlowFlowNodes> flowNodes;

        /**
         * <p>The flow template content.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;FormatVersion&quot;: &quot;appflow-2025-07-01&quot;,
         *   &quot;Nodes&quot;: [
         *         {}
         *    ]
         * }</p>
         */
        @NameInMap("FlowTemplate")
        public String flowTemplate;

        /**
         * <p>The flow version.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("FlowVersion")
        public String flowVersion;

        /**
         * <p>The flow version status.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FlowVersionStatus")
        public String flowVersionStatus;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-30T02:13:22Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The last modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-13T02:11:56Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>A list of tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<GetFlowResponseBodyFlowTags> tags;

        public static GetFlowResponseBodyFlow build(java.util.Map<String, ?> map) throws Exception {
            GetFlowResponseBodyFlow self = new GetFlowResponseBodyFlow();
            return TeaModel.build(map, self);
        }

        public GetFlowResponseBodyFlow setEnabled(String enabled) {
            this.enabled = enabled;
            return this;
        }
        public String getEnabled() {
            return this.enabled;
        }

        public GetFlowResponseBodyFlow setFlowDesc(String flowDesc) {
            this.flowDesc = flowDesc;
            return this;
        }
        public String getFlowDesc() {
            return this.flowDesc;
        }

        public GetFlowResponseBodyFlow setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public GetFlowResponseBodyFlow setFlowName(String flowName) {
            this.flowName = flowName;
            return this;
        }
        public String getFlowName() {
            return this.flowName;
        }

        public GetFlowResponseBodyFlow setFlowNodes(java.util.List<GetFlowResponseBodyFlowFlowNodes> flowNodes) {
            this.flowNodes = flowNodes;
            return this;
        }
        public java.util.List<GetFlowResponseBodyFlowFlowNodes> getFlowNodes() {
            return this.flowNodes;
        }

        public GetFlowResponseBodyFlow setFlowTemplate(String flowTemplate) {
            this.flowTemplate = flowTemplate;
            return this;
        }
        public String getFlowTemplate() {
            return this.flowTemplate;
        }

        public GetFlowResponseBodyFlow setFlowVersion(String flowVersion) {
            this.flowVersion = flowVersion;
            return this;
        }
        public String getFlowVersion() {
            return this.flowVersion;
        }

        public GetFlowResponseBodyFlow setFlowVersionStatus(String flowVersionStatus) {
            this.flowVersionStatus = flowVersionStatus;
            return this;
        }
        public String getFlowVersionStatus() {
            return this.flowVersionStatus;
        }

        public GetFlowResponseBodyFlow setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetFlowResponseBodyFlow setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetFlowResponseBodyFlow setTags(java.util.List<GetFlowResponseBodyFlowTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetFlowResponseBodyFlowTags> getTags() {
            return this.tags;
        }

    }

}
