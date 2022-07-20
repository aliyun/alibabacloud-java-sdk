// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class RegisterMediaStreamRequest extends TeaModel {
    @NameInMap("InputURL")
    public String inputURL;

    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("UserData")
    public String userData;

    public static RegisterMediaStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterMediaStreamRequest self = new RegisterMediaStreamRequest();
        return TeaModel.build(map, self);
    }

    public RegisterMediaStreamRequest setInputURL(String inputURL) {
        this.inputURL = inputURL;
        return this;
    }
    public String getInputURL() {
        return this.inputURL;
    }

    public RegisterMediaStreamRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public RegisterMediaStreamRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
