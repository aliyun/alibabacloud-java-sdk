// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GenerateVideoPlaylistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SignedURL")
    public String signedURL;

    @NameInMap("Token")
    public String token;

    @NameInMap("URI")
    public String URI;

    public static GenerateVideoPlaylistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateVideoPlaylistResponseBody self = new GenerateVideoPlaylistResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateVideoPlaylistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateVideoPlaylistResponseBody setSignedURL(String signedURL) {
        this.signedURL = signedURL;
        return this;
    }
    public String getSignedURL() {
        return this.signedURL;
    }

    public GenerateVideoPlaylistResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public GenerateVideoPlaylistResponseBody setURI(String URI) {
        this.URI = URI;
        return this;
    }
    public String getURI() {
        return this.URI;
    }

}
