// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class FtFlowSpecialResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    public static FtFlowSpecialResponse build(java.util.Map<String, ?> map) throws Exception {
        FtFlowSpecialResponse self = new FtFlowSpecialResponse();
        return TeaModel.build(map, self);
    }

}
