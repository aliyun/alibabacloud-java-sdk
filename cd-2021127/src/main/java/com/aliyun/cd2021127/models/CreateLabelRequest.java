// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class CreateLabelRequest extends TeaModel {
    @NameInMap("Category")
    public String category;

    @NameInMap("Country")
    public String country;

    @NameInMap("Label")
    public String label;

    @NameInMap("Title")
    public String title;

    public static CreateLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLabelRequest self = new CreateLabelRequest();
        return TeaModel.build(map, self);
    }

    public CreateLabelRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateLabelRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public CreateLabelRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public CreateLabelRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
