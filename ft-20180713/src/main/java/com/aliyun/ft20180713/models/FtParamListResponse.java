// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class FtParamListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    public static FtParamListResponse build(java.util.Map<String, ?> map) throws Exception {
        FtParamListResponse self = new FtParamListResponse();
        return TeaModel.build(map, self);
    }

}
