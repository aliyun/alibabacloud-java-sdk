// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateCdsFileRequest extends TeaModel {
    /**
     * <p>The ID of the cloud disk.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+cds-82414*****</p>
     */
    @NameInMap("CdsId")
    public String cdsId;

    /**
     * <p>The policy that is used when the file that you want to upload has the same name as an existing file in the cloud disk.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>refuse</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>denies creating the file</p>
     * <!-- -->
     * 
     * <p>.</p>
     * </li>
     * <li><p>auto_rename</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>automatically renames the file</p>
     * <!-- -->
     * 
     * <p>.</p>
     * </li>
     * <li><p>ignore</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>allows the file to use the same name as the existing file in the cloud disk</p>
     * <!-- -->
     * 
     * <p>.</p>
     * </li>
     * <li><p>over_write</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>overwrites the existing file in the cloud disk</p>
     * <!-- -->
     * 
     * <p>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ignore</p>
     */
    @NameInMap("ConflictPolicy")
    public String conflictPolicy;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The hash value of the SHA1 algorithm that is used by the file.</p>
     * 
     * <strong>example:</strong>
     * <p>7C4A8D09CA3762AF61E59520943DC26494F8****</p>
     */
    @NameInMap("FileHash")
    public String fileHash;

    /**
     * <p>The file size. Unit: bytes.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("FileLength")
    public Long fileLength;

    /**
     * <p>The file name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testFile.txt</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The file type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>file</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>folder</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>file</p>
     */
    @NameInMap("FileType")
    public String fileType;

    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the parent folder.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>637c9163b453b1a384874264ba79f3f9eab9****</p>
     */
    @NameInMap("ParentFileId")
    public String parentFileId;

    /**
     * <p>The region ID.</p>
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
