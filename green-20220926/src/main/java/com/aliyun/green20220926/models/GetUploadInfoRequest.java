// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetUploadInfoRequest extends TeaModel {
    /**
     * <p>The upload name.</p>
     * 
     * <strong>example:</strong>
     * <p>测试</p>
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
     * <p>image</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static GetUploadInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUploadInfoRequest self = new GetUploadInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetUploadInfoRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetUploadInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetUploadInfoRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
