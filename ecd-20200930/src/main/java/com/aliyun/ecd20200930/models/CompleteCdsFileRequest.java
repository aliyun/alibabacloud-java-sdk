// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CompleteCdsFileRequest extends TeaModel {
    /**
     * <p>The ID of the cloud disk.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai+cds-465878****</p>
     */
    @NameInMap("CdsId")
    public String cdsId;

    /**
     * <p>The name of the end user.</p>
     * 
     * <strong>example:</strong>
     * <p>test0</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The file ID. An ID is the unique identifier of a file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>635a316c94f40f35f5354da29b2aee88c9d1****</p>
     */
    @NameInMap("FileId")
    public String fileId;

    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the file uploading task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6C48B55A1FAC4E1A9E0579059514****</p>
     */
    @NameInMap("UploadId")
    public String uploadId;

    public static CompleteCdsFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CompleteCdsFileRequest self = new CompleteCdsFileRequest();
        return TeaModel.build(map, self);
    }

    public CompleteCdsFileRequest setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public CompleteCdsFileRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public CompleteCdsFileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public CompleteCdsFileRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CompleteCdsFileRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CompleteCdsFileRequest setUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }
    public String getUploadId() {
        return this.uploadId;
    }

}
