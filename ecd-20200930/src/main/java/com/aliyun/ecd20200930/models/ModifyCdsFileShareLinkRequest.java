// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyCdsFileShareLinkRequest extends TeaModel {
    /**
     * <p>The ID of the cloud disk.</p>
     */
    @NameInMap("CdsId")
    public String cdsId;

    /**
     * <p>The description of the file sharing task. The description must be 0 to 1,024 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to prohibit the download of the files that are being shared.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   false</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   true</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("DisableDownload")
    public Boolean disableDownload;

    /**
     * <p>Specifies whether to prohibit the preview of the files that are being shared.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   false</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("DisablePreview")
    public Boolean disablePreview;

    /**
     * <p>Specifies whether to prohibit the dump of the files that are being shared.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   false</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   true</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("DisableSave")
    public Boolean disableSave;

    /**
     * <p>The number of times that the shared files are downloaded. The value of this parameter must be equal to or greater than 0.</p>
     */
    @NameInMap("DownloadCount")
    public Long downloadCount;

    /**
     * <p>The limit on the number of times that the shared files can be downloaded. The value of this parameter must be equal to or greater than 0. The value 0 specifies that no limit is imposed on the number of times that the shared files can be downloaded.</p>
     */
    @NameInMap("DownloadLimit")
    public Long downloadLimit;

    /**
     * <p>The time when the file sharing link expires. The value of this parameter follows the RFC 3339 standard. Example: "2020-06-28T11:33:00.000+08:00". If this parameter is set to "", the file sharing link never expires.</p>
     */
    @NameInMap("Expiration")
    public String expiration;

    /**
     * <p>The number of times that the shared files are previewed. The value of this parameter must be equal to or greater than 0.</p>
     */
    @NameInMap("PreviewCount")
    public Long previewCount;

    /**
     * <p>The limit on the number of times that the shared files can be previewed. The value of this parameter must be equal to or greater than 0. The value 0 specifies that no limit is imposed on the number of times that the shared files can be downloaded.</p>
     */
    @NameInMap("PreviewLimit")
    public Long previewLimit;

    /**
     * <p>The number of times that the shared files are reported. The value of this parameter must be equal to or greater than 0.</p>
     */
    @NameInMap("ReportCount")
    public Long reportCount;

    /**
     * <p>The number of times that the shared files are dumped. The value of this parameter must be equal to or greater than 0.</p>
     */
    @NameInMap("SaveCount")
    public Long saveCount;

    /**
     * <p>The limit on the number of times that the shared files can be dumped. The value of this parameter must be equal to or greater than 0. The value 0 specifies that no limit is imposed on the number of times that the shared files can be downloaded.</p>
     */
    @NameInMap("SaveLimit")
    public Long saveLimit;

    /**
     * <p>The ID of the file sharing task.</p>
     */
    @NameInMap("ShareId")
    public String shareId;

    /**
     * <p>The name of the file sharing task. If you do not configure this parameter, the sharing task name is the first ID that is returned in the file_id_list value.</p>
     * <br>
     * <p>>  The sharing task name must be 0 to 128 characters in length.</p>
     */
    @NameInMap("ShareName")
    public String shareName;

    /**
     * <p>The length of the access code. Valid values: 6 to 8. Unit: bytes. If you leave this parameter empty or set it to null, no access code is required. If you use a token to share files, you do not need to configure this parameter. The access code can contain only visible ASCII characters.</p>
     */
    @NameInMap("SharePwd")
    public String sharePwd;

    /**
     * <p>The sharing status.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   disabled: The sharing task is canceled.</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   enabled: The sharing task is valid.</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The number of times that the videos are previewed in the shared files. The value of this parameter must be equal to or greater than 0.</p>
     */
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
