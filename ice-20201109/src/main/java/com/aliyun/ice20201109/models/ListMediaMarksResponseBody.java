// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListMediaMarksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>b48fb04483915d4f2cd8</strong></strong></strong></p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("MediaMarks")
    public String mediaMarks;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
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
