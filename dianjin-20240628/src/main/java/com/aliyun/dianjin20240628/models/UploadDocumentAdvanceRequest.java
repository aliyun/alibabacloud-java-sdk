// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class UploadDocumentAdvanceRequest extends TeaModel {
    /**
     * <p>File metadata. You can use this to filter results during retrieval.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;cateogry\&quot;: \&quot;报告\&quot;}</p>
     */
    @NameInMap("data")
    public String data;

    /**
     * <p>The full file name, including the extension. Supported formats are PDF, DOC, DOCX, Markdown, PPT, and PPTX. File size must not exceed 100 MB. PDF, DOC, DOCX, PPT, and PPTX files must not exceed 500 pages.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test.pdf</p>
     */
    @NameInMap("fileName")
    public String fileName;

    /**
     * <p>The OSS URL of the file. If the file is not publicly readable, include a signature in the URL.</p>
     * <p>If you use the SDK to upload files, upload the file directly. You do not need to provide an OSS URL. For more information, see the SDK documentation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://oss-xxx.hangzhou.com/test.pdf">https://oss-xxx.hangzhou.com/test.pdf</a></p>
     */
    @NameInMap("fileUrl")
    public java.io.InputStream fileUrlObject;

    /**
     * <p>The document library ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sjdhbcsj</p>
     */
    @NameInMap("libraryId")
    public String libraryId;

    public static UploadDocumentAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadDocumentAdvanceRequest self = new UploadDocumentAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public UploadDocumentAdvanceRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UploadDocumentAdvanceRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UploadDocumentAdvanceRequest setFileUrlObject(java.io.InputStream fileUrlObject) {
        this.fileUrlObject = fileUrlObject;
        return this;
    }
    public java.io.InputStream getFileUrlObject() {
        return this.fileUrlObject;
    }

    public UploadDocumentAdvanceRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

}
