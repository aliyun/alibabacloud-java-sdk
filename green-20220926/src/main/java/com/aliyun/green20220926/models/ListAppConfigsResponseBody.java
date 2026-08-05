// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListAppConfigsResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListAppConfigsResponseBodyData> data;

    /**
     * <p>The ID assigned by the backend to uniquely identify a request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAppConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppConfigsResponseBody self = new ListAppConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppConfigsResponseBody setData(java.util.List<ListAppConfigsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAppConfigsResponseBodyData> getData() {
        return this.data;
    }

    public ListAppConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAppConfigsResponseBodyData extends TeaModel {
        /**
         * <p>App ID。</p>
         * 
         * <strong>example:</strong>
         * <p>txt_check_pro_agent_01</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The classification.</p>
         * 
         * <strong>example:</strong>
         * <p>guard-scene</p>
         */
        @NameInMap("Classify")
        public String classify;

        /**
         * <p>The configuration details.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;agentItemConfigs&quot;: &quot;[{\&quot;agentId\&quot;:\&quot;ag.abcxxx\&quot;,\&quot;enable\&quot;:true,\&quot;name\&quot;:\&quot;Agent 1\&quot;}]&quot;}</p>
         */
        @NameInMap("CustomConfig")
        public java.util.Map<String, ?> customConfig;

        /**
         * <p>The publish status.</p>
         * 
         * <strong>example:</strong>
         * <p>editing</p>
         */
        @NameInMap("DeployStatus")
        public String deployStatus;

        /**
         * <p>The last modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-15 10:17:49</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom text moderation</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The preset options.</p>
         */
        @NameInMap("Option")
        public java.util.Map<String, ?> option;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>agent_text</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The type.</p>
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

        public static ListAppConfigsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAppConfigsResponseBodyData self = new ListAppConfigsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAppConfigsResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListAppConfigsResponseBodyData setClassify(String classify) {
            this.classify = classify;
            return this;
        }
        public String getClassify() {
            return this.classify;
        }

        public ListAppConfigsResponseBodyData setCustomConfig(java.util.Map<String, ?> customConfig) {
            this.customConfig = customConfig;
            return this;
        }
        public java.util.Map<String, ?> getCustomConfig() {
            return this.customConfig;
        }

        public ListAppConfigsResponseBodyData setDeployStatus(String deployStatus) {
            this.deployStatus = deployStatus;
            return this;
        }
        public String getDeployStatus() {
            return this.deployStatus;
        }

        public ListAppConfigsResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListAppConfigsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAppConfigsResponseBodyData setOption(java.util.Map<String, ?> option) {
            this.option = option;
            return this;
        }
        public java.util.Map<String, ?> getOption() {
            return this.option;
        }

        public ListAppConfigsResponseBodyData setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListAppConfigsResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAppConfigsResponseBodyData setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
