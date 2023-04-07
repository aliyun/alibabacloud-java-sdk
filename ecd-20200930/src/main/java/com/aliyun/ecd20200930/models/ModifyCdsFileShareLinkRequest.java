// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyCdsFileShareLinkRequest extends TeaModel {
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

    @NameInMap("DownloadCount")
    public Long downloadCount;

    @NameInMap("DownloadLimit")
    public Long downloadLimit;

    @NameInMap("Expiration")
    public String expiration;

    @NameInMap("PreviewCount")
    public Long previewCount;

    @NameInMap("PreviewLimit")
    public Long previewLimit;

    @NameInMap("ReportCount")
    public Long reportCount;

    @NameInMap("SaveCount")
    public Long saveCount;

    @NameInMap("SaveLimit")
    public Long saveLimit;

    @NameInMap("ShareId")
    public String shareId;

    @NameInMap("ShareName")
    public String shareName;

    @NameInMap("SharePwd")
    public String sharePwd;

    @NameInMap("Status")
    public String status;

    @NameInMap("VideoPreviewCount")
    public Long videoPreviewCount;

    public static ModifyCdsFileShareLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCdsFileShareLinkRequest self = new ModifyCdsFileShareLinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCdsFileShareLinkRequest setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public ModifyCdsFileShareLinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyCdsFileShareLinkRequest setDisableDownload(Boolean disableDownload) {
        this.disableDownload = disableDownload;
        return this;
    }
    public Boolean getDisableDownload() {
        return this.disableDownload;
    }

    public ModifyCdsFileShareLinkRequest setDisablePreview(Boolean disablePreview) {
        this.disablePreview = disablePreview;
        return this;
    }
    public Boolean getDisablePreview() {
        return this.disablePreview;
    }

    public ModifyCdsFileShareLinkRequest setDisableSave(Boolean disableSave) {
        this.disableSave = disableSave;
        return this;
    }
    public Boolean getDisableSave() {
        return this.disableSave;
    }

    public ModifyCdsFileShareLinkRequest setDownloadCount(Long downloadCount) {
        this.downloadCount = downloadCount;
        return this;
    }
    public Long getDownloadCount() {
        return this.downloadCount;
    }

    public ModifyCdsFileShareLinkRequest setDownloadLimit(Long downloadLimit) {
        this.downloadLimit = downloadLimit;
        return this;
    }
    public Long getDownloadLimit() {
        return this.downloadLimit;
    }

    public ModifyCdsFileShareLinkRequest setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public ModifyCdsFileShareLinkRequest setPreviewCount(Long previewCount) {
        this.previewCount = previewCount;
        return this;
    }
    public Long getPreviewCount() {
        return this.previewCount;
    }

    public ModifyCdsFileShareLinkRequest setPreviewLimit(Long previewLimit) {
        this.previewLimit = previewLimit;
        return this;
    }
    public Long getPreviewLimit() {
        return this.previewLimit;
    }

    public ModifyCdsFileShareLinkRequest setReportCount(Long reportCount) {
        this.reportCount = reportCount;
        return this;
    }
    public Long getReportCount() {
        return this.reportCount;
    }

    public ModifyCdsFileShareLinkRequest setSaveCount(Long saveCount) {
        this.saveCount = saveCount;
        return this;
    }
    public Long getSaveCount() {
        return this.saveCount;
    }

    public ModifyCdsFileShareLinkRequest setSaveLimit(Long saveLimit) {
        this.saveLimit = saveLimit;
        return this;
    }
    public Long getSaveLimit() {
        return this.saveLimit;
    }

    public ModifyCdsFileShareLinkRequest setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }
    public String getShareId() {
        return this.shareId;
    }

    public ModifyCdsFileShareLinkRequest setShareName(String shareName) {
        this.shareName = shareName;
        return this;
    }
    public String getShareName() {
        return this.shareName;
    }

    public ModifyCdsFileShareLinkRequest setSharePwd(String sharePwd) {
        this.sharePwd = sharePwd;
        return this;
    }
    public String getSharePwd() {
        return this.sharePwd;
    }

    public ModifyCdsFileShareLinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ModifyCdsFileShareLinkRequest setVideoPreviewCount(Long videoPreviewCount) {
        this.videoPreviewCount = videoPreviewCount;
        return this;
    }
    public Long getVideoPreviewCount() {
        return this.videoPreviewCount;
    }

}
