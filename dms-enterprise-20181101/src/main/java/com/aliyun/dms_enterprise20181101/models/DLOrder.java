// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DLOrder extends TeaModel {
    @NameInMap("Col")
    public String col;

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
