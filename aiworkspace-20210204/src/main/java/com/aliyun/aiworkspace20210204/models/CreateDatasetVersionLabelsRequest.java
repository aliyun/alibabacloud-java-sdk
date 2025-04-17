// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateDatasetVersionLabelsRequest extends TeaModel {
    /**
     * <p>The tags.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Labels")
    public java.util.List<Label> labels;

    public static CreateDatasetVersionLabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetVersionLabelsRequest self = new CreateDatasetVersionLabelsRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatasetVersionLabelsRequest setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

}
