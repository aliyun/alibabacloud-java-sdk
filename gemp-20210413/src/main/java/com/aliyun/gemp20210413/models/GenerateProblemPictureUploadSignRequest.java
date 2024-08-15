// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GenerateProblemPictureUploadSignRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("fileName")
    public String fileName;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("fileSize")
    public Long fileSize;

    /**
     * <strong>example:</strong>
     * <p>png</p>
     */
    @NameInMap("fileType")
    public String fileType;

    /**
     * <strong>example:</strong>
     * <p>67876</p>
     */
    @NameInMap("problemId")
    public Long problemId;

    public static GenerateProblemPictureUploadSignRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateProblemPictureUploadSignRequest self = new GenerateProblemPictureUploadSignRequest();
        return TeaModel.build(map, self);
    }

    public GenerateProblemPictureUploadSignRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GenerateProblemPictureUploadSignRequest setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public GenerateProblemPictureUploadSignRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public GenerateProblemPictureUploadSignRequest setProblemId(Long problemId) {
        this.problemId = problemId;
        return this;
    }
    public Long getProblemId() {
        return this.problemId;
    }

}
