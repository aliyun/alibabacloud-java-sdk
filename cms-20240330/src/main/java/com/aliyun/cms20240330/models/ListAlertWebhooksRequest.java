// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListAlertWebhooksRequest extends TeaModel {
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
    public java.util.List<String> webhookIds;

    public static ListAlertWebhooksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlertWebhooksRequest self = new ListAlertWebhooksRequest();
        return TeaModel.build(map, self);
    }

    public ListAlertWebhooksRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListAlertWebhooksRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAlertWebhooksRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAlertWebhooksRequest setWebhookIds(java.util.List<String> webhookIds) {
        this.webhookIds = webhookIds;
        return this;
    }
    public java.util.List<String> getWebhookIds() {
        return this.webhookIds;
    }

}
