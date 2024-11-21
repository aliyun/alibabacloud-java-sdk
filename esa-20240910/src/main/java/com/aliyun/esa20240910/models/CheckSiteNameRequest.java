// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CheckSiteNameRequest extends TeaModel {
    /**
     * <p>The website name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("SiteName")
    public String siteName;

    public static CheckSiteNameRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckSiteNameRequest self = new CheckSiteNameRequest();
        return TeaModel.build(map, self);
    }

    public CheckSiteNameRequest setSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }
    public String getSiteName() {
        return this.siteName;
    }

}
