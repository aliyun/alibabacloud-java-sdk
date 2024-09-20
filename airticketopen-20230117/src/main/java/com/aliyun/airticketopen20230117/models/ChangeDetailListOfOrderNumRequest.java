// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class ChangeDetailListOfOrderNumRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4988430***700</p>
     */
    @NameInMap("order_num")
    public Long orderNum;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page_index")
    public Integer pageIndex;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
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
