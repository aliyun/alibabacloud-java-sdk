// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetWsCustomizedSeaGeneralRequest extends TeaModel {
    @NameInMap("ServiceCode")
    @Validation(required = true)
    public String serviceCode;

    @NameInMap("Text")
    @Validation(required = true)
    public String text;

    @NameInMap("Language")
    @Validation(required = true)
    public String language;

    public static GetWsCustomizedSeaGeneralRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWsCustomizedSeaGeneralRequest self = new GetWsCustomizedSeaGeneralRequest();
        return TeaModel.build(map, self);
    }

}
