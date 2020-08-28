// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateMetaCategoryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

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

    @NameInMap("Data")
    @Validation(required = true)
    public CreateMetaCategoryResponseData data;

    public static CreateMetaCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMetaCategoryResponse self = new CreateMetaCategoryResponse();
        return TeaModel.build(map, self);
    }

    public static class CreateMetaCategoryResponseData extends TeaModel {
        @NameInMap("CategoryId")
        @Validation(required = true)
        public Long categoryId;

        public static CreateMetaCategoryResponseData build(java.util.Map<String, ?> map) throws Exception {
            CreateMetaCategoryResponseData self = new CreateMetaCategoryResponseData();
            return TeaModel.build(map, self);
        }

    }

}
