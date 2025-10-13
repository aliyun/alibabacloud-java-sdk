// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ListBackupDataRequest extends TeaModel {
    /**
     * <p>The backup type. Specific backup data is filtered based on the type. If you leave this parameter empty, all backup data is returned.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>redundant_remote</li>
     * <li>remote</li>
     * <li>redundant</li>
     * <li>full_remote</li>
     * <li>local</li>
     * <li>full</li>
     * </ul>
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
