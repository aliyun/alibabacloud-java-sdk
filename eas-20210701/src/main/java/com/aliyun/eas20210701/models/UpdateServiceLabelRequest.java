// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceLabelRequest extends TeaModel {
    /**
     * <p>The custom service tags.</p>
     */
    @NameInMap("Labels")
    public java.util.Map<String, String> labels;

    public static UpdateServiceLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceLabelRequest self = new UpdateServiceLabelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceLabelRequest setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

}
