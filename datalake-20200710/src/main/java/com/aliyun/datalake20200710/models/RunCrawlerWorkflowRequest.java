// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class RunCrawlerWorkflowRequest extends TeaModel {
    @NameInMap("CrawlerId")
    public String crawlerId;

    public static RunCrawlerWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        RunCrawlerWorkflowRequest self = new RunCrawlerWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public RunCrawlerWorkflowRequest setCrawlerId(String crawlerId) {
        this.crawlerId = crawlerId;
        return this;
    }
    public String getCrawlerId() {
        return this.crawlerId;
    }

}
