// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteGatewayLabelShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LabelKeys")
    public String labelKeysShrink;

    public static DeleteGatewayLabelShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayLabelShrinkRequest self = new DeleteGatewayLabelShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayLabelShrinkRequest setLabelKeysShrink(String labelKeysShrink) {
        this.labelKeysShrink = labelKeysShrink;
        return this;
    }
    public String getLabelKeysShrink() {
        return this.labelKeysShrink;
    }

}
