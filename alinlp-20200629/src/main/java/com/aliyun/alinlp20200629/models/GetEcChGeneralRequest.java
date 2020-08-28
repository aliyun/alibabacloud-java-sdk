// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetEcChGeneralRequest extends TeaModel {
    @NameInMap("ServiceCode")
    @Validation(required = true)
    public String serviceCode;

    @NameInMap("Text")
    @Validation(required = true)
    public String text;

    public static GetEcChGeneralRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEcChGeneralRequest self = new GetEcChGeneralRequest();
        return TeaModel.build(map, self);
    }

}
