// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaMarksResponseBody extends TeaModel {
    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("MediaMarks")
    public String mediaMarks;

    @NameInMap("RequestId")
    public String requestId;

    public static GetMediaMarksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMediaMarksResponseBody self = new GetMediaMarksResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMediaMarksResponseBody setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public GetMediaMarksResponseBody setMediaMarks(String mediaMarks) {
        this.mediaMarks = mediaMarks;
        return this;
    }
    public String getMediaMarks() {
        return this.mediaMarks;
    }

    public GetMediaMarksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
