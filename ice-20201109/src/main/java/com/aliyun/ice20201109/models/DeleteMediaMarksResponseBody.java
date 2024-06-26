// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteMediaMarksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><strong><strong>019b82e24b37a1c2958dec38</strong></strong></p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <strong>example:</strong>
     * <p>mark-f82d<em><strong><strong>4994b0915948ef7e16,mark-3d56d</strong></strong></em>4c8fa9ae2a1f9e5d2d60</p>
     */
    @NameInMap("MediaMarkIds")
    public String mediaMarkIds;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMediaMarksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaMarksResponseBody self = new DeleteMediaMarksResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMediaMarksResponseBody setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public DeleteMediaMarksResponseBody setMediaMarkIds(String mediaMarkIds) {
        this.mediaMarkIds = mediaMarkIds;
        return this;
    }
    public String getMediaMarkIds() {
        return this.mediaMarkIds;
    }

    public DeleteMediaMarksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
