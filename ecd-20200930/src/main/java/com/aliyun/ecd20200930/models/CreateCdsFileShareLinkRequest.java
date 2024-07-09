// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateCdsFileShareLinkRequest extends TeaModel {
    /**
     * <p>The ID of the cloud disk.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai+cds-135515****</p>
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
     * <p>Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>prohibits file download</p>
     * <!-- -->
     * 
     * <p>.</p>
     * </li>
     * <li><p>false</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>allows file download</p>
     * <!-- -->
     * 
     * <p>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisableDownload")
    public Boolean disableDownload;

    /**
     * <p>Specifies whether to prohibit the preview of the files that are being shared.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>prohibits file preview</p>
     * <!-- -->
     * 
     * <p>.</p>
     * </li>
     * <li><p>false</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>allows file preview</p>
     * <!-- -->
     * 
     * <p>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisablePreview")
    public Boolean disablePreview;

    /**
     * <p>Specifies whether to prohibit the dump of the files that are being shared.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>prohibits file dump</p>
     * <!-- -->
     * 
     * <p>.</p>
     * </li>
     * <li><p>false</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>allows file dump</p>
     * <!-- -->
     * 
     * <p>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisableSave")
    public Boolean disableSave;

    /**
     * <p>The limit on the number of times that the shared files can be downloaded. The value of this parameter must be equal to or greater than 0. The value 0 specifies that no limit is imposed on the number of times that the shared files can be downloaded.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("DownloadLimit")
    public Long downloadLimit;

    /**
     * <p>The ID of the end user.</p>
     * 
     * <strong>example:</strong>
     * <p>user01</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The time when the file sharing link expires. The value of this parameter follows the RFC 3339 standard. Example: &quot;2020-06-28T11:33:00.000+08:00&quot;. If this parameter is set to &quot;&quot;, the file sharing link never expires.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-06-28T11:33:00.000+08:00</p>
     */
    @NameInMap("Expiration")
    public String expiration;

    /**
     * <p>The file IDs.</p>
     */
    @NameInMap("FileIds")
    public java.util.List<String> fileIds;

    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The limit on the number of times that the shared files can be previewed. The value of this parameter must be equal to or greater than 0. The value 0 specifies that no limit is imposed on the number of times that the shared files can be previewed.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PreviewLimit")
    public Long previewLimit;

    /**
     * <p>The limit on the number of times that the shared files can be dumped. The value of this parameter must be equal to or greater than 0. The value 0 specifies that no limit is imposed on the number of times that the shared files can be dumped.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("SaveLimit")
    public Long saveLimit;

    /**
     * <p>The name of the file sharing task. If you leave this parameter empty, the file name that corresponds to the first ID in the file ID list is used. The name must be 0 to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>view.txt</p>
     */
    @NameInMap("ShareName")
    public String shareName;

    /**
     * <p>The length of the access code. Valid values: 6 to 8. Unit: bytes. If you leave this parameter empty or set it to null, no access code is required. If you use a token to share files, you do not need to configure this parameter. The access code can contain only visible ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678</p>
     */
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

    public CreateCdsFileShareLinkRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
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
