// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ModifyAppInfoRequest extends TeaModel {
    /**
     * <p>The app ID. Note: This parameter is actually required. If it is not provided, the service returns a 400 error (appId may not be empty).</p>
     * 
     * <strong>example:</strong>
     * <p>txt_check_agent_01</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The custom order number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CustomOrderNum")
    public Integer customOrderNum;

    /**
     * <p>The name of the app.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom text moderation</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource type. Note: This parameter is actually required. If it is not provided, the service returns a 400 error (resourceType may not be empty).</p>
     * 
     * <strong>example:</strong>
     * <p>agent_text</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static ModifyAppInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppInfoRequest self = new ModifyAppInfoRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAppInfoRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyAppInfoRequest setCustomOrderNum(Integer customOrderNum) {
        this.customOrderNum = customOrderNum;
        return this;
    }
    public Integer getCustomOrderNum() {
        return this.customOrderNum;
    }

    public ModifyAppInfoRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyAppInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyAppInfoRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
