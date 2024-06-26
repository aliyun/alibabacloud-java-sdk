// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UploadStreamByURLRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>HD</p>
     */
    @NameInMap("Definition")
    public String definition;

    /**
     * <strong>example:</strong>
     * <p>mp4</p>
     */
    @NameInMap("FileExtension")
    public String fileExtension;

    /**
     * <strong>example:</strong>
     * <p>HDR10</p>
     */
    @NameInMap("HDRType")
    public String HDRType;

    /**
     * <strong>example:</strong>
     * <p>411bed50018971edb60b0764a0ec6***</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <strong>example:</strong>
     * <p><a href="https://example.com/sample-stream.mp4">https://example.com/sample-stream.mp4</a></p>
     */
    @NameInMap("StreamURL")
    public String streamURL;

    /**
     * <strong>example:</strong>
     * <p>{&quot;MessageCallback&quot;:{&quot;CallbackURL&quot;:&quot;<a href="http://test.test.com%22%7D">http://test.test.com&quot;}</a>, &quot;Extend&quot;:{&quot;localId&quot;:&quot;xxx&quot;,&quot;test&quot;:&quot;www&quot;}}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static UploadStreamByURLRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadStreamByURLRequest self = new UploadStreamByURLRequest();
        return TeaModel.build(map, self);
    }

    public UploadStreamByURLRequest setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public UploadStreamByURLRequest setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
        return this;
    }
    public String getFileExtension() {
        return this.fileExtension;
    }

    public UploadStreamByURLRequest setHDRType(String HDRType) {
        this.HDRType = HDRType;
        return this;
    }
    public String getHDRType() {
        return this.HDRType;
    }

    public UploadStreamByURLRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public UploadStreamByURLRequest setStreamURL(String streamURL) {
        this.streamURL = streamURL;
        return this;
    }
    public String getStreamURL() {
        return this.streamURL;
    }

    public UploadStreamByURLRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
