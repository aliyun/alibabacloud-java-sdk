// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class SetExperimentLabelsRequest extends TeaModel {
    /**
     * <p>The tags.</p>
     */
    @NameInMap("Labels")
    public java.util.List<LabelInfo> labels;

    public static SetExperimentLabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        SetExperimentLabelsRequest self = new SetExperimentLabelsRequest();
        return TeaModel.build(map, self);
    }

    public SetExperimentLabelsRequest setLabels(java.util.List<LabelInfo> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<LabelInfo> getLabels() {
        return this.labels;
    }

}
