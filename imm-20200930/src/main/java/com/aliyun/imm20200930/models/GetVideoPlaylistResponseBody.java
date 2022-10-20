// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetVideoPlaylistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SignedURL")
    public String signedURL;

    @NameInMap("Token")
    public String token;

    @NameInMap("URI")
    public String URI;

    public static GetVideoPlaylistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoPlaylistResponseBody self = new GetVideoPlaylistResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoPlaylistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVideoPlaylistResponseBody setSignedURL(String signedURL) {
        this.signedURL = signedURL;
        return this;
    }
    public String getSignedURL() {
        return this.signedURL;
    }

    public GetVideoPlaylistResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public GetVideoPlaylistResponseBody setURI(String URI) {
        this.URI = URI;
        return this;
    }
    public String getURI() {
        return this.URI;
    }

}
