// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetTsChEcomResponse extends TeaModel {
    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static GetTsChEcomResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTsChEcomResponse self = new GetTsChEcomResponse();
        return TeaModel.build(map, self);
    }

}
