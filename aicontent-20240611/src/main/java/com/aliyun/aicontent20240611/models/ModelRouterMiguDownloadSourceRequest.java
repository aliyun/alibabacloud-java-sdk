// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterMiguDownloadSourceRequest extends TeaModel {
    /**
     * <p>The unique identifier of the source file. This is the sourceId returned by the upload operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3f2a1b9c8d7e4f60a1b2c3d4e5f6a7b8</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    public static ModelRouterMiguDownloadSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterMiguDownloadSourceRequest self = new ModelRouterMiguDownloadSourceRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterMiguDownloadSourceRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

}
