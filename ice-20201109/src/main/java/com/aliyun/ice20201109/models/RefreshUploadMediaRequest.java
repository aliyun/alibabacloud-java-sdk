// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class RefreshUploadMediaRequest extends TeaModel {
    @NameInMap("MediaId")
    public String mediaId;

    public static RefreshUploadMediaRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshUploadMediaRequest self = new RefreshUploadMediaRequest();
        return TeaModel.build(map, self);
    }

    public RefreshUploadMediaRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

}
