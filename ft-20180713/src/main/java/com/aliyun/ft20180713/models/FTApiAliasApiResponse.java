// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class FTApiAliasApiResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    public static FTApiAliasApiResponse build(java.util.Map<String, ?> map) throws Exception {
        FTApiAliasApiResponse self = new FTApiAliasApiResponse();
        return TeaModel.build(map, self);
    }

}
