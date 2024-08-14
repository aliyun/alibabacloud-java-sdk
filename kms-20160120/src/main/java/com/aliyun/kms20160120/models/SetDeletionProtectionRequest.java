// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class SetDeletionProtectionRequest extends TeaModel {
    /**
     * <p>The description of deletion protection.</p>
     * <blockquote>
     * <p> This parameter takes effect only when you set the EnableDeletionProtection parameter to true.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>This key is being used by XXX service. You are protected from deletion.</p>
     */
    @NameInMap("DeletionProtectionDescription")
    public String deletionProtectionDescription;

    /**
     * <p>Specifies whether to enable deletion protection. Valid values:</p>
     * <ul>
     * <li>true: enables deletion protection.</li>
     * <li>false: disables deletion protection.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableDeletionProtection")
    public Boolean enableDeletionProtection;

    /**
     * <p>The ARN of the CMK for which you want to set deletion protection.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/28952.html">DescribeKey</a> operation to query the CMK ARN.</p>
     * <p>This parameter is required.</p>
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

    public SetDeletionProtectionRequest setProtectedResourceArn(String protectedResourceArn) {
        this.protectedResourceArn = protectedResourceArn;
        return this;
    }
    public String getProtectedResourceArn() {
        return this.protectedResourceArn;
    }

}
