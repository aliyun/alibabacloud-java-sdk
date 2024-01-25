// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetBusinessGroupIndexRequest extends TeaModel {
    @NameInMap("BusinessGroupId")
    public String businessGroupId;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("ProductId")
    public Integer productId;

    public static GetBusinessGroupIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessGroupIndexRequest self = new GetBusinessGroupIndexRequest();
        return TeaModel.build(map, self);
    }

    public GetBusinessGroupIndexRequest setBusinessGroupId(String businessGroupId) {
        this.businessGroupId = businessGroupId;
        return this;
    }
    public String getBusinessGroupId() {
        return this.businessGroupId;
    }

    public GetBusinessGroupIndexRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public GetBusinessGroupIndexRequest setProductId(Integer productId) {
        this.productId = productId;
        return this;
    }
    public Integer getProductId() {
        return this.productId;
    }

}
