// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetDpChEcomResponse extends TeaModel {
    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static GetDpChEcomResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDpChEcomResponse self = new GetDpChEcomResponse();
        return TeaModel.build(map, self);
    }

}
