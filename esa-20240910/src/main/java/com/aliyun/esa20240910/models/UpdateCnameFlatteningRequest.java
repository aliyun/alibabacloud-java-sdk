// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateCnameFlatteningRequest extends TeaModel {
    /**
     * <p>Flattening mode. Possible values:</p>
     * <ul>
     * <li>flatten_all: Flatten all.</li>
     * <li>flatten_at_root: Flatten only the root domain. The default is to flatten the root domain.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>flatten_all</p>
     */
    @NameInMap("FlattenMode")
    public String flattenMode;

    /**
     * <p>Site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> interface.</p>
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
