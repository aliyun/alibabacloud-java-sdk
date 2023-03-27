// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class DeleteLabelRequest extends TeaModel {
    @NameInMap("Country")
    public String country;

    @NameInMap("LabelId")
    public String labelId;

    public static DeleteLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLabelRequest self = new DeleteLabelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLabelRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public DeleteLabelRequest setLabelId(String labelId) {
        this.labelId = labelId;
        return this;
    }
    public String getLabelId() {
        return this.labelId;
    }

}
