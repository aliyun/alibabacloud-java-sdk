// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteLiveSnapshotFilesShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateTimestampList")
    public String createTimestampListShrink;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DeleteOriginalFile")
    public Boolean deleteOriginalFile;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>a046-263c-3560-978a-fb287782</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static DeleteLiveSnapshotFilesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveSnapshotFilesShrinkRequest self = new DeleteLiveSnapshotFilesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveSnapshotFilesShrinkRequest setCreateTimestampListShrink(String createTimestampListShrink) {
        this.createTimestampListShrink = createTimestampListShrink;
        return this;
    }
    public String getCreateTimestampListShrink() {
        return this.createTimestampListShrink;
    }

    public DeleteLiveSnapshotFilesShrinkRequest setDeleteOriginalFile(Boolean deleteOriginalFile) {
        this.deleteOriginalFile = deleteOriginalFile;
        return this;
    }
    public Boolean getDeleteOriginalFile() {
        return this.deleteOriginalFile;
    }

    public DeleteLiveSnapshotFilesShrinkRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
