// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetPlayInfoRequest extends TeaModel {
    /**
     * <p>The validity period of the playback URL, in seconds. The value defaults to 3600, which is also the minimum.</p>
     */
    @NameInMap("AuthTimeout")
    public Long authTimeout;

    /**
     * <p>The InputURL used to register the media asset. For more information, see <a href="https://help.aliyun.com/document_detail/441152.html">RegisterMediaInfo</a>.</p>
     * <blockquote>
     * <p>Specify at least one of MediaId and InputURL.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4">http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4</a>  or  vod://<strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("InputURL")
    public String inputURL;

    /**
     * <p>The media asset ID.</p>
     * <blockquote>
     * <p>Specify at least one of MediaId and InputURL.</p>
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

    public GetPlayInfoRequest setAuthTimeout(Long authTimeout) {
        this.authTimeout = authTimeout;
        return this;
    }
    public Long getAuthTimeout() {
        return this.authTimeout;
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
