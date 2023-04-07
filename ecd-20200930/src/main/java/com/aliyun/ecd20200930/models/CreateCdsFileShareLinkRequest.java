// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateCdsFileShareLinkRequest extends TeaModel {
    @NameInMap("CdsId")
    public String cdsId;

    @NameInMap("Description")
    public String description;

    @NameInMap("DisableDownload")
    public Boolean disableDownload;

    @NameInMap("DisablePreview")
    public Boolean disablePreview;

    @NameInMap("DisableSave")
    public Boolean disableSave;

    @NameInMap("DownloadLimit")
    public Long downloadLimit;

    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("Expiration")
    public String expiration;

    @NameInMap("FileIds")
    public java.util.List<String> fileIds;

    @NameInMap("PreviewLimit")
    public Long previewLimit;

    @NameInMap("SaveLimit")
    public Long saveLimit;

    @NameInMap("ShareName")
    public String shareName;

    @NameInMap("SharePwd")
    public String sharePwd;

    public static CreateCdsFileShareLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCdsFileShareLinkRequest self = new CreateCdsFileShareLinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateCdsFileShareLinkRequest setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public CreateCdsFileShareLinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCdsFileShareLinkRequest setDisableDownload(Boolean disableDownload) {
        this.disableDownload = disableDownload;
        return this;
    }
    public Boolean getDisableDownload() {
        return this.disableDownload;
    }

    public CreateCdsFileShareLinkRequest setDisablePreview(Boolean disablePreview) {
        this.disablePreview = disablePreview;
        return this;
    }
    public Boolean getDisablePreview() {
        return this.disablePreview;
    }

    public CreateCdsFileShareLinkRequest setDisableSave(Boolean disableSave) {
        this.disableSave = disableSave;
        return this;
    }
    public Boolean getDisableSave() {
        return this.disableSave;
    }

    public CreateCdsFileShareLinkRequest setDownloadLimit(Long downloadLimit) {
        this.downloadLimit = downloadLimit;
        return this;
    }
    public Long getDownloadLimit() {
        return this.downloadLimit;
    }

    public CreateCdsFileShareLinkRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public CreateCdsFileShareLinkRequest setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public CreateCdsFileShareLinkRequest setFileIds(java.util.List<String> fileIds) {
        this.fileIds = fileIds;
        return this;
    }
    public java.util.List<String> getFileIds() {
        return this.fileIds;
    }

    public CreateCdsFileShareLinkRequest setPreviewLimit(Long previewLimit) {
        this.previewLimit = previewLimit;
        return this;
    }
    public Long getPreviewLimit() {
        return this.previewLimit;
    }

    public CreateCdsFileShareLinkRequest setSaveLimit(Long saveLimit) {
        this.saveLimit = saveLimit;
        return this;
    }
    public Long getSaveLimit() {
        return this.saveLimit;
    }

    public CreateCdsFileShareLinkRequest setShareName(String shareName) {
        this.shareName = shareName;
        return this;
    }
    public String getShareName() {
        return this.shareName;
    }

    public CreateCdsFileShareLinkRequest setSharePwd(String sharePwd) {
        this.sharePwd = sharePwd;
        return this;
    }
    public String getSharePwd() {
        return this.sharePwd;
    }

}
