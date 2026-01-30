// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ValidationOptions extends TeaModel {
    @NameInMap("skipVerifyAIChatCompletion")
    public Boolean skipVerifyAIChatCompletion;

    public static ValidationOptions build(java.util.Map<String, ?> map) throws Exception {
        ValidationOptions self = new ValidationOptions();
        return TeaModel.build(map, self);
    }

    public ValidationOptions setSkipVerifyAIChatCompletion(Boolean skipVerifyAIChatCompletion) {
        this.skipVerifyAIChatCompletion = skipVerifyAIChatCompletion;
        return this;
    }
    public Boolean getSkipVerifyAIChatCompletion() {
        return this.skipVerifyAIChatCompletion;
    }

}
