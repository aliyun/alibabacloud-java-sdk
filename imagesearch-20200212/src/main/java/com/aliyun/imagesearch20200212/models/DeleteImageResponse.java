// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20200212.models;

import com.aliyun.tea.*;

public class DeleteImageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    public static DeleteImageResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageResponse self = new DeleteImageResponse();
        return TeaModel.build(map, self);
    }

}
