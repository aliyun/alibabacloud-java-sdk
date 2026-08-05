// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListAppConfigHistoryResponseBody extends TeaModel {
    /**
     * <p>The historical versions.</p>
     */
    @NameInMap("History")
    public java.util.List<ListAppConfigHistoryResponseBodyHistory> history;

    /**
     * <p>The published versions.</p>
     */
    @NameInMap("Publish")
    public java.util.List<ListAppConfigHistoryResponseBodyPublish> publish;

    /**
     * <p>The ID assigned by the backend to uniquely identify a request. It can be used to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAppConfigHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppConfigHistoryResponseBody self = new ListAppConfigHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppConfigHistoryResponseBody setHistory(java.util.List<ListAppConfigHistoryResponseBodyHistory> history) {
        this.history = history;
        return this;
    }
    public java.util.List<ListAppConfigHistoryResponseBodyHistory> getHistory() {
        return this.history;
    }

    public ListAppConfigHistoryResponseBody setPublish(java.util.List<ListAppConfigHistoryResponseBodyPublish> publish) {
        this.publish = publish;
        return this;
    }
    public java.util.List<ListAppConfigHistoryResponseBodyPublish> getPublish() {
        return this.publish;
    }

    public ListAppConfigHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAppConfigHistoryResponseBodyHistory extends TeaModel {
        /**
         * <p>App ID。</p>
         * 
         * <strong>example:</strong>
         * <p>txt_check_agent_01</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p><strong>[Deprecated]</strong> The categorization.</p>
         * 
         * <strong>example:</strong>
         * <p>guard-scene</p>
         */
        @NameInMap("Classify")
        public String classify;

        /**
         * <p><strong>[Deprecated]</strong> The configuration details.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;agentItemConfigs&quot;: &quot;[{\&quot;agentId\&quot;:\&quot;ag.abcxxx\&quot;,\&quot;enable\&quot;:true,\&quot;name\&quot;:\&quot;Agent 1\&quot;}]&quot;}</p>
         */
        @NameInMap("CustomConfig")
        public java.util.Map<String, ?> customConfig;

        /**
         * <p><strong>[Deprecated]</strong> The publish status.</p>
         * 
         * <strong>example:</strong>
         * <p>editing</p>
         */
        @NameInMap("DeployStatus")
        public String deployStatus;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-29 10:05:27</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p><strong>[Deprecated]</strong> The name.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom text moderation</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p><strong>[Deprecated]</strong> The preset options.</p>
         */
        @NameInMap("Option")
        public java.util.Map<String, ?> option;

        /**
         * <p><strong>[Deprecated]</strong> The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>agent_text</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p><strong>[Deprecated]</strong> The type.</p>
         * 
         * <strong>example:</strong>
         * <p>plus</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1785888163</p>
         */
        @NameInMap("Version")
        public Long version;

        public static ListAppConfigHistoryResponseBodyHistory build(java.util.Map<String, ?> map) throws Exception {
            ListAppConfigHistoryResponseBodyHistory self = new ListAppConfigHistoryResponseBodyHistory();
            return TeaModel.build(map, self);
        }

        public ListAppConfigHistoryResponseBodyHistory setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListAppConfigHistoryResponseBodyHistory setClassify(String classify) {
            this.classify = classify;
            return this;
        }
        public String getClassify() {
            return this.classify;
        }

        public ListAppConfigHistoryResponseBodyHistory setCustomConfig(java.util.Map<String, ?> customConfig) {
            this.customConfig = customConfig;
            return this;
        }
        public java.util.Map<String, ?> getCustomConfig() {
            return this.customConfig;
        }

        public ListAppConfigHistoryResponseBodyHistory setDeployStatus(String deployStatus) {
            this.deployStatus = deployStatus;
            return this;
        }
        public String getDeployStatus() {
            return this.deployStatus;
        }

        public ListAppConfigHistoryResponseBodyHistory setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListAppConfigHistoryResponseBodyHistory setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAppConfigHistoryResponseBodyHistory setOption(java.util.Map<String, ?> option) {
            this.option = option;
            return this;
        }
        public java.util.Map<String, ?> getOption() {
            return this.option;
        }

        public ListAppConfigHistoryResponseBodyHistory setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListAppConfigHistoryResponseBodyHistory setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAppConfigHistoryResponseBodyHistory setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

    public static class ListAppConfigHistoryResponseBodyPublish extends TeaModel {
        /**
         * <p>App ID。</p>
         * 
         * <strong>example:</strong>
         * <p>txt_check_agent_01</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p><strong>[Deprecated]</strong> The categorization.</p>
         * 
         * <strong>example:</strong>
         * <p>guard-scene</p>
         */
        @NameInMap("Classify")
        public String classify;

        /**
         * <p><strong>[Deprecated]</strong> The configuration details.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;agentItemConfigs&quot;: &quot;[{\&quot;agentId\&quot;:\&quot;ag.abcxxx\&quot;,\&quot;enable\&quot;:true,\&quot;name\&quot;:\&quot;Agent 1\&quot;}]&quot;}</p>
         */
        @NameInMap("CustomConfig")
        public java.util.Map<String, ?> customConfig;

        /**
         * <p><strong>[Deprecated]</strong> The publish status.</p>
         * 
         * <strong>example:</strong>
         * <p>editing</p>
         */
        @NameInMap("DeployStatus")
        public String deployStatus;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-25 09:52:12</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p><strong>[Deprecated]</strong> The name.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom text moderation</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p><strong>[Deprecated]</strong> The preset options.</p>
         */
        @NameInMap("Option")
        public java.util.Map<String, ?> option;

        /**
         * <p><strong>[Deprecated]</strong> The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>agent_text</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p><strong>[Deprecated]</strong> The type.</p>
         * 
         * <strong>example:</strong>
         * <p>plus</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1785898163</p>
         */
        @NameInMap("Version")
        public Long version;

        public static ListAppConfigHistoryResponseBodyPublish build(java.util.Map<String, ?> map) throws Exception {
            ListAppConfigHistoryResponseBodyPublish self = new ListAppConfigHistoryResponseBodyPublish();
            return TeaModel.build(map, self);
        }

        public ListAppConfigHistoryResponseBodyPublish setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListAppConfigHistoryResponseBodyPublish setClassify(String classify) {
            this.classify = classify;
            return this;
        }
        public String getClassify() {
            return this.classify;
        }

        public ListAppConfigHistoryResponseBodyPublish setCustomConfig(java.util.Map<String, ?> customConfig) {
            this.customConfig = customConfig;
            return this;
        }
        public java.util.Map<String, ?> getCustomConfig() {
            return this.customConfig;
        }

        public ListAppConfigHistoryResponseBodyPublish setDeployStatus(String deployStatus) {
            this.deployStatus = deployStatus;
            return this;
        }
        public String getDeployStatus() {
            return this.deployStatus;
        }

        public ListAppConfigHistoryResponseBodyPublish setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListAppConfigHistoryResponseBodyPublish setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAppConfigHistoryResponseBodyPublish setOption(java.util.Map<String, ?> option) {
            this.option = option;
            return this;
        }
        public java.util.Map<String, ?> getOption() {
            return this.option;
        }

        public ListAppConfigHistoryResponseBodyPublish setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListAppConfigHistoryResponseBodyPublish setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAppConfigHistoryResponseBodyPublish setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
