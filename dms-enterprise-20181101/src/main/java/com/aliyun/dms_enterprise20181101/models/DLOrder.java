// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DLOrder extends TeaModel {
    /**
     * <p>The name of the column.</p>
     * 
     * <strong>example:</strong>
     * <p>col1</p>
     */
    @NameInMap("Col")
    public String col;

    /**
     * <p>The position of the column in the sort.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Order")
    public Integer order;

    public static DLOrder build(java.util.Map<String, ?> map) throws Exception {
        DLOrder self = new DLOrder();
        return TeaModel.build(map, self);
    }

    public DLOrder setCol(String col) {
        this.col = col;
        return this;
    }
    public String getCol() {
        return this.col;
    }

    public DLOrder setOrder(Integer order) {
        this.order = order;
        return this;
    }
    public Integer getOrder() {
        return this.order;
    }

}
