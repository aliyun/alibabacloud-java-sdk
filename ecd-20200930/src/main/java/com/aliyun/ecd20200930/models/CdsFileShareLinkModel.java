// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CdsFileShareLinkModel extends TeaModel {
    @NameInMap("AccessCount")
    public Long accessCount;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Creator")
    public String creator;

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

    @NameInMap("DriveId")
    public String driveId;

    @NameInMap("Expiration")
    public String expiration;

    @NameInMap("Expired")
    public Boolean expired;

    @NameInMap("FileIds")
    public String fileIds;

    @NameInMap("ModifiyTime")
    public String modifiyTime;

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

    @NameInMap("ShareLink")
    public String shareLink;

    @NameInMap("ShareName")
    public String shareName;

    @NameInMap("SharePwd")
    public String sharePwd;

    @NameInMap("Status")
    public String status;

    @NameInMap("VideoPreviewCount")
    public Long videoPreviewCount;

    public static CdsFileShareLinkModel build(java.util.Map<String, ?> map) throws Exception {
        CdsFileShareLinkModel self = new CdsFileShareLinkModel();
        return TeaModel.build(map, self);
    }

    public CdsFileShareLinkModel setAccessCount(Long accessCount) {
        this.accessCount = accessCount;
        return this;
    }
    public Long getAccessCount() {
        return this.accessCount;
    }

    public CdsFileShareLinkModel setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public CdsFileShareLinkModel setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public CdsFileShareLinkModel setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CdsFileShareLinkModel setDisableDownload(Boolean disableDownload) {
        this.disableDownload = disableDownload;
        return this;
    }
    public Boolean getDisableDownload() {
        return this.disableDownload;
    }

    public CdsFileShareLinkModel setDisablePreview(Boolean disablePreview) {
        this.disablePreview = disablePreview;
        return this;
    }
    public Boolean getDisablePreview() {
        return this.disablePreview;
    }

    public CdsFileShareLinkModel setDisableSave(Boolean disableSave) {
        this.disableSave = disableSave;
        return this;
    }
    public Boolean getDisableSave() {
        return this.disableSave;
    }

    public CdsFileShareLinkModel setDownloadCount(Long downloadCount) {
        this.downloadCount = downloadCount;
        return this;
    }
    public Long getDownloadCount() {
        return this.downloadCount;
    }

    public CdsFileShareLinkModel setDownloadLimit(Long downloadLimit) {
        this.downloadLimit = downloadLimit;
        return this;
    }
    public Long getDownloadLimit() {
        return this.downloadLimit;
    }

    public CdsFileShareLinkModel setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public CdsFileShareLinkModel setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public CdsFileShareLinkModel setExpired(Boolean expired) {
        this.expired = expired;
        return this;
    }
    public Boolean getExpired() {
        return this.expired;
    }

    public CdsFileShareLinkModel setFileIds(String fileIds) {
        this.fileIds = fileIds;
        return this;
    }
    public String getFileIds() {
        return this.fileIds;
    }

    public CdsFileShareLinkModel setModifiyTime(String modifiyTime) {
        this.modifiyTime = modifiyTime;
        return this;
    }
    public String getModifiyTime() {
        return this.modifiyTime;
    }

    public CdsFileShareLinkModel setPreviewCount(Long previewCount) {
        this.previewCount = previewCount;
        return this;
    }
    public Long getPreviewCount() {
        return this.previewCount;
    }

    public CdsFileShareLinkModel setPreviewLimit(Long previewLimit) {
        this.previewLimit = previewLimit;
        return this;
    }
    public Long getPreviewLimit() {
        return this.previewLimit;
    }

    public CdsFileShareLinkModel setReportCount(Long reportCount) {
        this.reportCount = reportCount;
        return this;
    }
    public Long getReportCount() {
        return this.reportCount;
    }

    public CdsFileShareLinkModel setSaveCount(Long saveCount) {
        this.saveCount = saveCount;
        return this;
    }
    public Long getSaveCount() {
        return this.saveCount;
    }

    public CdsFileShareLinkModel setSaveLimit(Long saveLimit) {
        this.saveLimit = saveLimit;
        return this;
    }
    public Long getSaveLimit() {
        return this.saveLimit;
    }

    public CdsFileShareLinkModel setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }
    public String getShareId() {
        return this.shareId;
    }

    public CdsFileShareLinkModel setShareLink(String shareLink) {
        this.shareLink = shareLink;
        return this;
    }
    public String getShareLink() {
        return this.shareLink;
    }

    public CdsFileShareLinkModel setShareName(String shareName) {
        this.shareName = shareName;
        return this;
    }
    public String getShareName() {
        return this.shareName;
    }

    public CdsFileShareLinkModel setSharePwd(String sharePwd) {
        this.sharePwd = sharePwd;
        return this;
    }
    public String getSharePwd() {
        return this.sharePwd;
    }

    public CdsFileShareLinkModel setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CdsFileShareLinkModel setVideoPreviewCount(Long videoPreviewCount) {
        this.videoPreviewCount = videoPreviewCount;
        return this;
    }
    public Long getVideoPreviewCount() {
        return this.videoPreviewCount;
    }

}
