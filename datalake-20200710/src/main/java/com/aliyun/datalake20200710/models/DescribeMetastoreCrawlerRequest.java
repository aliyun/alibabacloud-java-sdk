// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DescribeMetastoreCrawlerRequest extends TeaModel {
    @NameInMap("CrawlerId")
    public String crawlerId;

    public static DescribeMetastoreCrawlerRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetastoreCrawlerRequest self = new DescribeMetastoreCrawlerRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMetastoreCrawlerRequest setCrawlerId(String crawlerId) {
        this.crawlerId = crawlerId;
        return this;
    }
    public String getCrawlerId() {
        return this.crawlerId;
    }

}
