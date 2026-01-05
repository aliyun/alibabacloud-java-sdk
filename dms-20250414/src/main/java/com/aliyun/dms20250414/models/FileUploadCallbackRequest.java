// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class FileUploadCallbackRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>TrailCenter</p>
     */
    @NameInMap("CallFrom")
    public String callFrom;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DmsUnit")
    public String dmsUnit;

    /**
     * <strong>example:</strong>
     * <p>8110</p>
     */
    @NameInMap("FileSize")
    public Long fileSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>conversion_metrics.csv</p>
     */
    @NameInMap("Filename")
    public String filename;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UploadLocation")
    public String uploadLocation;

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

    public FileUploadCallbackRequest setUploadLocation(String uploadLocation) {
        this.uploadLocation = uploadLocation;
        return this;
    }
    public String getUploadLocation() {
        return this.uploadLocation;
    }

}
