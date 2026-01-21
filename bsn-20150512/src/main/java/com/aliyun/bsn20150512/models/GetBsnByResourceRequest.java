// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bsn20150512.models;

import com.aliyun.tea.*;

public class GetBsnByResourceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("aliuid")
    public Long aliuid;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3097938</p>
     */
    @NameInMap("resourceId")
    public String resourceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alicloud_edas_application_scale</p>
     */
    @NameInMap("resourceType")
    public Integer resourceType;

    public static GetBsnByResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBsnByResourceRequest self = new GetBsnByResourceRequest();
        return TeaModel.build(map, self);
    }

    public GetBsnByResourceRequest setAliuid(Long aliuid) {
        this.aliuid = aliuid;
        return this;
    }
    public Long getAliuid() {
        return this.aliuid;
    }

    public GetBsnByResourceRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public GetBsnByResourceRequest setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Integer getResourceType() {
        return this.resourceType;
    }

}
