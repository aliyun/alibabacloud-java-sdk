// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteLiveSnapshotFilesRequest extends TeaModel {
    /**
     * <p>A list of creation timestamps for the files to delete. You can specify up to 200 timestamps per request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateTimestampList")
    public java.util.List<Long> createTimestampList;

    /**
     * <p>Specifies whether to delete the original OSS files. The default value is false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DeleteOriginalFile")
    public Boolean deleteOriginalFile;

    /**
     * <p>The ID of the snapshot job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>a046-263c-3560-978a-fb287782</strong></strong></p>
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
