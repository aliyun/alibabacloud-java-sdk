// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class StopCrawlerWorkflowRequest extends TeaModel {
    @NameInMap("CrawlerId")
    public String crawlerId;

    public static StopCrawlerWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        StopCrawlerWorkflowRequest self = new StopCrawlerWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public StopCrawlerWorkflowRequest setCrawlerId(String crawlerId) {
        this.crawlerId = crawlerId;
        return this;
    }
    public String getCrawlerId() {
        return this.crawlerId;
    }

}
