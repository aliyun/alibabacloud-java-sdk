// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CdsFileShareLinkModel extends TeaModel {
    /**
     * <p>The number of times to access the shared file.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("AccessCount")
    public Long accessCount;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-09-04T03:30:36Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The user that creates the file sharing task.</p>
     * 
     * <strong>example:</strong>
     * <p>user01</p>
     */
    @NameInMap("Creator")
    public String creator;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>newDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The shared file is forbidden from being downloaded.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisableDownload")
    public Boolean disableDownload;

    /**
     * <p>The shared file is forbidden from being previewed.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisablePreview")
    public Boolean disablePreview;

    /**
     * <p>The shared file is forbidden from being dumped.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisableSave")
    public Boolean disableSave;

    /**
     * <p>The number of times that the shared file can be downloaded.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("DownloadCount")
    public Long downloadCount;

    /**
     * <p>The maximum number of times that the shared file can be downloaded.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("DownloadLimit")
    public Long downloadLimit;

    /**
     * <p>The team space ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dri-g0877jp3hu1ox****</p>
     */
    @NameInMap("DriveId")
    public String driveId;

    /**
     * <p>The time when the file sharing link expires.</p>
     * <blockquote>
     * <p> The value must be in the FC3339 format. Example: 2020-06-28T11:33:00.000+08:00. If the parameter is left empty, the file sharing link is permanently valid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2020-06-28T11:33:00.000+08:00</p>
     */
    @NameInMap("Expiration")
    public String expiration;

    /**
     * <p>Specifies whether the file sharing link expires.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("Expired")
    public Boolean expired;

    /**
     * <p>The file sharing task IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;63886f1fe2014d9a5a3348768dcc27dfc57ee103\&quot;]</p>
     */
    @NameInMap("FileIds")
    public String fileIds;

    /**
     * <p>The modification time.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-09-04T04:30:36Z</p>
     */
    @NameInMap("ModifiyTime")
    public String modifiyTime;

    /**
     * <p>The number of times that the shared file is previewed.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PreviewCount")
    public Long previewCount;

    /**
     * <p>The maximum number of times that the shared file can be previewed.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PreviewLimit")
    public Long previewLimit;

    /**
     * <p>The number of times that the shared file is reported due to content violation.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ReportCount")
    public Long reportCount;

    /**
     * <p>The number of times that the shared files can be dumped.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("SaveCount")
    public Long saveCount;

    /**
     * <p>The maximum number of times that the shared file can be saved.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("SaveLimit")
    public Long saveLimit;

    /**
     * <p>The file sharing task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7JQX1Fs****</p>
     */
    @NameInMap("ShareId")
    public String shareId;

    /**
     * <p>The file sharing link.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://stg109960.apps.aliyunpds.com/disk/s/7uLJanz">https://stg109960.apps.aliyunpds.com/disk/s/7uLJanz</a>****</p>
     */
    @NameInMap("ShareLink")
    public String shareLink;

    /**
     * <p>The shared file name. By default, the name of the first shared file is used.</p>
     * 
     * <strong>example:</strong>
     * <p>view.txt</p>
     */
    @NameInMap("ShareName")
    public String shareName;

    /**
     * <p>The access code. It must contain up to 64 characters in length. 0 characters indicates that there is no access code.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678</p>
     */
    @NameInMap("SharePwd")
    public String sharePwd;

    /**
     * <p>The status of the file sharing link.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>forbidden_disabled</p>
     * <!-- -->
     * 
     * <p>: The file sharing link is canceled</p>
     * <!-- -->
     * 
     * <p>after it</p>
     * <!-- -->
     * 
     * <p>is not allowed.</p>
     * </li>
     * <li><p>forbidden</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>The file sharing link is not allowed</p>
     * <!-- -->
     * 
     * <p>.</p>
     * </li>
     * <li><p>disabled</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>The file sharing link is canceled.</p>
     * <!-- -->
     * </li>
     * <li><p>enabled</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>The file sharing link is valid.</p>
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>disabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The number of times that the audio and video file is played.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
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
