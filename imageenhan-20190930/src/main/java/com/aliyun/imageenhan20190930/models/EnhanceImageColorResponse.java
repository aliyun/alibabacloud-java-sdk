// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class EnhanceImageColorResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public EnhanceImageColorResponseData data;

    public static EnhanceImageColorResponse build(java.util.Map<String, ?> map) throws Exception {
        EnhanceImageColorResponse self = new EnhanceImageColorResponse();
        return TeaModel.build(map, self);
    }

    public static class EnhanceImageColorResponseData extends TeaModel {
        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        public static EnhanceImageColorResponseData build(java.util.Map<String, ?> map) throws Exception {
            EnhanceImageColorResponseData self = new EnhanceImageColorResponseData();
            return TeaModel.build(map, self);
        }

    }

}
