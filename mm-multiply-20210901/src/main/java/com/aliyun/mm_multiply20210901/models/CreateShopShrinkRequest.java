// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class CreateShopShrinkRequest extends TeaModel {
    @NameInMap("ExtInfo")
    public String extInfoShrink;

    @NameInMap("TbShopDescription")
    public String tbShopDescription;

    @NameInMap("TbShopId")
    public String tbShopId;

    @NameInMap("TbShopName")
    public String tbShopName;

    @NameInMap("Token")
    public String token;

    @NameInMap("Type")
    public String type;

    public static CreateShopShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateShopShrinkRequest self = new CreateShopShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateShopShrinkRequest setExtInfoShrink(String extInfoShrink) {
        this.extInfoShrink = extInfoShrink;
        return this;
    }
    public String getExtInfoShrink() {
        return this.extInfoShrink;
    }

    public CreateShopShrinkRequest setTbShopDescription(String tbShopDescription) {
        this.tbShopDescription = tbShopDescription;
        return this;
    }
    public String getTbShopDescription() {
        return this.tbShopDescription;
    }

    public CreateShopShrinkRequest setTbShopId(String tbShopId) {
        this.tbShopId = tbShopId;
        return this;
    }
    public String getTbShopId() {
        return this.tbShopId;
    }

    public CreateShopShrinkRequest setTbShopName(String tbShopName) {
        this.tbShopName = tbShopName;
        return this;
    }
    public String getTbShopName() {
        return this.tbShopName;
    }

    public CreateShopShrinkRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public CreateShopShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
