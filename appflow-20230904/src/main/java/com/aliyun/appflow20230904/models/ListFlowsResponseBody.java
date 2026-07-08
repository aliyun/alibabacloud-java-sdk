// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class ListFlowsResponseBody extends TeaModel {
    /**
     * <p>The list of connector flows.</p>
     */
    @NameInMap("Flows")
    public java.util.List<ListFlowsResponseBodyFlows> flows;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAVY3rYiv9VoUJQSiCitgjgRCGYBJsWLezzDdq2+aDNB4j8bgHiGAwZWnCMJPepC+WYZ4J1BLMwE7gJm++1ku/AI=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>02FB9782-5390-5DF9-A1DA-9F2DE2FA1E3D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListFlowsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowsResponseBody self = new ListFlowsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowsResponseBody setFlows(java.util.List<ListFlowsResponseBodyFlows> flows) {
        this.flows = flows;
        return this;
    }
    public java.util.List<ListFlowsResponseBodyFlows> getFlows() {
        return this.flows;
    }

    public ListFlowsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListFlowsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListFlowsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListFlowsResponseBodyFlowsTags extends TeaModel {
        /**
         * <p>The tag key. The tag key can be up to 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>tuoluo</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag values.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;connectorId\&quot;: \&quot;connector-5e43ef26b53e4a158529\&quot;, \&quot;authConfig\&quot;: \&quot;{\\\&quot;apiKey\\\&quot;: \\\&quot;sk-77e7c7ed775f4fd388d505d37b2b1b33\\\&quot;}\&quot;}</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListFlowsResponseBodyFlowsTags build(java.util.Map<String, ?> map) throws Exception {
            ListFlowsResponseBodyFlowsTags self = new ListFlowsResponseBodyFlowsTags();
            return TeaModel.build(map, self);
        }

        public ListFlowsResponseBodyFlowsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListFlowsResponseBodyFlowsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListFlowsResponseBodyFlows extends TeaModel {
        /**
         * <p>Indicates whether the connector flow is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The connector flow description.</p>
         * 
         * <strong>example:</strong>
         * <p>在未认证的公众号中更实用Qwen3开源版本自动回复</p>
         */
        @NameInMap("FlowDesc")
        public String flowDesc;

        /**
         * <p>The connector flow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>flow-xxxxxxxx</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        /**
         * <p>The connector flow name.</p>
         * 
         * <strong>example:</strong>
         * <p>钉钉群聊 - 流式调用百炼应用-小助手</p>
         */
        @NameInMap("FlowName")
        public String flowName;

        /**
         * <p>The connector flow template content.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("FlowTemplate")
        public String flowTemplate;

        /**
         * <p>The connector flow version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FlowVersion")
        public String flowVersion;

        /**
         * <p>The connector flow version status.</p>
         * 
         * <strong>example:</strong>
         * <p>0 - 草稿
         * 1- 发布
         * 2- 下线</p>
         */
        @NameInMap("FlowVersionStatus")
        public String flowVersionStatus;

        /**
         * <p>The time when the connector flow was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-30T02:29:51Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the connector flow was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-30T02:29:48Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The released version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReleasedVersion")
        public Integer releasedVersion;

        /**
         * <p>The tag values.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListFlowsResponseBodyFlowsTags> tags;

        /**
         * <p>The webhook URL.</p>
         * 
         * <strong>example:</strong>
         * <p>https://{uid}.appflow.aliyunnest.com/webhook/xxxxxx</p>
         */
        @NameInMap("WebhookUrl")
        public String webhookUrl;

        public static ListFlowsResponseBodyFlows build(java.util.Map<String, ?> map) throws Exception {
            ListFlowsResponseBodyFlows self = new ListFlowsResponseBodyFlows();
            return TeaModel.build(map, self);
        }

        public ListFlowsResponseBodyFlows setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListFlowsResponseBodyFlows setFlowDesc(String flowDesc) {
            this.flowDesc = flowDesc;
            return this;
        }
        public String getFlowDesc() {
            return this.flowDesc;
        }

        public ListFlowsResponseBodyFlows setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public ListFlowsResponseBodyFlows setFlowName(String flowName) {
            this.flowName = flowName;
            return this;
        }
        public String getFlowName() {
            return this.flowName;
        }

        public ListFlowsResponseBodyFlows setFlowTemplate(String flowTemplate) {
            this.flowTemplate = flowTemplate;
            return this;
        }
        public String getFlowTemplate() {
            return this.flowTemplate;
        }

        public ListFlowsResponseBodyFlows setFlowVersion(String flowVersion) {
            this.flowVersion = flowVersion;
            return this;
        }
        public String getFlowVersion() {
            return this.flowVersion;
        }

        public ListFlowsResponseBodyFlows setFlowVersionStatus(String flowVersionStatus) {
            this.flowVersionStatus = flowVersionStatus;
            return this;
        }
        public String getFlowVersionStatus() {
            return this.flowVersionStatus;
        }

        public ListFlowsResponseBodyFlows setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListFlowsResponseBodyFlows setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListFlowsResponseBodyFlows setReleasedVersion(Integer releasedVersion) {
            this.releasedVersion = releasedVersion;
            return this;
        }
        public Integer getReleasedVersion() {
            return this.releasedVersion;
        }

        public ListFlowsResponseBodyFlows setTags(java.util.List<ListFlowsResponseBodyFlowsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListFlowsResponseBodyFlowsTags> getTags() {
            return this.tags;
        }

        public ListFlowsResponseBodyFlows setWebhookUrl(String webhookUrl) {
            this.webhookUrl = webhookUrl;
            return this;
        }
        public String getWebhookUrl() {
            return this.webhookUrl;
        }

    }

}
