// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateQualityFollowerResponse extends TeaModel {
    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("Data")
    @Validation(required = true)
    public Boolean data;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateQualityFollowerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateQualityFollowerResponse self = new UpdateQualityFollowerResponse();
        return TeaModel.build(map, self);
    }

}
