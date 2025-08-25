// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class RemoveImageSubtitlesResponseBody extends TeaModel {
    @NameInMap("Data")
    public RemoveImageSubtitlesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>939B2103-EE28-4F2D-9773-9A37AD00E5B7</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p><a href="http://algo-app-aic-vd-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/image-desubtitle/2020-03-23-08/02%3A50-e8af2ea3-bddc-4ec8-b21c-493ee687465e.jpg?Expires=1584952370&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=qVnfWZJ2QtI9NRWQ410FsEFioq">http://algo-app-aic-vd-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/image-desubtitle/2020-03-23-08/02%3A50-e8af2ea3-bddc-4ec8-b21c-493ee687465e.jpg?Expires=1584952370&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=qVnfWZJ2QtI9NRWQ410FsEFioq</a>****</p>
         */
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
