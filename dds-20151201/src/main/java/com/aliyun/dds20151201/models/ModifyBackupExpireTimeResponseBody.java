// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyBackupExpireTimeResponseBody extends TeaModel {
    /**
     * <p>The time-to-live (TTL) of the backup. The time is in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format and is in UTC.</p>
     * <blockquote>
     * <ul>
     * <li><p><em>9999-01-01</em>T<em>00:00:00</em>&#x5A;<em>&#x20;indicates that the backup is retained permanently.</em></p>
     * <p>**</p>
     * </li>
     * </ul>
     * <p>**</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2025-03-29T03:47:12Z</p>
     */
    @NameInMap("BackupExpireTime")
    public String backupExpireTime;

    /**
     * <p>The backup ID.</p>
     * 
     * <strong>example:</strong>
     * <p>260032xxxx</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A0181AC4-XXXX-XXXX-87CA-100C70B86729</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyBackupExpireTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupExpireTimeResponseBody self = new ModifyBackupExpireTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyBackupExpireTimeResponseBody setBackupExpireTime(String backupExpireTime) {
        this.backupExpireTime = backupExpireTime;
        return this;
    }
    public String getBackupExpireTime() {
        return this.backupExpireTime;
    }

    public ModifyBackupExpireTimeResponseBody setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public ModifyBackupExpireTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
