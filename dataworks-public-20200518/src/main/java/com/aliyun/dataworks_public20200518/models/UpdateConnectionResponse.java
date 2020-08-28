// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateConnectionResponse extends TeaModel {
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

    public static UpdateConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateConnectionResponse self = new UpdateConnectionResponse();
        return TeaModel.build(map, self);
    }

}
