// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetNerCustomizedChEcomRequest extends TeaModel {
    @NameInMap("ServiceCode")
    @Validation(required = true)
    public String serviceCode;

    @NameInMap("Text")
    @Validation(required = true)
    public String text;

    @NameInMap("Uuid")
    @Validation(required = true)
    public String uuid;

    @NameInMap("LexerId")
    public String lexerId;

    public static GetNerCustomizedChEcomRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNerCustomizedChEcomRequest self = new GetNerCustomizedChEcomRequest();
        return TeaModel.build(map, self);
    }

}
