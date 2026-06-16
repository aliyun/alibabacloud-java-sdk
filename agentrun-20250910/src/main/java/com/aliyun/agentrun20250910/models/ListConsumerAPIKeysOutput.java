// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListConsumerAPIKeysOutput extends TeaModel {
    /**
     * <p>A list of consumer API keys.</p>
     */
    @NameInMap("items")
    public java.util.List<ConsumerAPIKey> items;

    /**
     * <p>The current page number.</p>
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
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The total number of matching consumer API keys.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListConsumerAPIKeysOutput build(java.util.Map<String, ?> map) throws Exception {
        ListConsumerAPIKeysOutput self = new ListConsumerAPIKeysOutput();
        return TeaModel.build(map, self);
    }

    public ListConsumerAPIKeysOutput setItems(java.util.List<ConsumerAPIKey> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ConsumerAPIKey> getItems() {
        return this.items;
    }

    public ListConsumerAPIKeysOutput setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListConsumerAPIKeysOutput setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListConsumerAPIKeysOutput setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
