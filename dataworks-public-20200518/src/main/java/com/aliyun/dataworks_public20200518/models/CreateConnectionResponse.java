// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateConnectionResponse extends TeaModel {
    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public String httpStatusCode;

    @NameInMap("Data")
    @Validation(required = true)
    public Long data;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CreateConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateConnectionResponse self = new CreateConnectionResponse();
        return TeaModel.build(map, self);
    }

}
