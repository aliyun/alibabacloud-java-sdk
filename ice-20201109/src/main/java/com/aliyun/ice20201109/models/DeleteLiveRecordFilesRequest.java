// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteLiveRecordFilesRequest extends TeaModel {
    /**
     * <p>The collection of IDs of recording files.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RecordIds")
    public java.util.List<String> recordIds;

    /**
     * <p>Specifies whether to delete the original files in OSS.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RemoveFile")
    public Boolean removeFile;

    public static DeleteLiveRecordFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveRecordFilesRequest self = new DeleteLiveRecordFilesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveRecordFilesRequest setRecordIds(java.util.List<String> recordIds) {
        this.recordIds = recordIds;
        return this;
    }
    public java.util.List<String> getRecordIds() {
        return this.recordIds;
    }

    public DeleteLiveRecordFilesRequest setRemoveFile(Boolean removeFile) {
        this.removeFile = removeFile;
        return this;
    }
    public Boolean getRemoveFile() {
        return this.removeFile;
    }

}
