// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class PutGroupResourceTagRequest extends TeaModel {
    @NameInMap("BusinessGroupId")
    public String businessGroupId;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("ProductId")
    public String productId;

    @NameInMap("Resources")
    public String resources;

    @NameInMap("TagId")
    public String tagId;

    public static PutGroupResourceTagRequest build(java.util.Map<String, ?> map) throws Exception {
        PutGroupResourceTagRequest self = new PutGroupResourceTagRequest();
        return TeaModel.build(map, self);
    }

    public PutGroupResourceTagRequest setBusinessGroupId(String businessGroupId) {
        this.businessGroupId = businessGroupId;
        return this;
    }
    public String getBusinessGroupId() {
        return this.businessGroupId;
    }

    public PutGroupResourceTagRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public PutGroupResourceTagRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public PutGroupResourceTagRequest setResources(String resources) {
        this.resources = resources;
        return this;
    }
    public String getResources() {
        return this.resources;
    }

    public PutGroupResourceTagRequest setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }
    public String getTagId() {
        return this.tagId;
    }

}
