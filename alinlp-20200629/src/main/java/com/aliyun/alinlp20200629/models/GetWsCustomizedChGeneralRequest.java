// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetWsCustomizedChGeneralRequest extends TeaModel {
    @NameInMap("Uuid")
    @Validation(required = true)
    public String uuid;

    @NameInMap("TokenizerId")
    public String tokenizerId;

    @NameInMap("Text")
    @Validation(required = true)
    public String text;

    @NameInMap("OutType")
    public String outType;

    @NameInMap("ServiceCode")
    @Validation(required = true)
    public String serviceCode;

    public static GetWsCustomizedChGeneralRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWsCustomizedChGeneralRequest self = new GetWsCustomizedChGeneralRequest();
        return TeaModel.build(map, self);
    }

}
