// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ExportRecordsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static ExportRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportRecordsRequest self = new ExportRecordsRequest();
        return TeaModel.build(map, self);
    }

    public ExportRecordsRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
