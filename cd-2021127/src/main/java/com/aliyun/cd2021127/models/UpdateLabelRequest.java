// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class UpdateLabelRequest extends TeaModel {
    @NameInMap("Country")
    public String country;

    @NameInMap("Label")
    public String label;

    @NameInMap("LabelId")
    public String labelId;

    @NameInMap("Title")
    public String title;

    public static UpdateLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLabelRequest self = new UpdateLabelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLabelRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public UpdateLabelRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public UpdateLabelRequest setLabelId(String labelId) {
        this.labelId = labelId;
        return this;
    }
    public String getLabelId() {
        return this.labelId;
    }

    public UpdateLabelRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
