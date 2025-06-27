// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DeleteBackupFileRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BackupFileIdList")
    public java.util.List<String> backupFileIdList;

    public static DeleteBackupFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupFileRequest self = new DeleteBackupFileRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBackupFileRequest setBackupFileIdList(java.util.List<String> backupFileIdList) {
        this.backupFileIdList = backupFileIdList;
        return this;
    }
    public java.util.List<String> getBackupFileIdList() {
        return this.backupFileIdList;
    }

}
