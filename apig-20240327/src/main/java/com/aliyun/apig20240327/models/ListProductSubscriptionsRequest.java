// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListProductSubscriptionsRequest extends TeaModel {
    /**
     * <p>The keyword of the consumer name used to search the subscription records of the API product by consumer name.</p>
     * 
     * <strong>example:</strong>
     * <p>consumer-1</p>
     */
    @NameInMap("consumerName")
    public String consumerName;

    /**
     * <p>The page number. Pages start from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The subscription status used to filter subscriptions. Valid values: PENDING and APPROVED.</p>
     * 
     * <strong>example:</strong>
     * <p>APPROVED</p>
     */
    @NameInMap("status")
    public String status;

    public static ListProductSubscriptionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductSubscriptionsRequest self = new ListProductSubscriptionsRequest();
        return TeaModel.build(map, self);
    }

    public ListProductSubscriptionsRequest setConsumerName(String consumerName) {
        this.consumerName = consumerName;
        return this;
    }
    public String getConsumerName() {
        return this.consumerName;
    }

    public ListProductSubscriptionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListProductSubscriptionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProductSubscriptionsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
