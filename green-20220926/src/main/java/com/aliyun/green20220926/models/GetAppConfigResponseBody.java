// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetAppConfigResponseBody extends TeaModel {
    /**
     * <p>App ID。</p>
     * 
     * <strong>example:</strong>
     * <p>txt_check_pro_agent_01</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The category.</p>
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
     * <p>The modification time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-06-09 10:12:50</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <p>The application name.</p>
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
     * <p>The ID assigned by the backend to uniquely identify a request. This ID can be used to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public static GetAppConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppConfigResponseBody self = new GetAppConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppConfigResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetAppConfigResponseBody setClassify(String classify) {
        this.classify = classify;
        return this;
    }
    public String getClassify() {
        return this.classify;
    }

    public GetAppConfigResponseBody setCustomConfig(java.util.Map<String, ?> customConfig) {
        this.customConfig = customConfig;
        return this;
    }
    public java.util.Map<String, ?> getCustomConfig() {
        return this.customConfig;
    }

    public GetAppConfigResponseBody setDeployStatus(String deployStatus) {
        this.deployStatus = deployStatus;
        return this;
    }
    public String getDeployStatus() {
        return this.deployStatus;
    }

    public GetAppConfigResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public GetAppConfigResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetAppConfigResponseBody setOption(java.util.Map<String, ?> option) {
        this.option = option;
        return this;
    }
    public java.util.Map<String, ?> getOption() {
        return this.option;
    }

    public GetAppConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppConfigResponseBody setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetAppConfigResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GetAppConfigResponseBody setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

}
