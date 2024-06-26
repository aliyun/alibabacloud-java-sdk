// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateUploadStreamRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>HD</p>
     */
    @NameInMap("Definition")
    public String definition;

    /**
     * <strong>example:</strong>
     * <p>MP4</p>
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
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
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
