// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GenerateProblemPictureUploadSignRequest extends TeaModel {
    // 文件名
    @NameInMap("fileName")
    public String fileName;

    // 文件大小KB
    @NameInMap("fileSize")
    public Long fileSize;

    // 文件类型
    @NameInMap("fileType")
    public String fileType;

    // 故障id
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
