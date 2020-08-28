// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetTsChEcomRequest extends TeaModel {
    @NameInMap("ServiceCode")
    @Validation(required = true)
    public String serviceCode;

    @NameInMap("OriginQ")
    @Validation(required = true)
    public String originQ;

    @NameInMap("OriginT")
    @Validation(required = true)
    public String originT;

    @NameInMap("Type")
    @Validation(required = true)
    public String type;

    public static GetTsChEcomRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTsChEcomRequest self = new GetTsChEcomRequest();
        return TeaModel.build(map, self);
    }

}
