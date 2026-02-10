// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DLOrder extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>col1</p>
     */
    @NameInMap("Col")
    public String col;

    /**
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
