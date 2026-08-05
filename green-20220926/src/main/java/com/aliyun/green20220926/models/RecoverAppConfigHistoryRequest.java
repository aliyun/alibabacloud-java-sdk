// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class RecoverAppConfigHistoryRequest extends TeaModel {
    /**
     * <p>App ID。</p>
     * 
     * <strong>example:</strong>
     * <p>txt_check_agent_01</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The version number.</p>
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

    public static RecoverAppConfigHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        RecoverAppConfigHistoryRequest self = new RecoverAppConfigHistoryRequest();
        return TeaModel.build(map, self);
    }

    public RecoverAppConfigHistoryRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RecoverAppConfigHistoryRequest setAppVersion(Long appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public Long getAppVersion() {
        return this.appVersion;
    }

    public RecoverAppConfigHistoryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RecoverAppConfigHistoryRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
