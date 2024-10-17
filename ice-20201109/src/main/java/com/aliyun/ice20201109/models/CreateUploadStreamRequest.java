// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateUploadStreamRequest extends TeaModel {
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
     * <p>MP4</p>
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
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The user data.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;MessageCallback&quot;:{&quot;CallbackURL&quot;:&quot;<a href="http://aliyundoc.com%22%7D">http://aliyundoc.com&quot;}</a>, &quot;Extend&quot;:{&quot;localId&quot;:&quot;xxx&quot;,&quot;test&quot;:&quot;www&quot;}}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static CreateUploadStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadStreamRequest self = new CreateUploadStreamRequest();
        return TeaModel.build(map, self);
    }

    public CreateUploadStreamRequest setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public CreateUploadStreamRequest setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
        return this;
    }
    public String getFileExtension() {
        return this.fileExtension;
    }

    public CreateUploadStreamRequest setHDRType(String HDRType) {
        this.HDRType = HDRType;
        return this;
    }
    public String getHDRType() {
        return this.HDRType;
    }

    public CreateUploadStreamRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public CreateUploadStreamRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
