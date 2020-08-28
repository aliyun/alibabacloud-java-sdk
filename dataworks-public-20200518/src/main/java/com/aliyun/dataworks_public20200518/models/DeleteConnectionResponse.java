// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteConnectionResponse extends TeaModel {
    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public String httpStatusCode;

    @NameInMap("Data")
    @Validation(required = true)
    public Boolean data;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteConnectionResponse self = new DeleteConnectionResponse();
        return TeaModel.build(map, self);
    }

}
