// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetPosChEcomRequest extends TeaModel {
    @NameInMap("ServiceCode")
    @Validation(required = true)
    public String serviceCode;

    @NameInMap("Text")
    @Validation(required = true)
    public String text;

    @NameInMap("Uuid")
    @Validation(required = true)
    public String uuid;

    @NameInMap("TokenizerId")
    public String tokenizerId;

    @NameInMap("OutType")
    public String outType;

    public static GetPosChEcomRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPosChEcomRequest self = new GetPosChEcomRequest();
        return TeaModel.build(map, self);
    }

}
