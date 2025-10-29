// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class ReadPageScrapeRequest extends TeaModel {
    /**
     * <p>post body</p>
     */
    @NameInMap("body")
    public ReadPageScrapeBody body;

    public static ReadPageScrapeRequest build(java.util.Map<String, ?> map) throws Exception {
        ReadPageScrapeRequest self = new ReadPageScrapeRequest();
        return TeaModel.build(map, self);
    }

    public ReadPageScrapeRequest setBody(ReadPageScrapeBody body) {
        this.body = body;
        return this;
    }
    public ReadPageScrapeBody getBody() {
        return this.body;
    }

}
