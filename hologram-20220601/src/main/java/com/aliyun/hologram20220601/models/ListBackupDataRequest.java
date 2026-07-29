// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ListBackupDataRequest extends TeaModel {
    /**
     * <p>The backup type, used to filter snapshots. If you leave this parameter empty, all snapshots are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>redundant</p>
     */
    @NameInMap("backupType")
    public String backupType;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>hgprecn-cn-wwoxxxxx</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    public static ListBackupDataRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBackupDataRequest self = new ListBackupDataRequest();
        return TeaModel.build(map, self);
    }

    public ListBackupDataRequest setBackupType(String backupType) {
        this.backupType = backupType;
        return this;
    }
    public String getBackupType() {
        return this.backupType;
    }

    public ListBackupDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
