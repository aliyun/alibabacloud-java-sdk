// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AddMediaMarksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>53afdf003a******6a16b5feac6402</p>
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
     * <p>771A1414-27BF-53E6-AB73-EFCB*****ACF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddMediaMarksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMediaMarksResponseBody self = new AddMediaMarksResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMediaMarksResponseBody setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public AddMediaMarksResponseBody setMediaMarkIds(String mediaMarkIds) {
        this.mediaMarkIds = mediaMarkIds;
        return this;
    }
    public String getMediaMarkIds() {
        return this.mediaMarkIds;
    }

    public AddMediaMarksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
