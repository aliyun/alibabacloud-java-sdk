// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteLiveSnapshotFilesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateTimestampList")
    public java.util.List<Long> createTimestampList;

    @NameInMap("DeleteOriginalFile")
    public Boolean deleteOriginalFile;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static DeleteLiveSnapshotFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveSnapshotFilesRequest self = new DeleteLiveSnapshotFilesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveSnapshotFilesRequest setCreateTimestampList(java.util.List<Long> createTimestampList) {
        this.createTimestampList = createTimestampList;
        return this;
    }
    public java.util.List<Long> getCreateTimestampList() {
        return this.createTimestampList;
    }

    public DeleteLiveSnapshotFilesRequest setDeleteOriginalFile(Boolean deleteOriginalFile) {
        this.deleteOriginalFile = deleteOriginalFile;
        return this;
    }
    public Boolean getDeleteOriginalFile() {
        return this.deleteOriginalFile;
    }

    public DeleteLiveSnapshotFilesRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
