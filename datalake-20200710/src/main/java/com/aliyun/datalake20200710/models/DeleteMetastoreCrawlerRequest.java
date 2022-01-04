// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DeleteMetastoreCrawlerRequest extends TeaModel {
    @NameInMap("CrawlerId")
    public String crawlerId;

    public static DeleteMetastoreCrawlerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetastoreCrawlerRequest self = new DeleteMetastoreCrawlerRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMetastoreCrawlerRequest setCrawlerId(String crawlerId) {
        this.crawlerId = crawlerId;
        return this;
    }
    public String getCrawlerId() {
        return this.crawlerId;
    }

}
