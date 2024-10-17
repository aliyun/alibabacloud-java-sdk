// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetPlayInfoRequest extends TeaModel {
    /**
     * <p>The input URL that you specified for the media asset when you registered the media asset. For more information, see <a href="https://help.aliyun.com/document_detail/441152.html">RegisterMediaInfo</a>.</p>
     * <blockquote>
     * <p> You must specify at least one of the MediaId and InputURL parameters.</p>
     * </blockquote>
     */
    @NameInMap("InputURL")
    public String inputURL;

    /**
     * <p>The ID of the media asset.</p>
     * <blockquote>
     * <p> You must specify at least one of the MediaId and InputURL parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>86434e152b7d4f20be480574439fe***</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    public static GetPlayInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPlayInfoRequest self = new GetPlayInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetPlayInfoRequest setInputURL(String inputURL) {
        this.inputURL = inputURL;
        return this;
    }
    public String getInputURL() {
        return this.inputURL;
    }

    public GetPlayInfoRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

}
