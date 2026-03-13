// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class QueryCompenInfosForOpRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("category")
    public Integer category;

    /**
     * <strong>example:</strong>
     * <p>82508250249123456</p>
     */
    @NameInMap("compen_id")
    public String compenId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1002086203277812345</p>
     */
    @NameInMap("order_id")
    public String orderId;

    public static QueryCompenInfosForOpRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCompenInfosForOpRequest self = new QueryCompenInfosForOpRequest();
        return TeaModel.build(map, self);
    }

    public QueryCompenInfosForOpRequest setCategory(Integer category) {
        this.category = category;
        return this;
    }
    public Integer getCategory() {
        return this.category;
    }

    public QueryCompenInfosForOpRequest setCompenId(String compenId) {
        this.compenId = compenId;
        return this;
    }
    public String getCompenId() {
        return this.compenId;
    }

    public QueryCompenInfosForOpRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
