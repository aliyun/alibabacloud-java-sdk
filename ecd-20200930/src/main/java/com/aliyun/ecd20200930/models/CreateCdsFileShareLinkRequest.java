// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateCdsFileShareLinkRequest extends TeaModel {
    /**
     * <p>The enterprise cloud disk ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai+cds-135515****</p>
     */
    @NameInMap("CdsId")
    public String cdsId;

    /**
     * <p>The share description. Length range: 0 to 1024 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>SharedFile</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to disable downloading of files in the share. Valid values:</p>
     * <ul>
     * <li>true: Downloading is disabled.</li>
     * <li>false: Downloading is enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisableDownload")
    public Boolean disableDownload;

    /**
     * <p>Specifies whether to disable previewing of files in the share. Valid values:</p>
     * <ul>
     * <li>true: Preview is disabled.</li>
     * <li>false: Preview is enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisablePreview")
    public Boolean disablePreview;

    /**
     * <p>Specifies whether to disable saving of files in the share. Valid values:</p>
     * <ul>
     * <li>true: Saving is disabled.</li>
     * <li>false: Saving is enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisableSave")
    public Boolean disableSave;

    /**
     * <p>The maximum number of times the shared files can be downloaded. The value is an integer. A value of 0 indicates no limit.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("DownloadLimit")
    public Long downloadLimit;

    /**
     * <p>The ID of the user who uses the cloud disk.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The expiration time in RFC 3339 format. If this parameter is left empty, the share is permanently valid.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-06-28T11:33:00.000+08:00</p>
     */
    @NameInMap("Expiration")
    public String expiration;

    /**
     * <p>The list of file IDs.</p>
     */
    @NameInMap("FileIds")
    public java.util.List<String> fileIds;

    /**
     * <p>The team space ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cg-i1ruuudp92qpj****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The maximum number of times the shared files can be previewed. The value is an integer. A value of 0 indicates no limit.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PreviewLimit")
    public Long previewLimit;

    /**
     * <p>The maximum number of times the shared files can be saved. The value is an integer. A value of 0 indicates no limit.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("SaveLimit")
    public Long saveLimit;

    /**
     * <p>The share name. If this parameter is not set, the file name corresponding to the first ID in <code>file_id_list</code> is used by default. Length range: 0 to 128 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>view.txt</p>
     */
    @NameInMap("ShareName")
    public String shareName;

    /**
     * <p>The extraction code. Length range: 0 to 64 bytes. If this parameter is not set or is set to empty, no extraction code is required, and you do not need to specify the extraction code parameter when obtaining the share token. Only printable ASCII characters are allowed.</p>
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
