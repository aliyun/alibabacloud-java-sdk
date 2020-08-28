// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetApDetailStatusResponse extends TeaModel {
    @NameInMap("Data")
    @Validation(required = true)
    public java.util.Map<String, ?> data;

    @NameInMap("IsSuccess")
    @Validation(required = true)
    public Boolean isSuccess;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    public static GetApDetailStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApDetailStatusResponse self = new GetApDetailStatusResponse();
        return TeaModel.build(map, self);
    }

}
