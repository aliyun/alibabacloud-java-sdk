// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetVideoProcessingRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23321557***</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23282348***</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static GetVideoProcessingRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoProcessingRequest self = new GetVideoProcessingRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoProcessingRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public GetVideoProcessingRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
