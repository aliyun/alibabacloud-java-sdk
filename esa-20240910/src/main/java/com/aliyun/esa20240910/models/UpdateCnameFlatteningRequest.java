// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateCnameFlatteningRequest extends TeaModel {
    /**
     * <p>The CNAME flattening mode. Valid values:</p>
     * <ul>
     * <li>flatten_all: flattens all CNAMEs.</li>
     * <li>flatten_at_root: flattens only the root domain. Default: flatten_at_root</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>flatten_all</p>
     */
    @NameInMap("FlattenMode")
    public String flattenMode;

    /**
     * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
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
