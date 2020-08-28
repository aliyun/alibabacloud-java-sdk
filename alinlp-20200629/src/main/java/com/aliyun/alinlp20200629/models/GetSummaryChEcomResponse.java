// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetSummaryChEcomResponse extends TeaModel {
    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static GetSummaryChEcomResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSummaryChEcomResponse self = new GetSummaryChEcomResponse();
        return TeaModel.build(map, self);
    }

}
