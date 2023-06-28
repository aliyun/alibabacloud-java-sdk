// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyCdsFileRequest extends TeaModel {
    /**
     * <p>The ID of the cloud disk.</p>
     */
    @NameInMap("CdsId")
    public String cdsId;

    /**
     * <p>The processing method that is used if the file that you want to create has the same name as an existing file in the cloud. Valid values: ignore: allows you to create the file by using the same name as an existing file in the cloud. auto_rename: automatically renames the file that you want to create if a file that has the same name exists in the cloud. By default, the current point in time is added to the end of the file name. Example: xxx\_20060102\_150405. refuse: denies creating the file if a file that has the same name exists in the cloud. Default value: refuse.</p>
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

    public ModifyCdsFileRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
