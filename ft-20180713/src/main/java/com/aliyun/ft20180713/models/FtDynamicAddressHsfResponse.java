// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class FtDynamicAddressHsfResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static FtDynamicAddressHsfResponse build(java.util.Map<String, ?> map) throws Exception {
        FtDynamicAddressHsfResponse self = new FtDynamicAddressHsfResponse();
        return TeaModel.build(map, self);
    }

}
