// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class FtIpFlowControlResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    public static FtIpFlowControlResponse build(java.util.Map<String, ?> map) throws Exception {
        FtIpFlowControlResponse self = new FtIpFlowControlResponse();
        return TeaModel.build(map, self);
    }

}
