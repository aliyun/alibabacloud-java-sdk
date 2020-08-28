// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class EnableBillGenerationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public EnableBillGenerationResponseData data;

    public static EnableBillGenerationResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableBillGenerationResponse self = new EnableBillGenerationResponse();
        return TeaModel.build(map, self);
    }

    public static class EnableBillGenerationResponseData extends TeaModel {
        @NameInMap("Boolean")
        @Validation(required = true)
        public Boolean _boolean;

        public static EnableBillGenerationResponseData build(java.util.Map<String, ?> map) throws Exception {
            EnableBillGenerationResponseData self = new EnableBillGenerationResponseData();
            return TeaModel.build(map, self);
        }

    }

}
