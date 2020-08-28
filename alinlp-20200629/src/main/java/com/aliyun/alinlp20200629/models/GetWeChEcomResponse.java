// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetWeChEcomResponse extends TeaModel {
    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static GetWeChEcomResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWeChEcomResponse self = new GetWeChEcomResponse();
        return TeaModel.build(map, self);
    }

}
