// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class GoodsShippingNoticeCreateResult extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3239281273464326823</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("result")
    public String result;

    public static GoodsShippingNoticeCreateResult build(java.util.Map<String, ?> map) throws Exception {
        GoodsShippingNoticeCreateResult self = new GoodsShippingNoticeCreateResult();
        return TeaModel.build(map, self);
    }

    public GoodsShippingNoticeCreateResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GoodsShippingNoticeCreateResult setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
