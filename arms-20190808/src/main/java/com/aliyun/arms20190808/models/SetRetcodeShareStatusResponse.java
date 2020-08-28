// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SetRetcodeShareStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("IsSuccess")
    @Validation(required = true)
    public Boolean isSuccess;

    public static SetRetcodeShareStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetRetcodeShareStatusResponse self = new SetRetcodeShareStatusResponse();
        return TeaModel.build(map, self);
    }

}
