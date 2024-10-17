// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaMarksRequest extends TeaModel {
    /**
     * <p>The ID of the media asset.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The mark ID. You can specify multiple mark IDs separated with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>mark-f82d<em><strong><strong>4994b0915948ef7e16,mark-3d56d</strong></strong></em>4c8fa9ae2a1f9e5d2d60</p>
     */
    @NameInMap("MediaMarkIds")
    public String mediaMarkIds;

    public static GetMediaMarksRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMediaMarksRequest self = new GetMediaMarksRequest();
        return TeaModel.build(map, self);
    }

    public GetMediaMarksRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public GetMediaMarksRequest setMediaMarkIds(String mediaMarkIds) {
        this.mediaMarkIds = mediaMarkIds;
        return this;
    }
    public String getMediaMarkIds() {
        return this.mediaMarkIds;
    }

}
