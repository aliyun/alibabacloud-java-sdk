// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetVideoProcessingRequest extends TeaModel {
    /**
     * <p>The configuration ID. You can call the <a href="~~ListVideoProcessings~~">ListVideoProcessings</a> operation to obtain the configuration ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23321557***</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
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
