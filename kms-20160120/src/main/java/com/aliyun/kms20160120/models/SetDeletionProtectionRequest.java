// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class SetDeletionProtectionRequest extends TeaModel {
    /**
     * <p>The description of deletion protection.</p>
     * <br>
     * <p>>  This parameter takes effect only when you set the EnableDeletionProtection parameter to true.</p>
     */
    @NameInMap("DeletionProtectionDescription")
    public String deletionProtectionDescription;

    /**
     * <p>Specifies whether to enable deletion protection. Valid values:</p>
     * <br>
     * <p>*   true: enables deletion protection.</p>
     * <p>*   false: disables deletion protection.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EnableDeletionProtection")
    public Boolean enableDeletionProtection;

    /**
     * <p>The ARN of the CMK for which you want to set deletion protection.</p>
     * <br>
     * <p>You can call the [DescribeKey](https://help.aliyun.com/document_detail/28952.html) operation to query the CMK ARN.</p>
     * <br>
     * <p>This parameter is required.</p>
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

    public SetDeletionProtectionRequest setProtectedResourceArn(String protectedResourceArn) {
        this.protectedResourceArn = protectedResourceArn;
        return this;
    }
    public String getProtectedResourceArn() {
        return this.protectedResourceArn;
    }

}
