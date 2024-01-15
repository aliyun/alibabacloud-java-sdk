// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyCdsFileRequest extends TeaModel {
    /**
     * <p>The cloud disk ID.</p>
     */
    @NameInMap("CdsId")
    public String cdsId;

    /**
     * <p>The processing mode of files that have the same name.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   refuse</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    refuses to create a file that has the same name as the file in the cloud.</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   auto_rename</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    automatically renames a file if the file has the same name as another file. By default, the current point in time is appended. Example: xxx20060102\_150405.</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   ignore</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    allows files with the same name.</p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("ConflictPolicy")
    public String conflictPolicy;

    /**
     * <p>The ID of the end user who uses the cloud disk.</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The file ID.</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <p>The file name.</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The group ID.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyCdsFileRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCdsFileRequest self = new ModifyCdsFileRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCdsFileRequest setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public ModifyCdsFileRequest setConflictPolicy(String conflictPolicy) {
        this.conflictPolicy = conflictPolicy;
        return this;
    }
    public String getConflictPolicy() {
        return this.conflictPolicy;
    }

    public ModifyCdsFileRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public ModifyCdsFileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ModifyCdsFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ModifyCdsFileRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ModifyCdsFileRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
