// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class RemoveImageSubtitlesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RemoveImageSubtitlesResponseData data;

    public static RemoveImageSubtitlesResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveImageSubtitlesResponse self = new RemoveImageSubtitlesResponse();
        return TeaModel.build(map, self);
    }

    public static class RemoveImageSubtitlesResponseData extends TeaModel {
        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        public static RemoveImageSubtitlesResponseData build(java.util.Map<String, ?> map) throws Exception {
            RemoveImageSubtitlesResponseData self = new RemoveImageSubtitlesResponseData();
            return TeaModel.build(map, self);
        }

    }

}
