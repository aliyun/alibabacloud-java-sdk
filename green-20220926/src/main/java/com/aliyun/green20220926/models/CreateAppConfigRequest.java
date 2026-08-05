// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class CreateAppConfigRequest extends TeaModel {
    /**
     * <p>The name.</p>
     * 
     * <strong>example:</strong>
     * <p>CustomReview</p>
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

    /**
     * <p>The system app ID.</p>
     * 
     * <strong>example:</strong>
     * <p>txt_check_agent</p>
     */
    @NameInMap("SysAppId")
    public String sysAppId;

    /**
     * <p>The type.</p>
     * 
     * <strong>example:</strong>
     * <p>plus</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateAppConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppConfigRequest self = new CreateAppConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppConfigRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAppConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAppConfigRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public CreateAppConfigRequest setSysAppId(String sysAppId) {
        this.sysAppId = sysAppId;
        return this;
    }
    public String getSysAppId() {
        return this.sysAppId;
    }

    public CreateAppConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
