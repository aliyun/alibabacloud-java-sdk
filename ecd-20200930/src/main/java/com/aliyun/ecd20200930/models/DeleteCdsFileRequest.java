// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteCdsFileRequest extends TeaModel {
    /**
     * <p>The ID of the cloud disk.</p>
     */
    @NameInMap("CdsId")
    public String cdsId;

    /**
     * <p>The ID of the end user who uses the cloud disk.</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The ID of the file. The ID is a unique identifier for the file.</p>
     */
    @NameInMap("FileId")
    public String fileId;

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

    public static DeleteCdsFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCdsFileRequest self = new DeleteCdsFileRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCdsFileRequest setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public DeleteCdsFileRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public DeleteCdsFileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public DeleteCdsFileRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DeleteCdsFileRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
