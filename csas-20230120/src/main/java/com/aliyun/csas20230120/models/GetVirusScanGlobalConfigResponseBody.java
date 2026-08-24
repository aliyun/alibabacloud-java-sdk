// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetVirusScanGlobalConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3D7EC0AF-DB2A-5D9C-90EC-F090A6BAAEA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The maximum size of a single virus file that can be uploaded, in KB. A value of 0 indicates no size limit.</p>
     * 
     * <strong>example:</strong>
     * <p>10240</p>
     */
    @NameInMap("UploadFileMaxSize")
    public Long uploadFileMaxSize;

    /**
     * <p>The maximum upload rate for virus files, in KB/s. A value of 0 indicates no rate limit.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("UploadFileMaxSpeed")
    public Long uploadFileMaxSpeed;

    /**
     * <p>The collection of file types that are prohibited from being uploaded. Files that match these types are not uploaded even if the upload feature is enabled. An empty list is returned if no file types are configured.</p>
     */
    @NameInMap("UploadFileSuffixBlacklist")
    public java.util.List<String> uploadFileSuffixBlacklist;

    /**
     * <p>Indicates whether user terminal devices are allowed to upload detected virus files to the cloud for further analysis. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Upload is allowed.</li>
     * <li><strong>false</strong>: Upload is not allowed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("VirusFileUpload")
    public Boolean virusFileUpload;

    public static GetVirusScanGlobalConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVirusScanGlobalConfigResponseBody self = new GetVirusScanGlobalConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVirusScanGlobalConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVirusScanGlobalConfigResponseBody setUploadFileMaxSize(Long uploadFileMaxSize) {
        this.uploadFileMaxSize = uploadFileMaxSize;
        return this;
    }
    public Long getUploadFileMaxSize() {
        return this.uploadFileMaxSize;
    }

    public GetVirusScanGlobalConfigResponseBody setUploadFileMaxSpeed(Long uploadFileMaxSpeed) {
        this.uploadFileMaxSpeed = uploadFileMaxSpeed;
        return this;
    }
    public Long getUploadFileMaxSpeed() {
        return this.uploadFileMaxSpeed;
    }

    public GetVirusScanGlobalConfigResponseBody setUploadFileSuffixBlacklist(java.util.List<String> uploadFileSuffixBlacklist) {
        this.uploadFileSuffixBlacklist = uploadFileSuffixBlacklist;
        return this;
    }
    public java.util.List<String> getUploadFileSuffixBlacklist() {
        return this.uploadFileSuffixBlacklist;
    }

    public GetVirusScanGlobalConfigResponseBody setVirusFileUpload(Boolean virusFileUpload) {
        this.virusFileUpload = virusFileUpload;
        return this;
    }
    public Boolean getVirusFileUpload() {
        return this.virusFileUpload;
    }

}
