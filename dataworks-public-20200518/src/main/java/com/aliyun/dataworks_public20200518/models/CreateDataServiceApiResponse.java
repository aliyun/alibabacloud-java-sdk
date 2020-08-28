// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDataServiceApiResponse extends TeaModel {
    @NameInMap("Data")
    @Validation(required = true)
    public Long data;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CreateDataServiceApiResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataServiceApiResponse self = new CreateDataServiceApiResponse();
        return TeaModel.build(map, self);
    }

}
