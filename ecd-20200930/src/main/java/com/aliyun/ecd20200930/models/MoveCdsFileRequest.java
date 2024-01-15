// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class MoveCdsFileRequest extends TeaModel {
    /**
     * <p>The ID of the cloud disk.</p>
     */
    @NameInMap("CdsId")
    public String cdsId;

    /**
     * <p>The processing mode of files that have the same name.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   <!-- --></p>
     * <br>
     * <p>    refuse</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    : If you want to create a file that uses the same name as an existing file in the cloud, the system denies your request and returns the details of the existing file.</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   <!-- --></p>
     * <br>
     * <p>    auto_rename</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    : If you want to create a file that uses the same name as an existing file in the cloud, the system renames the file that you want to create by appending the current time point.</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   <!-- --></p>
     * <br>
     * <p>    ignore</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    : The system allows you to create a file that uses the same name as an existing file in the cloud.</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   <!-- --></p>
     * <br>
     * <p>    over_write</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    : After you create a file that uses the same name as an existing file in the cloud, the new file overwrites the existing file.</p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("ConflictPolicy")
    public String conflictPolicy;

    /**
     * <p>The user ID that you want to use to access the cloud disk.</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The ID of the file.</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <p>The group ID.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the parent folder that you want to move. If you want to remove the root folder, set the value to root.</p>
     */
    @NameInMap("ParentFolderId")
    public String parentFolderId;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static MoveCdsFileRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveCdsFileRequest self = new MoveCdsFileRequest();
        return TeaModel.build(map, self);
    }

    public MoveCdsFileRequest setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public MoveCdsFileRequest setConflictPolicy(String conflictPolicy) {
        this.conflictPolicy = conflictPolicy;
        return this;
    }
    public String getConflictPolicy() {
        return this.conflictPolicy;
    }

    public MoveCdsFileRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public MoveCdsFileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public MoveCdsFileRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public MoveCdsFileRequest setParentFolderId(String parentFolderId) {
        this.parentFolderId = parentFolderId;
        return this;
    }
    public String getParentFolderId() {
        return this.parentFolderId;
    }

    public MoveCdsFileRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
