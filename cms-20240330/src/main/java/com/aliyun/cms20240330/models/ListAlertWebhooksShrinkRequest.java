// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListAlertWebhooksShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("webhookIds")
    public String webhookIdsShrink;

    public static ListAlertWebhooksShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlertWebhooksShrinkRequest self = new ListAlertWebhooksShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListAlertWebhooksShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListAlertWebhooksShrinkRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAlertWebhooksShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAlertWebhooksShrinkRequest setWebhookIdsShrink(String webhookIdsShrink) {
        this.webhookIdsShrink = webhookIdsShrink;
        return this;
    }
    public String getWebhookIdsShrink() {
        return this.webhookIdsShrink;
    }

}
