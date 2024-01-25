// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DeleteBusinessResourceTagRequest extends TeaModel {
    @NameInMap("BusinessGroupId")
    public String businessGroupId;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("ProductId")
    public String productId;

    @NameInMap("Resources")
    public String resources;

    public static DeleteBusinessResourceTagRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBusinessResourceTagRequest self = new DeleteBusinessResourceTagRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBusinessResourceTagRequest setBusinessGroupId(String businessGroupId) {
        this.businessGroupId = businessGroupId;
        return this;
    }
    public String getBusinessGroupId() {
        return this.businessGroupId;
    }

    public DeleteBusinessResourceTagRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public DeleteBusinessResourceTagRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public DeleteBusinessResourceTagRequest setResources(String resources) {
        this.resources = resources;
        return this;
    }
    public String getResources() {
        return this.resources;
    }

}
