// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class RemoveImageSubtitlesResponseBody extends TeaModel {
    @NameInMap("Data")
    public RemoveImageSubtitlesResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static RemoveImageSubtitlesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveImageSubtitlesResponseBody self = new RemoveImageSubtitlesResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveImageSubtitlesResponseBody setData(RemoveImageSubtitlesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RemoveImageSubtitlesResponseBodyData getData() {
        return this.data;
    }

    public RemoveImageSubtitlesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RemoveImageSubtitlesResponseBodyData extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

        public static RemoveImageSubtitlesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RemoveImageSubtitlesResponseBodyData self = new RemoveImageSubtitlesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RemoveImageSubtitlesResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
