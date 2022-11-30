// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class SubmitVoiceFileRequest extends TeaModel {
    @NameInMap("CountryId")
    public String countryId;

    @NameInMap("FileKey")
    public String fileKey;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileUrl")
    public String fileUrl;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("QualificationId")
    public String qualificationId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static SubmitVoiceFileRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitVoiceFileRequest self = new SubmitVoiceFileRequest();
        return TeaModel.build(map, self);
    }

    public SubmitVoiceFileRequest setCountryId(String countryId) {
        this.countryId = countryId;
        return this;
    }
    public String getCountryId() {
        return this.countryId;
    }

    public SubmitVoiceFileRequest setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public SubmitVoiceFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public SubmitVoiceFileRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public SubmitVoiceFileRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SubmitVoiceFileRequest setQualificationId(String qualificationId) {
        this.qualificationId = qualificationId;
        return this;
    }
    public String getQualificationId() {
        return this.qualificationId;
    }

    public SubmitVoiceFileRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitVoiceFileRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
