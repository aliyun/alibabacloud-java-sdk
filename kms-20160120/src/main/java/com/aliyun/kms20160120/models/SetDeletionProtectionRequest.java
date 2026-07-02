// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class SetDeletionProtectionRequest extends TeaModel {
    /**
     * <p>The description of deletion protection.</p>
     * <blockquote>
     * <p>This parameter is available only when EnableDeletionProtection is set to true.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>The CMK is being used by XXX. Deletion protection is set.</p>
     */
    @NameInMap("DeletionProtectionDescription")
    public String deletionProtectionDescription;

    /**
     * <p>Specifies whether to enable deletion protection. Valid values:</p>
     * <ul>
     * <li><p>true: enables deletion protection.</p>
     * </li>
     * <li><p>false: disables deletion protection. This is the default value.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableDeletionProtection")
    public Boolean enableDeletionProtection;

    /**
     * <p>The ID of the key.</p>
     * 
     * <strong>example:</strong>
     * <p>key-hzz65f3a68554s6ms****</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    @NameInMap("KmsInstanceId")
    public String kmsInstanceId;

    /**
     * <p>The ARN of the CMK for which you want to configure deletion protection.<br>
     * You can call the <a href="https://help.aliyun.com/document_detail/28952.html">DescribeKey</a> operation to query the ARN of the CMK.<br><br></p>
     * 
     * <strong>example:</strong>
     * <p>acs:kms:cn-hangzhou:123213123****:key/0225f411-b21d-46d1-be5b-93931c82****</p>
     */
    @NameInMap("ProtectedResourceArn")
    public String protectedResourceArn;

    public static SetDeletionProtectionRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDeletionProtectionRequest self = new SetDeletionProtectionRequest();
        return TeaModel.build(map, self);
    }

    public SetDeletionProtectionRequest setDeletionProtectionDescription(String deletionProtectionDescription) {
        this.deletionProtectionDescription = deletionProtectionDescription;
        return this;
    }
    public String getDeletionProtectionDescription() {
        return this.deletionProtectionDescription;
    }

    public SetDeletionProtectionRequest setEnableDeletionProtection(Boolean enableDeletionProtection) {
        this.enableDeletionProtection = enableDeletionProtection;
        return this;
    }
    public Boolean getEnableDeletionProtection() {
        return this.enableDeletionProtection;
    }

    public SetDeletionProtectionRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public SetDeletionProtectionRequest setKmsInstanceId(String kmsInstanceId) {
        this.kmsInstanceId = kmsInstanceId;
        return this;
    }
    public String getKmsInstanceId() {
        return this.kmsInstanceId;
    }

    public SetDeletionProtectionRequest setProtectedResourceArn(String protectedResourceArn) {
        this.protectedResourceArn = protectedResourceArn;
        return this;
    }
    public String getProtectedResourceArn() {
        return this.protectedResourceArn;
    }

}
