// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateUploadStreamRequest extends TeaModel {
    @NameInMap("Definition")
    public String definition;

    @NameInMap("FileExtension")
    public String fileExtension;

    @NameInMap("HDRType")
    public String HDRType;

    @NameInMap("MediaId")
    public String mediaId;

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
