// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListServiceConfigsRequest extends TeaModel {
    /**
     * <p>Category.</p>
     * 
     * <strong>example:</strong>
     * <p>guard-scene</p>
     */
    @NameInMap("Classify")
    public String classify;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>Usage status.</p>
     * 
     * <strong>example:</strong>
     * <p>in</p>
     */
    @NameInMap("UseStatus")
    public String useStatus;

    public static ListServiceConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceConfigsRequest self = new ListServiceConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceConfigsRequest setClassify(String classify) {
        this.classify = classify;
        return this;
    }
    public String getClassify() {
        return this.classify;
    }

    public ListServiceConfigsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListServiceConfigsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListServiceConfigsRequest setUseStatus(String useStatus) {
        this.useStatus = useStatus;
        return this;
    }
    public String getUseStatus() {
        return this.useStatus;
    }

}
