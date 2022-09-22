// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListMediaMarksRequest extends TeaModel {
    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("MediaMarkIds")
    public String mediaMarkIds;

    public static ListMediaMarksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMediaMarksRequest self = new ListMediaMarksRequest();
        return TeaModel.build(map, self);
    }

    public ListMediaMarksRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public ListMediaMarksRequest setMediaMarkIds(String mediaMarkIds) {
        this.mediaMarkIds = mediaMarkIds;
        return this;
    }
    public String getMediaMarkIds() {
        return this.mediaMarkIds;
    }

}
