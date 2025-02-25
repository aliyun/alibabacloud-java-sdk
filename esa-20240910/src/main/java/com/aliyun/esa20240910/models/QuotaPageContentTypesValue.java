// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class QuotaPageContentTypesValue extends TeaModel {
    /**
     * <p>The switch for the Content-Type type in custom response pages.</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The content length quota for the Content-Type in custom response pages.</p>
     */
    @NameInMap("ContentLength")
    public WafQuotaInteger contentLength;

    public static QuotaPageContentTypesValue build(java.util.Map<String, ?> map) throws Exception {
        QuotaPageContentTypesValue self = new QuotaPageContentTypesValue();
        return TeaModel.build(map, self);
    }

    public QuotaPageContentTypesValue setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public QuotaPageContentTypesValue setContentLength(WafQuotaInteger contentLength) {
        this.contentLength = contentLength;
        return this;
    }
    public WafQuotaInteger getContentLength() {
        return this.contentLength;
    }

}
