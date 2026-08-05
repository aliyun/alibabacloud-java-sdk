// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListAppConfigsRequest extends TeaModel {
    /**
     * <p>The classification.</p>
     * 
     * <strong>example:</strong>
     * <p>guard-scene</p>
     */
    @NameInMap("Classify")
    public String classify;

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

    public static ListAppConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppConfigsRequest self = new ListAppConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListAppConfigsRequest setClassify(String classify) {
        this.classify = classify;
        return this;
    }
    public String getClassify() {
        return this.classify;
    }

    public ListAppConfigsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListAppConfigsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
