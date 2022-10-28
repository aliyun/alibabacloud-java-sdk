// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateModelVersionLabelsRequest extends TeaModel {
    @NameInMap("Labels")
    public java.util.List<Label> labels;

    public static CreateModelVersionLabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelVersionLabelsRequest self = new CreateModelVersionLabelsRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelVersionLabelsRequest setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

}
