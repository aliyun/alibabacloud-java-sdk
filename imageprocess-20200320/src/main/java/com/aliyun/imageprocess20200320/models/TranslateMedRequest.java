// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class TranslateMedRequest extends TeaModel {
    @NameInMap("FromLanguage")
    @Validation(required = true)
    public String fromLanguage;

    @NameInMap("ToLanguage")
    @Validation(required = true)
    public String toLanguage;

    @NameInMap("Text")
    @Validation(required = true)
    public String text;

    public static TranslateMedRequest build(java.util.Map<String, ?> map) throws Exception {
        TranslateMedRequest self = new TranslateMedRequest();
        return TeaModel.build(map, self);
    }

}
