// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ExtendImageStyleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ExtendImageStyleResponseData data;

    public static ExtendImageStyleResponse build(java.util.Map<String, ?> map) throws Exception {
        ExtendImageStyleResponse self = new ExtendImageStyleResponse();
        return TeaModel.build(map, self);
    }

    public static class ExtendImageStyleResponseData extends TeaModel {
        @NameInMap("Url")
        @Validation(required = true)
        public String url;

        @NameInMap("MajorUrl")
        @Validation(required = true)
        public String majorUrl;

        public static ExtendImageStyleResponseData build(java.util.Map<String, ?> map) throws Exception {
            ExtendImageStyleResponseData self = new ExtendImageStyleResponseData();
            return TeaModel.build(map, self);
        }

    }

}
