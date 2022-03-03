// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeSiteRequest extends TeaModel {
    @NameInMap("SiteId")
    public String siteId;

    public static DescribeSiteRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteRequest self = new DescribeSiteRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSiteRequest setSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }
    public String getSiteId() {
        return this.siteId;
    }

}
