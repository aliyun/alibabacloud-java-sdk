// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class ChangeDetailListOfOrderNumRequest extends TeaModel {
    @NameInMap("order_num")
    public Long orderNum;

    @NameInMap("page_index")
    public Integer pageIndex;

    @NameInMap("page_size")
    public Integer pageSize;

    public static ChangeDetailListOfOrderNumRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeDetailListOfOrderNumRequest self = new ChangeDetailListOfOrderNumRequest();
        return TeaModel.build(map, self);
    }

    public ChangeDetailListOfOrderNumRequest setOrderNum(Long orderNum) {
        this.orderNum = orderNum;
        return this;
    }
    public Long getOrderNum() {
        return this.orderNum;
    }

    public ChangeDetailListOfOrderNumRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ChangeDetailListOfOrderNumRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
