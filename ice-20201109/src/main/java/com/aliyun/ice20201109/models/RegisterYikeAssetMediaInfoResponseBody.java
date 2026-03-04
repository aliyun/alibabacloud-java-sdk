// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class RegisterYikeAssetMediaInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><strong><strong>c469e944b5a856828dc2</strong></strong></p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RegisterYikeAssetMediaInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterYikeAssetMediaInfoResponseBody self = new RegisterYikeAssetMediaInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterYikeAssetMediaInfoResponseBody setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public RegisterYikeAssetMediaInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
