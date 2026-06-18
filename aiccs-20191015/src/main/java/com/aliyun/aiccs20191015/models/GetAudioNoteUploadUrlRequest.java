// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAudioNoteUploadUrlRequest extends TeaModel {
    /**
     * <p>The name of the file to upload.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-audio</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The file type.</p>
     * 
     * <strong>example:</strong>
     * <p>wav</p>
     */
    @NameInMap("FileType")
    public String fileType;

    public static GetAudioNoteUploadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAudioNoteUploadUrlRequest self = new GetAudioNoteUploadUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetAudioNoteUploadUrlRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GetAudioNoteUploadUrlRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

}
