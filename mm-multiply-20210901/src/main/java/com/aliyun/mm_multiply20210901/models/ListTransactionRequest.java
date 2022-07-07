// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListTransactionRequest extends TeaModel {
    // 状态
    @NameInMap("Status")
    public Integer status;

    public static ListTransactionRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTransactionRequest self = new ListTransactionRequest();
        return TeaModel.build(map, self);
    }

    public ListTransactionRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
