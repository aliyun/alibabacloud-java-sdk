// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class RegisterMediaStreamRequest extends TeaModel {
    /**
     * <p>The URL of the media asset in another service. The URL is associated with the ID of the media asset in IMS. The URL cannot be modified once registered.</p>
     * <p>Set this parameter to the OSS URL of the media asset. The following formats are supported:</p>
     * <p>http(s)://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4</p>
     * <p>oss://example-bucket/example.mp4: In this format, it is considered by default that the region of the OSS bucket in which the media asset resides is the same as the region in which IMS is activated.</p>
     */
    @NameInMap("InputURL")
    public String inputURL;

    /**
     * <p>The ID of the media asset.</p>
     * 
     * <strong>example:</strong>
     * <p>5e778ec0027b71ed80a8909598506***</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The user data.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;MessageCallback&quot;:{&quot;CallbackURL&quot;:&quot;<a href="http://test.test.com%22%7D">http://test.test.com&quot;}</a>, &quot;Extend&quot;:{&quot;localId&quot;:&quot;xxx&quot;,&quot;test&quot;:&quot;www&quot;}}</p>
     */
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
