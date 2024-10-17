// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateMediaMarksResponseBody extends TeaModel {
    /**
     * <p>The ID of the media asset.</p>
     * 
     * <strong>example:</strong>
     * <p>53afdf003a******6a16b5feac6402</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The IDs of the successfully modified marks.</p>
     * 
     * <strong>example:</strong>
     * <p>mark-f82d<em><strong><strong>4994b0915948ef7e16,mark-3d56d</strong></strong></em>4c8fa9ae2a1f9e5d2d60</p>
     */
    @NameInMap("MediaMarkIds")
    public String mediaMarkIds;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateMediaMarksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaMarksResponseBody self = new UpdateMediaMarksResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMediaMarksResponseBody setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public UpdateMediaMarksResponseBody setMediaMarkIds(String mediaMarkIds) {
        this.mediaMarkIds = mediaMarkIds;
        return this;
    }
    public String getMediaMarkIds() {
        return this.mediaMarkIds;
    }

    public UpdateMediaMarksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
