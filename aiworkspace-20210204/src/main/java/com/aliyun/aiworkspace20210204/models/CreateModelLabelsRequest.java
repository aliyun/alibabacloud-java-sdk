// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateModelLabelsRequest extends TeaModel {
    @NameInMap("Labels")
    public java.util.List<Label> labels;

    public static CreateModelLabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelLabelsRequest self = new CreateModelLabelsRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelLabelsRequest setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

}
