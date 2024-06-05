// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListAScriptsResponseBody extends TeaModel {
    /**
     * <p>The AScript rules.</p>
     */
    @NameInMap("AScripts")
    public java.util.List<ListAScriptsResponseBodyAScripts> AScripts;

    /**
     * <p>The maximum number of entries returned.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <br>
     * <p>*   If **NextToken** is empty, no next page exists.</p>
     * <p>*   If a value is returned for **NextToken**, the value is the token that determines the start point of the next query.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * <br>
     * <p>> This parameter is optional. By default, this parameter is not returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAScriptsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAScriptsResponseBody self = new ListAScriptsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAScriptsResponseBody setAScripts(java.util.List<ListAScriptsResponseBodyAScripts> AScripts) {
        this.AScripts = AScripts;
        return this;
    }
    public java.util.List<ListAScriptsResponseBodyAScripts> getAScripts() {
        return this.AScripts;
    }

    public ListAScriptsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAScriptsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAScriptsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAScriptsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAScriptsResponseBodyAScripts extends TeaModel {
        /**
         * <p>The AScript rule ID.</p>
         */
        @NameInMap("AScriptId")
        public String AScriptId;

        /**
         * <p>The name of the AScript rule.</p>
         */
        @NameInMap("AScriptName")
        public String AScriptName;

        /**
         * <p>The status of the AScript rule. Valid values:</p>
         * <br>
         * <p>*   **Creating**</p>
         * <p>*   **Available**</p>
         * <p>*   **Configuring**</p>
         * <p>*   **Deleting**</p>
         */
        @NameInMap("AScriptStatus")
        public String AScriptStatus;

        /**
         * <p>Indicates whether the AScript rule is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The listener ID.</p>
         */
        @NameInMap("ListenerId")
        public String listenerId;

        /**
         * <p>The Application Load Balancer (ALB) instance ID.</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The content of the AScript rule.</p>
         */
        @NameInMap("ScriptContent")
        public String scriptContent;

        public static ListAScriptsResponseBodyAScripts build(java.util.Map<String, ?> map) throws Exception {
            ListAScriptsResponseBodyAScripts self = new ListAScriptsResponseBodyAScripts();
            return TeaModel.build(map, self);
        }

        public ListAScriptsResponseBodyAScripts setAScriptId(String AScriptId) {
            this.AScriptId = AScriptId;
            return this;
        }
        public String getAScriptId() {
            return this.AScriptId;
        }

        public ListAScriptsResponseBodyAScripts setAScriptName(String AScriptName) {
            this.AScriptName = AScriptName;
            return this;
        }
        public String getAScriptName() {
            return this.AScriptName;
        }

        public ListAScriptsResponseBodyAScripts setAScriptStatus(String AScriptStatus) {
            this.AScriptStatus = AScriptStatus;
            return this;
        }
        public String getAScriptStatus() {
            return this.AScriptStatus;
        }

        public ListAScriptsResponseBodyAScripts setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListAScriptsResponseBodyAScripts setListenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }
        public String getListenerId() {
            return this.listenerId;
        }

        public ListAScriptsResponseBodyAScripts setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public ListAScriptsResponseBodyAScripts setScriptContent(String scriptContent) {
            this.scriptContent = scriptContent;
            return this;
        }
        public String getScriptContent() {
            return this.scriptContent;
        }

    }

}
