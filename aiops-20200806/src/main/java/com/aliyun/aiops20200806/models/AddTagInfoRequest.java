// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class AddTagInfoRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("ProductId")
    public Long productId;

    @NameInMap("TagName")
    public String tagName;

    public static AddTagInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTagInfoRequest self = new AddTagInfoRequest();
        return TeaModel.build(map, self);
    }

    public AddTagInfoRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public AddTagInfoRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public AddTagInfoRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

}
