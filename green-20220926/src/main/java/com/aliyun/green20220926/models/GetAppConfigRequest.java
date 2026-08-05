// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetAppConfigRequest extends TeaModel {
    /**
     * <p>Agent ID。</p>
     * 
     * <strong>example:</strong>
     * <p>ag.abcxxx</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>App ID。</p>
     * 
     * <strong>example:</strong>
     * <p>txt_check_pro_agent_01</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The application version number.</p>
     * 
     * <strong>example:</strong>
     * <p>1785898163</p>
     */
    @NameInMap("AppVersion")
    public Long appVersion;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>agent_text</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static GetAppConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppConfigRequest self = new GetAppConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetAppConfigRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public GetAppConfigRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetAppConfigRequest setAppVersion(Long appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public Long getAppVersion() {
        return this.appVersion;
    }

    public GetAppConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetAppConfigRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
