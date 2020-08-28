// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imgsearch20200320.models;

import com.aliyun.tea.*;

public class CreateImageDbResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CreateImageDbResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateImageDbResponse self = new CreateImageDbResponse();
        return TeaModel.build(map, self);
    }

}
