// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class ModifyProductRequest extends TeaModel {
    @NameInMap("ProductId")
    @Validation(required = true)
    public String productId;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("IndustryId")
    public Integer industryId;

    @NameInMap("EncodedIcon")
    public String encodedIcon;

    @NameInMap("IconName")
    public String iconName;

    @NameInMap("RemoveIcon")
    public Boolean removeIcon;

    public static ModifyProductRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyProductRequest self = new ModifyProductRequest();
        return TeaModel.build(map, self);
    }

    public ModifyProductRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public ModifyProductRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyProductRequest setIndustryId(Integer industryId) {
        this.industryId = industryId;
        return this;
    }
    public Integer getIndustryId() {
        return this.industryId;
    }

    public ModifyProductRequest setEncodedIcon(String encodedIcon) {
        this.encodedIcon = encodedIcon;
        return this;
    }
    public String getEncodedIcon() {
        return this.encodedIcon;
    }

    public ModifyProductRequest setIconName(String iconName) {
        this.iconName = iconName;
        return this;
    }
    public String getIconName() {
        return this.iconName;
    }

    public ModifyProductRequest setRemoveIcon(Boolean removeIcon) {
        this.removeIcon = removeIcon;
        return this;
    }
    public Boolean getRemoveIcon() {
        return this.removeIcon;
    }

}
