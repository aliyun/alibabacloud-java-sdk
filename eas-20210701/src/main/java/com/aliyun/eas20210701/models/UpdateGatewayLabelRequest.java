// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateGatewayLabelRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Labels")
    public java.util.Map<String, String> labels;

    public static UpdateGatewayLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayLabelRequest self = new UpdateGatewayLabelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayLabelRequest setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

}
