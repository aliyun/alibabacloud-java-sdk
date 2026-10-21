// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class FileUploadCallbackRequest extends TeaModel {
    /**
     * <p>Used only by the frontend.</p>
     * 
     * <strong>example:</strong>
     * <p>TrailCenter</p>
     */
    @NameInMap("CallFrom")
    public String callFrom;

    /**
     * <p>The current DMS unit.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DmsUnit")
    public String dmsUnit;

    /**
     * <p>The size of the file, in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>8110</p>
     */
    @NameInMap("FileSize")
    public Long fileSize;

    /**
     * <p>The name of the file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>conversion_metrics.csv</p>
     */
    @NameInMap("Filename")
    public String filename;

    /**
     * <p>The name of the user\&quot;s OSS bucket.</p>
     * <ul>
     * <li>Specify this parameter to use a file in the user\&quot;s OSS bucket and register the file as a data center file through the callback.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>bgc-hangzhou-test-bucket</p>
     */
    @NameInMap("OssBucket")
    public String ossBucket;

    /**
     * <p>The full path of the uploaded file.</p>
     * <ul>
     * <li>Format: Concatenate the UploadDir field returned by the DescribeFileUploadSignature operation with the file name.</li>
     * <li>Example: ${UploadDir}/${Filename}</li>
     * </ul>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UploadLocation")
    public String uploadLocation;

    /**
     * <p>The ID of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>ccihe433d3*******lxljv</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static FileUploadCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        FileUploadCallbackRequest self = new FileUploadCallbackRequest();
        return TeaModel.build(map, self);
    }

    public FileUploadCallbackRequest setCallFrom(String callFrom) {
        this.callFrom = callFrom;
        return this;
    }
    public String getCallFrom() {
        return this.callFrom;
    }

    public FileUploadCallbackRequest setDmsUnit(String dmsUnit) {
        this.dmsUnit = dmsUnit;
        return this;
    }
    public String getDmsUnit() {
        return this.dmsUnit;
    }

    public FileUploadCallbackRequest setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public FileUploadCallbackRequest setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    public String getFilename() {
        return this.filename;
    }

    public FileUploadCallbackRequest setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public FileUploadCallbackRequest setUploadLocation(String uploadLocation) {
        this.uploadLocation = uploadLocation;
        return this;
    }
    public String getUploadLocation() {
        return this.uploadLocation;
    }

    public FileUploadCallbackRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
