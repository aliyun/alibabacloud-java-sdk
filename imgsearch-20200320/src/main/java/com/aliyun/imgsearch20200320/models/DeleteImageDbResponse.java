// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imgsearch20200320.models;

import com.aliyun.tea.*;

public class DeleteImageDbResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteImageDbResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageDbResponse self = new DeleteImageDbResponse();
        return TeaModel.build(map, self);
    }

}
