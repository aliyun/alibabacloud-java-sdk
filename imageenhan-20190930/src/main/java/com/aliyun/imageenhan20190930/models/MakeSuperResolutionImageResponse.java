// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class MakeSuperResolutionImageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public MakeSuperResolutionImageResponseData data;

    public static MakeSuperResolutionImageResponse build(java.util.Map<String, ?> map) throws Exception {
        MakeSuperResolutionImageResponse self = new MakeSuperResolutionImageResponse();
        return TeaModel.build(map, self);
    }

    public static class MakeSuperResolutionImageResponseData extends TeaModel {
        @NameInMap("Url")
        @Validation(required = true)
        public String url;

        public static MakeSuperResolutionImageResponseData build(java.util.Map<String, ?> map) throws Exception {
            MakeSuperResolutionImageResponseData self = new MakeSuperResolutionImageResponseData();
            return TeaModel.build(map, self);
        }

    }

}
