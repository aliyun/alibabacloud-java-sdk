// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteSiteFunctionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>33793140540****,33793140540****</p>
     */
    @NameInMap("ConfigIds")
    public String configIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>611133661****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static DeleteSiteFunctionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSiteFunctionRequest self = new DeleteSiteFunctionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSiteFunctionRequest setConfigIds(String configIds) {
        this.configIds = configIds;
        return this;
    }
    public String getConfigIds() {
        return this.configIds;
    }

    public DeleteSiteFunctionRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
