// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class AddAppConfigRequest extends TeaModel {
    /**
     * <p>The category.</p>
     * 
     * <strong>example:</strong>
     * <p>guard-scene</p>
     */
    @NameInMap("Classify")
    public String classify;

    /**
     * <p>The name.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
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
     * <p>text</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>appId</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
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

    public static AddAppConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAppConfigRequest self = new AddAppConfigRequest();
        return TeaModel.build(map, self);
    }

    public AddAppConfigRequest setClassify(String classify) {
        this.classify = classify;
        return this;
    }
    public String getClassify() {
        return this.classify;
    }

    public AddAppConfigRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddAppConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddAppConfigRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public AddAppConfigRequest setSysAppId(String sysAppId) {
        this.sysAppId = sysAppId;
        return this;
    }
    public String getSysAppId() {
        return this.sysAppId;
    }

    public AddAppConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
