// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateVirusScanGlobalConfigRequest extends TeaModel {
    /**
     * <p>The maximum size of a single virus file that can be uploaded. Unit: KB. Valid values: 0 to 204800. A value of 0 indicates no size limit. Values from 1 to 204800 specify the actual size limit.</p>
     * 
     * <strong>example:</strong>
     * <p>10240</p>
     */
    @NameInMap("UploadFileMaxSize")
    public Long uploadFileMaxSize;

    /**
     * <p>The maximum upload rate for virus files. Unit: KB/s. Valid values: 0 to 102400. A value of 0 indicates no rate limit.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("UploadFileMaxSpeed")
    public Long uploadFileMaxSpeed;

    /**
     * <p>The collection of file types that are prohibited from being uploaded. Duplicate values are not allowed. Files that match the specified types are not uploaded even if upload is enabled.</p>
     */
    @NameInMap("UploadFileSuffixBlacklist")
    public java.util.List<String> uploadFileSuffixBlacklist;

    /**
     * <p>Specifies whether user terminal devices are allowed to upload detected virus files to the cloud for further analysis. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Allowed.</li>
     * <li><strong>false</strong>: Not allowed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("VirusFileUpload")
    public Boolean virusFileUpload;

    public static UpdateVirusScanGlobalConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVirusScanGlobalConfigRequest self = new UpdateVirusScanGlobalConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVirusScanGlobalConfigRequest setUploadFileMaxSize(Long uploadFileMaxSize) {
        this.uploadFileMaxSize = uploadFileMaxSize;
        return this;
    }
    public Long getUploadFileMaxSize() {
        return this.uploadFileMaxSize;
    }

    public UpdateVirusScanGlobalConfigRequest setUploadFileMaxSpeed(Long uploadFileMaxSpeed) {
        this.uploadFileMaxSpeed = uploadFileMaxSpeed;
        return this;
    }
    public Long getUploadFileMaxSpeed() {
        return this.uploadFileMaxSpeed;
    }

    public UpdateVirusScanGlobalConfigRequest setUploadFileSuffixBlacklist(java.util.List<String> uploadFileSuffixBlacklist) {
        this.uploadFileSuffixBlacklist = uploadFileSuffixBlacklist;
        return this;
    }
    public java.util.List<String> getUploadFileSuffixBlacklist() {
        return this.uploadFileSuffixBlacklist;
    }

    public UpdateVirusScanGlobalConfigRequest setVirusFileUpload(Boolean virusFileUpload) {
        this.virusFileUpload = virusFileUpload;
        return this;
    }
    public Boolean getVirusFileUpload() {
        return this.virusFileUpload;
    }

}
