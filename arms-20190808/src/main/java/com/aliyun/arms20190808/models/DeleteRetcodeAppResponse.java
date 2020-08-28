// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteRetcodeAppResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    public static DeleteRetcodeAppResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRetcodeAppResponse self = new DeleteRetcodeAppResponse();
        return TeaModel.build(map, self);
    }

}
