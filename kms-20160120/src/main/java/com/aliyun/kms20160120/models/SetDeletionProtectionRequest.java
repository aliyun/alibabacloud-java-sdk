// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class SetDeletionProtectionRequest extends TeaModel {
    @NameInMap("DeletionProtectionDescription")
    public String deletionProtectionDescription;

    @NameInMap("EnableDeletionProtection")
    public Boolean enableDeletionProtection;

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
