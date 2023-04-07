// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateCdsFileRequest extends TeaModel {
    @NameInMap("CdsId")
    public String cdsId;

    @NameInMap("ConflictPolicy")
    public String conflictPolicy;

    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("FileHash")
    public String fileHash;

    @NameInMap("FileLength")
    public Long fileLength;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileType")
    public String fileType;

    @NameInMap("ParentFileId")
    public String parentFileId;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateCdsFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCdsFileRequest self = new CreateCdsFileRequest();
        return TeaModel.build(map, self);
    }

    public CreateCdsFileRequest setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public CreateCdsFileRequest setConflictPolicy(String conflictPolicy) {
        this.conflictPolicy = conflictPolicy;
        return this;
    }
    public String getConflictPolicy() {
        return this.conflictPolicy;
    }

    public CreateCdsFileRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public CreateCdsFileRequest setFileHash(String fileHash) {
        this.fileHash = fileHash;
        return this;
    }
    public String getFileHash() {
        return this.fileHash;
    }

    public CreateCdsFileRequest setFileLength(Long fileLength) {
        this.fileLength = fileLength;
        return this;
    }
    public Long getFileLength() {
        return this.fileLength;
    }

    public CreateCdsFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateCdsFileRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public CreateCdsFileRequest setParentFileId(String parentFileId) {
        this.parentFileId = parentFileId;
        return this;
    }
    public String getParentFileId() {
        return this.parentFileId;
    }

    public CreateCdsFileRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
