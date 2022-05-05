// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeWebhookContactsRequest extends TeaModel {
    @NameInMap("Page")
    public Long page;

    @NameInMap("Size")
    public Long size;

    // 告警webhook名称
    @NameInMap("WebhookName")
    public String webhookName;

    public static DescribeWebhookContactsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebhookContactsRequest self = new DescribeWebhookContactsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWebhookContactsRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public DescribeWebhookContactsRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public DescribeWebhookContactsRequest setWebhookName(String webhookName) {
        this.webhookName = webhookName;
        return this;
    }
    public String getWebhookName() {
        return this.webhookName;
    }

}
