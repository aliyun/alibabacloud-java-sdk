// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class FtDynamicAddressDubboResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("StringValue")
    @Validation(required = true)
    public String stringValue;

    @NameInMap("IntValue")
    @Validation(required = true)
    public Integer intValue;

    public static FtDynamicAddressDubboResponse build(java.util.Map<String, ?> map) throws Exception {
        FtDynamicAddressDubboResponse self = new FtDynamicAddressDubboResponse();
        return TeaModel.build(map, self);
    }

}
