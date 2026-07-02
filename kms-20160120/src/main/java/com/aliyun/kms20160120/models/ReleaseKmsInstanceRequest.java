// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ReleaseKmsInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to forcibly release the KMS instance if it has not been backed up.</p>
     * <ul>
     * <li><p>true: forcibly releases the instance.</p>
     * </li>
     * <li><p>false (default): does not release the instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ForceDeleteWithoutBackup")
    public String forceDeleteWithoutBackup;

    /**
     * <p>The ID of the KMS instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kst-hzz6****</p>
     */
    @NameInMap("KmsInstanceId")
    public String kmsInstanceId;

    public static ReleaseKmsInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseKmsInstanceRequest self = new ReleaseKmsInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseKmsInstanceRequest setForceDeleteWithoutBackup(String forceDeleteWithoutBackup) {
        this.forceDeleteWithoutBackup = forceDeleteWithoutBackup;
        return this;
    }
    public String getForceDeleteWithoutBackup() {
        return this.forceDeleteWithoutBackup;
    }

    public ReleaseKmsInstanceRequest setKmsInstanceId(String kmsInstanceId) {
        this.kmsInstanceId = kmsInstanceId;
        return this;
    }
    public String getKmsInstanceId() {
        return this.kmsInstanceId;
    }

}
