// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRetcodeShareUrlResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Url")
    @Validation(required = true)
    public String url;

    public static GetRetcodeShareUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRetcodeShareUrlResponse self = new GetRetcodeShareUrlResponse();
        return TeaModel.build(map, self);
    }

}
