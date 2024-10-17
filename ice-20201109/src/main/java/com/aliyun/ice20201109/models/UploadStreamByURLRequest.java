// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UploadStreamByURLRequest extends TeaModel {
    /**
     * <p>The quality of the media stream. Valid values:</p>
     * <ul>
     * <li>FD: low definition.</li>
     * <li>LD: standard definition.</li>
     * <li>SD: high definition.</li>
     * <li>HD: ultra-high definition.</li>
     * <li>OD: original quality.</li>
     * <li>2K: 2K resolution.</li>
     * <li>4K: 4K resolution.</li>
     * <li>SQ: standard sound quality.</li>
     * <li>HQ: high sound quality.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HD</p>
     */
    @NameInMap("Definition")
    public String definition;

    /**
     * <p>The file name extension of the media stream.</p>
     * 
     * <strong>example:</strong>
     * <p>mp4</p>
     */
    @NameInMap("FileExtension")
    public String fileExtension;

    /**
     * <p>The high dynamic range (HDR) format of the transcoded stream. Valid values:</p>
     * <ul>
     * <li>HDR</li>
     * <li>HDR10</li>
     * <li>HLG</li>
     * <li>DolbyVision</li>
     * <li>HDRVivid</li>
     * <li>SDR+</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The value is not case-sensitive,</p>
     * </li>
     * <li><p>You can leave this parameter empty for non-HDR streams.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HDR10</p>
     */
    @NameInMap("HDRType")
    public String HDRType;

    /**
     * <p>The ID of the media asset.</p>
     * 
     * <strong>example:</strong>
     * <p>411bed50018971edb60b0764a0ec6***</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The URL of the transcoded stream file.</p>
     * <p>If the URL of the transcoded stream requires authentication, you must specify the authentication parameters in the stream URL and make sure that the URL can be accessed over the Internet.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/sample-stream.mp4">https://example.com/sample-stream.mp4</a></p>
     */
    @NameInMap("StreamURL")
    public String streamURL;

    /**
     * <p>The user data.</p>
     * 
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
