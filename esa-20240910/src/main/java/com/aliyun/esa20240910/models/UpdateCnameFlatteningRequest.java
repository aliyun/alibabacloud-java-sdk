// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateCnameFlatteningRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>flatten_all</p>
     */
    @NameInMap("FlattenMode")
    public String flattenMode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static UpdateCnameFlatteningRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCnameFlatteningRequest self = new UpdateCnameFlatteningRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCnameFlatteningRequest setFlattenMode(String flattenMode) {
        this.flattenMode = flattenMode;
        return this;
    }
    public String getFlattenMode() {
        return this.flattenMode;
    }

    public UpdateCnameFlatteningRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
