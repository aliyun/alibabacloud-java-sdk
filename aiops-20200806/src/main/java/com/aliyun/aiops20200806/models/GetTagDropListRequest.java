// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetTagDropListRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("ProductId")
    public Long productId;

    public static GetTagDropListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTagDropListRequest self = new GetTagDropListRequest();
        return TeaModel.build(map, self);
    }

    public GetTagDropListRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public GetTagDropListRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

}
