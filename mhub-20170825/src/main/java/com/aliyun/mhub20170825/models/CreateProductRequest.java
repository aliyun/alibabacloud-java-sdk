// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class CreateProductRequest extends TeaModel {
    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("IndustryId")
    public Integer industryId;

    @NameInMap("IconName")
    public String iconName;

    @NameInMap("EncodedIcon")
    public String encodedIcon;

    public static CreateProductRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProductRequest self = new CreateProductRequest();
        return TeaModel.build(map, self);
    }

    public CreateProductRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateProductRequest setIndustryId(Integer industryId) {
        this.industryId = industryId;
        return this;
    }
    public Integer getIndustryId() {
        return this.industryId;
    }

    public CreateProductRequest setIconName(String iconName) {
        this.iconName = iconName;
        return this;
    }
    public String getIconName() {
        return this.iconName;
    }

    public CreateProductRequest setEncodedIcon(String encodedIcon) {
        this.encodedIcon = encodedIcon;
        return this;
    }
    public String getEncodedIcon() {
        return this.encodedIcon;
    }

}
