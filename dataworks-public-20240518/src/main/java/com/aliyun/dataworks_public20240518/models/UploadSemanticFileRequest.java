// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UploadSemanticFileRequest extends TeaModel {
    /**
     * <p>The MIME type of the object to upload. Maximum length: 128 characters. This value is included in the signature of UploadUrl. Use the same Content-Type when you perform the PUT request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>application/pdf</p>
     */
    @NameInMap("ContentType")
    public String contentType;

    /**
     * <p>The original file name of the reference file to upload. Maximum length: 255 characters. When FileId is used for singleTableFile, only CSV or XLSX files are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>reference.pdf</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The size of the file to upload, in bytes. This value is recorded as attachment metadata. Specify the actual file size.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("SizeBytes")
    public Long sizeBytes;

    public static UploadSemanticFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadSemanticFileRequest self = new UploadSemanticFileRequest();
        return TeaModel.build(map, self);
    }

    public UploadSemanticFileRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public UploadSemanticFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UploadSemanticFileRequest setSizeBytes(Long sizeBytes) {
        this.sizeBytes = sizeBytes;
        return this;
    }
    public Long getSizeBytes() {
        return this.sizeBytes;
    }

}
