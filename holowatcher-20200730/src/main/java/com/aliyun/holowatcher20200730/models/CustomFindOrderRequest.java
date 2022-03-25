// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CustomFindOrderRequest extends TeaModel {
    @NameInMap("OrderIdCipher")
    public String orderIdCipher;

    @NameInMap("OrderName")
    public String orderName;

    @NameInMap("OrderState")
    public String orderState;

    @NameInMap("Page")
    public Long page;

    @NameInMap("Size")
    public Long size;

    @NameInMap("Sort")
    public String sort;

    public static CustomFindOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CustomFindOrderRequest self = new CustomFindOrderRequest();
        return TeaModel.build(map, self);
    }

    public CustomFindOrderRequest setOrderIdCipher(String orderIdCipher) {
        this.orderIdCipher = orderIdCipher;
        return this;
    }
    public String getOrderIdCipher() {
        return this.orderIdCipher;
    }

    public CustomFindOrderRequest setOrderName(String orderName) {
        this.orderName = orderName;
        return this;
    }
    public String getOrderName() {
        return this.orderName;
    }

    public CustomFindOrderRequest setOrderState(String orderState) {
        this.orderState = orderState;
        return this;
    }
    public String getOrderState() {
        return this.orderState;
    }

    public CustomFindOrderRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public CustomFindOrderRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public CustomFindOrderRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

}
