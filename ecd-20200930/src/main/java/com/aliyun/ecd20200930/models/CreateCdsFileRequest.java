// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateCdsFileRequest extends TeaModel {
    /**
     * <p>Enterprise cloud disk ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+cds-82414*****</p>
     */
    @NameInMap("CdsId")
    public String cdsId;

    /**
     * <p>How to handle files with the same name.</p>
     * 
     * <strong>example:</strong>
     * <p>ignore</p>
     */
    @NameInMap("ConflictPolicy")
    public String conflictPolicy;

    /**
     * <p>User ID.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>SHA-1 hash value of the file.</p>
     * 
     * <strong>example:</strong>
     * <p>7C4A8D09CA3762AF61E59520943DC26494F8****</p>
     */
    @NameInMap("FileHash")
    public String fileHash;

    /**
     * <p>File size. Unit: Byte.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1048576</p>
     */
    @NameInMap("FileLength")
    public Long fileLength;

    /**
     * <p>File name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testFile.txt</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>File type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>file</p>
     */
    @NameInMap("FileType")
    public String fileType;

    /**
     * <p>Team space ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cg-i1ruuudp92qpj****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>Parent file ID. Get this from the <code>FileId</code> parameter returned by the <a href="https://help.aliyun.com/document_detail/2247622.html">ListCdsFiles</a> API.</p>
     * 
     * <strong>example:</strong>
     * <p>637c9163b453b1a384874264ba79f3f9eab9****</p>
     */
    @NameInMap("ParentFileId")
    public String parentFileId;

    /**
     * <p>Region ID. Call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to list regions supported by WUYING Workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
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

    public CreateCdsFileRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
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
