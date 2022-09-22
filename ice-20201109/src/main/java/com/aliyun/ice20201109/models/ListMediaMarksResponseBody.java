// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListMediaMarksResponseBody extends TeaModel {
    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("MediaMarks")
    public String mediaMarks;

    @NameInMap("RequestId")
    public String requestId;

    public static ListMediaMarksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMediaMarksResponseBody self = new ListMediaMarksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMediaMarksResponseBody setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public ListMediaMarksResponseBody setMediaMarks(String mediaMarks) {
        this.mediaMarks = mediaMarks;
        return this;
    }
    public String getMediaMarks() {
        return this.mediaMarks;
    }

    public ListMediaMarksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
