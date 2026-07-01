// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class RegisterMediaStreamRequest extends TeaModel {
    /**
     * <p>The URL of the media asset in another service. The URL is associated with the ID of the media asset in IMS. The URL cannot be modified once registered.</p>
     * <p>Set this parameter to the OSS URL of the media asset. The following formats are supported:</p>
     * <p>http(s)://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4</p>
     * <p>oss\://example-bucket/example.mp4: In this format, it is considered by default that the region of the OSS bucket in which the media asset resides is the same as the region in which IMS is activated.</p>
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
     * <p>Custom stream tags used to identify transcoding streams.</p>
     * <p>After the media stream is registered, you can invoke <a href="https://help.aliyun.com/zh/ims/developer-reference/api-ice-2020-11-09-getplayinfo?spm=a2c4g.11186623.help-menu-193643.d_5_0_3_1_4.56dc5a11JzNEVj">GetPlayInfo</a> to retrieve this tag value.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key1&quot;: &quot;value1&quot;}</p>
     */
    @NameInMap("StreamTags")
    public String streamTags;

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

    public RegisterMediaStreamRequest setStreamTags(String streamTags) {
        this.streamTags = streamTags;
        return this;
    }
    public String getStreamTags() {
        return this.streamTags;
    }

    public RegisterMediaStreamRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
