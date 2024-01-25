// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetEventTypeRequest extends TeaModel {
    @NameInMap("BusinessGroupId")
    public String businessGroupId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("ProductId")
    public Integer productId;

    public static GetEventTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEventTypeRequest self = new GetEventTypeRequest();
        return TeaModel.build(map, self);
    }

    public GetEventTypeRequest setBusinessGroupId(String businessGroupId) {
        this.businessGroupId = businessGroupId;
        return this;
    }
    public String getBusinessGroupId() {
        return this.businessGroupId;
    }

    public GetEventTypeRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetEventTypeRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public GetEventTypeRequest setProductId(Integer productId) {
        this.productId = productId;
        return this;
    }
    public Integer getProductId() {
        return this.productId;
    }

}
