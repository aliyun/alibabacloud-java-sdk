// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class ModelTypeDetermineShrinkRequest extends TeaModel {
    @NameInMap("history")
    public String historyShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("inputText")
    public String inputText;

    public static ModelTypeDetermineShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelTypeDetermineShrinkRequest self = new ModelTypeDetermineShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModelTypeDetermineShrinkRequest setHistoryShrink(String historyShrink) {
        this.historyShrink = historyShrink;
        return this;
    }
    public String getHistoryShrink() {
        return this.historyShrink;
    }

    public ModelTypeDetermineShrinkRequest setInputText(String inputText) {
        this.inputText = inputText;
        return this;
    }
    public String getInputText() {
        return this.inputText;
    }

}
