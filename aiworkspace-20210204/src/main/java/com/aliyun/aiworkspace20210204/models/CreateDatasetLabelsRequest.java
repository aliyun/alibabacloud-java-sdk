// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateDatasetLabelsRequest extends TeaModel {
    @NameInMap("Labels")
    public java.util.List<DatasetLabel> labels;

    public static CreateDatasetLabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetLabelsRequest self = new CreateDatasetLabelsRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatasetLabelsRequest setLabels(java.util.List<DatasetLabel> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<DatasetLabel> getLabels() {
        return this.labels;
    }

}
