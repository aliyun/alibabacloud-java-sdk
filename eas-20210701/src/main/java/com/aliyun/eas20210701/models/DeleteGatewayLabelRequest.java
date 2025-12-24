// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteGatewayLabelRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LabelKeys")
    public java.util.List<String> labelKeys;

    public static DeleteGatewayLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayLabelRequest self = new DeleteGatewayLabelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayLabelRequest setLabelKeys(java.util.List<String> labelKeys) {
        this.labelKeys = labelKeys;
        return this;
    }
    public java.util.List<String> getLabelKeys() {
        return this.labelKeys;
    }

}
