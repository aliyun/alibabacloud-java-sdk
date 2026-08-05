// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class CopyAppConfigRequest extends TeaModel {
    /**
     * <p>The ID of the source App to copy from.</p>
     * 
     * <strong>example:</strong>
     * <p>txt_check_agent_01</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The name of the new App to be created from the copy.</p>
     * 
     * <strong>example:</strong>
     * <p>CustomTextModeration</p>
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
     * <p>The resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>agent_text</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static CopyAppConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyAppConfigRequest self = new CopyAppConfigRequest();
        return TeaModel.build(map, self);
    }

    public CopyAppConfigRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CopyAppConfigRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CopyAppConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CopyAppConfigRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
